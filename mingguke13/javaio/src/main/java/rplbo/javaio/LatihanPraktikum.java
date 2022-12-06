package rplbo.javaio;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;

public class LatihanPraktikum {
    static void p(String s){
        System.out.println(s);
    }
    public static void main(String[] args){
        File filepertama = new File("D:\\71180366\\mingguke13\\Filesatu.txt");
        try {
            Path file = Paths.get(String.valueOf(filepertama));
            BasicFileAttributes attrfile = Files.readAttributes(file,BasicFileAttributes.class);
            System.out.println("Tanggal Modified: " + attrfile.lastModifiedTime());
            if (filepertama.createNewFile()){
                System.out.println("File dibuat: " + filepertama.getName());
            }else {
                System.out.println("File sudah ada");
            }
        } catch (IOException e){
            System.out.println("Terjadi Kesalahan.");
            e.printStackTrace();
        }
        p("Ukuran file: " + filepertama.length() + " Bytes");
        p(filepertama.exists() ? "exists" : "does not exist");
        p(filepertama.setReadOnly() ? "is readonly" : "is not readonly");
        p(filepertama.canWrite() ? "is writeable" : "is not writeable");
        p(filepertama.canRead() ? "is readable" : "is not readable");

    }
}
