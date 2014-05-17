package com.recetatordeveloperteam.presentacion.comandos.ingrediente;

import java.util.List;

import com.recetatordeveloperteam.negocio.FactorySA.FactorySA;
import com.recetatordeveloperteam.negocio.ingrediente.Ingrediente;
import com.recetatordeveloperteam.presentacion.comandos.Comando;
import com.recetatordeveloperteam.presentacion.comandos.ComandoRespuesta;
import com.recetatordeveloperteam.presentacion.comandos.IDEventos;

public class ComandoListarIngrediente implements Comando
{

	@Override
	public ComandoRespuesta execute(Object datos) 
	{
		ComandoRespuesta cr = new ComandoRespuesta();
		String salida = "";
		
		List<Ingrediente> listaIngrediente = FactorySA.getInstance().getSAIngrediente().getAllIngredientes();
		
		for (Ingrediente ingrediente: listaIngrediente)
			salida += "Nombre: " + ingrediente.getNombre() + ", Unidad de medida: " + ingrediente.getUnidad() + ", Calorias por unidad: " + ingrediente.getCalorias() + "\n";
		
		cr.setDatos(salida);		
		cr.setEvento(IDEventos.EVENTO_LISTAR_INGREDIENTES);
		
		return cr;
	}

}
