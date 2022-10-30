
/**
 * RPS Match allows the computer and a person to play the game and keep track of each round's results.
 *
 * @author Emily Ensign and Mahee Shah
 * @version 10-24-2022
 */
public class RPSMatch
{
    private int humanWins;
    private int computerWins;
    private int ties;
    private int humanPlay;
    private int computerPlay;
    
    private final int ROCK = 0;
    private final int PAPER = 1;
    private final int SCISSORS = 2;
    
    // this sets the counter of each result to zero
    // both of us worked on this part
    public RPSMatch()
    {
        humanWins = 0;
        computerWins = 0;
        ties = 0;
    }
    // this assigns the play of the human to a result, assigning each outcome a number
    // both of us worked on this part
    public void setHumanPlay(String hp)
    {
        if (hp.equals("rock"))
        {
            humanPlay = 0;
        }
        if (hp.equals("paper"))
        {
            humanPlay = 1;
        }
        if (hp.equals("scissors"))
        {
            humanPlay = 2;
        }
    }   
   // this version does not cheat
   // Emily wrote this part
    public String getComputerPlay()
    {
        computerPlay = (int)(Math.random() * 3);
        if (computerPlay == 0)
        {
            return ("rock");
        }
        else if (computerPlay == 1)
        {
            return ("paper");
        }
        else
        {
            return ("scissors");
        }
    }
   // this version cheats
   // Mahee wrote the code and Emily came up with the idea on how to cheat
   /*
    public String getComputerPlay(String hp)
    {
        computerPlay = (int)(Math.random() * 10);
        if (humanPlay == 0 && (computerPlay == 6 || computerPlay == 7))
        {
            return ("rock");
        }
        else if (humanPlay == 0 && computerPlay <= 5)
        {
            return ("paper");
        }
        else if (humanPlay == 0 && (computerPlay == 8 || computerPlay == 9))
        {
            return ("scissors");
        }
        else if (humanPlay == 1 && (computerPlay == 6 || computerPlay == 7))
        {
            return ("rock");
        }
        else if (humanPlay == 1 && (computerPlay == 8 || computerPlay == 9))
        {
            return ("paper");
        }
        else if (humanPlay == 1 && computerPlay <= 5)
        {
            return ("scissors");
        }
        else if (humanPlay == 2 && computerPlay <= 5)
        {
            return ("rock");
        }
        else if (humanPlay == 2 && (computerPlay == 6 || computerPlay == 7))
        {
            return ("paper");
        }
        else if (humanPlay == 2 && (computerPlay == 8 || computerPlay == 9))
        {
            return ("scissors");
        }
        else
        {
            return ("Something is wrong!");
        }
    }
    */
   // this says what the outcome of the game will be with each player's choice
   // Emily wrote this part with help from Mahee
    public String getResult()
    {
        if (humanPlay==0 && computerPlay==0)
        {
            ties += 1;
            return ("Tie!");
        }
        if (humanPlay==1 && computerPlay==1)
        {
            ties += 1;
            return ("Tie!");
        }
        if (humanPlay==2 && computerPlay==2)
        {
            ties += 1;
            return ("Tie!");
        }
        if (humanPlay==1 && computerPlay==2)
        {
            computerWins += 1;
            return ("The computer wins!");
        }
        if (humanPlay==2 && computerPlay==1)
        {
            humanWins += 1;
            return ("You win!");
        }
        if (humanPlay==1 && computerPlay==0)
        {
            humanWins += 1;
            return ("You win!");
        }
        if (humanPlay==0 && computerPlay==1)
        {
            computerWins += 1;
            return ("The computer wins!");
        }
        if (humanPlay==2 && computerPlay==0)
        {
            computerWins += 1;
            return ("The computer wins!");
        }
        if (humanPlay==0 && computerPlay==2)
        {
            humanWins += 1;
            return ("You win!");
        }
        else
        {
            return ("Something is wrong!");
        }
    }
    // this  returns who won the game
    // both of us worked on this part
    public int getHumanWins()
    {
        return humanWins;
    }
    public int getComputerWins()
    {
        return computerWins;
    }
    public int getTies()
    {
        return ties;
    }  
}
