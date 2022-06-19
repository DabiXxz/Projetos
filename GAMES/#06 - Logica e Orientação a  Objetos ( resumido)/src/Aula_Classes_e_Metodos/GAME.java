package Aula_Classes_e_Metodos;

public class GAME {
	
	public static void main(String[] args) {
		
		PLAYER player = new PLAYER();
		
		player.perderVida();
		
		player.perderVida();
		
		player.ganharVida();
		
		System.out.println(player.vida);
		
	}
}
