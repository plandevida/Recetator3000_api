package com.recetatordeveloperteam.negocio.receta.entidad;

import java.util.List;

import javax.persistence.Embedded;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.StaticMetamodel;

import org.datanucleus.api.jpa.metamodel.SingularAttributeImpl;

import com.google.appengine.api.datastore.Key;
import com.recetatordeveloperteam.negocio.alergia.AlergiaReceta;
import com.recetatordeveloperteam.negocio.categoria.CategoriaReceta;
import com.recetatordeveloperteam.negocio.ingrediente.IngredienteReceta;



@StaticMetamodel(Receta.class)
public class Receta_ {
	public static volatile SingularAttributeImpl<Receta, Key> id;
	public static volatile SingularAttributeImpl<Receta, String> nombre;
	public static volatile SingularAttributeImpl<Receta, String> descripcion;
	public static volatile ListAttribute<Receta, IngredienteReceta> ingredientes;
	public static volatile ListAttribute<Receta, CategoriaReceta> categorias;
	public static volatile SingularAttributeImpl<Receta, Dificultades> dificultad;
	public static volatile SingularAttributeImpl<Receta, Float> tiempo;
	public static volatile ListAttribute<Receta, AlergiaReceta> alergias;
	public static volatile SingularAttributeImpl<Receta, TipoCocina> tipoCocina;
}
