package br.com.alura.bytebank;

import br.com.Bytebank.Banco.Modelo.Conta;
import br.com.Bytebank.Banco.Modelo.ContaCorrente;

public class TesteBiblioteca {

	public static void main(String[] args) {
		
		Conta c = new ContaCorrente(123,321);

		c.deposita(200.3);
		System.out.println(c.getSaldo());
	}

}
