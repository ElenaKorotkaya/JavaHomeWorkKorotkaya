package com.pb.korotkaya.hw9_1;

import java.io.*;
import java.util.Random;

public class FileNumber2 {

    public static void createNumbersFile() {

        File out = new File("numbers.txt");
        FileWriter fw = null;

        int n = 10;                                              //СТРОКИ

        try {
            fw = new FileWriter(out);
            BufferedWriter writer = new BufferedWriter(fw);
            int line;
            Random random = new Random();

            while (n > 0) {

                for (int i = 0; i < 10; i++) {                    //ЧИСЛА С " "
                    line = random.nextInt(100);
                    writer.write(line + " ");
                }
                writer.write("\n");                           //ПЕРЕНОС СТРОКИ
                n--;
            }
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
            System.exit(0);
        }
    }
    public static void oddNumbersFile() throws FileNotFoundException {

        BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
        int n = 10;
        try {

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //считывание файла
    public static void main(String[] args) throws IOException {
        //createNumbersFile();
        //oddNumbersFile();


        /*
        BufferedReader reader = new BufferedReader(new FileReader("numbers.txt"));
        String line = reader.readLine();
        while (line != null) {
            System.out.println(line);
            line = reader.readLine();


        }   reader.close();
*/

    }

}