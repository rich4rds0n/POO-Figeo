package br.edu.figPlanas;

public class Hexagono extends FormasPlanas{
	
	public void calcArea() {
		if (lado <= 0) {
			System.out.println("Erro. O lado do Hexagono deve ser maior que 0.");
		} else {
			apotema = lado/(2*Math.tan(Math.PI/6));
			area = ((lado*6)*apotema)/2;
			System.out.println("A area do hexagono é: " + area);
		}
	}

}
