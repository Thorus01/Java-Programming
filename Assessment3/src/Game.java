/**
 * Class representing a game of AFL.
 *
 * @version 1.0
 */
public class Game
{
    private final Team FINAL_TEAM1;
    private final Team FINAL_TEAM2;
    private int team1Score;
    private int team2Score;
    public static final int FINAL_GOAL = 6;
    public static final int FINAL_BEHIND = 1;

    public Game()
    {
        FINAL_TEAM1 = null;
        FINAL_TEAM2 = null;
        team1Score = 0;
        team2Score = 0;

    }

    public Game(Team team1, Team team2)
    {
        FINAL_TEAM1 = team1;
        FINAL_TEAM2 = team2;
        team1Score = 0;
        team2Score = 0;
    }

    public Team getFINAL_TEAM1()
    {
        return FINAL_TEAM1;
    }

    public Team getFINAL_TEAM2()
    {
        return FINAL_TEAM2;
    }

    public int getTeam1Score()
    {
        return team1Score;
    }

    public int getTeam2Score()
    {
        return team2Score;
    }

    public void playGame()
    {
        System.out.println("Welcome to " + FINAL_TEAM1.getTeamName() + " vs " + FINAL_TEAM2.getTeamName());
        System.out.println("The game has started! \n");

        int team1Number = 0;
        int team2Number = 0;
        Team winningTeam = null;

        for (int i = 80; i > 1; i--)
        {
            team1Number = (int) ((Math.random()*100)+1);
            team2Number = (int) ((Math.random()*100)+1);

            if (team1Number >= 1 && team1Number <= 14)
            {
                team1Score += FINAL_GOAL;

            }
            else if (team1Number >= 15 && team1Number <= 32)
            {
                team1Score += FINAL_BEHIND;
            }

            if (team2Number >= 1 && team2Number <= 14)
            {
                team2Score += FINAL_GOAL;

            }
            else if (team2Number >= 15 && team2Number <= 32)
            {
                team2Score += FINAL_BEHIND;
            }
        }

        if (team1Score > team2Score)
        {
            winningTeam = FINAL_TEAM1;
            FINAL_TEAM1.setWins(FINAL_TEAM1.getWins() + 1);
            FINAL_TEAM2.setLosses(FINAL_TEAM2.getLosses() + 1);
            System.out.println("Game over \n" + winningTeam.getTeamName() + " wins!");
        }
        else if (team1Score < team2Score)
        {
            winningTeam = FINAL_TEAM2;
            FINAL_TEAM2.setWins(FINAL_TEAM2.getWins() + 1);
            FINAL_TEAM1.setLosses(FINAL_TEAM1.getLosses() + 1);
            System.out.println("Game over \n" + winningTeam.getTeamName() + " wins!");
        }
        else
        {
            FINAL_TEAM1.setDraws(FINAL_TEAM1.getDraws() + 1);
            FINAL_TEAM2.setDraws(FINAL_TEAM2.getDraws() + 1);
            System.out.println("Game over \n" + "It's a draw!");
        }

        System.out.print("Final Score: " + FINAL_TEAM1.getTeamName() + " " + team1Score);
        System.out.println(" - " + team2Score + " " + FINAL_TEAM2.getTeamName());
        System.out.println("\n ---------------------- \n");
    }

    public void setTeam1Score(int team1Score)
    {
        this.team1Score = team1Score;
    }

    public void setTeam2Score(int team2Score)
    {
        this.team2Score = team2Score;
    }

    public String toString()
    {
        return "Game{" +
                "FINAL_TEAM1=" + FINAL_TEAM1 +
                ", FINAL_TEAM2=" + FINAL_TEAM2 +
                ", team1Score=" + team1Score +
                ", team2Score=" + team2Score +
                '}';
    }
}
