package inputtestandkeyboard;

public class KeyboardTest {
    public static void main(String[] args) {

        //Create a Keyboard object
        Keyboard kb = new Keyboard();

        //Test case 1 ; readInteger
        int intInput;
        String promptMsg1 = "Enter an integer value : ";
        String errorMsg1 = "Invalid entry, enter an integer value";
        //Call to readInteger
        intInput = kb.readInteger(promptMsg1, errorMsg1);
        //Output
        System.out.println("You entered the value " + intInput);

        //Test case 2 : readDouble
        double doubleInput;
        String promptMsg2 = "Enter a double value : ";
        String errorMsg2 = "Invalid entry, enter a double value";
        //Call to readDouble
        doubleInput= kb.readDouble(promptMsg2, errorMsg2);
        //Output
        System.out.println("You entered the value " + doubleInput);

        //Test case 3 ; readInteger with low and high
        int intInput2;
        String promptMsg3 = "Enter an integer value in the range (1-10) : ";
        String errorMsg3 = "Invalid entry, enter an integer value in the range (1-10)";
        //Call to readInteger with low and high
        intInput2 = kb.readInteger(promptMsg3, errorMsg3,1 , 10);
        //Output
        System.out.println("You entered the value " + intInput2);


    }
}
