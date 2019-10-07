package vitao;

public class Mamifero extends Animal {
	private String corPelo;
	
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	@Override
	public void locomover() {
		System.out.println("Locomovendo como mamífero");
		
	}

	@Override
	public void alimentar() {
		System.out.println("Sendo amamentado");
		
	}

	@Override
	public void emitirSom() {
		System.out.println("Emitindo som de mamífero");
		
	}

}