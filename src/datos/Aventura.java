package datos;

import java.util.ArrayList;
import java.util.List;

public class Aventura {
	private String nombre;
	private List<Mision> misiones;
	private List<Jugador> jugadores;
	
	public Aventura(String nombre) {
		this.nombre = nombre;
		this.misiones = new ArrayList<Mision>();
		this.jugadores = new ArrayList<Jugador>();
	}
	
	
	public boolean agregarJugador(Jugador jugador) {
		if(jugadores.contains(jugador)) {
			return false;
		}else {
			
			for(Mision mision : misiones) {
				if(jugador.addMisionSuperada(mision.getNombre())) {
					jugador.incrementarPuntos(mision.getPuntosEXRecompensa());
				}
			}
			jugadores.add(jugador);
			return true;
		}
	}
	
	public boolean addMision(Mision mision) {
		misiones.add(mision);
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((jugadores == null) ? 0 : jugadores.hashCode());
		result = prime * result + ((misiones == null) ? 0 : misiones.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aventura other = (Aventura) obj;
		if (jugadores == null) {
			if (other.jugadores != null)
				return false;
		} else if (!jugadores.equals(other.jugadores))
			return false;
		if (misiones == null) {
			if (other.misiones != null)
				return false;
		} else if (!misiones.equals(other.misiones))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		return true;
	}
	
	
	
}
