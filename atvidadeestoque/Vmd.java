package atvidadeestoque;

import javax.swing.JOptionPane;

public class Vmd {
	
public void calcularvmd() {
	
	JOptionPane.showMessageDialog(null,"produto1");
		
		String m1 = JOptionPane.showInputDialog("digite a venda do mes 1:");
		int mes1 = Integer.parseInt(m1);
		
		String m2 = JOptionPane.showInputDialog("digite a venda do mes 2:");
		int mes2 = Integer.parseInt(m2);
		
		String m3 = JOptionPane.showInputDialog("digite a venda do mes 3:");
		int mes3 = Integer.parseInt(m3);
		
		int vmd = ((mes1 + mes2 + mes3) / 3) / 25;
		
		JOptionPane.showMessageDialog(null,"vmd:" + vmd);
		
		

		JOptionPane.showMessageDialog(null,"produto2");
			
			String m01 = JOptionPane.showInputDialog("digite a venda do mes 1:");
			int mes01 = Integer.parseInt(m01);
			
			String m02 = JOptionPane.showInputDialog("digite a venda do mes 2:");
			int mes02 = Integer.parseInt(m02);
			
			String m03 = JOptionPane.showInputDialog("digite a venda do mes 3:");
			int mes03 = Integer.parseInt(m03);
			
			int vmd2 = ((mes01 + mes02 + mes03) / 3) / 25;
			
			JOptionPane.showMessageDialog(null,"vmd:" + vmd2);
		
	}

}
