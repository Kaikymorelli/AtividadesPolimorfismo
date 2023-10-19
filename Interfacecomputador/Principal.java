package Interfacecomputador;

public class Principal {

	public static void main(String[] args) {
		Gamer gamer = new Gamer ();
		gamer.ligar();
		gamer.reniciar();
		gamer.desligar();
		gamer.carregandoSistema();
		
		
		Home home = new Home ();
		home.ligar();
		home.reniciar();
		home.desligar();
		home.carregandoSistema();
		
		
		
	}
}
