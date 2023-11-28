package com.itFactory.pathFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Exercitiul7 {

    public static void main(String[] args) throws IOException {

        Path p1 = Paths.get("./src/com/itFactory/pathFile/fisier1.txt");

        if(!Files.exists(p1)) {
            Files.createFile(p1);
        }

        boolean isDirectory = Files.isDirectory(p1);

        System.out.println(isDirectory);

        Path p2 = Paths.get("./src/com/itFactory/pathFile");

        System.out.println(Files.isDirectory(p2));

        Path p3 = Paths.get("./src/folder/newFolder");

        Files.createDirectories(p3);

//
//        Files.notExists(); // -> returneaza true daca fisierul nu exista
//        Files.exists(); // -> returneaza true daca fisierul exista
//        Files.isDirectory(); // -> returneaza true daca este director
//        Files.copy(); // -> putem copia continultul unui fisier in alt fisier
//        Files.isRegularFile(); // -> returneaza true daca este fisier






    }


}
