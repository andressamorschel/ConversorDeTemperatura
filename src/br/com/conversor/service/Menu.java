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

		System.out.println("\n=========================\n" + "Conversor de Temperatura\n" + "=========================");
		Scanner teclado = new Scanner(System.in);

		try {
			System.out.println("Selecione uma opção: \n" + "1- Converter Fahreinheit para Celsius \n"
					+ "2- Converter Celcius para Fahreinheit \n" + "3- Sair");

			var resposta = teclado.nextInt();

			while (resposta != 3) {
				switch (resposta) {
				case 1:
					calcularCelcius();
					break;
				case 2:
					calcularFahreinheit();
					break;
				case 3:
					break;
				}
			}
		} catch (java.util.InputMismatchException e) {
			System.err.println("Algo deu errado. Tente novamente!");
			opcoes();
		}

	}

	public void calcularFahreinheit() {

		try {
			System.out.println("Informe o valor em Celsius: ");
			Scanner teclado = new Scanner(System.in);
			Double valorEmCelsius = teclado.nextDouble();

			if (valorEmCelsius == 3) {
				opcoes();
			}
			Double resultado = this.calcularFahreinheit.calcular(valorEmCelsius);
			System.out.println("O resultado é: " + resultado);
		} catch (java.util.InputMismatchException e) {
			System.err.println("Algo deu errado. Tente novamente!");
			opcoes();

		}

	}

	public void calcularCelcius() {

		try {
			System.out.println("Informe o valor em Fahreinheit: ");
			Scanner teclado = new Scanner(System.in);
			Double valorEmFahreinheit = teclado.nextDouble();

			if (valorEmFahreinheit == 3) {
				opcoes();
			}

			Double resultado = this.calcularCelcius.calcular(valorEmFahreinheit);
			System.out.println("O resultado é: " + resultado);

		} catch (java.util.InputMismatchException e) {
			System.err.println("Algo deu errado. Tente novamente!");
			opcoes();

		}

	}

}
