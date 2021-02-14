package tpzao;

public class VerificaMes {
	static public void ErroMes(String mes) {
		if((mes != "Janeiro") || (mes != "Fevereiro") || (mes != "Março") || (mes != "Abril") || (mes != "Maio") || (mes != "Junho") || (mes != "Julho") || (mes != "Agosto") || (mes != "Setembro") || (mes != "Outubro") || (mes != "Novembro") || (mes != "Dezembro")) {
			System.out.println("Digite um mês válido!");
		}
	}

}
