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
package org.openhab.binding.swegonventilation.internal;

/**
 * Exception for Swegon ventilation system errors.
 *
 * @author Pauli Anttila
 * @since 1.4.0
 */
public class SwegonVentilationException extends Exception {

    private static final long serialVersionUID = 8030315127747955747L;

    public SwegonVentilationException() {
        super();
    }

    public SwegonVentilationException(String message) {
        super(message);
    }

    public SwegonVentilationException(String message, Throwable cause) {
        super(message, cause);
    }

    public SwegonVentilationException(Throwable cause) {
        super(cause);
    }

}
