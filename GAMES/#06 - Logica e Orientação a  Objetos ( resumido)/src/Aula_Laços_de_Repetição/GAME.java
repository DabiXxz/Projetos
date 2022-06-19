package Aula_Laços_de_Repetição;

public class GAME {

	public static void main(String[] args) {
		
		int contador = 0;
		
		/*while(contador <= 10) {
			
			System.out.println("O numero atual � "+ contador);
			
			contador++;
		}*/
		
		for(int i = 2; i <= 10;i+=2) {
			System.out.println("O numero atual � "+ i);
		}
	}
}
