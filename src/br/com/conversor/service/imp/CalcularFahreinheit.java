package br.com.conversor.service.imp;

import br.com.conversor.service.CalcularTemperatura;

public class CalcularFahreinheit implements CalcularTemperatura{

	@Override
	public Double calcular(Double valor) {
		return valor * 1.8 + 32;
	}  
  
}
/*c * 1,8 + 32
valor / 5 * ((fahreinheit - 32) / 9);*/