package com.recetatordeveloperteam.negocio.categoria;

import javax.persistence.Embeddable;
import javax.persistence.OneToOne;

@Embeddable
public class CategoriaReceta {
	
	@OneToOne
	private Categoria categoria;
}
