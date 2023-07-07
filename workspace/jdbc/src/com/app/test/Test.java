package com.app.test;

import com.app.dao.UserDAO;
import com.app.domain.UserVO;

public class Test {
   public static void main(String[] args) {
      UserDAO userDAO = new UserDAO();
      
      System.out.println(userDAO.checkId("hds31234"));
      
      UserVO userVO = new UserVO();
      
      userVO.setUserIdentification("JSS1234");
      userVO.setUserPassword("1234");
      userVO.setUserName("Á¤»ó½Ä");
      userVO.setUserPhone("01012341234");
      userVO.setUserEmail("HEC5030@gmail.com");
      
      userDAO.insert(userVO);
      
   }
}
