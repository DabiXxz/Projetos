package Aula_Herança;

public class GAME {
	
	public static void main(String[] args) {
		
		PLAYER player = new PLAYER();
		ELFO elf = new ELFO(10);
		
		elf.tomarDano();

		System.out.println(elf.getVida());

	}
}
