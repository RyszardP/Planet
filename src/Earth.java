
import java.util.List;

public class Earth{



    public static void main(String[] args) {

        Planet planet = new Planet("Earth");

        planet.addContinent(new Continent("Eurasia"));
        planet.addContinent(new Continent("Africa"));
        planet.addContinent(new Continent("Asia"));
        planet.addContinent(new Continent("Europe"));

        System.out.println("Continent name: " + getFirstContinentName(planet.getContinentList()));
        System.out.println("Count continents:" + planet.getContinentList().size());
    }
    public static String getFirstContinentName(List<Continent> continentList) {
        String result = null;
        for (Continent continent: continentList) {
            result = continent.getName();
        }

        return result;
    }
}
