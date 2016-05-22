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
package com.hiperium.commons.services.restful.path;

/**
 * 
 * @author Andres Solorzano
 */
public final class ControlRestfulPath {

	// ***************************************************************** //
	// ***************************************************************** //
	// ************************ APPLICATION CONTEXT ******************** //
	// ***************************************************************** //
	// ***************************************************************** //

	/** The property SECURITY_CONTEXT_ROOT with path /hiperium-security. */
	public static final String CONTROL_CONTEXT_ROOT = "/hiperium-control";

	// ***************************************************************** //
	// ***************************************************************** //
	// ************************ APPLICATION PATH *********************** //
	// ***************************************************************** //
	// ***************************************************************** //

	/** The property CONTROL_PATH with path /api/control. */
	public static final String CONTROL_PATH = "/api/control";

	// ***************************************************************** //
	// ***************************************************************** //
	// ******************************** PATHS ************************** //
	// ***************************************************************** //
	// ***************************************************************** //

	/**
	 * The property DEVICES with REST path /device.
	 */
	public static final String DEVICES = "/device";

	/**
	 * The property TASKS with REST path /task.
	 */
	public static final String TASKS = "/task";

	/**
	 * The property ZONES with REST path /zone.
	 */
	public static final String ZONES = "/zone";

	// ***************************************************************** //
	// ***************************************************************** //
	// ************************ FUNCTIONALITIES ************************ //
	// ***************************************************************** //
	// ***************************************************************** //

	/** The CREATE property path. */
	public static final String CREATE = "/create";

	/** The UPDATE property path. */
	public static final String UPDATE = "/update";

	/** The DELETE property path. */
	public static final String DELETE = "/delete";
	
	/** The FIND_DEVICE_BY_HOME_ID property path. */
	public static final String FIND_DEVICE_BY_HOME_ID = "/findByHomeId";

	/** The FIND_DEVICE_BY_ZONE_ID property path. */
	public static final String FIND_DEVICE_BY_ZONE_ID = "/findByZoneId";
	
	/** The FIND_DEVICE_BY_CLASS property path. */
	public static final String FIND_DEVICE_BY_CLASS = "/findByClass";

	/** The FIND_TASK_BY_HOME_ID property path. */
	public static final String FIND_TASK_BY_HOME_ID = "/findByHomeId";

	/** The FIND_ZONE_BY_ID property path. */
	public static final String FIND_ZONE_BY_ID = "/findById";

	/** The USER_OPERATION property path. */
	public static final String FIND_ZONE_BY_PROFILE_ID = "/findByProfileId";

	/** The HOME_OPERATION property path /userOperation. */
	public static final String USER_OPERATION = "/userOperation";
	
	/** The HOME_OPERATION property path /homeOperation. */
	public static final String HOME_OPERATION = "/homeOperation";

}
