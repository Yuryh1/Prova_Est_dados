package Q2;

import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.File;
public class QUESTA2 {
    public static void main(String[] args) throws FileNotFoundException {

        Queue<String> fileira01 = new LinkedList<>();
        Queue<String> fileira02 = new LinkedList<>();
        Queue<String> fileira03 = new LinkedList<>();

        Scanner scan = new Scanner(new File("./tools/deputadosfederais.txt"));

        while(scan.hasNextLine()){

            if (fileira01.size() < 20){
                fileira01.add(scan.nextLine());
            } else if (fileira02.size() < 20) {
                fileira02.add(scan.nextLine());
            } else if (fileira03.size() < 20) {
                fileira03.add(scan.nextLine());
            }else{
                System.out.println("   ");
            }

        }


        System.out.println("  " + fileira01.size());
        for (String nome:fileira01){
            System.out.println(nome);
        }

        System.out.println("  " + fileira02.size());
        for (String nome:fileira02){
            System.out.println(nome);
        }

        System.out.println("  " + fileira03.size());
        for (String nome:fileira03){
            System.out.println(nome);
        }

    }
}