package com.knoldus.controller;

import com.knoldus.model.Address;
import com.knoldus.model.Student;

import java.time.*;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Handler {

    public static void main(String[] args) {

        Student studentOne = new Student(1, "Shivani", 24, new Address("Sahibabad"));
        Student studentThree = new Student(2, "Muskan", 21, new Address("Faridabad", java.util.Optional.of("VijayNagar")));
        Student studentFour = new Student(3, "Aakash", 23, new Address("Delhi"));

        List<Student> listOfStudents = Arrays.asList(studentOne, studentThree, studentFour);

        List<Student> services = Services.getListOfStudentsWithNoSecondaryAddress(listOfStudents);
        System.out.println(services);

        List<String> listOfStudentsWithNameS = Services.getListStudentsWithS(listOfStudents);
        System.out.println(listOfStudentsWithNameS);

        int startYear = 1996;
        List<String> daysBirth = Services.getBirthDateDays(startYear);
        System.out.println(daysBirth);


        LocalDate republicFirst = LocalDate.of(1947, 1, 26);
        List<Integer> republicYearsList = Services.getLeapYearsAfterFirstRepublicDay(republicFirst);
        System.out.println(republicYearsList);

        LocalDate birthDate = LocalDate.of(1996, 3, 4);
        LocalDate deathDate = LocalDate.of(2020, 3, 4);
        long timeAlive = Services.getTimeBetweenBirthAndDeath(birthDate, deathDate);
        System.out.println(timeAlive);

        ZonedDateTime zone = ZonedDateTime.now(ZoneId.of("America/New_York"));
        String timeFromTimeZone = Services.getTimeFromGivenTimeZone(zone);
        System.out.println(timeFromTimeZone);

        String pathName = "./src/main/resources/RepeatedWords.txt";
        Map<String, Integer> wordCountsFromFile = WordCountInFile.getWordCountOfDataFromFile(pathName);
        System.out.println(wordCountsFromFile);
    }
}
