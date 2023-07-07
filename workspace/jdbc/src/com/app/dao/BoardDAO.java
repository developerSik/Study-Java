package com.app.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.app.domain.BoardDTO;
import com.app.domain.BoardVO;

public class BoardDAO {
   public Connection connection;
   public PreparedStatement preparedStatement;
   public ResultSet resultSet;
   
//   게시글 추가
   public void insert(BoardVO boardVO) {
      String query = "INSERT INTO TBL_BOARD(BOARD_ID, BOARD_TITLE, BOARD_CONTENT, USER_ID) "
            + "VALUES(SEQ_BOARD.NEXTVAL, ?, ?, ?)";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, boardVO.getBoardTitle());
         preparedStatement.setString(2, boardVO.getBoardContent());
         preparedStatement.setString(3, boardVO.getBoardRegisterDate());
         preparedStatement.setString(4, boardVO.getBoardUpdateDate());
         preparedStatement.setLong(5, UserDAO.userId);
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         System.out.println("insert(BoardVO) SQL 오류");
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
   }
   
//   게시글 1개 조회
   public BoardDTO select(Long boardId) {
      String query = "SELECT BOARD_ID, BOARD_TITLE, BOARD_CONTENT, BOARD_REGISTER_DATE, BOARD_UPDATE_DATE, USER_ID, USER_IDENTIFICATION "
            + "FROM TBL_USER U JOIN TBL_BOARD B ON U.USER_ID = B.USER_ID AND BOARD_ID = ?";
      BoardDTO boardDTO = new BoardDTO();
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, boardId);
         resultSet = preparedStatement.executeQuery();
         
         resultSet.next();
         boardDTO.setBoardId(resultSet.getLong(1));
         boardDTO.setBoardTitle(resultSet.getString(2));
         boardDTO.setBoardContent(resultSet.getString(3));
         boardDTO.setBoardRegisterDate(resultSet.getString(4));
         boardDTO.setBoardUpdateDate(resultSet.getString(5));
         boardDTO.setUserId(resultSet.getLong(6));
         boardDTO.setUserIdentification(resultSet.getString(7));
         
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      
      return boardDTO;
   }
   
//   게시글 전체 목록
   public List<BoardDTO> selectAll(Long boardId) {
      String query = "SELECT BOARD_ID, BOARD_TITLE, BOARD_CONTENT, BOARD_REGISTER_DATE, BOARD_UPDATE_DATE, USER_ID, USER_IDENTIFICATION "
            + "FROM TBL_USER U JOIN TBL_BOARD B ON U.USER_ID = B.USER_ID";
      BoardDTO boardDTO = null;
      List<BoardDTO> boards = new ArrayList<BoardDTO>();
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, boardId);
         resultSet = preparedStatement.executeQuery();
         
         while(resultSet.next()) {
            boardDTO = new BoardDTO();
            boardDTO.setBoardId(resultSet.getLong(1));
            boardDTO.setBoardTitle(resultSet.getString(2));
            boardDTO.setBoardContent(resultSet.getString(3));
            boardDTO.setBoardRegisterDate(resultSet.getString(4));
            boardDTO.setBoardUpdateDate(resultSet.getString(5));
            boardDTO.setUserId(resultSet.getLong(6));
            boardDTO.setUserIdentification(resultSet.getString(7));
            
            boards.add(boardDTO);
         }
         
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
      
      return boards;
   }
   
//   게시글 수정
   public void update(BoardVO boardVO) {
      String query = "UPDATE TBL_BOARD SET BOARD_TITLE = ?, BOARD_CONTENT = ?, BOARD_UPDATE_DATE = SYSDATE "
            + "WHERE BOARD_ID = ?";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setString(1, boardVO.getBoardTitle());
         preparedStatement.setString(2, boardVO.getBoardContent());
         preparedStatement.setLong(3, boardVO.getBoardId());
         preparedStatement.executeUpdate();
         
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
   }
   
//   게시글 삭제
   public void delete(Long boardId) {
      String query = "DELETE FROM TBL_BOARD WHERE BOARD_ID = ?";
      connection = DBConnecter.getConnection();
      try {
         preparedStatement = connection.prepareStatement(query);
         preparedStatement.setLong(1, boardId);
         preparedStatement.executeUpdate();
      } catch (SQLException e) {
         e.printStackTrace();
      } catch (Exception e) {
         e.printStackTrace();
      } finally {
         try {
            if(preparedStatement != null) {
               preparedStatement.close();
            }
            if(connection != null) {
               connection.close();
            }
         } catch (SQLException e) {
            throw new RuntimeException(e);
         }
      }
   }
   
   
}



























