package org;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

public class Data {

    // Универсальный метод для загрузки данных и их преобразования
    // Универсальный метод для загрузки и преобразования данных
    public static <T> List<T> loadData(String url, Class<T> type) throws IOException {
        URLConnection urlConnection = new URL(url).openConnection();
        urlConnection.connect();

        StringBuilder jsonContent = new StringBuilder();

        try (BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(urlConnection.getInputStream(), "UTF-8"))) {

            bufferedReader.lines().forEach(jsonContent::append);
        }

        // Используем Gson для преобразования JSON в список объектов
        Gson gsonParser = new Gson();
        Type targetType = TypeToken.getParameterized(List.class, type).getType();

        return gsonParser.fromJson(jsonContent.toString(), targetType);
    }

}

