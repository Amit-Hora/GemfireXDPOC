package com.amithora.gemfire.example;
/*package com.kpit.cache;

import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Properties;
import java.util.Queue;
import java.util.Map.Entry;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.pivotal.gemfirexd.callbacks.Event;
import com.pivotal.gemfirexd.callbacks.EventCallback;
*//**
 * EventCallbackWriterImpl is an implementation of the EventCallback interface
 * that writes to backend database. It works with tables having a primary key.
 * 
 * EventCallbackWriterImpl has the following features:
 * <ul>
 * <li>It can be used for any JDBC data source (provided the driver is available
 * in the classpath of the server).</li>
 * <li>It can be used for any table, although a separate instance of the
 * EventCallbackWriterImpl is created for each table.</li>
 * <li>It will pool JDBC Connections, with a configurable minimum and maximum
 * number of connections.</li>
 * </ul>
 * 
 * 
 * The EventCallbackWriterImpl is configured with an initialization string
 * passed as the 4th parameter to the SYS.ATTACH_WRITER procedure. The
 * initialization string should contain a delimited set of parameters for the
 * EventCallbackWriterImpl.
 * 
 * The first character in the initialization string is used as the delimiter for
 * the rest of the parameters, so the string should start with a delimiter
 * character.
 * 
 * Accepted parameters are:
 * 
 * <ul>
 * <li>url (required) - the JDBC URL of the database to connect to</li>
 * <li>min-connections (optional, default is 1) - the minimum number of
 * connections to maintain in the connection pool</li>
 * <li>max-connections (optional, default is 1) - the maximum number of
 * connections to maintain in the connection pool</li>
 * <li>connection-timeout (optional, default is 10000) - the maximum amount of
 * time to wait, in milliseconds, for a connection to become available in the
 * connection pool</li>
 * </ul>
 * 
 * 
 * 
 * Note: For this implementation, it is required that the schema and table name
 * in GemFireXD match the schema and table name in the backend database. And the
 * column layout of the backend table should match the column layout of the
 * GemFireXD table.
 * 
 *//*

public class Listener implements EventCallback{

	public void close() throws SQLException {
		// TODO Auto-generated method stub
		
	}

	public void init(String arg0) throws SQLException {
		log.entering("EventCallbackWriterImpl", "init()");
		loadParametersFromInitString(arg0);	
	}
	  *//**
	   * Parse the initialization string, and initialize the member fields
	   * 
	   * @param initStr
	   *          the initialization string
	   * @throws SQLException 
	   *//*
	  private void loadParametersFromInitString(String initStr) throws SQLException {
	    parsePropertiesFromString(initStr);
	    this.url = getProperty("url", "");
	    if (url.isEmpty()) {
	      throw new SQLException("Connection url not provided "
	          + "for EventCallbackWriterImpl", "XJ028", VENDOR_CODE_NO_URL);
	    }
	    this.minConnections = Integer.parseInt("1");
	    this.maxConnections = Integer.parseInt("5");
	    this.connectionTimeout = Long.parseLong("10000");
	  }

	  *//**
	   * Parse the initialization string and put key value pairs into property
	   * 
	   * @param initStr
	   *          initialization string
	   *//*
	  private void parsePropertiesFromString(String initStr) {
	    if (initStr.length() > 1) {
	      String delimiter = initStr.substring(0, 1);
	      String[] params = initStr.substring(1).split("\\" + delimiter);

	      for (String parameter : params) {
	        int equalsIndex = parameter.indexOf('=');
	        if ((equalsIndex > 0) & (parameter.length() > equalsIndex + 1)) {
	          String key = parameter.substring(0, equalsIndex).trim();
	          String value = parameter.substring(equalsIndex + 1).trim();
	          props.put(key, value);
	        }
	      }
	    }
	  }


	public void onEvent(Event arg0) throws SQLException {
		// TODO Auto-generated method stub
		
	}
	

}
*/