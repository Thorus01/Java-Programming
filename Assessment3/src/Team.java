/**
 * Class representing an AFL team and its related statistics.
 *
 * @version 1.0
 */
public class Team
{
    private final String FINAL_TEAMNAME;
    private int wins;
    private int draws;
    private int losses;

    public Team()
    {
        FINAL_TEAMNAME = "";
        wins = 0;
        draws = 0;
        losses = 0;
    }

    public Team(String teamName)
    {
        FINAL_TEAMNAME = teamName;
        wins = 0;
        draws = 0;
        losses = 0;
    }

    public int getDraws()
    {
        return draws;
    }

    public int getLosses()
    {
        return losses;
    }

    public String getTeamName()
    {
        return FINAL_TEAMNAME;
    }

    public int getWins()
    {
        return wins;
    }

    public void setDraws(int draws)
    {
        this.draws = draws;
    }

    public void setLosses(int losses)
    {
        this.losses = losses;
    }

    public void setWins(int wins)
    {
        this.wins = wins;
    }

    public String toString()
    {
        return "Team{" +
                "teamName='" + FINAL_TEAMNAME + '\'' +
                ", wins=" + wins +
                ", draws=" + draws +
                ", losses=" + losses +
                '}';
    }
}
