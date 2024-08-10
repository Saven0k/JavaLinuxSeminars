import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class work {
    public void workShop(int doup, ArrayList toys) {
        Scanner iScanner = new Scanner(System.in);
        if (doup == 1) {
            System.out.println("You have chosen a draw!");
            prank_toys pt = new prank_toys();
            pt.prank_random_toy(toys);

        } else if (doup == 2) {
            System.out.println("You have chosen add new toy");

            System.out.print("Choose the name of the toy: ");
            String name = iScanner.nextLine();

            System.out.print("Choose the id of the toy: ");
            int id = iScanner.nextInt();

            System.out.print("Choose the amount of the toy: ");
            int amount = iScanner.nextInt();

            System.out.print("Choose the drop chance of the toy: ");
            int dropChance = iScanner.nextInt();
            System.out.print(toys);
            addNewToys aNT = new addNewToys();
            aNT.add(id, amount, name, dropChance, toys);
        } else if (doup == 0) {
            System.out.println("Goodbye!");
            System.exit(0);

        }
    }
}
