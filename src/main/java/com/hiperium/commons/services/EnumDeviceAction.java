/**
 * Product  : Hiperium Project
 * Architect: Andres Solorzano.
 * Created  : 08-05-2009 - 23:30:00
 * 
 * The contents of this file are copyrighted by Andres Solorzano 
 * and it is protected by the license: "GPL V3." You can find a copy of this 
 * license at: http://www.hiperium.com/about/licence.html
 * 
 * Copyright 2014 Andres Solorzano. All rights reserved.
 * 
 */
package com.hiperium.commons.services;

/**
 * This enumeration specifies the actions over the devices in the system.
 * 
 * @author Andres Solorzano
 */
public enum EnumDeviceAction {

	/** The ACTIVATE element witch value is activate. */
	ACTIVATE("activate"),

	/** The DEACTIVATE element witch value is deactivate. */
	DEACTIVATE("deactivate"),

	/** The OPEN element witch value is open. */
	OPEN("open"),

	/** The CLOSE element witch value is close. */
	CLOSE("close"),
	
	/** The LOCK element witch value is locked. */
	LOCK("lock"),

	/** The UNLOCK element witch value is unlocked. */
	UNLOCK("unlock");

	/** Property that contains the value of the element. */
	private final String label;

	/**
	 * Enumeration constructor.
	 * 
	 * @param label
	 *            Label of the enumeration element
	 */
	EnumDeviceAction(String label) {
		this.label = label;
	}

	/**
	 * Return the label associate to the element of the enumeration.
	 * 
	 * @return the label associate with the enumeration
	 */
	public String getLabel() {
		return this.label;
	}
	
	/**
	 * Decodes a label of a specific frequency.
	 * 
	 * @param label
	 *            the label to be decoded
	 * @return a frequency of a specific value.
	 */
	public static EnumDeviceAction decodeValue(String label) {
		for (EnumDeviceAction e : EnumDeviceAction.values()) {
			if (e.getLabel().equals(label)) {
				return e;
			}
		}
		return EnumDeviceAction.ACTIVATE;
	}
}
