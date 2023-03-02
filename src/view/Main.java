package view;

import Controller.RedesController;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String args[]) {
		RedesController RC = new RedesController();
        int opc = 0;
        while (opc != 9){
            opc= Integer.parseInt(JOptionPane.showInputDialog(" 1 -Verificar adaptadores IPv4\n 2 - Veirificar Ping \n 9 - Fim"));
        switch (opc){
            case 1:
            	RC.ip();
                break;
            case 2:
            	RC.ping();
                break;
            case 9:
                 JOptionPane.showMessageDialog(null,"FIM");
                 System.exit(0);
                 break;
            default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
        }
        }
		
	}

}
