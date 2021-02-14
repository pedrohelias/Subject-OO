package tpzao;

public class RelatorioMet {
	static public void executa(double[] dias, int tamanho, String Mes, int Ano) {
		
		PrintaDia.print(dias);
		OperacaoMedia.media(dias);
		RetornaMenor.menor(dias, tamanho, Mes, Ano);
		RetornaMaior.maior(dias, tamanho, Mes, Ano);
		
	}
}
