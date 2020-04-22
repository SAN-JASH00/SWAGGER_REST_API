package com.san.config;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import io.swagger.jaxrs.config.BeanConfig;

public class SwaggerConfig extends HttpServlet{
	
	
	private static final long serialVersionUID = -4554955339937189382L;
	public void init(ServletConfig config) throws ServletException
	{
		//super.init(config);
		BeanConfig beanConfig = new BeanConfig();
		
		beanConfig.setBasePath("/rest");
		beanConfig.setVersion("1.0");
		beanConfig.setTitle("RestAPI");
		beanConfig.setResourcePackage("com.san");
		
		String[] schemes = {"https", "http"};
		 
		beanConfig.setSchemes(schemes);
		beanConfig.setScan(true);
		beanConfig.setPrettyPrint(true);
		//beanConfig.setHost("https://java-swagger-restapi.herokuapp.com");
	}
	

}
