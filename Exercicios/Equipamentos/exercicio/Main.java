package exercicio;


public class Main {
    public static void main(String [] args){
		Equipamento equipamento = new Equipamento(true);

		equipamento.ligar();
		equipamento.desligar();
		equipamento.toString();

		EquipamentoSonoro equipamentoSonoro = new EquipamentoSonoro(true, false, 4);

		equipamentoSonoro.mono();
		equipamentoSonoro.stereo();
		equipamentoSonoro.ligar();
		equipamentoSonoro.toString();
		equipamentoSonoro.aumentarVolume();
		equipamentoSonoro.diminuirVolume();



	}
}
