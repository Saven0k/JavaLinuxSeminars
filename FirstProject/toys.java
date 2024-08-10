import java.util.ArrayList;
import java.util.List;

public class toys{
    private ArrayList<toy> toyss;
    public toys(){
        toyss = new ArrayList<toy>();
    }

    public ArrayList getToys() {
        return toyss;

    }
    public void addToys(toy toy){
        toyss.add(toy);
    }
}
