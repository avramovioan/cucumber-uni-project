package cucumber.uni.finalProject;
import java.util.*;

public class Topic {
    private String title;
    private User publisher;
    private String text;
    private int likes;
    private int dislikes;
    public ArrayList<Topic> children;
    public Topic parent;
    public ArrayList<Comment> comments;


    public Topic() {
    	this.comments = new ArrayList<Comment>();
    }   

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

 
    public User getPublisher() {
        return this.publisher;
    }

   
    public void setPublisher(User user) {
    	this.publisher = user;
    }

 
    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    
    public int getLikes() {
    	return this.likes;
    }

    public void addLike() {
        this.likes ++;
    }
    public int getDislikes() {
       return this.dislikes;
    }
    public void addDislike() {
    	 this.dislikes++;
    }

    public ArrayList<Comment> getComments() {
    	return this.comments;
    }
    public void addComment(Comment comm)  {
    	this.comments.add(comm);
    }

}