package com.amithora.gemfire.example;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;



public class GemfirXDJDBC {

	public static void main(String args[]) throws SQLException{
		DriverManager.registerDriver(new com.pivotal.gemfirexd.jdbc.ClientDriver());

	      java.sql.Connection cxn = DriverManager.getConnection("jdbc:gemfirexd://localhost:1528/");
	      System.out.println("Connected to : jdbc:gemfirexd://xx.xx.xx.xx:10334/");
	      java.sql.Statement st=cxn.createStatement( ResultSet.TYPE_SCROLL_INSENSITIVE,
                  ResultSet.CONCUR_READ_ONLY);
//	      st.execute("CREATE TABLE app(appname VARCHAR(20),appstatus VARCHAR(20))");
//	      st.execute("INSERT INTO app VALUES('SINT','ACTIVE')");
//	      st.execute("INSERT INTO app VALUES('BUZZ','ACTIVE')");
//	      st.execute("INSERT INTO app VALUES('PA','ACTIVE')");
//	      st.execute("INSERT INTO app VALUES('SNP','ACTIVE')");
	      ResultSet rs = st.executeQuery("SELECT * FROM app where appname='O360'");
	      System.out.println(rs.next());
	      rs.first();
	      System.out.println("appaname -- "+rs.getString("appname")+" appstatus -- "+rs.getString("appstatus"));
	      ResultSetMetaData meta = rs.getMetaData();
	      int colCnt = meta.getColumnCount();
	      System.out.println(colCnt);

	      /*CallableStatement cs = cxn
	    	        .prepareCall("CALL SYS.ATTACH_LOADER(?,?,?,?)");
	    	   cs.setString(1, "app");
	    	   cs.setString(2, "app");
	    	   cs.setString(3, "com.kpit.cache.JDBCRowLoader");
	    	   cs.setString(4, null);
	    	   cs.execute();*/
	      
	}
}
