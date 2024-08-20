package br.edu.figPlanas;

public class Trapezio extends FormasPlanas{
	
	public double baseMaior;
	public double baseMenor;
	
	public void calcArea() {
		if (baseMaior <= 0 || baseMenor <= 0 || altura <= 0) {
			System.out.println("Erro. Base maior, Base menor e Altura devem ser maiores que 0.");
		} else {
			area = ((baseMaior + baseMenor) * altura)/2;
			System.out.println("A area do trapezio é: " + area);
		}
	}

}
