public class Terre extends Planet{

    private static Planet instanceTerre;
    public Terre() {
        super("Terre");
    }


    public static Astre getInstance() {
        if(instanceTerre ==null)
        {
            instanceTerre = new Terre();
        }
        return instanceTerre;

    }
}
