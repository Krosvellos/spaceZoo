public class ZooService {


    private static Zoo instance;


    private ZooService() {
    }


    public static Zoo createZoo(String name) {
        if (instance == null) {
            instance = new Zoo(name);
        }
        return instance;
    }
}
