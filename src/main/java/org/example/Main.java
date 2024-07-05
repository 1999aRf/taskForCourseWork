package org.example;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> names = List.of(“Rinat”, “Anna”, “Alexey”);

        List<String> modifiedNames = names.stream()
                .map(name -> name.substring(1)) // удаляем первую букву
                .sorted()
                .collect(Collectors.toList());

        modifiedNames.forEach(System.out::println);
    }
}