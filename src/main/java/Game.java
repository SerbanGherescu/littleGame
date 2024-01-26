import javax.swing.*;
import java.util.Random;

public class Game {

    public static void main(String[] args) {

//        You can customize starting numbers of points by modify the value after "=" (modify 20 with any number you want)
        int points = 20;

//        Here I set name for user who is going to play this game
        String user = JOptionPane.showInputDialog("Enter your name");

//        Here I inform the player how many points he will start with
        JOptionPane.showMessageDialog(null, user + " you start with " + points + " points");

//        Here I told to the user the rules of the game
        JOptionPane.showMessageDialog(null, """
                RULES : You need to pick a number between 1 and 6\s
                If you get high number than me, you win 10 points, otherwise you lose 5 points.\s
                Have fun!""");

//        I created a LOOP for entire game for executing following lines until player lose all points
        while (points > 0) {

//           I created a variable "playerNumber" witch will assign the number that player chose and told him
//           to pick a number between 1 and 6, also displayed his number of points via ' + points + '
            int playerNumber = Integer.parseInt(JOptionPane
                    .showInputDialog(user + " your points is : " + points + "\n" + "Enter your number"));

//            I created an if statement for conditioning the player to pick a number higher than 0 and lower than 7
//            (between 1 and 6)
            if (0 < playerNumber && playerNumber < 7) {
                //            Here I display his number
                JOptionPane.showMessageDialog(null, "Your number is :" + playerNumber);
//            here I create a little of suspense :))
                JOptionPane.showMessageDialog(null, "My number is ...");

//            Here I created a variable for a random number;
                Random computerNumber = new Random();
//            Here I initialize the random number
                int x = computerNumber.nextInt(9) + 1;
//            Here I display the random number
                JOptionPane.showMessageDialog(null, "My number is :" + x);

//                I created the condition where player will be winner
                if (x < playerNumber) {
//                    adding 10 points for winning
                    points += 10;
//                    Display status of winning the game and his numbers of points
                    JOptionPane.showMessageDialog(null, "You won!" +
                            "\nNow you have " + points + " points");
//                    Condition for player who is going to lose the game
                } else if (x > playerNumber) {
//                    decrement his number of points because he lost the game
                    points -= 5;
//                    Display status of losing the game and remaining numbers of points
                    JOptionPane.showMessageDialog(null, "You lose!" +
                            "\nNow you have " + points + " points");
//                    Last condition for draw statement
                } else {
//                    Informing the player about the draw round and told him his number of points and
//                    to continue the game by picking another number
                    JOptionPane.showMessageDialog(null, "It's draw!" +
                            "\nYou have " + points + " points" +
                            "\nLet's continue. Pick a number between 1 and 6.");

                }
//              the condition for player that will pick a number lower than 0 and higher than 6
//              witch will result to display an "error" message to inform him about his mistake and pick another number
            } else {
                JOptionPane.showMessageDialog(null,
                        "You need to pick a number between 1 and 6.." +
                                "\nLet's try again..");
            }
        }
//        If player lose all his points, he gets this message
        JOptionPane.showMessageDialog(null, "Now you lost all your points." +
                "\nYou need to start again the game");

    }


}


