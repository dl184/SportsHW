package Models;

import javax.persistence.*;

@Entity
public class Player extends ClubStaff {

    private SquadNumber squadNumbers;
    private Team team;


    public Player(String name, int age, String nationality, int salary, SquadNumber squadNumbers) {
        super(name, age, nationality, salary);
        this.squadNumbers = squadNumbers;

    }

    public SquadNumber getSquadNumbers() {
        return squadNumbers;
    }

    public void setSquadNumbers(SquadNumber squadNumbers) {
        this.squadNumbers = squadNumbers;
    }

    @ManyToOne
    @JoinColumn(name="team_id", nullable=true)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }
}







