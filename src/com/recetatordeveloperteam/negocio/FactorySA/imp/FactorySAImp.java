package com.recetatordeveloperteam.negocio.FactorySA.imp;

import com.recetatordeveloperteam.negocio.FactorySA.FactorySA;
import com.recetatordeveloperteam.negocio.alergia.sa.SAAlergia;
import com.recetatordeveloperteam.negocio.alergia.sa.imp.SAAlergiaImp;
import com.recetatordeveloperteam.negocio.receta.sa.SAReceta;
import com.recetatordeveloperteam.negocio.receta.sa.imp.SARecetaImp;

public class FactorySAImp extends FactorySA {

	@Override
	public SAReceta getSARecetas() {

		return new SARecetaImp();
	}

	@Override
	public SAAlergia getSAAlergia() {
		return new SAAlergiaImp();
	}

}
