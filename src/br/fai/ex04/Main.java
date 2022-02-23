package br.fai.ex04;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();
		app.start();
	}

	private void start() {

		iterarUsandoWhile();
		iterarUsandoDoWhile();
		iterarUsandoFor();
	}

	private void iterarUsandoFor() {
		for(int j = 0; j < 20; j++) {
			System.out.println("j: " + j);
		}
	}

	private void iterarUsandoDoWhile() {
		int k = 0;
		do {
			System.out.println("k: " + k);
			k += 1;
		}while (k < 20);
		System.out.println("----------");	
	}

	private void iterarUsandoWhile() {
		int i = 0;
		while(i < 20) {
			System.out.println("i: "+ i);
			i++;
		}
	}		
}

	