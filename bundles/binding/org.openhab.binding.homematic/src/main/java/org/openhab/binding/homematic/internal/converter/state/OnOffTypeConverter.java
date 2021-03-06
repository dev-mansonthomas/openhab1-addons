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
package org.openhab.binding.homematic.internal.converter.state;

import org.openhab.binding.homematic.internal.model.HmValueItem;
import org.openhab.core.library.types.OnOffType;

/**
 * Converts between openHAB OnOffType and Homematic values.
 *
 * @author Gerhard Riegler
 * @since 1.5.0
 */
public class OnOffTypeConverter extends AbstractEnumTypeConverter<OnOffType> {

    /**
     * {@inheritDoc}
     */
    @Override
    protected OnOffType getFalseType() {
        return OnOffType.OFF;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    protected OnOffType getTrueType() {
        return OnOffType.ON;
    }

    /**
     * If the item is a sensor or a state from some devices, then OnOff must be
     * inverted.
     */
    @Override
    protected boolean isInvert(HmValueItem hmValueItem) {
        return isName(hmValueItem, "SENSOR") || isStateInvertDevice(hmValueItem);
    }
}
