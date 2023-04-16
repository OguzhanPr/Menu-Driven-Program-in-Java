package inputtestandkeyboard;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {

        int num = 0;
        String strInput;
        boolean valid = false;

        //Setup Scanner
        Scanner scan = new Scanner(System.in);
        //Keep looking until valid input
        while(valid==false){
            //Prompt the user
            System.out.println("Enter an Integer value : ");
            //Gran input from keyboard
            strInput = scan.nextLine();
            //try to convert String to int
            try{
                num = Integer.parseInt(strInput);
                valid=true;
            }catch (NumberFormatException e){
                System.out.println("Erorr - enter an integer value ");
            }
        }

        //Output the number entered by user
        System.out.println("You entered the number " + num);


    }
}
