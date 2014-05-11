package com.recetatordeveloperteam.presentacion.controlador.dispatcher;

import com.recetatordeveloperteam.presentacion.comandos.ComandoRespuesta;
import com.recetatordeveloperteam.presentacion.controlador.dispatcher.imp.DispatcherImp;

public abstract class Dispatcher {
	private static Dispatcher dispatcherInstance;

	public abstract void redirect(ComandoRespuesta respuestacomando);

	private static void createDispatcher() {
		if (dispatcherInstance == null)
			dispatcherInstance = new DispatcherImp();
	}

	public static Dispatcher getInstance() {
		createDispatcher();
		return dispatcherInstance;

	}
}
