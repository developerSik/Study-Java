package inheritance;

class A {
   String name = "A";
   int data = 10;
   
   public A() {System.out.println("�θ� ������");}
   
   void printName() {
      System.out.println(name);
   }
}

class B extends A{
   
   public B() {
      super();
      this.data = 20;
      System.out.println("�ڽ� ������");
   }
   
   void printData() {
      System.out.println(data);
   }
}

public class InheritanceTest1 {
   public static void main(String[] args) {
      B b = new B();
      b.printName();
//      b.data = 20;
      b.printData();
   }
}
