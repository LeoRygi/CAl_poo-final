package programa;

import interfaces.ICalculadora;

public class Soma implements ICalculadora {
	
	@Override
	public Integer calcula(Integer n1, Integer n2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		return null;
	}

	@Override
	public Float calcula(Float[] numeros) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double somador = 0d;
		for (int i = 0; i < numeros.length; i++) {
			somador += numeros[i];
		}
		return somador;
	}

}
