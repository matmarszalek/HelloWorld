package com.helloworld.r02;

import com.helloworld.runners.ChapterRunner;
import com.helloworld.runners.TaskRunner;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Scanner;

public class CalendarWriter extends TaskRunner{

    public CalendarWriter(ChapterRunner owner) {
        super(owner);
    }

    void showCalendar(){
        // get the date, where the day of the month is set to 1
        LocalDate date = LocalDate.now().withDayOfMonth(1);
        // get the month
        int month = date.getMonthValue();

        System.out.println(" Sun Mon Tue Wed Thu Fri Sat");
        // check from which day, the month starts
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue(); // 1 = Monday, ... 7 = Sunday
        if(value != 7)
            for (int i = 1; i <= value; i++)
                System.out.print("    ");
        while (date.getMonthValue() == month) {
            System.out.printf("%4d", date.getDayOfMonth());
            date = date.plusDays(1);
            if (date.getDayOfWeek().getValue() == 7)
                System.out.println();
        }
        if (date.getDayOfWeek().getValue() != 1)
            System.out.println();
    }

    @Override
    public void run(Scanner in) {

        showCalendar();
    }
}
