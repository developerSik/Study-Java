package methodTest;

public class MethodTask {
//   1~10까지 println()으로 출력하는 메소드
   void printFrom1To10() {
      for (int i = 0; i < 10; i++) {
         System.out.println(i+1);
      }
   }
   
//   "홍길동"을 n번 println()으로 출력하는 메소드
   void printHong(int end) {
      for (int i = 0; i < end; i++) {
         System.out.println("홍길동");
      }
   }
   
//   이름을 n번 println()으로 출력하는 메소드
   void printName(String name, int end) {
      for (int i = 0; i < end; i++) {
         System.out.println(name);
      }
   }
   
//   세 정수를 뺄셈해주는 메소드
   int sub(int number1, int number2, int number3) {
      return number1 - number2 - number3;
   }
   
//   두 정수의 나눗셈 후 몫과 나머지 두 개를 구하는 메소드
   int[] div(int number1, int number2) {
      int[] results = null;
      
      if(number2 != 0) {
         results = new int[2];
         results[0] = number1 / number2;
         results[1] = number1 % number2;
      }
      
      return results;
   }
   
//   1~n까지의 합을 구해주는 메소드
   int getTotal(int end) {
      int total = 0;
      
      for (int i = 0; i < end; i++) {
         total += i + 1;
      }
      
      return total;
   }
   
//   홀수를 짝수로, 짝수를 홀수로 바꿔주는 메소드
   int change(int number) {
      return ++number;
   }
   
//   문자열을 입력받고 소문자는 대문자로, 대문자는 소문자로 바꿔주는 메소드
   String changeString(String string) {
      String result = "";
      
      for (int i = 0; i < string.length(); i++) {
         char c = string.charAt(i);
         if(c >= 65 && c <= 90) {
            result += (char)(c + 32);
            
         }else if(c >= 97 && c <= 122) {
            result += (char)(c - 32);
            
         }else {
            result += c;
         }
      }
      
      return result;
   }
   
//   문자열을 입력받고 원하는 문자의 개수를 구해주는 메소드
   int getCount(String string, char target) {
      int count = 0;
      for (int i = 0; i < string.length(); i++) {
         char c = string.charAt(i);
         if(c == target) {
            count++;
         }
      }
      
      return count;
   }
   
//   5개의 정수를 입력받은 후 원하는 인덱스의 값을 구해주는 메소드
   int getValue(int[] arData, int index) {
      return arData[index];
   }
   
//   한글을 정수로 바꿔주는 메소드 (일공이사 -> 1024)
   int changeToInteger(String hangle) {
      String hangleOriginal = "공일이삼사오육칠팔구";
      String result = "";
      
      for (int i = 0; i < hangle.length(); i++) {
         result += hangleOriginal.indexOf(hangle.charAt(i));
      }
      
      return Integer.parseInt(result);
   }
   
//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드
//   int[] getMaxAndMin(int[] arData) {
//      int[] results = new int[2];
//      
//      results[0] = arData[0];
//      results[1] = arData[0];
//      
//      for (int i = 1; i < arData.length; i++) {
//         if(results[0] < arData[i]) { results[0] = arData[i]; }
//         if(results[1] > arData[i]) { results[1] = arData[i]; }
//      }
//      
//      return results;
//   }
   
//   5개의 정수를 입력받고 최대값과 최소값을 구해주는 메소드(void)
   void getMaxAndMin(int[] arData, int[] results) {
      results[0] = arData[0];
      results[1] = arData[0];
      
      for (int i = 1; i < arData.length; i++) {
         if(results[0] < arData[i]) { results[0] = arData[i]; }
         if(results[1] > arData[i]) { results[1] = arData[i]; }
      }
   }
   
//   indexOf() 만들기
   int indexOf(String string, char target) {
      for (int i = 0; i < string.length(); i++) {
         char c = string.charAt(i);
         
         if(c == target) {
            return i;
         }
      }
      return -1;
   }
   
   public static void main(String[] args) {
      MethodTask methodTask = new MethodTask();
      
      int[] arData = {2, 5, 7, 3, 1};
      int[] result = new int[2];
      
      methodTask.getMaxAndMin(arData, result);
      
      System.out.println("최대값: " + result[0]);
      System.out.println("최소값: " + result[1]);
      
   }
}
