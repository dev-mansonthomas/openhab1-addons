/**
 * Copyright (c) 2010-2019 Contributors to the openHAB project
 *
 * See the NOTICE file(s) distributed with this work for additional
 * information.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0
 *
 * SPDX-License-Identifier: EPL-2.0
 */
package org.openhab.binding.satel.internal.types;

/**
 * Base of all kinds of Integra state.
 *
 * @author Krzysztof Goworek
 * @since 1.7.0
 */
public interface StateType {

    /**
     * Returns Satel command to get current state for this state type.
     *
     * @return command identifier
     */
    byte getRefreshCommand();

    /**
     * Returns number of payload bytes in refresh command.
     *
     * @param extendedCmd if <code>true</code> return number of bytes for extended command
     * @return payload length
     */
    int getPayloadLength(boolean extendedCmd);

    /**
     * Returns object type for this kind of state.
     *
     * @return Integra object type
     */
    ObjectType getObjectType();

    /**
     * Returns state's first byte in the response buffer.
     *
     * @return start byte in the response
     */
    int getStartByte();

    /**
     * Returns number of state bytes in the response buffer.
     *
     * @param extendedCmd if <code>true</code> return number of bytes for extended command
     * @return bytes count in the response
     */
    int getBytesCount(boolean extendedCmd);

}
