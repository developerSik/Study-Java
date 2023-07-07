package castingTest;

class Car {
   void engineStart() {
      System.out.println("����� �õ� ��");
   }
}

class SuperCar extends Car {
   @Override
   void engineStart() {
      System.out.println("�������� �õ� ��");
   }
   
   void openRoof() {
      System.out.println("���� ����");
   }
   
}

public class CastingTest {
   public static void main(String[] args) {
      Car matiz = new Car();
      SuperCar ferrari = new SuperCar();
//      up casting
      Car noOptionFerrari = new SuperCar();
      
//      down casting
      SuperCar fullOptionFerrari = (SuperCar)noOptionFerrari;
      
//      ����
//      SuperCar brokenFerrari = (SuperCar)new Car();
      
//      instanceof : ���ǽ�
//      ��ü instanceof Ÿ�� : �� �Ǵ� ����
      
      System.out.println(matiz instanceof Car);
      System.out.println(matiz instanceof SuperCar);
      System.out.println(ferrari instanceof Car);
      System.out.println(ferrari instanceof SuperCar);
      System.out.println(noOptionFerrari instanceof Car);
      System.out.println(noOptionFerrari instanceof SuperCar);
      System.out.println(fullOptionFerrari instanceof Car);
      System.out.println(fullOptionFerrari instanceof SuperCar);
   }
}

