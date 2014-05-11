package com.recetatordeveloperteam.negocio.receta.sa.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.*;

import com.google.appengine.api.datastore.Key;
import com.recetatordeveloperteam.integracion.EMF.EMF;
import com.recetatordeveloperteam.negocio.receta.entidad.Receta;
import com.recetatordeveloperteam.negocio.receta.sa.SAReceta;
import com.recetatordeveloperteam.negocio.recetas.Alergias;
import com.recetatordeveloperteam.negocio.recetas.Categorias;
import com.recetatordeveloperteam.negocio.recetas.Dificultades;

public class SARecetaImp implements SAReceta {

	// TODO cuando se cambie la BBDD seguramente los ingredientes sean una lista
	// del tipo Ingrediente.
	public Key addReceta(String nombreReceta, List<String> ingredientes,
			String descripcion, Categorias categoria, Dificultades dificultad,
			Integer numeroCalorias, Float tiempoPreparacion, Alergias alergia) {

		Receta recetaInsertada = null;

		if (nombreReceta != null && !"".equals(nombreReceta)
				&& ingredientes != null && !ingredientes.isEmpty()
				&& descripcion != null && categoria != null
				&& dificultad != null && numeroCalorias != null
				&& numeroCalorias >= 0 && tiempoPreparacion != null
				&& tiempoPreparacion >= 0 && alergia != null) {

			recetaInsertada = new Receta(nombreReceta, ingredientes,
					descripcion, categoria, dificultad, numeroCalorias,
					tiempoPreparacion, alergia);

			EntityManager em = EMF.get().createEntityManager();
			em.getTransaction().begin();

			em.persist(recetaInsertada);

			em.getTransaction().commit();
		}

		return recetaInsertada != null ? recetaInsertada.getKey() : null;
	}

	public Key addReceta(String nombreReceta) {

		Receta recetaInsertada = null;

		if (nombreReceta != null && !"".equals(nombreReceta)) {

			recetaInsertada = new Receta(nombreReceta);

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

		CriteriaBuilder criteriaB = em.getCriteriaBuilder();
		CriteriaQuery<Receta> query = criteriaB.createQuery(Receta.class);
		Root<Receta> entityRoot = query.from(Receta.class);
		query.select(entityRoot);

		em.getTransaction().begin();
		lista = em.createQuery(query).getResultList();
		em.getTransaction().commit();

		return null;
	}
}
