package com.cisco.rwhitear.threeParREST.authenticate.json;

import com.google.gson.Gson;

public class LoginResponseJSON {
	
	private String request;
	
	
	public String getSessionToken(String request) {
		this.request = request;
		
		Gson gson = new Gson();
		
		LoginResponseJsonWrapper lrd = gson.fromJson(this.request, LoginResponseJsonWrapper.class);
		
		//System.out.println(lrd.getData().getSession_token());
		
		return lrd.getKey();
		
	}
	
}

class LoginResponseJsonWrapper {
	
	private String key;
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

}


