package com.example.demorestfulapi.demostream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static com.example.demorestfulapi.demostream.Main.Gender.FEMALE;
import static com.example.demorestfulapi.demostream.Main.Gender.MALE;

public class Main {
    public static void main(String[] args){
        List<Person> people = List.of(
                new Person("Hoc", MALE),
                new Person("Quynh", FEMALE),
                new Person("Dang", MALE),
                new Person("Mai", FEMALE),
                new Person("Tung", MALE)
        );

        Predicate<Person> personPredicate = person -> FEMALE.equals(person.gender);
        people.stream()
                .filter(personPredicate)
                .forEach(System.out::println);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }
    enum Gender{
        MALE, FEMALE
    }
}
