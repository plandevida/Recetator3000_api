package com.recetatordeveloperteam.negocio.categoria;

import javax.persistence.metamodel.StaticMetamodel;

import org.datanucleus.api.jpa.metamodel.SingularAttributeImpl;

import com.google.appengine.api.datastore.Key;



@StaticMetamodel(Categoria.class)
public class Categoria_ {
	public static volatile SingularAttributeImpl<Categoria, Key> id;
	public static volatile SingularAttributeImpl<Categoria, String> nombre;

}
