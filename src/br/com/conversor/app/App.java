package br.com.conversor.app;

import br.com.conversor.service.Menu;
import br.com.conversor.service.imp.CalcularCelsius;
import br.com.conversor.service.imp.CalcularFahreinheit;

public class App {

	public static void main(String[] args) {

		var celsius = new CalcularCelsius();
		var fahreinheit = new CalcularFahreinheit();
		
		Menu menu = new Menu(celsius, fahreinheit);
		menu.opcoes();
		
		
	}  

}
