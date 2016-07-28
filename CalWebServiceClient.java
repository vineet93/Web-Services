package com.vineet.webservice;

import java.net.MalformedURLException;
import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class CalWebServiceClient {

	public static void main(String[] args) throws MalformedURLException {
	
		URL url = new URL("http://localhost:40256/cal?wsdl");
		
		QName qname = new QName("http://webservice.vineet.com/","CalWebServiceImplService");
		
		Service ser =Service.create(url,qname);
        CalWebService calservice = ser.getPort(CalWebService.class);
        
        System.out.println(calservice.Add(2,3));
        System.out.println(calservice.Sub(2,3));
        System.out.println(calservice.div(6,3));
        System.out.println(calservice.Mul(2,3));
        
	}

}
