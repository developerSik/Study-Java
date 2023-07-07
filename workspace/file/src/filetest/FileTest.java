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
      
//      절대 경로: 어디에서 작성해도 찾아갈 수 있는 경로, C:/a/b
//      상대 경로: 현재 위치에 따라 변경되는 경로, .., ., ./a, a
      
//      BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("test.txt", true));
//      bufferedWriter.write("한동석\n");
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
         System.out.println("파일을 찾을 수 없습니다.");
         
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
