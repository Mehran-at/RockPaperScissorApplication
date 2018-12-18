//Derek, Matilda and Hansel meet in the weekend and they are talking about what to do. Derek wants to go to a museum,
//  Matilda wants to go to the cinema and Hansel wants to go shopping. They decide to play rock, scissors, paper and
//  the winner gets to choose.
//        Game rules:
//        . Each player chooses a move. The possible options are rock, scissors and paper.
//        . Rock defeats scissors. Scissors defeats paper. Paper defeats rock.
//        Develop the RockScissorsPaperApplication following the rules below:
//        . One human player (player 1) plays against the computer player (player 2).
//        . Both players choose a move, either rock, scissors or paper.
//        . The human player types in the move until it is typed correctly.
//        . A decision maker compares both moves and returns the result a message.
//        . Both players answer if they want to play again.
//        . The game repeats itself until either player chooses not to continue playing.
//        . Make sure all combinations work by creating a test that covers them.
//        Hints:
//        > Use the strategies to understand the problem and break it down into smaller pieces.
//        > The purpose of the exercise is not only to develop a game that works. It has to work applying the concept
//              of interfaces.
//        > Try to abstract interfaces to simplify the solution. There are two types of players: the human and the
//              computer. There are three types of moves: rock, scissors and paper. Player and move seem enough.
//        > Identify responsibilities and create classes accordingly. There should be at least one class for the main
//              application, one for the game, one for the decision maker that compares the moves. Then the two different
//              players and the three different moves.
//        > The three moves are only allowed to be created in one class. Every other class interacts with this one to
//              get the moves. You are allowed to use static methods in that class to make class communication easier.
//-----------------------------------------------------------------------------------------
//      Let’s play rock, paper, scissors!
//          These are your options: rock, paper, scissors
//          Choose one:
//          rok
//          These are your options: rock, paper, scissors
//          Choose one:
//          rock
//          Player 1 chose: rock
//          Player 2 chose: scissors
//          You win!
//          Do you want to play again? (yes/no)
//          no
//          See you next time!
//-----------------------------------------------------------------------------------------
import java.util.Scanner;

public class RockScissorsPaperApplication {
    public static void main(String[] args) {
        Game game = new Game();
        game.play();
    }
}
