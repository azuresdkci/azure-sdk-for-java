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
 * Defines values for SecurityRuleAccess.
 */
public final class SecurityRuleAccess {
    /** Static value Allow for SecurityRuleAccess. */
    public static final SecurityRuleAccess ALLOW = new SecurityRuleAccess("Allow");

    /** Static value Deny for SecurityRuleAccess. */
    public static final SecurityRuleAccess DENY = new SecurityRuleAccess("Deny");

    private String value;

    /**
     * Creates a custom value for SecurityRuleAccess.
     * @param value the custom value
     */
    public SecurityRuleAccess(String value) {
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
        if (!(obj instanceof SecurityRuleAccess)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        SecurityRuleAccess rhs = (SecurityRuleAccess) obj;
        if (value == null) {
            return rhs.value == null;
        } else {
            return value.equals(rhs.value);
        }
    }
}
