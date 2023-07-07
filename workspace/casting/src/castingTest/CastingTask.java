package castingTest;

//���ø���
//�ִϸ��̼�, ��ȭ, ��� Ŭ���� ����
//����ڰ� ������ ������
//�ִϸ��̼��̶�� "�ڸ� ����" ��� ���
//��ȭ��� "4D" ��� ���
//��󸶶�� "����" ��� ���
public class CastingTask {
   public void checkVideo(Video video) {
      if(video instanceof Animation) {
         Animation animation = (Animation) video;
         animation.printjamak();
         
      }else if(video instanceof Drama) {
         Drama drama = (Drama) video;
         drama.sellGoods();
         
      }else if(video instanceof Film) {
         Film film = (Film) video;
         film.moveChair();
         
      }
   }
   
   public static void main(String[] args) {
      CastingTask castingTask = new CastingTask();
      Video[] videos = {
            new Drama(),
            new Film(),
            new Animation()
      };
      
      for (int i = 0; i < videos.length; i++) {
         castingTask.checkVideo(videos[i]);
      }
   }
}
