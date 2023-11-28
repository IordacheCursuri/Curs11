package com.itFactory.time;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Exemplu9 {
    public static void main(String[] args) {

        LocalDate l1 = LocalDate.of(2026, 8, 15);

        System.out.println(l1);

        LocalDate l2 = l1
                .minusDays(5)
                .minusMonths(1)
                .plusYears(5);

        System.out.println(l2);


        LocalDateTime l3 = LocalDateTime.of(2023,5, 15, 21, 36, 5);

        LocalDateTime l4 = l3.plusMinutes(5).plusSeconds(5);

        System.out.println(l4);



    }
}
