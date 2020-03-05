package com.knoldus.controller;

import com.knoldus.model.Student;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Services {

    public static List<Student> getListOfStudentsWithNoSecondaryAddress(List<Student> listOfStudents) {
        return listOfStudents.stream()
                .filter(element -> !element.getAddress().getSecondaryAddress().isPresent())
                .collect(Collectors.toList());
    }

    public static List<String> getListStudentsWithS(List<Student> listOfStudents) {
        return listOfStudents.stream()
                .filter(element -> element.getName().startsWith("S"))
                .filter(element -> !element.getAddress().getSecondaryAddress().isPresent())
                .map(Student::getName)
                .collect(Collectors.toList());
    }

    public static List<String> getBirthDateDays(int startYear) {
        return IntStream.rangeClosed(startYear, LocalDate.now().getYear())
                .mapToObj(y -> LocalDate.of(y, 3, 4)
                        .getDayOfWeek()
                        .toString())
                .collect(Collectors.toList());
    }

    public static List<Integer> getLeapYearsAfterFirstRepublicDay(LocalDate startYear) {
        return IntStream.rangeClosed(startYear.getYear(), LocalDate.now().getYear())
                .filter(yearIndex -> LocalDate.of(yearIndex, 1, 26).isLeapYear())
                .boxed()
                .collect(Collectors.toList());


    }

    public static long getTimeBetweenBirthAndDeath(LocalDate birthDate, LocalDate deathDate) {
         //Period gap = Period.between(birthDate, deathDate);
         long noOfDays = ChronoUnit.DAYS.between(birthDate,deathDate);
         return noOfDays*24*3600;

        //return Duration.between(birthDate.atStartOfDay(), deathDate.atStartOfDay()).toSeconds();
    }

    public static String getTimeFromGivenTimeZone(ZonedDateTime zoneId) {
        return zoneId.format(DateTimeFormatter.ISO_LOCAL_TIME) + " - " + zoneId + ",UTC"
                + zoneId.getOffset().toString();
    }

}
