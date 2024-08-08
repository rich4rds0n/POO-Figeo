package br.edu.figPlanas;

public class Triangulo {
	
	public double base;
	public double altura;
	public double area;
	
	public void calcArea() {
		if (base <= 0 || altura <= 0) {
			System.out.println("Erro. Base e Altura devem ser maiores que 0.");
		} else {
			area = (base * altura)/2;
			System.out.println("A area do triangulo é: " + area);
		}
	}

}
