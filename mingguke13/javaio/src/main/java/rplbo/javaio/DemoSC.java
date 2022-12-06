package rplbo.javaio;

import java.util.*;


public class DemoSC {
    public static void main(String[] args) throws Exception {
        System.out.println("Masukkan bilangan pecahan : ");
        Scanner scan = new Scanner(System.in);
        Double number = scan.nextDouble();
        System.out.println(number + ":" + Math.sqrt(number));
    }
}
