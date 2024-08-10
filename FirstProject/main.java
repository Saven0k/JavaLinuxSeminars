import java.util.Scanner;

public class main{
    public static void main(String[] args) {
        toys ts = new toys();
        // toy New_top2 = new toy(1 , 5, "heep", 25 );
        // ts.addToys(New_top2);
        Scanner iScanner = new Scanner(System.in);

        System.out.println("\n\n\n---------Welcom to toys shop----------");
        System.out.println("What do you want to do?\n"
                + "1 - Prank toy\n"
                + "2 - Add new toy in shop\n"
                + "0 - close programm\n"
                + ":  ");
        int cp = iScanner.nextInt();
        while (cp != 0) {
            work wk = new work();
            wk.workShop(cp, ts.getToys());
            main(args);
        }

    }
}