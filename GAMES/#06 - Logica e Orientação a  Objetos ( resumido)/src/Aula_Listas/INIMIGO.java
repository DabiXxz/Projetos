package Aula_Listas;

public class INIMIGO {

	public int vida = 100;
	public String inimigoTipo = "Inimigo";
	public double ataqueDano = 10.0;
	
	public INIMIGO(int vida) {
		this.vida = vida;
	}
	
	public void tomarDano() {
		vida--;
	}
	
	public int getVida() {
		return vida;
	}
}
