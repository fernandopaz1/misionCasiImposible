package datos;

import java.util.ArrayList;
import java.util.List;

public class Jugador {
	private String nombre;
	private Aventura aventura;
	private List<String> misionesSuperadas;
	private int puntosExperienciaAcumulados;
	private List<String> accionesRealizadas;
	
	public Jugador(String nombre, Aventura aventura) {
		this.nombre = nombre;
		this.aventura = aventura;
		this.misionesSuperadas = new ArrayList<String>();
		this.accionesRealizadas = new ArrayList<String>();
	}

	public boolean addAccion(String elemento) {
		// TODO Auto-generated method stub
		return true;
	}
	
	public boolean realizoAccion(String elemento) {
		return accionesRealizadas.contains(elemento);
	}
	
	public boolean addMisionSuperada(String mision) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public void incrementarPuntos(int puntosEx) {
		if(puntosEx>=0) {
			puntosExperienciaAcumulados += puntosEx;
		}
	}
	
	public int getCantidadMisionesSuperadas() {
		return misionesSuperadas.size();
	}

	public int getPuntosExperienciaAcumulados() {
		return puntosExperienciaAcumulados;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((accionesRealizadas == null) ? 0 : accionesRealizadas.hashCode());
		result = prime * result + ((aventura == null) ? 0 : aventura.hashCode());
		result = prime * result + ((misionesSuperadas == null) ? 0 : misionesSuperadas.hashCode());
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + puntosExperienciaAcumulados;
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
		Jugador other = (Jugador) obj;
		if (accionesRealizadas == null) {
			if (other.accionesRealizadas != null)
				return false;
		} else if (!accionesRealizadas.equals(other.accionesRealizadas))
			return false;
		if (aventura == null) {
			if (other.aventura != null)
				return false;
		} else if (!aventura.equals(other.aventura))
			return false;
		if (misionesSuperadas == null) {
			if (other.misionesSuperadas != null)
				return false;
		} else if (!misionesSuperadas.equals(other.misionesSuperadas))
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (puntosExperienciaAcumulados != other.puntosExperienciaAcumulados)
			return false;
		return true;
	}
	
	
	
	
	
	

}
