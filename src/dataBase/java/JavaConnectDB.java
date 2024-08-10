package dataBase.java;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;

import com.mysql.cj.protocol.a.MysqlBinaryValueDecoder;

public class JavaConnectDB {
	public static void main(String[] args) {
		
		try {
		com.mysql.cj.jdbc.Driver d=new com.mysql.cj.jdbc.Driver();
		DriverManager.registerDriver(d);
		
		Connection n=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo","root", "root");
		
		if(n!=null)
		{
			System.out.println("Connection created ");
		}else
		{
			System.out.println("Some problem is here ");
		}
		
		}catch(Exception e)
		{
			
			System.out.println(e);
		}
		
		
		
		
	}

}
