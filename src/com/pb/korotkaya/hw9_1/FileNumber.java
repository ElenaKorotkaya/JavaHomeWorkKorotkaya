package com.pb.korotkaya.hw9_1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Random;

public class FileNumber {
    public static void main(String[] args) throws IOException {

        createNumbers();
        createOddNumbers();
    }


    public static void createNumbers() throws IOException { //ВЫВОД ДАННЫХ В ФАЙЛ С ПРОГИ OUT

        File out = new File("numbers.txt");
        FileWriter fw = null;

        try {
            fw = new FileWriter(out);
            BufferedWriter writer = new BufferedWriter(fw);
            int[][] a = new int[10][10];
            Random random = new Random();

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

    public static void createOddNumbers() {

        //ВВОД ДАННЫХ С ФАЙЛА В ПРОГУ IN
        try (InputStream is = new FileInputStream("numbers.txt")) {

            int available = is.available();
            byte[] buffer = new byte[available];
            int i = 0;

            int data = is.read();
            while (data != -1) {
                buffer[i] = (byte) data;
                data = is.read();
                i++;
            }
            //ПЕЧАТАЕТСЯ МАССИВ
            System.out.println(new String(buffer));
            //
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}

            //ЗАМЕНИТЬ ЧЕТНЫЕ НА 0 (считать строки, выделить числа по " ", четные заменить на 0


            //ВЫВЕСТИ В НОВЫЙ ФАЙЛ
    /*
        File out = new File("odd-numbers.txt");
        FileWriter fw = null;

        try{
            fw = new FileWriter(out);
            BufferedWriter writer = new BufferedWriter(fw);
            int[][] a = new int[10][10];


        for(int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
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
}
*/