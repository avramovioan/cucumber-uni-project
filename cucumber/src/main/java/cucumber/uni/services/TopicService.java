package cucumber.uni.services;

import java.util.ArrayList;

import cucumber.uni.finalProject.Comment;
import cucumber.uni.finalProject.Role;
import cucumber.uni.finalProject.Topic;
import cucumber.uni.finalProject.User;

public class TopicService {

	private static ArrayList<Topic> topics = new ArrayList<Topic>();

	
	public static String addComment(String text) {
		AddTopic();
		Comment comm = new Comment();
		comm.setText(text);
		if(!topics.isEmpty() && !text.isEmpty()) {
			topics.get(0).addComment(comm);
			return "The comment has been added";
		}
		else {
			return "Please add text";
		}
		
		
	}
	
	public static String deleteComment(int commentIndex) {
		AddTopic();
		Comment comm = new Comment();
		comm.setText("sometext");
		if(!topics.isEmpty()) {
			topics.get(0).addComment(comm);
		}
		topics.get(0).getComments().remove(commentIndex);
		
		return "Comment deleted successfully";
		
	}
	
	public static String deleteTopic(int index) {
		AddTopic();
		Topic topic = new Topic();
		if(!topics.isEmpty()) {
			topic = topics.remove(index);
		}
		return topic==null? "Deleteion of the topic failed!": "Topic was successfully deleted";
	}
	
	private static void AddTopic() {
		UserService.populateUser(Role.Administrator);
		Topic topic = new Topic();
		topic.setTitle("Some Cool Title");
		topic.setText("This is the topic text that people will see. This sentence is just to make it longer !");
		topic.setPublisher(UserService.loggedUser);
		topics.add(topic);
	}
}
