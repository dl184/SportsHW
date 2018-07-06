package Models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="teams")
public class Team {

    Manager manager;
    List<Player> players;

    private int id;
    private String name;

    public Team(){
        }

    public Team(String name, Manager manager) {
        this.name = name;
        this.manager = manager;
        this.players = new ArrayList<Player>();

    }



    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manager_id", nullable = false)
    public Manager getManager() {
        return manager;
    }

    public void setManager(Manager manager) {
        this.manager = manager;
    }


    @OneToMany(mappedBy="team", fetch = FetchType.LAZY)
    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Column(name="name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
