package Models;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Manager extends ClubStaff {

//    Player players;
    Team team;

    public Manager(String name, int age, String nationality, int salary) {
        super(name, age, nationality, salary);
//        this.players = players;
    }

//    public Player getPlayers() {
//        return players;
//    }

//    public void setPlayers(Player players) {
//        this.players = players;
//    }

    @OneToOne(mappedBy = "manager", fetch = FetchType.LAZY)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}

