package com.recetatordeveloperteam.comandos;

public class ComandoRespuesta {
	
	private IDEventos evento;
	private Object datos;

	
	public IDEventos getEvento() {
		// begin-user-code
		return evento;
		// end-user-code
	}

	public void setEvento(IDEventos evento) {
		// begin-user-code
		this.evento = evento;
		// end-user-code
	}

	

	
	public Object getDatos() {
		// begin-user-code
		return datos;
		// end-user-code
	}

	public void setDatos(Object datos) {
		// begin-user-code
		this.datos=datos;
		// end-user-code
	}
}