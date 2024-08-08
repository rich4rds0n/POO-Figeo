package br.edu.figPlanas;

public class Pentagono {
	
	public double lado;
	public double apotema;
	public double area;
	
	public void calcArea() {
		if (lado <= 0) {
			System.out.println("Erro. O lado do Pentagono deve ser maior que 0.");
		} else {
			apotema = lado/(2*Math.tan(Math.PI/5));
			area = ((lado*5)*apotema)/2;
			System.out.println("A area do pentagono é: " + area);
		}
	}

}
