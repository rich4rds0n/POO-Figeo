package br.edu.carros;

public class Veiculos {
	
	protected String marca;
	protected int capTanqComb;
	
	public void Acelerar() {
		
	}
	
	public void Freiar() {
		
	}
	
	public void Buzinar() {
		System.out.println("Pi, Bi !!!");
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCapTanqComb() {
		return capTanqComb;
	}

	public void setCapTanqComb(int capTanqComb) {
		this.capTanqComb = capTanqComb;
	}

}
