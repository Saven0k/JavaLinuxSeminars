import java.util.ArrayList;
import java.util.List;

public class addNewToys {

    public ArrayList add(int id, int amount, String name, int dropChance, ArrayList toys) {
        toy newToy = new toy(id, amount, name, dropChance);
        toys.add(newToy);
        System.out.println("Toy was add!\n");
        System.out.println(toys);
        return toys;
    }

}
