package menu;

import java.util.Scanner;

public class Menu2 {

    public static void displayMenu(int opts[], String items[], double pr[]  ){
        //Display menu
        System.out.println("M E N U");
        System.out.println("==============");
       //Loop through options and items
        for(int i =0; i< opts.length-1; i++){
            System.out.printf("%d. %s \t %.2f\n", opts[i], items[i], pr[i] );
        }
        // Print the Exit option
        System.out.printf("%d. %s\n", opts[opts.length-1], items[items.length-1] );
        System.out.println("==============");
        System.out.print("Enter choice : ");

    }

    public static void main(String[] args){
        //User choise
        int choise;

        //menu.Menu data
        int options[] ={1,2,3,4,5};
        String menuItems[]={"Cappuccino", "Latte   ", "Espresso", "Americano", "Exit"};
        double prices[]= {2.50,3.00,2.00,2.50};

        //Exit option
        int EXIT = options[options.length-1];

        //Display menu
        displayMenu(options, menuItems, prices);

        //Setup Scanner
        Scanner scan = new Scanner(System.in);

        //Get choice from user
        choise = scan.nextInt();

        //menu.Menu Loop
        while(choise!=EXIT){
            //Check choice value
            if(choise==options[0]){
                System.out.printf("%s coffee %.2f\n",menuItems[0],prices[0]);
            } else if (choise==options[1]) {
                System.out.printf("%s coffee %.2f\n",menuItems[1],prices[1]);
            } else if (choise==options[2]) {
                System.out.printf("%s coffee %.2f\n",menuItems[2],prices[2]);
            } else if (choise==options[3]) {
                System.out.printf("%s coffee %.2f\n",menuItems[3],prices[3]);
            }

            //Display menu.Menu
            displayMenu(options, menuItems, prices);

            //Get choice from user
            choise = scan.nextInt();

        }
        System.out.println("Goodbye, call again");




    }
}
