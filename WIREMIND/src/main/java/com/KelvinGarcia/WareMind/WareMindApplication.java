package com.KelvinGarcia.WareMind;
import com.KelvinGarcia.WareMind.IU.InicioSesion;

import javax.swing.*;


public class WareMindApplication {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				InicioSesion inicioSesion = new InicioSesion();
				inicioSesion.setVisible(true);
			}
		});



	}
}
