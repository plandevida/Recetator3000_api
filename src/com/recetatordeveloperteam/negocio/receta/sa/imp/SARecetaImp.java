package com.recetatordeveloperteam.negocio.receta.sa.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.google.appengine.api.datastore.Key;
import com.google.appengine.labs.repackaged.org.json.JSONException;
import com.google.appengine.labs.repackaged.org.json.JSONObject;
import com.recetatordeveloperteam.integracion.EMF.EMF;
import com.recetatordeveloperteam.negocio.FactorySA.FactorySA;
import com.recetatordeveloperteam.negocio.alergia.Alergia;
import com.recetatordeveloperteam.negocio.alergia.AlergiaReceta;
import com.recetatordeveloperteam.negocio.categoria.CategoriaReceta;
import com.recetatordeveloperteam.negocio.ingrediente.IngredienteReceta;
import com.recetatordeveloperteam.negocio.ingrediente.Ingrediente_;
import com.recetatordeveloperteam.negocio.receta.entidad.Dificultades;
import com.recetatordeveloperteam.negocio.receta.entidad.Receta;
import com.recetatordeveloperteam.negocio.receta.entidad.Receta_;
import com.recetatordeveloperteam.negocio.receta.entidad.TipoCocina;
import com.recetatordeveloperteam.negocio.receta.sa.SAReceta;

public class SARecetaImp implements SAReceta {

	// TODO cuando se cambie la BBDD seguramente los ingredientes sean una lista
	// del tipo Ingrediente.
	public Key addReceta(String nombreReceta, List<IngredienteReceta> ingredientes,
			String descripcion, List<CategoriaReceta> categoria, Dificultades dificultad,
			Integer numeroCalorias, Float tiempoPreparacion, List<AlergiaReceta> alergia, TipoCocina tipoCocina) {

		Receta recetaInsertada = null;

		if (nombreReceta != null && !"".equals(nombreReceta)
				&& ingredientes != null && !ingredientes.isEmpty()
				&& descripcion != null && categoria != null
				&& dificultad != null && numeroCalorias != null
				&& numeroCalorias >= 0 && tiempoPreparacion != null
				&& tiempoPreparacion >= 0 && alergia != null
				&& tipoCocina != null) {

			recetaInsertada = new Receta(nombreReceta, ingredientes,
					descripcion, categoria, dificultad, numeroCalorias,
					tiempoPreparacion, alergia, tipoCocina);

			EntityManager em = EMF.get().createEntityManager();
			em.getTransaction().begin();

			em.persist(recetaInsertada);

			em.getTransaction().commit();
		}

		return recetaInsertada != null ? recetaInsertada.getId() : null;
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

		return recetaInsertada != null ? recetaInsertada.getId() : null;
	}
	
	@Override
	public List<Receta> getAllRecetas() {

		List<Receta> lista = new ArrayList<>();

		EntityManager em = EMF.get().createEntityManager();

		CriteriaBuilder criteriaB = em.getCriteriaBuilder();
		CriteriaQuery<Receta> query = criteriaB.createQuery(Receta.class);
		Root<Receta> entityRoot = query.from(Receta.class);
		// PRUEBA query.where(criteriaB.equal(entityRoot.get(Receta_.nombre), "Mi receta mágica"));
		query.select(entityRoot);

		em.getTransaction().begin();
		lista = em.createQuery(query).getResultList();
		em.getTransaction().commit();

		return lista;
	}
	@Override
	public JSONObject getAlergias() {
		
		JSONObject salida = new JSONObject();
		
		List<Alergia> alergias = FactorySA.getInstance().getSAAlergia().getAllAlergias();
		
		for ( Alergia alergia : alergias) {
			try {
				salida.put(alergia.getId().toString(), alergia.getNombre());
			} catch (JSONException e) {
				e.printStackTrace();
			}
		}
		
		return salida;
		
	}
}
