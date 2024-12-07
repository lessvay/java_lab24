package org;
import java.util.List;

public class Continents {
    private String code;
    private String name;
    private int areaSqKm;
    private long population;
    private List<String> lines;
    private int countries;
    private List<String> oceans;
    private List<String> developedCountries;

    @Override
    public String toString() {
        return "Continent\n " + name +
                "\n code='" + code + '\'' +
                ",\n area=" + areaSqKm + " sq km" +
                ",\n population=" + population +
                ",\n lines=" + lines +
                ",\n countries=" + countries +
                ",\n oceans=" + oceans +
                ",\n developedCountries=" + developedCountries;
    }
}
