package com.recetatordeveloperteam.presentacion.comandos.factoria;

import com.recetatordeveloperteam.presentacion.comandos.factoria.imp.FactoriaComandosImp;

public class FactoriaComandos {
	private FactoriaComandos instance;

	public FactoriaComandos getInstance() {
		if (instance == null) {
			this.instance = new FactoriaComandosImp();
		}
		return instance;
	}
}
