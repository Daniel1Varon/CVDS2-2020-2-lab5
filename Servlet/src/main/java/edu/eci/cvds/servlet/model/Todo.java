package edu.eci.cvds.servlet.model;

public class Todo {
	
	public Todo() {
		
	}

	int userId,id;
	String title;
	boolean completed;


	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id= id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	public boolean getCompleted(){
		return completed;
	}

	public void setCompleted(boolean state){
		completed = state;
	}
}

