package lv.majormarket.menu.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MenuItem implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;
    private String title;
    private String description;
    @Column(nullable = false)
    private boolean exists;

    public MenuItem() {
    }
    public MenuItem(String title, String description, boolean exists) {
        this.title = title;
        this.description = description;
        this.exists = exists;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }


    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isExists() {
        return exists;
    }
    public void setExists(boolean exists) {
        this.exists = exists;
    }
}
