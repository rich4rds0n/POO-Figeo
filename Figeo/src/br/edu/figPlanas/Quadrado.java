package br.edu.figPlanas;

public class Quadrado extends FormasPlanas{
	
	public void calcArea() {
		 if (lado > 0) {
			 area = Math.pow(lado, 2); 
			 System.out.println("A area do quadrado é: " + area);
		 } else {
			 System.out.println("Erro. O comprimento do lado deve ser maior que 0.");
		 }
	}

}
