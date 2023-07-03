public class Singleton {


    // static = variable de classe   = Class.var
    // non static variable d'instance   = this.var
    private static Singleton instance;

    private Singleton() {
        System.out.println("Initialisation de l'instance");
    }

    public static Singleton getInstance() {
        if (Singleton.instance == null)
        {
            Singleton.instance = new Singleton();
        }
        return instance;
    }
}
