package br.com.rubinhocar.implementacao;

import br.com.rubinhocar.modelo.Veiculo;

public class TesteVeiculo {
 
	public static void main(String[] args) {
		
		//Veiculo objeto2; // criando um objeto
		
		Veiculo objeto = new Veiculo(); // instanciando um objeto
		objeto.preencherModelo("camaro");
		System.out.println(objeto.retornarModelo());
		System.out.println("Status: " + objeto.ligar());
		System.out.println("Status: " + objeto.desligar());
		
		objeto.preencherBasico((float) 1000, (short) 2021);
		
		System.out.println("Retonar tudo: "+ objeto.retornarTudo());
		
		System.out.println("Retornar Desconto: " + objeto.retornarDesconto());
		
		/*System.out.println("Retornar Desconto Informado: " + objeto.retornarDesconto(50));*/
		
		objeto.acelerar();
		
		objeto.acelerar((short) 100);
		
		objeto.desacelerar((short) 50);
		
		System.out.println("Retornar tudo novamente: " + objeto.retornarTudo());
		
	}

}
