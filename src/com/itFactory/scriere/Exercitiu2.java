package com.itFactory.scriere;

import java.io.*;

public class Exercitiu2 {

    public static void main(String[] args) throws FileNotFoundException {

        //flux low level byte-wise
        FileOutputStream fos = new FileOutputStream("fisier1.txt", true);

        //flux char-wise
        OutputStreamWriter streamWriter = new OutputStreamWriter(fos);

        BufferedWriter bw = new BufferedWriter(streamWriter);


        try (fos; streamWriter; bw) {

            bw.write("Primul meu rand intr-un fisier");
            bw.newLine();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

}
