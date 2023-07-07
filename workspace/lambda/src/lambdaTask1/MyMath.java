package lambdaTask1;

import java.util.Scanner;

public class MyMath{
   
   public static Calc operate(String oper) {
      return oper.equals("+") ? (n1, n2) -> n1 + n2 : (n1, n2) -> n1 - n2;
      
//      Calc calc = null;
      
//      switch(oper) {
//      case "+":
//         calc = (n1, n2) -> n1 + n2;
//         break;
//      case "-":
//         calc = (n1, n2) -> n1 - n2;
//         break;
//      }
      
//      return calc;
   }
   
   public static void main(String[] args) {
      OperCheck operCheck = e -> {
         String result = "";
         for (int i = 0; i < e.length(); i++) {
            char c = e.charAt(i);
            if(c == '-' || c == '+') {
               result += c;
            }
         }
         return result.split("");
      };
      
      String message = "Á¤¼öÀÇ µ¡¼À, »¬¼À¿¡ ´ëÇÑ ½ÄÀ» ÀÔ·ÂÇÏ¼¼¿ä.";
      String exampleMessage = "¿¹)9+7-5";
      String expression = null;
      Scanner sc = new Scanner(System.in);
      String[] opers = null, numbers = null;
      int number1 = 0, number2 = 0;
      
      System.out.println(message);
      System.out.println(exampleMessage);
      expression = sc.nextLine();
      
      opers = operCheck.getOpers(expression);
      numbers = expression.split("\\+|\\-");
      number1 = Integer.parseInt(numbers[0].equals("") ? opers[0] + numbers[1] : numbers[0]);
      
      for (int i = 0; i < opers.length; i++) {
         if(i == 0 && number1 < 0) {continue;}
         number2 = Integer.parseInt(numbers[i + 1]);
         number1 = MyMath.operate(opers[i]).calc(number1, number2); 
      }
      
      System.out.println(number1);
   }   
}
