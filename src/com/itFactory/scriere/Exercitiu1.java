package com.itFactory.scriere;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercitiu1 {

    public static void main(String[] args) {

        InputStreamReader isr = new InputStreamReader(System.in);

        BufferedReader br = new BufferedReader(isr);

        try (isr; br) {
            System.out.println("Introdu un text: ");
            String line = br.readLine();

            System.out.println(line);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }


}
