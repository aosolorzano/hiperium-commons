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
package com.hiperium.commons.services.path;

/**
 * 
 * @author Andres Solorzano
 */
public final class LoggingRestfulPath {

	// ***************************************************************** //
	// ***************************************************************** //
	// ************************ APPLICATION CONTEXT ******************** //
	// ***************************************************************** //
	// ***************************************************************** //

	/** The property AUDIT_CONTEXT_ROOT with path /hiperium-audit. */
	public static final String LOGGING_CONTEXT_ROOT = "/hiperium-logging";

	// ***************************************************************** //
	// ***************************************************************** //
	// ************************ APPLICATION PATH *********************** //
	// ***************************************************************** //
	// ***************************************************************** //

	/** The property LOGGING_PATH with path /api/logging. */
	public static final String LOGGING_PATH = "/api/logging";

	// ***************************************************************** //
	// ***************************************************************** //
	// ******************************** PATHS ************************** //
	// ***************************************************************** //
	// ***************************************************************** //

	/**
	 * The property APPLICATION_USER with REST path /appUser.
	 */
	public static final String DEVICE_AUDIT = "/device";

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

}
