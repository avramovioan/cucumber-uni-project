package cucumber.uni.finalProject;

import java.util.*;

import org.joda.time.DateTime;

public class Comment {

    public Comment() {
    }
    private User owner;
    private String text;
    private DateTime dateAdded;
    public ArrayList<Topic> topics;

    public void setOwner(User user) {
        this.owner = user;
    }
    public User getOwner() {
        return this.owner;
    }
    public void setText(String text) {
        this.text = text;
    }
    public String getText() {
        return this.text;
    }

    public void setDateAdded(DateTime date) {
        this.dateAdded = date;
        
    }
    public DateTime getDateAdded() {
        return this.dateAdded;
    }

}