package com.cisco.rwhitear.threeParREST;

import java.io.IOException;

import org.apache.commons.httpclient.HttpException;

import com.cisco.rwhitear.threeParREST.authenticate.GetSessionToken;

public class AuthTest {

	public static void main(String[] args) throws HttpException, IOException {
		
		String ipAddress = "10.51.8.210";
		String user = "3paradm";
		String password = "3pardata";
		
		String token = new GetSessionToken(ipAddress, user, password).getNewToken();

		System.out.println("3Par WAPI Auth Token: " + token );
	}

}
