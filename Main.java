package Condicionales;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
			
	int numero;
	
	float cantidad;
	
	cantidad = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la cantidad"));
	
	if (cantidad > 300) {
		JOptionPane.showMessageDialog(null, "Total a pagar " +cantidad*.80);
	}
	else {
		JOptionPane.showMessageDialog(null, "Total a pagar " +cantidad);
	}
	
			

	}
}
