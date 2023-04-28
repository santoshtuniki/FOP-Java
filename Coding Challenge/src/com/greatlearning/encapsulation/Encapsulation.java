package com.greatlearning.encapsulation;

public class Encapsulation {

	private String country = "Germany";
	private String nationalAnthem = "Das Lied der Deutschen";
	private String touristSpot = "Brandenburg Gate";

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getNationalAnthem() {
		return nationalAnthem;
	}

	public void setNationalAnthem(String nationalAnthem) {
		this.nationalAnthem = nationalAnthem;
	}

	public String getTouristSpot() {
		return touristSpot;
	}

	public void setTouristSpot(String touristSpot) {
		this.touristSpot = touristSpot;
	}

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		System.out.println("Before updating the variablevalues:");
		System.out.println("Country: " + encapsulation.getCountry());
		System.out.println("National Anthem: " + encapsulation.getNationalAnthem());
		System.out.println("Tourist Spot: " + encapsulation.getTouristSpot());

		encapsulation.setCountry("India");
		encapsulation.setNationalAnthem("Jana Gana Mana");
		encapsulation.setTouristSpot("Taj Mahal");

		System.out.println("\nAfter updating the variablevalues:");
		System.out.println("Country: " + encapsulation.getCountry());
		System.out.println("National Anthem: " + encapsulation.getNationalAnthem());
		System.out.println("Tourist Spot: " + encapsulation.getTouristSpot());
	}
}