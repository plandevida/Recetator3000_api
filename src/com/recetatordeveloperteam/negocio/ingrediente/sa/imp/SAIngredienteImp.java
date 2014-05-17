package com.recetatordeveloperteam.negocio.ingrediente.sa.imp;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaBuilder.In;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.google.appengine.api.datastore.Key;
import com.recetatordeveloperteam.integracion.EMF.EMF;
import com.recetatordeveloperteam.negocio.ingrediente.Ingrediente;
import com.recetatordeveloperteam.negocio.ingrediente.Ingrediente_;
import com.recetatordeveloperteam.negocio.ingrediente.sa.SAIngrediente;
import com.recetatordeveloperteam.negocio.receta.entidad.Receta;

public class SAIngredienteImp implements SAIngrediente
{

	@Override
	public Key addIngrediente(String nombre, String unidad, float calorias) 
	{
		Ingrediente ingredienteInsertado = null;
		
		if (nombre != null && !"".equals(nombre)
				&& unidad != null && !"".equals(unidad)
				&& calorias >= 0) 
		{

			ingredienteInsertado = new Ingrediente(nombre, unidad,calorias);
			List<Ingrediente> lista = new ArrayList<>();
			EntityManager em = EMF.get().createEntityManager();
			em.getTransaction().begin();
			
			//Comprueba que no exista un ingrediente con las misma descripción
			CriteriaBuilder criteriaB = em.getCriteriaBuilder();
			CriteriaQuery<Ingrediente> query = criteriaB.createQuery(Ingrediente.class);
			Root<Ingrediente> entityRoot = query.from(Ingrediente.class);
			query.where(criteriaB.equal(entityRoot.get(Ingrediente_.nombre), nombre));
			query.select(entityRoot);
		
			lista = em.createQuery(query).getResultList();
		
			if(!lista.isEmpty()){
				System.out.println("existe");
			}
			else{
				em.persist(ingredienteInsertado);
			}

			em.getTransaction().commit();
		}

		return ingredienteInsertado != null ? ingredienteInsertado.getId() : null;
	}

	@Override
	public List<Ingrediente> getAllIngredientes()
	{
			List<Ingrediente> lista = new ArrayList<>();

			EntityManager em = EMF.get().createEntityManager();

			CriteriaBuilder criteriaB = em.getCriteriaBuilder();
			CriteriaQuery<Ingrediente> query = criteriaB.createQuery(Ingrediente.class);
			Root<Ingrediente> entityRoot = query.from(Ingrediente.class);
			query.select(entityRoot);

			em.getTransaction().begin();
			lista = em.createQuery(query).getResultList();
			em.getTransaction().commit();

			return lista;
		
	}
}
