package codingTest;

public class Locker {
//   ���ݼ� p
//   ��� s
//   number : 82195
//   target : 64723
   public int solution(String p, String s) {
      int answer = 0;
      
      for (int i = 0; i < s.length(); i++) {
         int number = p.charAt(i), target = s.charAt(i);
//         target - number ����� ������� ����� 10�� �����ְ�, ������ 10�� ���ش�.
         int result = target - number < 0 ? 10 + target - number : 10 - (target - number);
//         ����� ���밪�� 5���� ũ�� ���� ��� �״�� �����ϰ�, ���� 5���� ������ 10�� ���� �ʰ� �� ���� ���밪���� �����Ѵ�.
         answer += Math.abs(target - number) > 5 ? result : Math.abs(target - number);
      }
      
      return answer;
   }
   
   public static void main(String[] args) {
      System.out.println(new Locker().solution("00000000000000000000", "91919191919191919191"));
   }
   
   
}