package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConn {
	public static Connection getConnnection() {
		  Connection conn = null;
		  @SuppressWarnings("unused")
		Statement stmt = null;
		  @SuppressWarnings("unused")
		ResultSet rs = null;
		  String url = null;
		  String user = null;
		  String password = null;
		  @SuppressWarnings("unused")
		String sql = null;
		try {
	
			Class.forName("com.mysql.jdbc.Driver"); //����mysq����
			  } catch (ClassNotFoundException e) {
			   System.out.println("�������ش���");
			   e.printStackTrace();//��ӡ������ϸ��Ϣ
			  }
			  try {
			   url = 
			    "jdbc:mysql://192.168.3.110/bank?user=bank&password=admin&useUnicode=true&&characterEncoding=gb2312&autoReconnect=true&relaxAutoCommit=true&zeroDateTimeBehavior=convertToNull";//��д����url = "jdbc:myqsl://localhost/test(���ݿ���)? user=root(�û�)&password=yqs2602555(����)";
			   user = "bank";
			   password = "admin";
			   conn = DriverManager.getConnection(url,user,password);
			   //System.out.println("���ݿ������ӣ�����");
			  } catch (SQLException e) {
			   System.out.println("���ݿ����Ӵ���");
			   e.printStackTrace();
			  }
		
		return conn;
	}
}
