import java.util.HashMap;
import java.util.UUID;

public class Database {
    public static HashMap<UUID, Animal> animalHashMap = new HashMap<>();
    public static HashMap<UUID, Pavilion> pavilionHashMap = new HashMap<>();

    public static HashMap<UUID, Veterinary> veterinaryHashMap = new HashMap<>();

    public static HashMap<UUID, Zoo> zooHashMap = new HashMap<>();
}
