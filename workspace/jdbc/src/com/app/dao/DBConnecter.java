package com.app.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnecter {
   public static Connection getConnection() {
      Connection connection = null;
      
//      ���ῡ �ʿ��� ����
      String userName = "hr";
      String password = "hr";
      String url = "jdbc:oracle:thin:@localhost:1521:XE";
      
      try {
//         ����̹��� �޸𸮿� �Ҵ�
         Class.forName("oracle.jdbc.driver.OracleDriver");
         connection = DriverManager.getConnection(url, userName, password);
      } catch (ClassNotFoundException e) {
         System.out.println("����̹� �ε� ����");
         e.printStackTrace();
      } catch (SQLException e) {
         System.out.println("���� ���� ����");
         e.printStackTrace();
      }
      return connection;
   }
}
