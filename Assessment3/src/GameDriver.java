import java.util.ArrayList;
import java.util.Scanner;

/**
 * Calls and uses the class "Game" to play a double round-robin with six teams.
 *
 * @version 1.0
 */
public class GameDriver
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Team> teamList = new ArrayList<Team>();

        System.out.println("Enter team 1's name: ");
        Team team1 = new Team(scanner.nextLine());
        System.out.println("Enter team 2's name: ");
        Team team2 = new Team(scanner.nextLine());
        System.out.println("Enter team 3's name: ");
        Team team3 = new Team(scanner.nextLine());
        System.out.println("Enter team 4's name: ");
        Team team4 = new Team(scanner.nextLine());
        System.out.println("Enter team 5's name: ");
        Team team5 = new Team(scanner.nextLine());
        System.out.println("Enter team 6's name: ");
        Team team6 = new Team(scanner.nextLine());

        teamList.add(team1);
        teamList.add(team2);
        teamList.add(team3);
        teamList.add(team4);
        teamList.add(team5);
        teamList.add(team6);

        //first round
        for (int i = 0; i < teamList.size() - 1; i++)
        {
            for (int j = 1; i + j < teamList.size(); j++)
            {
                Game game = new Game(teamList.get(i), teamList.get(i + j));
                game.playGame();
            }
        }
        //second round
        for (int i = 0; i < teamList.size() - 1; i++)
        {
            for (int j = 1; i + j < teamList.size(); j++)
            {
                Game game = new Game(teamList.get(i), teamList.get(i + j));
                game.playGame();
            }
        }

        for (Team team : teamList)
        {
            System.out.println("-----------");
            System.out.println("Team stats: ");
            System.out.println("Name: " + team.getTeamName());
            System.out.println("Wins: " + team.getWins());
            System.out.println("Draws: " + team.getDraws());
            System.out.println("Losses: " + team.getLosses());
            System.out.println("----------- \n");
        }
    }
}