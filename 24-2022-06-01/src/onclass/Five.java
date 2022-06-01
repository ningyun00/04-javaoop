package onclass;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class Five {
    public static void main(String[] args) throws IOException {
        fileJava("E:\\S2\\04-javaoop\\24-2022-06-01\\src");
        six("E:\\S2\\04-javaoop\\24-2022-06-01\\src\\onclass\\Employee.java");
        seven();
    }

    public static void fileJava(String path) {
        File file = new File(path);
        File[] files = file.listFiles();
        for (File file1 : files) {
            if (file1.isDirectory()) {
                fileJava(file1.getPath());
            } else {
                if (file1.getName().contains(".java")) {
                    System.out.println(file1.getName());
                }
            }
        }
    }
    public static void six(String path) throws IOException {
        System.out.println(Files.readString(Path.of(path)));
    }
    public static  void  seven() throws IOException {
        File file = new File("HelloWorld.txt");
        file.createNewFile();
        if (file.isDirectory()){
            System.out.println("目录");
        }else{
            System.out.println("文件");
        }
    }
}
