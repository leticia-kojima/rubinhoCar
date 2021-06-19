package br.com.rubinhocar.modelo;

public class Veiculo {
	
	private String modelo;
	private float valor;
	private boolean status;
	private short ano;
	private short velocidadeAtual; 
	
	// Método: <modificador> <tipo do retorno> <nome do método> (tipo do parametro, nome do parametro)
	
	public void desacelerar(short velocidade) {
		if (status == true) {
			short resultado = (short) (velocidadeAtual - velocidade);
			
			if(resultado >= 0) {
				velocidadeAtual -= velocidade;			
			}
		}					
	}
	
	public void acelerar(short velocidade) {
		if (status == true) {
			velocidadeAtual += velocidade;			
		}
				
	}
	
	public void acelerar() {
		if (status == true) {
			velocidadeAtual += 10;			
		}
				
	}
	
	/*
	public float retornarDesconto(float porc) {
		
		float porcDesconto = 1 - (porc / 100);
		
		return valor = (float) (valor * porcDesconto);
		
	}
	*/
	
	public float retornarDesconto() {
		
		return valor = (float) (valor * (1 - 0.1));
	
	}
	
	public String retornarTudo() {
		
		String resposta = "SIM";
		
		if(status == false) {
			resposta = "NÃO";
		}
		
		return "Modelo: " + modelo +
				" - Valor: " + valor +
				" - Ligado?: " + resposta +
				" - Ano: " + ano +
				" - Velocidade Atual: " + velocidadeAtual;	
	}
	
	public void preencherBasico(float pValor, short pAno) {	
		
		valor = pValor;
		ano = pAno;	
	}
	
	public String ligar() {
		status = true;
		return "Veiculo Ligado!";
	}
	
	public String desligar() {
		status = false;
		velocidadeAtual = 0;
		return "Veiculo Desligado!";		
	}
	
	
	public String retornarModelo() {
		return modelo;
	}
	
	public void preencherModelo (String param) {
		if (param.length() < 10) {
			
			modelo = param.toUpperCase();
			
		}
		
	}

}
