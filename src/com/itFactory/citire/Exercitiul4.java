package com.itFactory.citire;

import java.io.*;

public class Exercitiul4 {

    public static void main(String[] args) throws FileNotFoundException {

        //flux char-wise
        FileReader fileReader = new FileReader("./src/com/itFactory/citire/Exercitiul3.java");

        BufferedReader bufferedReader = new BufferedReader(fileReader);


        PrintWriter printWriter = new PrintWriter("./src/com/itFactory/citire/Exercitiu3Copie.txt");


        try(fileReader; bufferedReader; printWriter) {

            String line;

            while ((line = bufferedReader.readLine()) != null) {
                printWriter.println(line);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }


}
