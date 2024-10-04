import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declare scanner
        Scanner input = new Scanner(System.in);
        //Ask the user if the figurine is in a good state
        System.out.println("Is your figurine in a good state?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        int numFigurineGoodState = -1;
        double priceFigurine = -1.0f;
        double resellPrice = 0.0f;

        boolean isFigurineGood = false;
        boolean validPurchase = false;
        do {
            //Check if the input is a number or not
            if (input.hasNextInt())
            {
                numFigurineGoodState= input.nextInt();
                //If it's a number, check if it's between 1 and 2
                if (numFigurineGoodState != 1 && numFigurineGoodState != 2) {
                    //If it's not, ask again
                    System.out.println("That's not a valid number");
                } else {
                    isFigurineGood = true;
                }
            } else{
                //If it's not a number, ask again
                System.out.println("That's not a number");
            }
            //Clear input
            input.nextLine();
        } while(!isFigurineGood);

        //Ask teh user how much is the price of the figurine
        System.out.println("How much is your figurine?");

        do {
            //Check if the input is a number or not
            if (input.hasNextInt())
            {
                priceFigurine= input.nextInt();
                //If it's a number, check if it's between 1 and 10
                if (priceFigurine < 0.0f) {
                    //If it's not, ask again
                    System.out.println("That's not a valid number");
                }
                else {
                    validPurchase = true;
                }
            } else{
                //If it's not a number, ask again
                System.out.println("That's not a number");
            }
            //Clear input
            input.nextLine();
        } while(!validPurchase);

        //Check which resell price is necessary
        if (numFigurineGoodState == 1)
        {
            resellPrice = 1.25f;
        } else
        {
            resellPrice = 1.10f;
        }
        //Print out the final price
        System.out.println("Your resell price is: " + resellPrice);
        System.out.println("Your figurine would resell at: " + resellPrice * priceFigurine);

    }
}