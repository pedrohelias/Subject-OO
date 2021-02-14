package tpzao;

public class OperacaoMedia {
	static public void media(double[] dias) {
		
		int contador;
		double soma = 0;
		double media = 0;
		String resultado;
		
		for(int i = 0; i < dias.length;i++) {
			soma = dias[i] + soma;
			
		}
		
		media = soma/dias.length;
		resultado = String.format("%.2f", media);
		System.out.println("A temperatura média é: " + resultado + "ºC" + "\n");
	}
}