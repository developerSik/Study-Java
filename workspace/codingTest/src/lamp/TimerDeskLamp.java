package codingTest;

import javax.swing.JOptionPane;

import lamp.TimerDeskLamp;

public class TestDeskLamp {
   public static void main(String[] args) {
      String[] buttons = {"전원 끄기 예약", "나가기"};
      TimerDeskLamp timerDeskLamp = new TimerDeskLamp();
      int choice = 0;
      while(true) {
         choice = JOptionPane.showOptionDialog(null, "조명 장치", "조명", JOptionPane.DEFAULT_OPTION,
               JOptionPane.PLAIN_MESSAGE, null, buttons, null);
         if(choice == 0) {
            timerDeskLamp.offDelay();
            
         }else {
            System.exit(0);
         }
      }
   }
}