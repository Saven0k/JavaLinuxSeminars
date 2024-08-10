package code;
import code.Counter;
import java.util.Scanner; 
import java.io.IOException;
import java.util.ArrayList;

public class work {
    public static ArrayList<String> commands = new ArrayList<String>();
    public static Scanner scanner = new Scanner(System.in);
    public  int count = 0;
    public static void main(String args[]) {
        menu();
    }
    
    public static void AddNewCommands(){
        System.out.println("Enter command: ");
        String command = scanner.nextLine();
        commands.add(command);
        System.out.println("Commands was add!");
    }

    public static void menu(){
        System.out.println("What do what to do?: \n1 - Add new animal\n2 - Add new Command\n3 - View Commands");    
        int value = scanner.nextInt();
        if (value == 1){
            try{
                Counter ct = new Counter();
                ct.add();
                menu();    
            } catch (IOException e) {
                menu();
            }
        } else if(value == 2){
            AddNewCommands();
        } else if (value == 3){
            PrintCOmmands();
        } else {
            System.exit(0);
        }
        
    }
    public static void PrintCOmmands(){
        if (commands.size() == 0){
            System.out.println("List is empty");
            menu();
        } else {
            for(String command: commands){
                System.out.println(command);
            }
        }    
    }
}

