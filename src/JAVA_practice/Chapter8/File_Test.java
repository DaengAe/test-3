package JAVA_practice.Chapter8;

import java.io.*;

public class File_Test {
    public static void listDirectory(File dir){
        System.out.println("-----" + dir.getPath() + "의 서브 리스트 입니다.-----");
        File[] subFiles = dir.listFiles();

        for(int i=0; i<subFiles.length; i++){
            File f = subFiles[i];
            long t = f.lastModified();
            System.out.print(f.getName());
            System.out.print("\t파일 크기: " + f.length());
            System.out.printf("\t수정한 시간: %tb %tb %ta %tT\n", t, t, t, t);
        }
    }

    public static void main(String[] args){
        File f1 = new File("intelliJ/textFiles/test.txt");
        System.out.println(f1.getPath() + ", " + f1.getParent() + ", " + f1.getName());
        String res = "";
        if(f1.isFile()) {res = "파일";}
        else if(f1.isDirectory()) {res = "디렉토리";}
        System.out.println(f1.getPath() + "은 " + res + "입니다.");

        File f2 = new File("intelliJ/textFiles/testDir");
        if(f2.exists()) {
            f2.mkdir(); // 존재하지 않으면 디렉토리 생성
        }
        listDirectory(new File("intelliJ"));
        f2.renameTo(new File("intelliJ/textFiles/testDir"));
        listDirectory(new File("intelliJ"));
    }
}
