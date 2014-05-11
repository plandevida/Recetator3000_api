package com.recetatordeveloperteam.negocio.FactorySA.imp;

import com.recetatordeveloperteam.negocio.FactorySA.FactorySA;
import com.recetatordeveloperteam.negocio.receta.sa.SAReceta;
import com.recetatordeveloperteam.negocio.receta.sa.imp.SARecetaImp;

public class FactorySAImp extends FactorySA {

	@Override
	public SAReceta getSARecetas() {

		return new SARecetaImp();
	}

}
