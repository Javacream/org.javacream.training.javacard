/** 
 * Copyright (c) 1998, 2019, Oracle and/or its affiliates. All rights reserved.
 * 
 */


package org.javacream.training.javacard;

import javacard.framework.APDU;
import javacard.framework.Applet;

public class Training extends Applet {

    /**
     * Installs this applet.
     * 
     * @param bArray
     *            the array containing installation parameters
     * @param bOffset
     *            the starting offset in bArray
     * @param bLength
     *            the length in bytes of the parameter data in bArray
     */
    public static void install(byte[] bArray, short bOffset, byte bLength) {
        new Training();
    }

    /**
     * Only this class's install method should create the applet object.
     */
    protected Training() {
        register();
    }

    /**
     * Processes an incoming APDU.
     * 
     * @see APDU
     * @param apdu
     *            the incoming APDU
     */
    @Override
    public void process(APDU apdu) {
        //Insert your code here
    }
}
