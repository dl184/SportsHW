package Models;

import org.hibernate.annotations.Table;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToOne;

@Entity
public class Manager extends ClubStaff {

    Team team;

    public Manager(){
        }

    public Manager(String name, int age, String nationality, int salary) {
        super(name, age, nationality, salary);
    }


    @OneToOne(mappedBy = "manager", fetch = FetchType.LAZY)
    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }


}

