/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network;

import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for VirtualNetworkGatewayConnectionStatus.
 */
public final class VirtualNetworkGatewayConnectionStatus {
    /** Static value Unknown for VirtualNetworkGatewayConnectionStatus. */
    public static final VirtualNetworkGatewayConnectionStatus UNKNOWN = new VirtualNetworkGatewayConnectionStatus("Unknown");

    /** Static value Connecting for VirtualNetworkGatewayConnectionStatus. */
    public static final VirtualNetworkGatewayConnectionStatus CONNECTING = new VirtualNetworkGatewayConnectionStatus("Connecting");

    /** Static value Connected for VirtualNetworkGatewayConnectionStatus. */
    public static final VirtualNetworkGatewayConnectionStatus CONNECTED = new VirtualNetworkGatewayConnectionStatus("Connected");

    /** Static value NotConnected for VirtualNetworkGatewayConnectionStatus. */
    public static final VirtualNetworkGatewayConnectionStatus NOT_CONNECTED = new VirtualNetworkGatewayConnectionStatus("NotConnected");

    private String value;

    /**
     * Creates a custom value for VirtualNetworkGatewayConnectionStatus.
     * @param value the custom value
     */
    public VirtualNetworkGatewayConnectionStatus(String value) {
        this.value = value;
    }

    @JsonValue
    @Override
    public String toString() {
        return value;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof VirtualNetworkGatewayConnectionStatus)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        VirtualNetworkGatewayConnectionStatus rhs = (VirtualNetworkGatewayConnectionStatus) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
