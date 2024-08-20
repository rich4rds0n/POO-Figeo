package br.edu.figPlanas;

public class Paralelogramo extends FormasPlanas{
	
	public void calcArea() {
		if (base <= 0 || altura <= 0) {
			System.out.println("Erro. A base e altura devem ser maiores que 0.");
		} else {
			area = base * altura;
			System.out.println("A area do Paralelogramo é: " + area);
		}
	}

}
