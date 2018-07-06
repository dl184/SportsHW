package Models;

import javax.persistence.*;

@Entity
public class Competition {

    private int id;
    private String name;

    public Competition(){
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

    public Competition(String name) {
        this.name = name;
    }

    @Column(name="budget")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
