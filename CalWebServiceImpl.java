package com.vineet.webservice;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(endpointInterface="com.vineet.webservice.CalWebService")
@SOAPBinding(style=Style.RPC)
public class CalWebServiceImpl implements CalWebService {
    
	public static void main(String[] args) {
		
		

	}

	@Override
	public int Add(int a, int b) {
		// TODO Auto-generated method stub
		return (a+b);
	}

	@Override
	public int Sub(int a, int b) {
		// TODO Auto-generated method stub
		return (a-b);
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return (a/b);
	}

	@Override
	public int Mul(int a, int b) {
		// TODO Auto-generated method stub
		return (a*b);
	}

}
