package com.recetatordeveloperteam.negocio.alergia;

import javax.persistence.Embeddable;
import javax.persistence.Id;

import com.google.appengine.api.datastore.Key;


@Embeddable
public class AlergiaReceta {

		@Id
		private Key id;
		
}
