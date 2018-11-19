import java.util.ArrayList;

import java.util.List;

public class Planet {
    private String name;

    List<Continent> continentList = new ArrayList<>();

    public Planet(String name) {
        this.name = name;
    }

    public void addContinent(Continent continent){
        continentList.add(continent);
    }
    public List<Continent> getContinentList() {
        return continentList;}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContinentList(List<Continent> continentList) {
        this.continentList = continentList;
    }

    public Planet() {
    }
}
