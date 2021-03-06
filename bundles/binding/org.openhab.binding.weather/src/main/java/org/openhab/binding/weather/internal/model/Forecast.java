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
package org.openhab.binding.weather.internal.model;

/**
 * Marker class for forecast weather data.
 *
 * @author Gerhard Riegler
 * @since 1.6.0
 */
public class Forecast extends Weather {
    private int day;

    public Forecast(ProviderName provider) {
        super(provider);
    }

    /**
     * Returns the day of the forecast.
     */
    public int getDay() {
        return day;
    }

    /**
     * Sets the day of the forecast.
     */
    public void setDay(int day) {
        this.day = day;
    }

}
