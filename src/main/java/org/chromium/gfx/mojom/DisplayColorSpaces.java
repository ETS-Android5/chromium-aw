// DisplayColorSpaces.java is auto generated by mojom_bindings_generator.py, do not edit


// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     ui/gfx/mojom/display_color_spaces.mojom
//

package org.chromium.gfx.mojom;

import androidx.annotation.IntDef;


public final class DisplayColorSpaces extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public ColorSpace[] colorSpaces;
    public int[] bufferFormats;
    public float sdrWhiteLevel;
    public HdrStaticMetadata hdrStaticMetadata;

    private DisplayColorSpaces(int version) {
        super(STRUCT_SIZE, version);
    }

    public DisplayColorSpaces() {
        this(0);
    }

    public static DisplayColorSpaces deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static DisplayColorSpaces deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static DisplayColorSpaces decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        DisplayColorSpaces result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new DisplayColorSpaces(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                {
                    org.chromium.mojo.bindings.DataHeader si1 = decoder1.readDataHeaderForPointerArray(6);
                    result.colorSpaces = new ColorSpace[si1.elementsOrVersion];
                    for (int i1 = 0; i1 < si1.elementsOrVersion; ++i1) {
                        
                        org.chromium.mojo.bindings.Decoder decoder2 = decoder1.readPointer(org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i1, false);
                        result.colorSpaces[i1] = ColorSpace.decode(decoder2);
                    }
                }
                }
                {
                    
                result.bufferFormats = decoder0.readInts(16, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 6);
                {
                    for (int i1 = 0; i1 < result.bufferFormats.length; ++i1) {
                        BufferFormat.validate(result.bufferFormats[i1]);
                    }
                }
                }
                {
                    
                result.sdrWhiteLevel = decoder0.readFloat(24);
                }
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(32, true);
                result.hdrStaticMetadata = HdrStaticMetadata.decode(decoder1);
                }

        } finally {
            decoder0.decreaseStackDepth();
        }
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    protected final void encode(org.chromium.mojo.bindings.Encoder encoder) {
        org.chromium.mojo.bindings.Encoder encoder0 = encoder.getEncoderAtDataOffset(DEFAULT_STRUCT_INFO);
        
        if (this.colorSpaces == null) {
            encoder0.encodeNullPointer(8, false);
        } else {
            org.chromium.mojo.bindings.Encoder encoder1 = encoder0.encodePointerArray(this.colorSpaces.length, 8, 6);
            for (int i0 = 0; i0 < this.colorSpaces.length; ++i0) {
                
                encoder1.encode(this.colorSpaces[i0], org.chromium.mojo.bindings.DataHeader.HEADER_SIZE + org.chromium.mojo.bindings.BindingsHelper.POINTER_SIZE * i0, false);
            }
        }
        
        encoder0.encode(this.bufferFormats, 16, org.chromium.mojo.bindings.BindingsHelper.NOTHING_NULLABLE, 6);
        
        encoder0.encode(this.sdrWhiteLevel, 24);
        
        encoder0.encode(this.hdrStaticMetadata, 32, true);
    }
}