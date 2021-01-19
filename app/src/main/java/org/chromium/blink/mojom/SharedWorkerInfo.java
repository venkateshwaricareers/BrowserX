
// Copyright 2014 The Chromium Authors. All rights reserved.
// Use of this source code is governed by a BSD-style license that can be
// found in the LICENSE file.

// This file is autogenerated by:
//     mojo/public/tools/bindings/mojom_bindings_generator.py
// For:
//     third_party/blink/public/mojom/worker/shared_worker_info.mojom
//

package org.chromium.blink.mojom;

import org.chromium.mojo.bindings.DeserializationException;


public final class SharedWorkerInfo extends org.chromium.mojo.bindings.Struct {

    private static final int STRUCT_SIZE = 40;
    private static final org.chromium.mojo.bindings.DataHeader[] VERSION_ARRAY = new org.chromium.mojo.bindings.DataHeader[] {new org.chromium.mojo.bindings.DataHeader(40, 0)};
    private static final org.chromium.mojo.bindings.DataHeader DEFAULT_STRUCT_INFO = VERSION_ARRAY[0];
    public org.chromium.url.mojom.Url url;
    public String name;
    public String contentSecurityPolicy;
    public int contentSecurityPolicyType;
    public int creationAddressSpace;

    private SharedWorkerInfo(int version) {
        super(STRUCT_SIZE, version);
    }

    public SharedWorkerInfo() {
        this(0);
    }

    public static SharedWorkerInfo deserialize(org.chromium.mojo.bindings.Message message) {
        return decode(new org.chromium.mojo.bindings.Decoder(message));
    }

    /**
     * Similar to the method above, but deserializes from a |ByteBuffer| instance.
     *
     * @throws org.chromium.mojo.bindings.DeserializationException on deserialization failure.
     */
    public static SharedWorkerInfo deserialize(java.nio.ByteBuffer data) {
        return deserialize(new org.chromium.mojo.bindings.Message(
                data, new java.util.ArrayList<org.chromium.mojo.system.Handle>()));
    }

    @SuppressWarnings("unchecked")
    public static SharedWorkerInfo decode(org.chromium.mojo.bindings.Decoder decoder0) {
        if (decoder0 == null) {
            return null;
        }
        decoder0.increaseStackDepth();
        SharedWorkerInfo result;
        try {
            org.chromium.mojo.bindings.DataHeader mainDataHeader = decoder0.readAndValidateDataHeader(VERSION_ARRAY);
            final int elementsOrVersion = mainDataHeader.elementsOrVersion;
            result = new SharedWorkerInfo(elementsOrVersion);
                {
                    
                org.chromium.mojo.bindings.Decoder decoder1 = decoder0.readPointer(8, false);
                result.url = org.chromium.url.mojom.Url.decode(decoder1);
                }
                {
                    
                result.name = decoder0.readString(16, false);
                }
                {
                    
                result.contentSecurityPolicy = decoder0.readString(24, false);
                }
                {
                    
                result.contentSecurityPolicyType = decoder0.readInt(32);
                    ContentSecurityPolicyType.validate(result.contentSecurityPolicyType);
                }
                {
                    
                result.creationAddressSpace = decoder0.readInt(36);
                    IpAddressSpace.validate(result.creationAddressSpace);
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
        
        encoder0.encode(this.url, 8, false);
        
        encoder0.encode(this.name, 16, false);
        
        encoder0.encode(this.contentSecurityPolicy, 24, false);
        
        encoder0.encode(this.contentSecurityPolicyType, 32);
        
        encoder0.encode(this.creationAddressSpace, 36);
    }
}