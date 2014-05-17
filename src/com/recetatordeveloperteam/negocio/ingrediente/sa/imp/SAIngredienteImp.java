package com.recetatordeveloperteam.negocio.ingrediente.sa.imp;

import javax.persistence.EntityManager;

import com.google.appengine.api.datastore.Key;
import com.recetatordeveloperteam.integracion.EMF.EMF;
import com.recetatordeveloperteam.negocio.ingrediente.Ingrediente;
import com.recetatordeveloperteam.negocio.ingrediente.sa.SAIngrediente;

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

			EntityManager em = EMF.get().createEntityManager();
			em.getTransaction().begin();

			em.persist(ingredienteInsertado);

			em.getTransaction().commit();
		}

		return ingredienteInsertado != null ? ingredienteInsertado.getId() : null;
	}

}
