package com.recetatordeveloperteam.negocio.busqueda.sa;
import java.util.List;

import com.recetatordeveloperteam.negocio.receta.entidad.*;
import com.recetatordeveloperteam.negocio.ingrediente.Ingrediente;
import com.recetatordeveloperteam.negocio.categoria.Categoria;
import com.recetatordeveloperteam.negocio.alergia.Alergia;




public interface SABusqueda 
{
	// La variable modo es para especificar si buscaremos por SOLO los ingredientes listados o por CONTIENE los ingredientes listados.
	public List<Receta> buscarPorIngredientes(List<Ingrediente> ingredientes, int modo); 
	// Entendemos que solo se puede pertenecer a un tipo de cocina.
	public List<Receta> buscarPorTipoCocina(TipoCocina tipoCocina);
	// Dado el caso de uso todas las recetas con mas calorias que las del parametro seran filtradas.
	public List<Receta> buscarPorCalorias(float calorias);
	public List<Receta> buscarPorChef(String nombreChef);
	public List<Receta> buscarPorCategorias(List<Categoria> categorias);
	public List<Receta> buscarPorDificultad(Dificultades dificultades);
	public List<Receta> buscarPorTiempoPreparacion(float tiempoMin, float tiempoMax);
	public List<Receta> buscarPorAlergia(List<Alergia> alergias);
}
