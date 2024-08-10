package code;

import java.io.IOException;
import java.util.Scanner;

class Counter {
    public  Scanner scanner = new Scanner(System.in);
    int count = 0;
    public  int add() throws IOException{
        count = count + 1;
        System.out.println("Enter name Animal: ");
        String name = scanner.nextLine();
        if (name.isEmpty() != false) throw new IOException("name is empty");
        System.out.println("Enter age Animal: ");
        String age = scanner.nextLine();
        if (age.isEmpty() != false) throw new IOException(" age is empty");
        System.out.println("Enter one of the command Animal: ");
        String command = scanner.nextLine();
        if (command.isEmpty() != false) throw new IOException(" commnds is empty");
        System.out.println("Animal was added. Name:" + name + ", age:" + age + ", command" + command);
        return count;
    }
}