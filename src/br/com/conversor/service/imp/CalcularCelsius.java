package br.com.conversor.service.imp;

import br.com.conversor.service.CalcularTemperatura;

public class CalcularCelsius implements CalcularTemperatura{ 
	 
	@Override
	public Double calcular(Double valor) {
		return ((valor - 32)/9)* 5;
	}   
} 
    