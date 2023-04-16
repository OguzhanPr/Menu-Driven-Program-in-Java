package menu;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args){
        //User choise
        int choise;

        //Display menu
        System.out.println("M E N U");
        System.out.println("==============");
        System.out.println("1. Americano");
        System.out.println("2. Latte");
        System.out.println("3. Espresso");
        System.out.println("4. Exit");
        System.out.println("==============");
        System.out.print("Enter choice : ");

        //Setup Scanner
        Scanner scan = new Scanner(System.in);

        //Get choice from user
        choise = scan.nextInt();

        //menu.Menu Loop
        while(choise!=4){
            //Check choice value
            if(choise==1){
                System.out.println("Americano coffee ");
            } else if (choise==2) {
                System.out.println("Latte coffee ");
            } else if (choise==3) {
                System.out.println("Espresso coffee ");
            }

            //Display menu.Menu
            System.out.println("M E N U");
            System.out.println("==============");
            System.out.println("1. Americano");
            System.out.println("2. Latte");
            System.out.println("3. Espresso");
            System.out.println("4. Exit");
            System.out.println("==============");
            System.out.print("Enter choice : ");

            //Get choice from user
            choise = scan.nextInt();

        }
        System.out.println("Goodbye, call again");




    }
}
