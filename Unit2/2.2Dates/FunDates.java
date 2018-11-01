// Ryan Densmore
// 9/20/18, 2A
// Lab 2.2 Dates

import java.time.*;

public class FunDates {
    public static void main(String[] args) {
        LocalDate piDay = LocalDate.of(2019, 3, 14);
        System.out.println("Pi Day 2019 is on a " + piDay.getDayOfWeek().toString() + ", an A-Day for Hough.");

        LocalDate programmersDay = LocalDate.ofYearDay(2018, 256);
        System.out.println("2018's programmer's day is " + programmersDay.getDayOfWeek().toString() + ", " + programmersDay.toString());

        LocalDate now = LocalDate.now();
        LocalDate nowMinus = LocalDate.now().minusDays(10000);
        System.out.println("10,000 days earlier than today (" + now.toString() + ") is " + nowMinus.getDayOfWeek() + ", " + nowMinus.toString());
    }
}