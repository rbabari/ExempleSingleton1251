import java.util.ArrayList;

public class Soleil extends Astre{
    private static Soleil instance;
    public static ArrayList<Planet> listePlanet = new ArrayList<Planet>();
    private Soleil(String nom)
    {
        super(nom);

    }
    public static Soleil getInstance()
    {
        if (instance == null)
        {
            instance = new Soleil("Soleil");

        }
        return instance;
    }

    public static void add(Astre planet)
    {
        Soleil.listePlanet.add((Planet) planet);
    }


    // Utiliser l'interface ...
    public void runSimulation()
    {
        for (Planet planet :listePlanet) {
            for (Satellite sat: planet.getListeSat()) {
                System.out.println("==>" + sat.getNom());
                sat.run();
            }
        }
    }



}
