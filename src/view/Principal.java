package view;
import javax.swing.JOptionPane;

import controller.NPRController;
import br.edu.fateczl.WillianMeirelles.pilhaint.*;

public class Principal {
	public static void main(String[] args) {
		Pilha p = new Pilha();
		
		NPRController Cont = new NPRController();
		
		String dado = "";
		int resultado = 0;
		int numero = 0;

		boolean validador = true; 
		while(validador==true) {
			dado = (JOptionPane.showInputDialog("Digite um numero ou operação, "
					+ "\nResultado = " + resultado
					+ "\n\n\nPara cancelar digite Sair"));
			//if (dado.isEmpty()){
			if (dado.equalsIgnoreCase("Sair")){
				break;
			}
			try {
				numero = Integer.parseInt(dado);
				Cont.insereValor(p,numero);
			}
			catch(Exception NumberFormatException){
				resultado=Cont.npr(p, dado);
			}
			
			//JOptionPane.showMessageDialog(null," Resultado da operação " + resultado);
		}
	}	
}