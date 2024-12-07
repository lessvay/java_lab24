package org;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            // Чтение данных о пользователях
            List<Person> persons = Data.loadData("https://fake-json-api.mock.beeceptor.com/users",Person.class);
            System.out.println("Reading from 'https://fake-json-api.mock.beeceptor.com/users'");
            displayData(persons);

            // Чтение данных о задачах
            List<Continents> continents = Data.loadData("https://dummy-json.mock.beeceptor.com/continents ", Continents.class);
            System.out.println("Reading from 'https://dummy-json.mock.beeceptor.com/continents '");
            displayData(continents);

        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }

    private static <T> void displayData(List<T> data) {
        for (int i = 0; i < data.size(); i++) {
            System.out.println("№" + (i + 1) + " " + data.get(i) + "\n");
        }
    }
}
