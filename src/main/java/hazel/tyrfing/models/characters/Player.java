package hazel.tyrfing.models.characters;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Player {

    @Id
    @GeneratedValue
    private long id;

    @Column
    private String name;

    public Player(){}

    public Player(String name){
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
