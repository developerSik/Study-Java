package com.app.domain;

public class BoardVO {
   private Long boardId;
   private String boardTitle;
   private String boardContent;
   private String boardRegisterDate;
   private String boardUpdateDate;
   private Long userId;
   
   public BoardVO() {;}

   public Long getBoardId() {
      return boardId;
   }

   public void setBoardId(Long boardId) {
      this.boardId = boardId;
   }

   public String getBoardTitle() {
      return boardTitle;
   }

   public void setBoardTitle(String boardTitle) {
      this.boardTitle = boardTitle;
   }

   public String getBoardContent() {
      return boardContent;
   }

   public void setBoardContent(String boardContent) {
      this.boardContent = boardContent;
   }

   public String getBoardRegisterDate() {
      return boardRegisterDate;
   }

   public void setBoardRegisterDate(String boardRegisterDate) {
      this.boardRegisterDate = boardRegisterDate;
   }

   public String getBoardUpdateDate() {
      return boardUpdateDate;
   }

   public void setBoardUpdateDate(String boardUpdateDate) {
      this.boardUpdateDate = boardUpdateDate;
   }

   public Long getUserId() {
      return userId;
   }

   public void setUserId(Long userId) {
      this.userId = userId;
   }

   @Override
   public String toString() {
      return "BoardVO [boardId=" + boardId + ", boardTitle=" + boardTitle + ", boardContent=" + boardContent
            + ", boardRegisterDate=" + boardRegisterDate + ", boardUpdateDate=" + boardUpdateDate + ", userId="
            + userId + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((boardId == null) ? 0 : boardId.hashCode());
      return result;
   }

   @Override
   public boolean equals(Object obj) {
      if (this == obj)
         return true;
      if (obj == null)
         return false;
      if (getClass() != obj.getClass())
         return false;
      BoardVO other = (BoardVO) obj;
      if (boardId == null) {
         if (other.boardId != null)
            return false;
      } else if (!boardId.equals(other.boardId))
         return false;
      return true;
   }
}