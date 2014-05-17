package com.recetatordeveloperteam.negocio.alergia;

import javax.persistence.metamodel.StaticMetamodel;

import org.datanucleus.api.jpa.metamodel.SingularAttributeImpl;

import com.google.appengine.api.datastore.Key;




@StaticMetamodel(Alergia.class)
public class Alergia_ {
public static volatile SingularAttributeImpl<Alergia, Key> id;
public static volatile SingularAttributeImpl<Alergia, String> nombre;
}
