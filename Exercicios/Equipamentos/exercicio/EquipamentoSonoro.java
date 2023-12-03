package exercicio;

public class EquipamentoSonoro extends Equipamento{ 
	private boolean stereo; 
	private int volume; 

	public EquipamentoSonoro(boolean ligado, boolean stereo, int volume){
		super(ligado);
		this.stereo = stereo;
		this.volume = volume;
	}

	@Override
	public void ligar(){
		System.out.println("estou sobreescrevendo o método do meu pai, com o mesmo nome");
		volume = 5;
		super.ligar();
	}
	
	public void mono(){
		stereo = false;
	}

	public void stereo(){
		stereo = true;
	}


	@Override
	public String toString(){
		super.toString();
		return "O volume é: " +  volume + "e o stereo é" + stereo;
	}

	public void aumentarVolume(){
		int count = 0; 
		if(volume < 10){
			count++;
		}
	}

	public void diminuirVolume(){
		int count = 10; 
		if(volume != 10){
			count--;
		}
	}
}