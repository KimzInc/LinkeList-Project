package com.kimz;

public abstract class ListItem {

	protected ListItem rightLink=null; //to be accessed from our concrete subclasses 
	protected ListItem leftLink=null;
	
	//need to hold a value
	protected Object value;


	public ListItem(Object value) {
		
		this.value = value;
	}
	
	//methods to move to the next item and back to the previous item
	//methods set next and previous items 
	abstract ListItem next();
	abstract ListItem setNext(ListItem item);
	abstract ListItem previous();
	abstract ListItem setPrevious(ListItem item);
	
	//compare to method, takes a parameter of the same type as the class
	abstract int compareTo(ListItem item);
//getters and setters for values 
	public Object getValue() {
		return value;
	}

	public void setValues(Object value) {
		this.value = value;
	}
	
	
	
}
