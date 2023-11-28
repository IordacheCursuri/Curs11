package com.itFactory.serializare;

import java.io.*;

public class Exercitiu5 {
    public static void main(String[] args) throws IOException {

        Caine caine = new Caine("Azorel", "15", 10);

        //ne conectam la un fieser
        FileOutputStream fos = new FileOutputStream("caine.txt");

        //bufurizam fluxul de iesire
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        //fluxul cu ajutorul caruia trimitem instanta serializata
        ObjectOutputStream oos = new ObjectOutputStream(bos);

        try (fos; bos; oos) {
            oos.writeObject(caine);
        }

    }

}
