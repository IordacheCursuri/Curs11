package com.itFactory.citire;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exercitiul3 {

    public static void main(String[] args) throws FileNotFoundException {

        //flux char wise
        FileReader fileReader = new FileReader("./src/com/itFactory/scriere/Exercitiu1.java");

        BufferedReader bufferedReader = new BufferedReader(fileReader);

        try (fileReader; bufferedReader) {

            String line;

            line = bufferedReader.readLine();

            while (line != null) {
                line = bufferedReader.readLine();
                System.out.println(line);
            }


        } catch (IOException e) {
          //  System.out.println(e.getMessage());
            e.printStackTrace();
        }


    }





}
