package br.edu.figPlanas;

public class Losango {
	
	public double diagMaior;
	public double diagMenor;
	public double area;
	
	public void calcArea() {
		if (diagMaior <= 0 || diagMenor <= 0) {
			System.out.println("Erro. As diagonais do losango devem ser maiores que 0.");
		} else {
			area = (diagMaior * diagMenor)/2;
			System.out.println("A area do Losango é: " + area);
		}
	}

}
