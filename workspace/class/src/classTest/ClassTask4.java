package classTest;

public class ClassTask4 {
   void getMaxAndMin(int[] arData, Result result) {
      result.max = arData[0];
      result.min = arData[0];
      
      for (int i = 0; i < arData.length; i++) {
         if(result.max < arData[i]) { result.max = arData[i]; }
         if(result.min > arData[i]) { result.min = arData[i]; }
      }
   }
   
   public static void main(String[] args) {
      int[] arData = {2, 5, 6, 1, 8};
      Result result = new Result();
      new ClassTask4().getMaxAndMin(arData, result);
      System.out.println(result.max);
      System.out.println(result.min);
   }
}