import java.util.ArrayList;

public class Planet extends Astre implements IOrbitable {
    private static ArrayList<Satellite> lisrteSat = new ArrayList<Satellite>();
    private static int compteurPlanet = 0; // dans le cas ou il n est pas static

    public Planet(String nom) {
        super(nom);
        compteurPlanet++;
    }

    public ArrayList<Satellite> getListeSat()
    {
        return lisrteSat;

    }

    public static int getCompteurPlanet() {
        return compteurPlanet;
    }

    @Override
    public void Orbiter(Astre atre) {

    }

    @Override
    public void run() {

    }
}


