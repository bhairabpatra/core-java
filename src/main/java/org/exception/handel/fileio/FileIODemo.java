package org.exception.handel.fileio;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileIODemo {


    public static void main(String[] args) throws IOException {
        System.out.println("This is example of FILE io");

        File f1 = new File("abc.txt");
        System.out.println(f1.exists());
        f1.createNewFile();
        System.out.println(f1.exists());

//        File f2 = new File("project");
//        System.out.println("++" + f2.exists());
//        f2.mkdir();
//        System.out.println(f2.exists());
//
//        //  Write a code to crate a file named with abc.txt ,e:xyz folder
//        //  D:\react-medium This should be available in the system
//
//        File test = new File("D:\\react-medium", "test.txt");
//        test.createNewFile();
//        System.out.println(test.length());
//        System.out.println(test.isFile());

        File test1 = new File("D:\\react-medium\\my-app");
        String[] s = test1.list();
        System.out.println("Length" + s.length);
        for (String files : s) {
            File isItFile = new File("D:\\react-medium\\my-app", files);
            if (isItFile.isFile()) {
                System.out.println(isItFile.getName());
            }
        }

        File t1 = new File("de,o.text");

        FileWriter fw = new FileWriter("demo.txt");
        fw.write("test");
        char[] ch = {'a','b','c'};
        fw.write(ch);
        fw.flush();
        fw.close();
    }
}
