package br.edu.figPlanas;

public class Triangulo extends FormasPlanas{
	
	public void calcArea() {
		if (base <= 0 || altura <= 0) {
			System.out.println("Erro. Base e Altura devem ser maiores que 0.");
		} else {
			area = (base * altura)/2;
			System.out.println("A area do triangulo é: " + area);
		}
	}

}
