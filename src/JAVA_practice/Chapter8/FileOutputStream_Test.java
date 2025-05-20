package JAVA_practice.Chapter8;

import java.io.*;

public class FileOutputStream_Test {
    public static void main(String [] args){
        byte b[] = {7, 51, 3, 4, -1, 24};
        try{
            FileOutputStream fo = new FileOutputStream("intelliJ/textFiles/test.out");
            for(int i = 0; i<b.length; i++) {
                fo.write(b[i]);
            }
            fo.close();
        }
        catch(IOException e){
            System.out.println("해당 파일에 저장할 수 없습니다. 경로명을 확인해주세요.");
            return;
        }
        System.out.println("파일에 저장하였습니다.");
    }
}
