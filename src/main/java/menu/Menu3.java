package menu;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class MenuItem{
    private String name;
    private double price;
    MenuItem(String name, double price){
        this.name=name;
        this.price=price;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }

}



public class Menu3 {

    public static void displayMenu(ArrayList<MenuItem>items){
        //Display menu
        System.out.println("M E N U");
        System.out.println("==============");

        //Loop through options and items
        for(int i =0; i< items.size(); i++){
            MenuItem item = items.get(i);
            System.out.printf("%d. %-25s %.2f\n", i+1, item.getName(), item.getPrice());
        }
        // Print the Exit option
        System.out.printf("%d. Exit\n", items.size()+1);
        System.out.println("==============");
    }

    public static void completeTransaction(int choise, ArrayList<MenuItem> items){
        MenuItem item = items.get(choise-1);
        System.out.printf("Here is your %s coffee worth %.2f\n", item.getName(), item.getPrice());
    }

    public static void readInventoryFile(String fileName, ArrayList<MenuItem> items){
        try {
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while ((line = br.readLine()) != null){
                //example:  Cappuccino,2.50
                String tokens[]= line.split(",");
                String name = tokens[0];
                double price = Double.parseDouble(tokens[1]);
                items.add(new MenuItem(name, price));
            }
            br.close();
        }
        catch (IOException e){
            System.out.println("Error : Cannot read from file " + fileName);
        }
    }


    public static void main(String[] args) throws IOException {

        //User choise
        int choise;

        //Menu data
        ArrayList<MenuItem> menuItems = new ArrayList<>();

        //Read inventory.txt and create menu items
        readInventoryFile("inventory.txt", menuItems);

        //Exit option
        int EXIT = menuItems.size()+1;

        //Create a keyboard object for input validation
        Keyboard key = new Keyboard();


        //Display menu
        displayMenu(menuItems);

        //Setup Scanner
        Scanner scan = new Scanner(System.in);

        //Get choice from user
        choise = key.readInteger("Enter choice : " , "Error : invalid input", 1, EXIT );

        //menu.Menu Loop
        while(choise!=EXIT){
            //Check choice value
            completeTransaction(choise, menuItems);

            //Display menu.Menu
            displayMenu(menuItems);

            //Get choice from user
            choise = key.readInteger("Enter choice : " , "Error : invalid input", 1, EXIT );

        }
        System.out.println("Goodbye, call again");




    }
}

