package datos;

import java.util.ArrayList;
import java.util.List;

public class MisionCasiImposible extends Mision {


	private List<String> accionesRequeridas;
	
	public MisionCasiImposible(String nomrbe, String dificultad, int puntosEXRecompensa, int minimoPuntosEXReqeridos) {
		super(nomrbe, dificultad, puntosEXRecompensa, minimoPuntosEXReqeridos);
		this.accionesRequeridas = new ArrayList<String>();
	}
	
	public void addAccionRequerida(String accion) {
		this.accionesRequeridas.add(accion);
	}
	
	@Override
	public boolean superarMision(Jugador jugador) {
		boolean tieneLosPuntos = super.superarMision(jugador);
		boolean cumplioTodas = true;
		int cumplidas = 0;
		for(String accion : accionesRequeridas) {
			if(!jugador.realizoAccion(accion)) {
				cumplioTodas = false;
				cumplidas ++;
			}
		}
		int misionesFaltantes = accionesRequeridas.size()-cumplidas;
		boolean faltanPocas = misionesFaltantes > jugador.getCantidadMisionesSuperadas() ;
		if(tieneLosPuntos && (cumplioTodas || faltanPocas)) {
			return true;				
		}
		return false;
		
	}
}
