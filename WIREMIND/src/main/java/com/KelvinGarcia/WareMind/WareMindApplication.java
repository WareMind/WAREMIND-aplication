package com.KelvinGarcia.WareMind;
import com.KelvinGarcia.WareMind.IU.IniciarSesion;

import javax.swing.*;


public class WareMindApplication {

	public static void main(String[] args) {

		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				IniciarSesion iniciarSesion = new IniciarSesion();
				iniciarSesion.setVisible(true);
			}
		});



	}
}
