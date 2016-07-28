package com.vineet.webservice;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public interface CalWebService {
	
	public int Add(int a,int b);
	
	public int Sub(int a,int b);

	public int div(int a,int b);

	public int Mul(int a,int b);


}
