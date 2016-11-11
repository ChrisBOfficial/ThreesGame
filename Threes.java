import java.io.IOException;
import java.util.Scanner;
import java.lang.*;

public class Threes {
    /**
     * First, you put in a random number to start with. Then, repeatedly do the following:
     * If the number is divisible by 3, divide it by 3.
     * If it's not, either add 1 or subtract 1 (to make it divisible by 3), then divide it by 3.
     * The game stops when you reach "1".
     */
    public static void main(String str[]) throws IOException {

        Scanner scan = new Scanner(System.in);

        System.out.println("Would you like to play a game called Threes? Y/N");
        String answer = scan.nextLine();        //Simple yes or no
        String again = "a";

        do {
            if (answer.contains("Y") || (answer.contains("y"))) {
                System.out.println("OK, want to know the rules? Y/N");
                String answer2 = scan.nextLine();
                int step = 0;
                if (answer2.contains("n") || (answer2.contains("N"))) {
                    System.out.println("Alright what difficulty?\n1   2   3   or   Custom (4)");
                    int difficulty = scan.nextInt();
                    if (difficulty == 1) {
                        int numstart = ((int) (Math.random() * 700 + 100));       //Random number for user
                        System.out.println("OK, your number is: " + numstart);

                        int mistake = 0;    //Used as a counter for number of division mistakes made
                        int current = numstart;     //Current number displayed - starts as the first number

                        System.out.println("Enter 1 or -1 if you're adding or subtracting, and 0 to divide.");
                        System.out.println(numstart);       //Displays first number input
                        int input = scan.nextInt();     //First function performed by user

                        while (current != 1) {      //The game will run until the number '1' is reached
                            if (input == 1) {       //If '1' is input, add one to the number, and display new number
                                current++;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == -1) {      //If '-1' is input, subtract one from the number, and display new number
                                current--;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == 0) {       //If '0' is input, try to divide
                                if (current % 3 != 0 && current != 1) {     //If you can't divide by three, try again
                                    System.out.println("Try again.");
                                    mistake++;
                                    step++;
                                    input = scan.nextInt();
                                }
                                if (current % 3 == 0) {     //If you can divide, do it and display new number
                                    current = current / 3;
                                    step++;
                                    System.out.println(current);
                                    input = scan.nextInt();
                                }
                            }
                            if (input == 69 || input == 666)     //Cheat code! If you input 69 or 666, you automatically win
                                break;
                            if (input > 1 || input < -1) {        //If input is not valid, try again and display error
                                System.out.println("Error - wrong input.");
                                input = scan.nextInt();
                            }
                        }
                        System.out.println("You Win! Mistakes: " + mistake + " Steps: " + step + "\n");        //Will display a win condition, and amount of division errors
                        System.out.println("Thank you for playing Threes \n - Chris Burbach");
                        scan.nextLine();
                        System.out.println("Credits? Y/N");
                        String credits = scan.nextLine();

                        if (credits.contains("Y") || credits.contains("y")) {
                            System.out.println("\n***********************************************************************");
                            System.out.println("*Threes: a game of dividing by three - inspired by my boredom in class*");
                            System.out.println("***********************************************************************\n");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        } else
                        {
                            System.out.println("OK, have a nice day.\n");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        }
                    }
                    if (difficulty == 2) {
                        int numstart = ((int) (Math.random() * 2000 + 700));      //Random number for user
                        System.out.println("OK, your number is: " + numstart);

                        int mistake = 0;    //Used as a counter for number of division mistakes made
                        int current = numstart;     //Current number displayed - starts as the first number

                        System.out.println("Enter 1 or -1 if you're adding or subtracting, and 0 to divide.");
                        System.out.println(numstart);       //Displays first number input
                        int input = scan.nextInt();     //First function performed by user

                        while (current != 1) {      //The game will run until the number '1' is reached
                            if (input == 1) {       //If '1' is input, add one to the number, and display new number
                                current++;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == -1) {      //If '-1' is input, subtract one from the number, and display new number
                                current--;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == 0) {       //If '0' is input, try to divide
                                if (current % 3 != 0 && current != 1) {     //If you can't divide by three, try again
                                    System.out.println("Try again.");
                                    step++;
                                    mistake++;
                                    input = scan.nextInt();
                                }
                                if (current % 3 == 0) {     //If you can divide, do it and display new number
                                    current = current / 3;
                                    step++;
                                    System.out.println(current);
                                    input = scan.nextInt();
                                }
                            }
                            if (input == 69 || input == 666)     //Cheat code! If you input 69 or 666, you automatically win
                                break;
                            if (input > 1 || input < -1) {        //If input is not valid, try again and display error
                                System.out.println("Error - wrong input.");
                                input = scan.nextInt();
                            }
                        }
                        System.out.println("You Win! Mistakes: " + mistake + " Steps: " + step + "\n");        //Will display a win condition, and amount of division errors
                        System.out.println("Thank you for playing Threes \n - Chris Burbach");
                        scan.nextLine();
                        System.out.println("Credits? Y/N");
                        String credits = scan.nextLine();

                        if (credits.contains("Y") || credits.contains("y")) {
                            System.out.println("\n***********************************************************************");
                            System.out.println("*Threes: a game of dividing by three - inspired by my boredom in class*");
                            System.out.println("***********************************************************************\n");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        } else
                        {
                            System.out.println("OK, have a nice day.");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        }

                    }
                    if (difficulty == 3) {
                        int numstart = ((int) (Math.random() * 10000 + 2000));    //Random number for user
                        System.out.println("OK, your number is: " + numstart);

                        int mistake = 0;    //Used as a counter for number of division mistakes made
                        int current = numstart;     //Current number displayed - starts as the first number

                        System.out.println("Enter 1 or -1 if you're adding or subtracting, and 0 to divide.");
                        System.out.println(numstart);       //Displays first number input
                        int input = scan.nextInt();     //First function performed by user

                        while (current != 1) {      //The game will run until the number '1' is reached
                            if (input == 1) {       //If '1' is input, add one to the number, and display new number
                                current++;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == -1) {      //If '-1' is input, subtract one from the number, and display new number
                                current--;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == 0) {       //If '0' is input, try to divide
                                if (current % 3 != 0 && current != 1) {     //If you can't divide by three, try again
                                    System.out.println("Try again.");
                                    mistake++;
                                    step++;
                                    input = scan.nextInt();
                                }
                                if (current % 3 == 0) {     //If you can divide, do it and display new number
                                    current = current / 3;
                                    step++;
                                    System.out.println(current);
                                    input = scan.nextInt();
                                }
                            }
                            if (input == 69 || input == 666)     //Cheat code! If you input 69 or 666, you automatically win
                                break;
                            if (input > 1 || input < -1) {        //If input is not valid, try again and display error
                                System.out.println("Error - wrong input.");
                                input = scan.nextInt();
                            }
                        }
                        System.out.println("You Win! Mistakes: " + mistake + " Steps: " + step + "\n");        //Will display a win condition, and amount of division errors
                        System.out.println("Thank you for playing Threes \n - Chris Burbach");
                        scan.nextLine();
                        System.out.println("Credits? Y/N");
                        String credits = scan.nextLine();

                        if (credits.contains("Y") || credits.contains("y")) {
                            System.out.println("\n***********************************************************************");
                            System.out.println("*Threes: a game of dividing by three - inspired by my boredom in class*");
                            System.out.println("***********************************************************************\n");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        } else
                        {
                            System.out.println("OK, have a nice day.");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        }
                    }
                    if (difficulty == 4) {
                        System.out.println("OK, Enter a single number.");

                        int mistake = 0;    //Used as a counter for number of division mistakes made
                        int numstart = scan.nextInt();  //First number input
                        int current = numstart;     //Current number displayed - starts as the first number

                        System.out.println("Enter 1 or -1 if you're adding or subtracting, and 0 to divide.");
                        System.out.println(numstart);       //Displays first number input
                        int input = scan.nextInt();     //First function performed by user

                        while (current != 1) {      //The game will run until the number '1' is reached
                            if (input == 1) {       //If '1' is input, add one to the number, and display new number
                                current++;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == -1) {      //If '-1' is input, subtract one from the number, and display new number
                                current--;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == 0) {       //If '0' is input, try to divide
                                if (current % 3 != 0 && current != 1) {     //If you can't divide by three, try again
                                    System.out.println("Try again.");
                                    step++;
                                    mistake++;
                                    input = scan.nextInt();
                                }
                                if (current % 3 == 0) {     //If you can divide, do it and display new number
                                    current = current / 3;
                                    step++;
                                    System.out.println(current);
                                    input = scan.nextInt();
                                }
                            }
                            if (input == 69 || input == 666)     //Cheat code! If you input 69 or 666, you automatically win
                                break;
                            if (input > 1 || input < -1) {        //If input is not valid, try again and display error
                                System.out.println("Error - wrong input.");
                                input = scan.nextInt();
                            }
                        }
                        System.out.println("You Win! Mistakes: " + mistake + " Steps: " + step + "\n");        //Will display a win condition, and amount of division errors
                        System.out.println("Thank you for playing Threes \n - Chris Burbach");
                        scan.nextLine();
                        System.out.println("Credits? Y/N");
                        String credits = scan.nextLine();

                        if (credits.contains("Y") || credits.contains("y")) {
                            System.out.println("\n***********************************************************************");
                            System.out.println("*Threes: a game of dividing by three - inspired by my boredom in class*");
                            System.out.println("***********************************************************************\n");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        } else
                        {
                            System.out.println("OK, have a nice day.");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        }
                    }
                }
                if (answer2.contains("Y") || answer2.contains("y")) {
                    System.out.println("\nOK, you first will enter a number, and then either enter '1' or '-1' to add or subtract 1 respectively. " +
                            "\nOr you can enter '0' to divide by three. The goal is to get your number down to '1' in as little steps as possible." +
                            "\nEnter '0' to confirm once you've reached '1'");
                    System.out.println("\nAlright, what difficulty?\n1   2   3   or   Custom (4)");
                    int difficulty = scan.nextInt();
                    if (difficulty == 1) {
                        int numstart = ((int) (Math.random() * 700 + 100));
                        System.out.println("OK, your number is: " + numstart);

                        int mistake = 0;    //Used as a counter for number of division mistakes made
                        int current = numstart;     //Current number displayed - starts as the first number

                        System.out.println("Enter 1 or -1 if you're adding or subtracting, and 0 to divide.");
                        System.out.println(numstart);       //Displays first number input
                        int input = scan.nextInt();     //First function performed by user

                        while (current != 1) {      //The game will run until the number '1' is reached
                            if (input == 1) {       //If '1' is input, add one to the number, and display new number
                                current++;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == -1) {      //If '-1' is input, subtract one from the number, and display new number
                                current--;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == 0) {       //If '0' is input, try to divide
                                if (current % 3 != 0 && current != 1) {     //If you can't divide by three, try again
                                    System.out.println("Try again.");
                                    mistake++;
                                    step++;
                                    input = scan.nextInt();
                                }
                                if (current % 3 == 0) {     //If you can divide, do it and display new number
                                    current = current / 3;
                                    step++;
                                    System.out.println(current);
                                    input = scan.nextInt();
                                }
                            }
                            if (input == 69 || input == 666)     //Cheat code! If you input 69 or 666, you automatically win
                                break;
                            if (input > 1 || input < -1) {        //If input is not valid, try again and display error
                                System.out.println("Error - wrong input.");
                                input = scan.nextInt();
                            }
                        }
                        System.out.println("You Win! Mistakes: " + mistake + " Steps: " + step + "\n");        //Will display a win condition, and amount of division errors
                        System.out.println("Thank you for playing Threes \n - Chris Burbach");
                        scan.nextLine();
                        System.out.println("Credits? Y/N");
                        String credits = scan.nextLine();

                        if (credits.contains("Y") || credits.contains("y")) {
                            System.out.println("\n***********************************************************************");
                            System.out.println("*Threes: a game of dividing by three - inspired by my boredom in class*");
                            System.out.println("***********************************************************************\n");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        } else
                        {
                            System.out.println("OK, have a nice day.");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        }
                    }
                    if (difficulty == 2) {
                        int numstart = ((int) (Math.random() * 2000 + 700));
                        System.out.println("OK, your number is: " + numstart);

                        int mistake = 0;    //Used as a counter for number of division mistakes made
                        int current = numstart;     //Current number displayed - starts as the first number

                        System.out.println("Enter 1 or -1 if you're adding or subtracting, and 0 to divide.");
                        System.out.println(numstart);       //Displays first number input
                        int input = scan.nextInt();     //First function performed by user

                        while (current != 1) {      //The game will run until the number '1' is reached
                            if (input == 1) {       //If '1' is input, add one to the number, and display new number
                                current++;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == -1) {      //If '-1' is input, subtract one from the number, and display new number
                                current--;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == 0) {       //If '0' is input, try to divide
                                if (current % 3 != 0 && current != 1) {     //If you can't divide by three, try again
                                    System.out.println("Try again.");
                                    mistake++;
                                    step++;
                                    input = scan.nextInt();
                                }
                                if (current % 3 == 0) {     //If you can divide, do it and display new number
                                    current = current / 3;
                                    step++;
                                    System.out.println(current);
                                    input = scan.nextInt();
                                }
                            }
                            if (input == 69 || input == 666)     //Cheat code! If you input 69 or 666, you automatically win
                                break;
                            if (input > 1 || input < -1) {        //If input is not valid, try again and display error
                                System.out.println("Error - wrong input.");
                                input = scan.nextInt();
                            }
                        }
                        System.out.println("You Win! Mistakes: " + mistake + " Steps: " + step + "\n");        //Will display a win condition, and amount of division errors
                        System.out.println("Thank you for playing Threes \n - Chris Burbach");
                        scan.nextLine();
                        System.out.println("Credits? Y/N");
                        String credits = scan.nextLine();

                        if (credits.contains("Y") || credits.contains("y")) {
                            System.out.println("\n***********************************************************************");
                            System.out.println("*Threes: a game of dividing by three - inspired by my boredom in class*");
                            System.out.println("***********************************************************************\n");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        } else
                        {
                            System.out.println("OK, have a nice day.");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        }
                    }
                    if (difficulty == 3) {
                        int numstart = ((int) (Math.random() * 10000 + 2000));
                        System.out.println("OK, your number is: " + numstart);

                        int mistake = 0;    //Used as a counter for number of division mistakes made
                        int current = numstart;     //Current number displayed - starts as the first number

                        System.out.println("Enter 1 or -1 if you're adding or subtracting, and 0 to divide.");
                        System.out.println(numstart);       //Displays first number input
                        int input = scan.nextInt();     //First function performed by user

                        while (current != 1) {      //The game will run until the number '1' is reached
                            if (input == 1) {       //If '1' is input, add one to the number, and display new number
                                current++;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == -1) {      //If '-1' is input, subtract one from the number, and display new number
                                current--;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == 0) {       //If '0' is input, try to divide
                                if (current % 3 != 0 && current != 1) {     //If you can't divide by three, try again
                                    System.out.println("Try again.");
                                    mistake++;
                                    step++;
                                    input = scan.nextInt();
                                }
                                if (current % 3 == 0) {     //If you can divide, do it and display new number
                                    current = current / 3;
                                    step++;
                                    System.out.println(current);
                                    input = scan.nextInt();
                                }
                            }
                            if (input == 69 || input == 666)     //Cheat code! If you input 69 or 666, you automatically win
                                break;
                            if (input > 1 || input < -1) {        //If input is not valid, try again and display error
                                System.out.println("Error - wrong input.");
                                input = scan.nextInt();
                            }
                        }
                        System.out.println("You Win! Mistakes: " + mistake + " Steps: " + step + "\n");        //Will display a win condition, and amount of division errors
                        System.out.println("Thank you for playing Threes \n - Chris Burbach");
                        scan.nextLine();
                        System.out.println("Credits? Y/N");
                        String credits = scan.nextLine();

                        if (credits.contains("Y") || credits.contains("y")) {
                            System.out.println("\n***********************************************************************");
                            System.out.println("*Threes: a game of dividing by three - inspired by my boredom in class*");
                            System.out.println("***********************************************************************\n");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        } else
                        {
                            System.out.println("OK, have a nice day.");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        }
                    }
                    if (difficulty == 4) {
                        System.out.println("OK, Enter a single number.");

                        int mistake = 0;    //Used as a counter for number of division mistakes made
                        int numstart = scan.nextInt();  //First number input
                        int current = numstart;     //Current number displayed - starts as the first number

                        System.out.println("Enter 1 or -1 if you're adding or subtracting, and 0 to divide.");
                        System.out.println(numstart);       //Displays first number input
                        int input = scan.nextInt();     //First function performed by user

                        while (current != 1) {      //The game will run until the number '1' is reached
                            if (input == 1) {       //If '1' is input, add one to the number, and display new number
                                current++;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == -1) {      //If '-1' is input, subtract one from the number, and display new number
                                current--;
                                step++;
                                System.out.println(current);
                                input = scan.nextInt();
                            }
                            if (input == 0) {       //If '0' is input, try to divide
                                if (current % 3 != 0 && current != 1) {     //If you can't divide by three, try again
                                    System.out.println("Try again.");
                                    mistake++;
                                    step++;
                                    input = scan.nextInt();
                                }
                                if (current % 3 == 0) {     //If you can divide, do it and display new number
                                    current = current / 3;
                                    step++;
                                    System.out.println(current);
                                    input = scan.nextInt();
                                }
                            }
                            if (input == 69 || input == 666)     //Cheat code! If you input 69 or 666, you automatically win
                                break;
                            if (input > 1 || input < -1) {        //If input is not valid, try again and display error
                                System.out.println("Error - wrong input.");
                                input = scan.nextInt();
                            }
                        }
                        System.out.println("You Win! Mistakes: " + mistake + " Steps: " + step + "\n");        //Will display a win condition, and amount of division errors
                        System.out.println("Thank you for playing Threes \n - Chris Burbach");
                        scan.nextLine();
                        System.out.println("Credits? Y/N");
                        String credits = scan.nextLine();

                        if (credits.contains("Y") || credits.contains("y")) {
                            System.out.println("\n***********************************************************************");
                            System.out.println("*Threes: a game of dividing by three - inspired by my boredom in class*");
                            System.out.println("***********************************************************************\n");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        } else
                        {
                            System.out.println("OK, have a nice day.");
                            System.out.println("Press r to play again?");
                            again = scan.nextLine();
                        }
                    }
                }
            }
            if (answer.contains("N") || answer.contains("n"))
                System.out.println("Okay, have a nice day.");
        }
        while(again.contains("r"));
    }
}
//Chris Burbach - 2016
