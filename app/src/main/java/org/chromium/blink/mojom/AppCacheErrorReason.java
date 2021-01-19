
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/appcache/appcache.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;

public final class AppCacheErrorReason {


    public static final int APPCACHE_MANIFEST_ERROR = 0;

    public static final int APPCACHE_SIGNATURE_ERROR = APPCACHE_MANIFEST_ERROR + 1;

    public static final int APPCACHE_RESOURCE_ERROR = APPCACHE_SIGNATURE_ERROR + 1;

    public static final int APPCACHE_CHANGED_ERROR = APPCACHE_RESOURCE_ERROR + 1;

    public static final int APPCACHE_ABORT_ERROR = APPCACHE_CHANGED_ERROR + 1;

    public static final int APPCACHE_QUOTA_ERROR = APPCACHE_ABORT_ERROR + 1;

    public static final int APPCACHE_POLICY_ERROR = APPCACHE_QUOTA_ERROR + 1;

    public static final int APPCACHE_UNKNOWN_ERROR = APPCACHE_POLICY_ERROR + 1;

    public static final int MIN_VALUE = (int) (0);
    public static final int MAX_VALUE = (int) (7);

    private static final boolean IS_EXTENSIBLE = false;

    public static boolean isKnownValue(int value) {
        switch (value) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return true;
        }
        return false;
    }

    public static void validate(int value) {
        if (IS_EXTENSIBLE || isKnownValue(value))
            return;

        throw new DeserializationException("Invalid enum value.");
    }

    private AppCacheErrorReason() {}

}