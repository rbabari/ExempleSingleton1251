// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Entrée with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");


        // Singleton s1 = new Singleton();
        // Singleton s2 = new Singleton();

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        if (s1 == s2)
        {
            System.out.println("Meme instance");

        }


       Astre soleil = Soleil.getInstance();

       Astre mars = new Planet("mars");
       Astre jupiter = new Planet("jupiter");
       IOrbitable terre = (IOrbitable) Terre.getInstance();

       // System.out.println("nombre de planette" + ((Planet)terre).getCompteurPlanet() ); dans le cas ou compteur n est pas statique ... ça ne marche pas

        System.out.println(" " + Planet.getCompteurPlanet());
       Soleil.add((Astre) terre);



        System.out.printf("----------!");
    }
}