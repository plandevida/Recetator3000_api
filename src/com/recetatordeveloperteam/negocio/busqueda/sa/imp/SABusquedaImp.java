package com.recetatordeveloperteam.negocio.busqueda.sa.imp;

import java.util.List;

import com.recetatordeveloperteam.negocio.alergia.Alergia;
import com.recetatordeveloperteam.negocio.busqueda.sa.SABusqueda;
import com.recetatordeveloperteam.negocio.categoria.Categoria;
import com.recetatordeveloperteam.negocio.ingrediente.Ingrediente;
import com.recetatordeveloperteam.negocio.receta.entidad.Dificultades;
import com.recetatordeveloperteam.negocio.receta.entidad.Receta;
import com.recetatordeveloperteam.negocio.receta.entidad.TipoCocina;

public class SABusquedaImp implements SABusqueda 
{

	@Override
	public List<Receta> buscarPorIngredientes(List<Ingrediente> ingredientes, int modo) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Receta> buscarPorTipoCocina(TipoCocina tipoCocina) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Receta> buscarPorCalorias(float calorias) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Receta> buscarPorChef(String nombreChef) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Receta> buscarPorCategorias(List<Categoria> categorias) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Receta> buscarPorDificultad(Dificultades dificultades) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Receta> buscarPorTiempoPreparacion(float tiempoMin, float tiempoMax) 
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Receta> buscarPorAlergia(List<Alergia> alergias) 
	{
		// TODO Auto-generated method stub
		return null;
	}

}
