
/**
 * Write a description of class RPSMatch here.
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
    
    public RPSMatch()
    {
        humanWins = 0;
        computerWins = 0;
        ties = 0;
    }
    public void setHumanPlay(String hp)
    {
        if (hp.equals("rock"))
        {
            humanPlay = ROCK;
        }
        if (hp.equals("paper"))
        {
            humanPlay = PAPER;
        }
        if (hp.equals("scissors"))
        {
            humanPlay = SCISSORS;
        }
    }
    //this version cheats
    
    public String getComputerPlay(String hp)
    {
        if (hp.equals("rock"))
        {
            int computerPlay = (int)(Math.random()*5);
            if (computerPlay == 4)
            {
              computerPlay = 1;
            }
            else if ( computerPlay <= 3)
            {
                computerPlay = 0;
            }
            else if (computerPlay == 5)
                computerPlay = 2;
            }
        if (hp.equals("paper"))
        {
            int computerPlay = (int)(Math.random()*5);
            if (computerPlay == 4)
            {
              computerPlay = 0;
            }
            else if ( computerPlay <= 3)
            {
                computerPlay = 2;
            }
            else if (computerPlay == 5)
                computerPlay = 1;
            }
        if (hp.equals("rock"))
        {
            int computerPlay=(int)(Math.random()*5);
            if (computerPlay == 4)
            {
              computerPlay = 2;
            }
            else if ( computerPlay <= 3)
            {
                computerPlay = 1;
            }
            else if (computerPlay==5)
                computerPlay = 0;
            }
            return "Something is wrong!";
        }
        
   // this version does not cheat
   /*
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
    */
    public void setComputerPlay(String cp)
    {
        
    }
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
