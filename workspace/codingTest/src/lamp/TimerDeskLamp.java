package codingTest;

import javax.swing.JOptionPane;

import lamp.TimerDeskLamp;

public class TestDeskLamp {
   public static void main(String[] args) {
      String[] buttons = {"���� ���� ����", "������"};
      TimerDeskLamp timerDeskLamp = new TimerDeskLamp();
      int choice = 0;
      while(true) {
         choice = JOptionPane.showOptionDialog(null, "���� ��ġ", "����", JOptionPane.DEFAULT_OPTION,
               JOptionPane.PLAIN_MESSAGE, null, buttons, null);
         if(choice == 0) {
            timerDeskLamp.offDelay();
            
         }else {
            System.exit(0);
         }
      }
   }
}