package br.edu.Principal;
import java.util.Scanner;
import br.edu.figPlanas.*;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Quadrado q1 = new Quadrado();
		
		//System.out.print("Digite o comprimento do lado: ");
		//q1.lado = sc.nextDouble();
		q1.lado = 5;
		q1.calcArea();
		
		Circulo c1 = new Circulo();
		c1.raio = 5;
		c1.calcArea();
		
		Hexagono h1 = new Hexagono();
		h1.lado = 5;
		h1.calcArea();
		
		Losango l1 = new Losango();
		l1.diagMaior = 10;
		l1.diagMenor = 5;
		l1.calcArea();
		
		Paralelogramo p1 = new Paralelogramo();
		p1.base = 10;
		p1.altura = 5;
		p1.calcArea();
		
		Pentagono p2 = new Pentagono();
		p2.lado = 5;
		p2.calcArea();
		
		Retangulo r1 = new Retangulo();
		r1.base = 20;
		r1.altura = 15;
		r1.calcArea();
		
		Trapezio t1 = new Trapezio();
		t1.baseMaior = 20;
		t1.baseMenor = 15;
		t1.altura = 10;
		t1.calcArea();
		
		Triangulo t2 = new Triangulo();
		t2.base = 20;
		t2.altura = 15;
		t2.calcArea();
	}

}
