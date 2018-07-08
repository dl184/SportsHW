import Models.Manager;
import Models.Player;
import Models.SquadNumber;
import Models.Team;
import db.DBHelper;
import db.DBManager;
import db.DBPlayers;


import java.util.List;

public class Runner {

    public static void main(String[] args) {


        Manager manager1 = new Manager("Antonio Conte", 56, "Italian", 95000);
        DBHelper.save(manager1);
        Manager manager2 = new Manager("Pep Guardiola", 53, "Spanish", 155000);
        DBHelper.save(manager2);

        Team team1 = new Team("Manchester City", manager2);
        DBHelper.save(team1);
        Team team2 = new Team("Chelsea", manager1);
        DBHelper.save(team2);

        Player player1 = new Player("Sergio Aguero", 31, "Argentinian", 350000, SquadNumber.EIGHTEEN);
        DBHelper.save(player1);
        Player player2 = new Player("Cesc Fabregas", 34, "Spanish", 105000, SquadNumber.EIGHT);
        DBHelper.save(player2);

        player1.setTeam(team1);
        player2.setTeam(team2);
        manager1.setTeam(team2);
        manager2.setTeam(team1);

        List<Player> getPlayers = DBPlayers.getAllPlayersInTeam(team1);
        Manager foundManager= DBHelper.find(Manager.class, manager1.getId());
        Team foundTeam= DBHelper.find(Team.class, team1.getId());






    }
}

