package com.recetatordeveloperteam.negocio.busqueda.sa;
import java.util.List;

import com.recetatordeveloperteam.negocio.receta.entidad.*;
import com.recetatordeveloperteam.negocio.ingrediente.Ingrediente;
import com.recetatordeveloperteam.negocio.categoria.Categoria;
import com.recetatordeveloperteam.negocio.alergia.Alergia;




public interface SABusqueda 
{
	public List<Receta> buscarPorIngredientes(List<Ingrediente> ingredientes);
	public List<Receta> buscarPorTipoCocina(TipoCocina tipoCocina);
	public List<Receta> buscarPorCalorias(float calorias);
	public List<Receta> buscarPorChef(String nombreChef);
	public List<Receta> buscarPorCategorias(List<Categoria> categorias);
	public List<Receta> buscarPorDificultad(List<Dificultades> dificultades);
	public List<Receta> buscarPorTiempoPreparacion(float tiempoMin, float tiempoMax);
	public List<Receta> buscarPorAlergia(List<Alergia> alergias);
}
