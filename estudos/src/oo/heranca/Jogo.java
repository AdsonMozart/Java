package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Monstro monstro = new Monstro();
		monstro.x = 10;
		monstro.y = 10;
		
		System.out.println(monstro.x);
		System.out.println(monstro.y + "\n");
		
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
//		j1.andar(Direcao.NORTE);
//		j1.andar(Direcao.LESTE);
		
		Heroi heroi = new Heroi(10, 11);
		
		System.out.println("O Monstro tem =>> " + monstro.vida);
		System.out.println("O Herói tem =>> " + heroi.vida + "\n");
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		

		System.out.println("O Monstro tem =>> " + monstro.vida);
		System.out.println("O Herói tem =>> " + heroi.vida + "\n");
				
//		System.out.println(j1.x);
//		System.out.println(j1.y);
	}
}
