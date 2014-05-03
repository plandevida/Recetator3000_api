package com.recetatordeveloperteam.receta.sa.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.google.appengine.api.datastore.Key;
import com.recetatordeveloperteam.EMF.EMF;
import com.recetatordeveloperteam.receta.entidad.Receta;
import com.recetatordeveloperteam.receta.sa.SAReceta;
import com.recetatordeveloperteam.sharedwithapps.Alergias;
import com.recetatordeveloperteam.sharedwithapps.Categorias;
import com.recetatordeveloperteam.sharedwithapps.Dificultades;

public class SARecetaImp implements SAReceta {
	
	//TODO cuando se cambie la BBDD sefuramente los ingredientes sean una lista del tipo Ingrediente.
	public Key addReceta(String nombreReceta, List<String> ingredientes, String descripcion, Categorias categoria, Dificultades dificultad, Integer numeroCalorias, Float tiempoPreparacion, Alergias alergia) {
		
		Receta recetaInsertada = null;
		
		if ( nombreReceta != null && !"".equals(nombreReceta)
			 && ingredientes != null && ! ingredientes.isEmpty()
			 && descripcion != null
			 && categoria != null
			 && dificultad != null
			 && numeroCalorias != null && numeroCalorias >= 0
			 && tiempoPreparacion != null && tiempoPreparacion >= 0
			 && alergia != null ) {
			
			recetaInsertada = new Receta(nombreReceta, ingredientes, descripcion, categoria, dificultad, numeroCalorias, tiempoPreparacion, alergia);
			
			EntityManager em = EMF.get().createEntityManager();
			em.getTransaction().begin();
			
			em.persist(recetaInsertada);
			
			em.getTransaction().commit();
		}
		
		return recetaInsertada != null ? recetaInsertada.getKey() : null;
	}

	@Override
	public List<Receta> getAllRecetas() {
		
		List<Receta> lista = new ArrayList<>();
		
		EntityManager em = EMF.get().createEntityManager();
//		em.getTransaction().begin();
		
		CriteriaBuilder criteriaB = em.getCriteriaBuilder();
		CriteriaQuery<Receta> query = criteriaB.createQuery(Receta.class);
		Root<Receta> entityRoot = query.from(Receta.class);
		
		lista = em.createQuery(query).getResultList();
		
//		em.getTransaction().commit();
		
		return lista;
	}
}
