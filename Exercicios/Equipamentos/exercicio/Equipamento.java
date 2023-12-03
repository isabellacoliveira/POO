package exercicio;

public class Equipamento {
	private boolean ligado;

	public Equipamento(boolean ligado){
		this.ligado = ligado;
	}

	// vou sobreescrever esse método
	public void ligar(){
		System.out.println("essa frase não vai aparecer");
		ligado = true;
	}

	public void desligar(){
		ligado = false;
	}

	public String toString(){
		if(ligado){
			return "o equipamento está ligado"; 			
		} else {
			return "o equipamento está desligado";
		}
	}
}