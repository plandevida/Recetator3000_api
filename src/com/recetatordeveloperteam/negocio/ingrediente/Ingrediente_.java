package com.recetatordeveloperteam.negocio.ingrediente;

import javax.persistence.metamodel.StaticMetamodel;

import org.datanucleus.api.jpa.metamodel.SingularAttributeImpl;

import com.google.appengine.api.datastore.Key;

@StaticMetamodel(Ingrediente.class)
public class Ingrediente_ {
	public static volatile SingularAttributeImpl<Ingrediente, Key> id;
	public static volatile SingularAttributeImpl<Ingrediente, String> nombre;
	public static volatile SingularAttributeImpl<Ingrediente, String> unidad;
	public static volatile SingularAttributeImpl<Ingrediente, Float> calorias;
	

}
