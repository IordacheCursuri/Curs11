package com.itFactory.serializare;

import java.io.*;

public class Exercitiul6 {

    public static void main(String[] args){

        try (
            FileInputStream fis = new FileInputStream("caine.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            ObjectInputStream ois = new ObjectInputStream(bis))
        {

            Caine caine = (Caine) ois.readObject();

            System.out.println(caine);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }



}
