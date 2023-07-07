package inheritance;

class Human{
   String name;
   
//   기본 생성자는 직접 선언한다.
   public Human() {;}
   
   public Human(String name) {
      super();
      this.name = name;
   }

   void eat() {
      System.out.println("먹기");
   }
   
   void sleep() {
      System.out.println("자기");
   }
   
   void walk() {
      System.out.println("두 발로 걷기");
   }
}

class Monkey extends Human{
   @Override // 어노테이션
   void walk() {
      System.out.println("네 발로 걷는다.");
      super.walk();
   }
}

public class InheritanceTest2 {
   public static void main(String[] args) {
      Human 한동석 = new Human();
      Monkey kingkong = new Monkey();
      kingkong.walk();
      한동석.walk();
   }
}


