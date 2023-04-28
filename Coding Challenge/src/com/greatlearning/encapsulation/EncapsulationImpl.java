package com.greatlearning.encapsulation;

public class EncapsulationImpl {
	
	private int age;
	private boolean decision;
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean getDecision() {
		return decision;
	}
	
	public void setDecision(boolean decision) {
		this.decision = decision;
	}

	public static void main(String[] args) {
		EncapsulationImpl obj = new EncapsulationImpl();
		obj.setAge (70);
		
		if (obj.getAge() <= 60)  {
			obj.setDecision(false);
		}else {
			obj.setDecision(false);
		}
		
		System.out.println("The age of the candidate is: "+obj.getAge());
		System.out.println("Driving license can be issued to the candidate."+obj.getDecision());
	}

}