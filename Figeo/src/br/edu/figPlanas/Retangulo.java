package br.edu.figPlanas;

public class Retangulo extends FormasPlanas{
	
	public void calcArea() {
		
		if (base <= 0 || altura <= 0) {
			System.out.println("Erro. Base e Altura devem ser maiores que 0.");
		} else if (base == altura) {
			System.out.println("Erro. Base e Altura são iguais, use a função da area do Quadrado.");
		} else {
			area = base * altura;
			System.out.println("A area do retangulo é: " + area);
		}
		
	}

}
