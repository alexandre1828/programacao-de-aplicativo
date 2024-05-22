package atvidadeestoque;
import javax.swing.JOptionPane;

public class Estoqueminimo {
	
	public void minimo() {
		
		Vmd vmd1= new Vmd();
		
		JOptionPane.showMessageDialog(null,"conferindo estoque minimo do produto 1....");
		
		String tr1 = JOptionPane.showInputDialog("digite o tempo de reposição:");
		int tr01 = Integer.parseInt(tr1);
		
		int emin = tr01 * vmd;
		
		
		
		String m2 = JOptionPane.showInputDialog("digite a venda do mes 2:");
		int mes2 = Integer.parseInt(m2);
		
		
	}

}
