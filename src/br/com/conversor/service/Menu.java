package br.com.conversor.service;

import java.util.Scanner;

public class Menu {
 
	private CalcularTemperatura calcularCelcius;
	private CalcularTemperatura calcularFahreinheit;

	public Menu(CalcularTemperatura calcularCelcius, CalcularTemperatura calcularFahreinheit) {
		super();
		this.calcularCelcius = calcularCelcius;
		this.calcularFahreinheit = calcularFahreinheit;
	}



	public void opcoes() {
		System.out.println("===Conversor de Temperatura===");
		Scanner teclado = new Scanner(System.in); 
		
		System.out.println("Selecione uma opção: \n"
				+ "1- Converter Fahreinheit para Celsius \n"
				+ "2- Converter Celcius para Fahreinheit \n"
				+ "3- Sair"); 
		var resposta = teclado.nextInt();
		switch(resposta) {
		case 1 :  
			calcularCelcius();
			break;
		case 2 :
			calcularFahreinheit();
			break;
		case 3 :
			break;
		}
		
	
	}
 


	public void calcularFahreinheit() {
		System.out.println("Informe o valor em Celsius: ");
		Scanner teclado = new Scanner(System.in);
		Double valorEmCelsius = teclado.nextDouble();
		Double resultado =  this.calcularFahreinheit.calcular(valorEmCelsius);
		System.out.println("O resultado é: " + resultado);
		
	}



	public void calcularCelcius() {
		System.out.println("Informe o valor em Fahreinheit: ");
		Scanner teclado = new Scanner(System.in);
		Double valorEmFahreinheit = teclado.nextDouble();
		Double resultado = this.calcularCelcius.calcular(valorEmFahreinheit); 
		System.out.println("O resultado é: " + resultado);
		
	}



	
}
