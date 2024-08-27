package br.edu.animais;

public abstract class Animal {
	
	protected String picture;
	protected String food;
	protected boolean hunger;
	protected String boundaries;
	protected String location;
	
	public void makeNoise() {
		
	}
	
	public abstract void roam();
	
	public void sleep() {
		System.out.println("Dormindo.");
	}
	
	public void eat() {
		System.out.println("Comendo.");	
	}
	

	public String getPicture() {
		System.out.println("Imagem do animal.");	
		return picture;
	}
	

	public void setPicture(String picture) {
		this.picture = picture;
	}
	

	public String getFood() {
		System.out.println("Comida do animal.");	
		return food;
	}
	

	public void setFood(String food) {
		this.food = food;
	}
	

	public boolean isHunger() {
		System.out.println("Está com fome.");	
		return hunger;
	}
	

	public void setHunger(boolean hunger) {
		this.hunger = hunger;
	}
	

	public String getBoundaries() {
		System.out.println("Limites do animal.");	
		return boundaries;
	}
	

	public void setBoundaries(String boundaries) {
		this.boundaries = boundaries;
	}
	

	public String getLocation() {
		System.out.println("Localização do animal.");	
		return location;
	}
	

	public void setLocation(String location) {
		this.location = location;
	}

}