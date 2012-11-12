package net.ss;

public class HelloWorld {

	public String getMessage() {
		// TODO Auto-generated method stub
		return "Hello World";
	}

	public String getMessage(String name) {
		// TODO Auto-generated method stub
		if (name == null) {
			return "Hello World";
		}
		return "Hello " + name;
	}

}
