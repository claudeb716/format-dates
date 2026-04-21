package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class FormatDates {
    public static void main(String[] args) {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        LocalDate today = LocalDate.now();
        System.out.println("Today is: " + today);

        System.out.println("==================================");
        //LocalDate newtoday =
        //System.out.println("Today is: " + newtoday);

        System.out.println("==================================");



    }
}
