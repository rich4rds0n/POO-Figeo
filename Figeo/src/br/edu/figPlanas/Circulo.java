package br.edu.figPlanas;

public class Circulo extends FormasPlanas{
	
	public double raio;
	
	public void calcArea() {
		if (raio <= 0) {
			System.out.println("Erro. O raio do circulo deve ser maior que 0.");
		} else {
			area = Math.PI * Math.pow(raio, 2);
			System.out.println("A area do circulo é: " + area);
		}
	}

}
