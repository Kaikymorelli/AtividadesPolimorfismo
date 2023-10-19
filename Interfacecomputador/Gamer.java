package Interfacecomputador;

public class Gamer implements Computador {
	
	@Override
	public void ligar() {
		System.out.println("ligando");
	}
	@Override
	public void reniciar () {
		System.out.println("reniciando");
	}

	@Override
	public void desligar() {
		System.out.println("desligando");
	}

	@Override
	public void carregandoSistema() {
		System.out.println("carregando o sistema");
	}


}
