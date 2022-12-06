package rplbo.javaio;

import java.io.*;

public class DemoBR {
    public static void main(String[] args) throws Exception {
        System.out.println("Masukkan bilangan pecahan :");
        BufferedReader reader = new BufferedReader
                (new InputStreamReader(System.in));
        String input = reader.readLine();
        double number = Double.parseDouble(input);
        System.out.println(input + ":" + Math.sqrt(number));
        reader.close();
    }
}
