package com.vineet.webservice;

import javax.xml.ws.Endpoint;

public class CalWebServicePublish {

	public static void main(String[] args) {
	
		Endpoint endpoint = Endpoint.publish("http://localhost:40256/cal", new CalWebServiceImpl());
          System.out.println(endpoint.isPublished());
	}

}
