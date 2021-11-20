package com.pb.korotkaya.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumber2 {

    public static void main(String[] args) throws IOException {

        File out = new File("numbers.txt");
        FileWriter fw = null;

        try{
            fw = new FileWriter(out);
            BufferedWriter writer = new BufferedWriter(fw);
            int[][] a = new int[10][10];
            Random random = new Random();

            for(int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    a[i][j] = random.nextInt(100);
                    writer.write(a[i][j] + " ");
                }
                writer.write("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(new String(Files.readAllBytes(Paths.get("numbers.txt"))));



        //System.out.println("Массив: \n");

    }
}


/*int[][] a = new int[10][10];
        Random random = new Random();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++) {
                a[i][j] = random.nextInt(100);
            }
        }

        //System.out.println("Массив: \n");

        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
 */