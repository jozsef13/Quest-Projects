package inout;

import java.io.Serializable;
import java.util.ArrayList;

public class Output implements OutputRole,Serializable{
	
	private ArrayList<String> messages;

	public Output() {
		messages = new ArrayList<String>();
	}

	@Override
	public void addMessage(String message) {
		messages.add(message);
		
	}

	@Override
	public void displayConsole() {
		for(String message : messages) {
			System.out.println(message);
		}
	}
	
	@Override
	public ArrayList<String> getMessages() {
		return messages;
	}

}
