package rest.spring.example;

import org.springframework.core.style.ToStringCreator;

public class Message {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Message(String message) {
		super();
		this.message = message;
	}

	public Message() {
		super();
	}
	

	@Override
	public String toString() {
		
		return (" Custom  "+this.message);
	}
	
}
