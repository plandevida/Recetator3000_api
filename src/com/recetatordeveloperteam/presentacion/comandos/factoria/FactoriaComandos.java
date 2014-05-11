package com.recetatordeveloperteam.presentacion.comandos.factoria;

import com.recetatordeveloperteam.presentacion.comandos.Comando;
import com.recetatordeveloperteam.presentacion.comandos.IDEventos;
import com.recetatordeveloperteam.presentacion.comandos.factoria.imp.FactoriaComandosImp;

public abstract class FactoriaComandos {
	private static FactoriaComandos instance;

	public static FactoriaComandos getInstance() {
		if (instance == null) {
			instance = new FactoriaComandosImp();
		}
		return instance;
	}
	
	public abstract Comando nuevoComando(IDEventos id_comando);
}
