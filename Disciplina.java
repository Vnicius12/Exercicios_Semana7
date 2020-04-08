
public class Disciplina {

	
	private String nomeDisc;
	private boolean pratica;
	
	public Disciplina(String nomeDisc, boolean pratica) {
		this.nomeDisc = nomeDisc;
		this.pratica = pratica;
	}
	
	public String getNomeDisc() {
		return nomeDisc;
	}

	public void setNomeDisc(String nomeDisc) {
		this.nomeDisc = nomeDisc;
	}

	public boolean isPratica() {
		return pratica;
	}

	public void setPratica(boolean pratica) {
		this.pratica = pratica;
	}

	public String getDados() {
		return "Disciplina: " + nomeDisc + " - " + "Pratica: " + pratica;
	}
}
