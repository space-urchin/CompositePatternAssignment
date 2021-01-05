
package compositepatternassignment;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;



public class CompositePatternAssignment {

 private static Scanner scanner = new Scanner(System.in);

    private static Shape village = new Shape("Village", new ArrayList<>());

    public static void main(String args[]) {
        System.out.println("Welcome to AOV. Let's build your village!\nCommands:\n1.Build House\n2.Build Tree\n3.Build Water Source\n4.Display Village\nPress any other key to exit");
        System.out.println("Enter Command:");
        boolean exit = false;
        
        while (!exit) {

            int command = scanner.nextInt();
            

            switch (command) {
                case 1:
                    System.out.println("Building House!");
                    village.draw(new House());
                    System.out.println("Building Complete!");
                    break;
                case 2:
                    System.out.println("Building Tree!");
                    village.draw(new Tree());
                    System.out.println("Building Complete!");
                    break;
                case 3:
                    System.out.println("Building Water Source!");
                    village.draw(new WaterSource());
                    System.out.println("Building Complete!");
                    break;
                case 4:
                    System.out.println("Viewing your village structure");
                    village.display(0);
                    break;
                default:
                    System.out.println("Exiting!");
                    exit = true;
            }
        } 

    }



}
