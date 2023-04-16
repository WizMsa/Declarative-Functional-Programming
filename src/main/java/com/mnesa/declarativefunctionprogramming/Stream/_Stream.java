package com.mnesa.declarativefunctionprogramming.Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();

        people.add(new Person("Wiz", Gender.Male));
        people.add(new Person("Asha", Gender.Female));
        people.add(new Person("Mnesa", Gender.Male));
        people.add(new Person("Msa", Gender.Female));
        people.add(new Person("Mans", Gender.Female));


        people.stream()
                .filter(person -> person.gender.equals(Gender.Male) || person.gender.equals(Gender.Female))
                .collect(Collectors.toSet())
                .forEach(
                        person -> System.out.println("Name : "+person.name +" :: gender : "+person.gender)
                );


        people.stream()
                .map(person -> person.name)
                .collect(Collectors.toSet())
                .forEach(
                        System.out::println
                );

        boolean containsOnlyMales = people.stream().allMatch(person -> person.gender.equals(Gender.Male));
        System.out.println(containsOnlyMales);
        boolean containsWithMales = people.stream().anyMatch(person -> person.gender.equals(Gender.Male));
        System.out.println(containsWithMales);
    }

    static class Person{
        String name;
        Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }
    }
}
