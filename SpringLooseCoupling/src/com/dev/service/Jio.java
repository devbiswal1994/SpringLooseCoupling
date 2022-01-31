package com.dev.service;

public class Jio {
	private Service service;

	public Jio(Service service) {
		this.service = service;
	}

	/*
	 * public void setService(Service service) { this.service = service; }
	 */

	public void activateService() {
		service.service();
	}

}
