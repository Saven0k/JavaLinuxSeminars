import java.util.ArrayList;

public class toy {

    private int id; // id
    private String name; // Имя
    private int amount; // Колличество
    private int dropChance; // Шанс выпадения

    public toy(int id, int amount, String name, int dropChance) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.dropChance = dropChance;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getDropChance() {
        return dropChance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public void setDropChance(int dropChance) {
        this.dropChance = dropChance;
    }

}
