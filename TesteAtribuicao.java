import javax.swing.JOptionPane;

public class TesteAtribuicao {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Nome do Professor: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
		String nomeDisc = JOptionPane.showInputDialog("Nome da Disciplina: ");
		boolean pratica = Boolean.parseBoolean(JOptionPane.showInputDialog("Pratica: "));
		
		Professor professor = new Professor (nome, idade);
		
		Disciplina disciplina = new Disciplina (nomeDisc, pratica);
		
		Atribuicao atribuicao = new Atribuicao (professor, disciplina);
		
		JOptionPane.showMessageDialog(null, atribuicao.getDados());
	}
}
