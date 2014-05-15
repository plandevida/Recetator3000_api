package com.recetatordeveloperteam.negocio.FactorySA;

import com.recetatordeveloperteam.negocio.FactorySA.imp.FactorySAImp;
import com.recetatordeveloperteam.negocio.alergia.sa.SAAlergia;
import com.recetatordeveloperteam.negocio.receta.sa.SAReceta;

public abstract class FactorySA {
	private static FactorySA factorySAinstance;

	public static FactorySA getInstance() {

		createServiceApplicationFactory();
		return factorySAinstance;
	}

	private static void createServiceApplicationFactory() {
		if (factorySAinstance == null)
			factorySAinstance = new FactorySAImp();
	}

	public abstract SAReceta getSARecetas();
	
	public abstract SAAlergia getSAAlergia();
}
