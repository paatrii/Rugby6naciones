package Rugby6Naciones;

public class Jugador extends Persona{
	
	private Posicion jugador;
	
	public Equipo jugadores;
	
	public java.util.Collection capitan = new java.util.TreeSet();
	
	
	public enum Posicion
	{
		Pilier, Talonador, SegundaLinea, TerceraLinea, MedioMele, 
		Apertura, Centro, Ala, Zaguero
	}

}
