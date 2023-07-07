package codingTest;

public class Locker {
//   눈금선 p
//   비번 s
//   number : 82195
//   target : 64723
   public int solution(String p, String s) {
      int answer = 0;
      
      for (int i = 0; i < s.length(); i++) {
         int number = p.charAt(i), target = s.charAt(i);
//         target - number 결과가 음수라면 결과에 10을 더해주고, 양수라면 10을 빼준다.
         int result = target - number < 0 ? 10 + target - number : 10 - (target - number);
//         결과의 절대값이 5보다 크면 위의 결과 그대로 결정하고, 만약 5보다 작으면 10을 빼지 않고 뺀 값의 절대값으로 결정한다.
         answer += Math.abs(target - number) > 5 ? result : Math.abs(target - number);
      }
      
      return answer;
   }
   
   public static void main(String[] args) {
      System.out.println(new Locker().solution("00000000000000000000", "91919191919191919191"));
   }
   
   
}