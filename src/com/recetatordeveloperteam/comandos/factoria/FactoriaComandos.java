package com.recetatordeveloperteam.comandos.factoria;

import com.recetatordeveloperteam.comandos.factoria.imp.FactoriaComandosImp;

public class FactoriaComandos {
	private FactoriaComandos instance;
	
	public FactoriaComandos getInstance(){
		if(instance==null){
			this.instance=new FactoriaComandosImp();
		}
		return instance;
	}
}
