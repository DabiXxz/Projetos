package Aula_Listas;

import java.util.ArrayList;

public class GAME {
	
	public static void main(String[] args) {
		
		PLAYER player = new PLAYER();
		ArrayList<INIMIGO> inimigos = new ArrayList<INIMIGO>();
		
		inimigos.add(new ELFO(100)); //0
		inimigos.add(new ZUMBI(110)); //1
		
		for(int i = 0; i < inimigos.size();i++) {
			INIMIGO inimigoLocal = inimigos.get(i);
			if(i == 1) {
				inimigoLocal.tomarDano();
				System.out.println(inimigoLocal.vida);
			}else {
				System.out.println(inimigoLocal.vida);
			}
		}
		
		/*
		inimigos.get(0).tomarDano();
		System.out.println(inimigos.get(0).vida);
		
		inimigos.get(1).tomarDano();
		System.out.println(inimigos.get(1).vida);
		*/
	}
}
