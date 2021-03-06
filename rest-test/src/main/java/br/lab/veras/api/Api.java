package br.lab.veras.api;


import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
 
@ApplicationPath("api")
public class Api extends Application {
	 public static void main(String[] args) throws Exception {
	        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
	        context.setContextPath("/rest-test");
	 
	        Server jettyServer = new Server(8080);
	        jettyServer.setHandler(context);

	        ServletHolder jerseyServlet = context.addServlet(
	                org.glassfish.jersey.servlet.ServletContainer.class, "/*");
	           jerseyServlet.setInitOrder(0);
	    
	           // Tells the Jersey Servlet which REST service/class to load.
	           jerseyServlet.setInitParameter(
	              "jersey.config.server.provider.classnames",
	              CalculatorREST.class.getCanonicalName());	        
	        try {
	            jettyServer.start();
	            jettyServer.join();
	        } finally {
	            jettyServer.destroy();
	        }
	    } 
}