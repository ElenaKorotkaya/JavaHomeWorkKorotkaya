package com.pb.korotkaya.hw9_1;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) throws IOException {

        createNumbers();
        createOddNumbers();
    }
    public static void createNumbers() throws IOException { //ВЫВОД ДАННЫХ В ФАЙЛ С ПРОГИ OUT

            int[][] a = new int[10][10];
            Random random = new Random();

            try(Writer writer = new FileWriter("numbers.txt")){

            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    a[i][j] = random.nextInt(100);
                    writer.write(a[i][j] + " ");
                }
                writer.write("\n");
            }
            writer.close();

        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        }
        //ПЕЧАТАЕТСЯ МАССИВ
        System.out.println(new String(Files.readAllBytes(Paths.get("numbers.txt"))));
    }
    public static void createOddNumbers() throws IOException {

        Path path = Paths.get("numbers.txt");
/*
        List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
        for(String s : lines){
            System.out.println(s);
        }
 */
        Scanner scan = new Scanner(path);
        try {
            scan.useDelimiter(" ");

            while (scan.hasNextLine()) {
                String str = scan.nextLine();
                int y = scan.nextInt(Integer.parseInt(str));
                if (y % 2 == 0) {
                    y = 0;
                }
            }
            System.out.println();
        } finally {
            scan.close();
        }


    }
}
