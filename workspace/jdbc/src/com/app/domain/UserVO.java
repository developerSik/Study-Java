package com.app.domain;

public class UserVO {
   private Long userId;
   private String userIdentification;
   private String userPassword;
   private String userName;
   private String userPhone;
   private String userNickname;
   private String userEmail;
   private String userAddress;
   private String userBirth;
   private String userRecommenderId;
   private String userStatus;
   
   public UserVO() {;}

   public Long getUserId() {
      return userId;
   }

   public void setUserId(Long userId) {
      this.userId = userId;
   }

   public String getUserIdentification() {
      return userIdentification;
   }

   public void setUserIdentification(String userIdentification) {
      this.userIdentification = userIdentification;
   }

   public String getUserPassword() {
      return userPassword;
   }

   public void setUserPassword(String userPassword) {
      this.userPassword = userPassword;
   }

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getUserPhone() {
      return userPhone;
   }

   public void setUserPhone(String userPhone) {
      this.userPhone = userPhone;
   }

   public String getUserNickname() {
      return userNickname;
   }

   public void setUserNickname(String userNickname) {
      this.userNickname = userNickname;
   }

   public String getUserEmail() {
      return userEmail;
   }

   public void setUserEmail(String userEmail) {
      this.userEmail = userEmail;
   }

   public String getUserAddress() {
      return userAddress;
   }

   public void setUserAddress(String userAddress) {
      this.userAddress = userAddress;
   }

   public String getUserBirth() {
      return userBirth;
   }

   public void setUserBirth(String userBirth) {
      this.userBirth = userBirth;
   }

   public String getUserRecommenderId() {
      return userRecommenderId;
   }

   public void setUserRecommenderId(String userRecommenderId) {
      this.userRecommenderId = userRecommenderId;
   }
   
   public String getUserStatus() {
      return userStatus;
   }

   public void setUserStatus(String userStatus) {
      this.userStatus = userStatus;
   }

   @Override
   public String toString() {
      return "UserVO [userId=" + userId + ", userIdentification=" + userIdentification + ", userPassword="
            + userPassword + ", userName=" + userName + ", userPhone=" + userPhone + ", userNickname="
            + userNickname + ", userEmail=" + userEmail + ", userAddress=" + userAddress + ", userBirth="
            + userBirth + ", userRecommenderId=" + userRecommenderId + ", userStatus=" + userStatus + "]";
   }

   @Override
   public int hashCode() {
      final int prime = 31;
      int result = 1;
      result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
      UserVO other = (UserVO) obj;
      if (userId == null) {
         if (other.userId != null)
            return false;
      } else if (!userId.equals(other.userId))
         return false;
      return true;
   }
   
}
  
