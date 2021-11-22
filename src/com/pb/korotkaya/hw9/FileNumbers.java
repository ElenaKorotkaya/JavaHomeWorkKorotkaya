package com.pb.korotkaya.hw9;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;

public class FileNumbers {



    public static void main(String[] args) throws IOException {

        createNumbers();
        createOddNumbers();
    }

    public static void createNumbers() throws IOException { //ВЫВОД ДАННЫХ В ФАЙЛ С ПРОГИ OUT

        int[][] a = new int[10][10];
        Random random = new Random();

        try (Writer writer = new FileWriter("numbers.txt")) {

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    a[i][j] = random.nextInt(100);
                    writer.write(a[i][j] + " ");
                }
                writer.write("\n");
            } writer.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        //ПЕЧАТАЕТСЯ МАССИВ
        System.out.println(new String(Files.readAllBytes(Paths.get("numbers.txt"))));
    }

    public static void createOddNumbers() throws IOException {

        Path path = Paths.get("numbers.txt");
        int[][] a = new int[10][10];

                 try{
                     Scanner scan = new Scanner(path);

                     for(int i = 0; i <10; i++) {
                         for (int j = 0; j < 10; j++) {

                             a[i][j] = scan.nextInt();

                             if(a[i][j] % 2 == 0){
                                 a[i][j] = 0;
                             }
                             System.out.print(a[i][j] + " ");
                         }
                         System.out.println();
                     }
                 } catch (IOException e) {
                        e.printStackTrace();
                        System.exit(0);
                 }

            try (Writer writer = new FileWriter("odd_numbers.txt")) {

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {

                    writer.write(a[i][j] + " ! ");

                }
                writer.write("\n");
            }

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }

        System.out.println(new String(Files.readAllBytes(Paths.get("odd_numbers.txt"))));
    }
}

/*
try {
            Scanner scan = new Scanner(path);
                while (scan.hasNextInt()) {
                    System.out.print(scan.nextInt());
                }
            } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();
 */
