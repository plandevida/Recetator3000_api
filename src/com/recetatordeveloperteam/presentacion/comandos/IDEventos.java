package com.recetatordeveloperteam.presentacion.comandos;

public enum IDEventos {

	/* Receta */
	EVENTO_ALTA_RECETA, ERROR_ALTA_RECETA, EVENTO_ADD_VIDEO_RECETA, ERROR_ADD_VIDEO_RECETA, EVENTO_ELIMINAR_RECETA, ERROR_ELIMINAR_RECETA, EVENTO_MODIFICAR_RECETA, ERROR_MODIFICAR_RECETA, EVENTO_COMENTAR_RECETA, ERROR_COMENTAR_RECETA, EVENTO_VALORAR_RECETA, ERROR_VALORAR_RECETA, EVENTO_MARCAR_FAVORITA, ERROR_MARCAR_FAVORITA, EVENTO_ADD_RECETA_PENDIENTES, ERROR_ADD_RECETA_PENDIENTES,

	/* Usuario */
	EVENTO_ALTA_USUARIO, ERROR_ALTA_USUARIO, EVENTO_MODIFICAR_USUARIO, ERROR_MODIFICAR_USUARIO, EVENTO_BAJA_USUARIO, ERROR_BAJA_USUARIO, EVENTO_VISUALIZAR_USUARIO, ERROR_VISUALIZAR_USUARIO,

	/* Busqueda */
	EVENTO_BUSQUEDA_INGREDIENTE, ERROR_BUSQUEDA_INGREDIENTE, EVENTO_BUSQUEDA_TIPO, ERROR_BUSQUEDA_TIPO, EVENTO_BUSQUEDA_VARIOS_INGREDIENTES, ERROR_BUSQUEDA_VARIOS_INGREDIENTES, EVENTO_BUSQUEDA_CALORIAS, ERROR_BUSQUEDA_CALORIAS, EVENTO_BUSQUEDA_CHEF, ERROR_BUSQUEDA_CHEF, EVENTO_BUSQUEDA_CATEGORIA, ERROR_BUSQUEDA_CATEGORIA, EVENTO_BUSQUEDA_DIFICULTAD, ERROR_BUSQUEDA_DIFICULTAD, EVENTO_BUSQUEDA_TIEMPO, ERROR_BUSQUEDA_TIEMPO, EVENTO_BUSQUEDA_ALERGIA, ERROR_BUSQUEDA_ALERGIA,

	/*Errores*/
	NOT_FOUND
	
}
