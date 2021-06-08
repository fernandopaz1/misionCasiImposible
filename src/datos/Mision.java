package datos;

public class Mision {
	
	private String nombre;
	private String dificultad;
	private int puntosEXRecompensa;
	private int minimoPuntosEXReqeridos;
	
	public Mision(String nomrbe, String dificultad, int puntosEXRecompensa, int minimoPuntosEXReqeridos) {
		this.nombre = nomrbe;
		this.dificultad = dificultad;
		this.puntosEXRecompensa = puntosEXRecompensa;
		this.minimoPuntosEXReqeridos = minimoPuntosEXReqeridos;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public int getPuntosEXRecompensa() {
		return puntosEXRecompensa;
	}
	
	public boolean superarMision(Jugador jugador){
		return minimoPuntosEXReqeridos <= jugador.getPuntosExperienciaAcumulados();
	}

}
