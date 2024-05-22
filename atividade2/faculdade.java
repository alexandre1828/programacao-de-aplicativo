
package atividade2;
import javax.swing.JOptionPane;
public class faculdade {

	public static void main(String[] args) {
		Disciplina disciplina = new Disciplina();
		Aluno aluno = new Aluno();
		Professor professor = new Professor();
		JOptionPane.showMessageDialog(null,"digite informacao sobre sua disciplina");
		disciplina.informacaodisciplina();
		JOptionPane.showMessageDialog(null,"digite informacao sobre o aluno");
		aluno.informacaoaluno();
		JOptionPane.showMessageDialog(null,"digite informacao sobre o professor");
		professor.informacaoprofessor();
		
		
	}

}
