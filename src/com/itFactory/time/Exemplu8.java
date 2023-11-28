package com.itFactory.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Exemplu8 {

    public static void main(String[] args) {

        LocalDate l1 = LocalDate.now();

        LocalTime l2 = LocalTime.now();

        LocalDateTime l3 = LocalDateTime.now();

        System.out.println(l1 + " ------ " + l2 + " ------- " + l3);

    }


}
