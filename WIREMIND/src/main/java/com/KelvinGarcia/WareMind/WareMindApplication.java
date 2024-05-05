package com.KelvinGarcia.WareMind;

import javax.swing.*;


public class WareMindApplication {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				RegistrarProducto registrarProducto = new RegistrarProducto();
				registrarProducto.se
			}
		});
			SwingUtilities.invokeLater(() -> {
				RegistrarProveedor ventana = new RegistrarProveedor();
				ventana.setTitle("Registrar Proveedor");
				ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				ventana.setVisible(true);
			});
	}

}
