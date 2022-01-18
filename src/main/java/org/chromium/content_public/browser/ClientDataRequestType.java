
// Copyright 2022 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by
//     java_cpp_enum.py
// From
//     ../../content/browser/webauth/client_data_json.h

package org.chromium.content_public.browser;

import androidx.annotation.IntDef;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@IntDef({
    ClientDataRequestType.U2F_REGISTER, ClientDataRequestType.U2F_SIGN,
    ClientDataRequestType.WEB_AUTHN_CREATE, ClientDataRequestType.WEB_AUTHN_GET,
    ClientDataRequestType.PAYMENT_GET
})
@Retention(RetentionPolicy.SOURCE)
public @interface ClientDataRequestType {
  int U2F_REGISTER = 0;
  int U2F_SIGN = 1;
  int WEB_AUTHN_CREATE = 2;
  int WEB_AUTHN_GET = 3;
  int PAYMENT_GET = 4;
}