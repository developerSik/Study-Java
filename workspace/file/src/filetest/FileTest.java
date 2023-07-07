package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileTest {
   
   public static void main(String[] args) throws IOException{
//      FileTest fileTest = new FileTest();
      
//      ���� ���: ��𿡼� �ۼ��ص� ã�ư� �� �ִ� ���, C:/a/b
//      ��� ���: ���� ��ġ�� ���� ����Ǵ� ���, .., ., ./a, a
      
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
//      bufferedWriter.write("�ѵ���\n");
//      bufferedWriter.close();
//      
//      System.out.println();
      
      BufferedReader bufferedReader = null;
      
//      String content = new String(Files.readAllBytes(Paths.get("test.txt")));
//      System.out.println(content);
      
      try {
         bufferedReader = new BufferedReader(new FileReader("test.txt"));
         String line = null;
         while((line = bufferedReader.readLine()) != null) {
            System.out.print(line);
         }
         
      } catch (FileNotFoundException e) {
         System.out.println("������ ã�� �� �����ϴ�.");
         
      } finally {
         try {
            if(bufferedReader != null) {
               bufferedReader.close();
            }
         } catch (Exception e) {
            throw new RuntimeException(e);
         }
      }
      
      File file = new File("test.txt");
      if(file.exists()) {
         file.delete();
      }
   }
}
