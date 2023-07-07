package arrayTest;

public class ArTest2 {
   public static void main(String[] args) {
      int[] arData = null;
      
//      arData = new int[5];
      arData = new int[] {1, 2, 3, 4, 5};
      
      for (int i = 0; i < arData.length; i++) {
         System.out.println(arData[i]);
      }
   }
}