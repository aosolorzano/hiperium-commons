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
package com.hiperium.commons.services.exception;

/**
 * Represents the error codes supported by the Application for internationalized
 * support.
 * 
 * @author Andres Solorzano.
 */
public enum EnumInformationException {
	
	/** Resource SYSTEM_EXCEPTION with the value informationException.systemException. */
	SYSTEM_EXCEPTION("informationException.systemException"),
	
	/** Resource ACCESS_NOT_ALLOWED with the value informationException.accessNotAllowed. */
	ACCESS_NOT_ALLOWED("informationException.accessNotAllowed"),
	
	/** Resource HOME_CLOUD_NOT_ENABLED with the value informationException.homeCloudNotEnabled. */
	HOME_CLOUD_NOT_ENABLED("informationException.homeCloudNotEnabled"),
	
	/** Resource CRUD_OPERATION_NOT_ALLOWED with the value informationException.crudOperationNotAllowed. */
	CRUD_OPERATION_NOT_ALLOWED("informationException.crudOperationNotAllowed"),
	
	/** Resource INVALID_FUNCTION_ACCESS_TIME with the value informationException.invalidFunctionalityAccessTime. */
	INVALID_FUNCTION_ACCESS_TIME("informationException.invalidFunctionalityAccessTime"),
	
	/** Resource USER_SESSION_NOT_FOUND with the value informationException.userSessionNotFound. */
	USER_SESSION_NOT_FOUND("informationException.userSessionNotFound"),
	
	/** Resource INVALID_ACCESS_TIME_PARAMETERS with the value informationException.invalidAccessTimeParameters. */
	INVALID_ACCESS_TIME_PARAMETERS("informationException.invalidAccessTimeParameters"),
	
	/** Resource USER_NOT_FOUND with the value informationException.userNotFound. */
	USER_NOT_FOUND("informationException.userNotFound"),
	
	/** Resource USER_NOT_FOUND with the value informationException.menuItemNotFound. */
	MENU_ITEM_NOT_FOUND("informationException.menuItemNotFound"),
	
	/** Resource USER_ACCOUNT_LOCKED with the value informationException.userAccountLocked. */
	USER_ACCOUNT_LOCKED("informationException.userAccountLocked"),
	
	/** Resource USER_PREVIOUS_PASS_NOT_MATCH with the value informationException.previousPasswdNotMatch. */
	USER_PREVIOUS_PASS_NOT_MATCH("informationException.previousPasswdNotMatch"),
	
	/** Resource ADMIN_PROFILE_REMOVED with the value informationException.adminProfileRemoved. */
	ADMIN_PROFILE_REMOVED("informationException.adminProfileRemoved"),
	
	/** Resource ADMIN_PROFILE_FUNCTION_UPDATED with the value informationException.adminProfileFunctionUpdated. */
	ADMIN_PROFILE_FUNCTION_UPDATED("informationException.adminProfileFunctionUpdated"),
	
	/** Resource ADMIN_PROFILE_FUNCTION_REMOVED with the value informationException.adminProfileFunctionRemoved. */
	ADMIN_PROFILE_FUNCTION_REMOVED("informationException.adminProfileFunctionRemoved"),
	
	/** Resource USER_ADMIN_PROFILE_REMOVED with the value informationException.userAdminProfileRemoved. */
	USER_ADMIN_PROFILE_REMOVED("informationException.userAdminProfileRemoved"),
	
	/** Resource ADMIN_PROFILE_STATE_CHANGED with the value informationException.adminProfileRemoved. */
	ADMIN_PROFILE_STATE_CHANGED("informationException.adminProfileStateChanged"),
	
	/** Resource ADMIN_USER_PROFILE_REMOVED with the value informationException.adminUserProfileRemoved. */
	ADMIN_USER_PROFILE_REMOVED("informationException.adminUserProfileRemoved"),
	
	/** Resource TASK_DATE_TIME with the value informationException.taskDateTime. */
	TASK_DATE_TIME("informationException.taskDateTime"),
	
	/** Resource FUNCTIONALITY_ACCESS_DENIED with the value informationException.functionalityAccessDenied. */
	FUNCTIONALITY_ACCESS_DENIED("informationException.functionalityAccessDenied"),
	
	/** Resource OPTIMISTIC_LOCK with the value informationException.optimisticLock. */
	OPTIMISTIC_LOCK("informationException.optimisticLock"),
	
	/** Resource INVALID_USER_EMAIL_ADDRESS with the value informationException.invalidUserEmailAddress. */
	INVALID_USER_EMAIL_ADDRESS("informationException.invalidUserEmailAddress"),
	
	/** Resource SENDING_EMAIL_PROBLEM with the value informationException.sendingEmailProblem. */
	SENDING_EMAIL_PROBLEM("informationException.sendingEmailProblem");

	/** Property code. */
	private final String code;

	/**
	 * The Enumeration constructor.
	 * 
	 * @param code
	 *            the information exception code.
	 */
	private EnumInformationException(String code) {
		this.code = code;
	}

	/**
	 * Return the value associate to the element of the enumeration.
	 * 
	 * @return the value associate with the enumeration
	 */
	public String getCode() {
		return this.code;
	}
}
