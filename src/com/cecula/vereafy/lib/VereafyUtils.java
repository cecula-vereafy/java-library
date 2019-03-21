package com.cecula.vereafy.lib;

public final class VereafyUtils {

	private VereafyUtils() {
		// Empty Constructor
	}

	private static final String BASE_URL = "https://api.cecula.com";
	
	public static final String INITIALIZATION_ENDPOINT = BASE_URL+"/twofactor/init";
	public static final String COMPLETION_ENDPOINT = BASE_URL+"/twofactor/complete";
	public static final String RESEND_ENDPOINT = BASE_URL+"/twofactor/resend";
	public static final String GET_BALANCE_ENDPOINT = BASE_URL+"";
}
