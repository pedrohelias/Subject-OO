package tpzao;

public class PrintaDia {
	static public void print(double [] dias) {
		int i;
		System.out.println("As respectivas médias para cada dia são:");
		for(i = 0; i < dias.length; i++) {
			System.out.println("dia "+ (i+1) + ": " + dias[i]+"ºC");
			
		}
		System.out.println("\n");
	}

}
