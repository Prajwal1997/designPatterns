public class Singleton {
    private static Singleton Instance;
    private Singleton(){
        System.out.println("Hi");
    }

    public static Singleton getInstance()
    {
        if(Instance == null)
        {
            Instance = new Singleton();
        }
        return Instance;
    }
}
