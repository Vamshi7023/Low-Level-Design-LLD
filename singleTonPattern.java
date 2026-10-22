class singleton{
    private static singleton instance;

    public static singleton getSingleton(){
        if(instance == null){
            instance = new singleton();
            System.out.println("Obj created");
            return instance;
        }
        System.out.println("direct");
        return instance;
    }
}

public class singleTonPattern {
    public static void main(String[] args) {
        singleton s1 = singleton.getSingleton();
        singleton s2 = singleton.getSingleton();
    }
}
