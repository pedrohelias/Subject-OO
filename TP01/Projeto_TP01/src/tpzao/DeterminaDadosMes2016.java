package tpzao;

import java.util.Scanner;
import java.util.Locale; //vai fazer com que o scanner enxergue ponto "." com virgula entre caracteres

public class DeterminaDadosMes2016 {
	static public void GerenciaMes2016(String mes, int Operacao){
		
		Scanner ler = new Scanner(System.in);
    	ler.useLocale(Locale.ENGLISH);
    	int QntDias = 0;
    	int Contador = 0;
		int aux = 0;
		
		switch(mes){

        case "Janeiro":
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJaneiro2016 = new double[QntDias];
        	aux = 0;
        	        	
        	System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJaneiro2016[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJaneiro2016);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJaneiro2016,VetorJaneiro2016.length, mes, 2016);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJaneiro2016,VetorJaneiro2016.length, mes, 2016);
        	}else {
        		RelatorioMet.executa(VetorJaneiro2016, VetorJaneiro2016.length, mes, 2016);
        		}

        	MetodoSwitch.SwitchzaoDaMassa(); break;
        
        case "Fevereiro":
            
        	QntDias = 29;
        	Contador = 0;
        	double [] VetorFevereiro2016 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorFevereiro2016[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorFevereiro2016);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorFevereiro2016,VetorFevereiro2016.length, mes, 2016);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorFevereiro2016,VetorFevereiro2016.length, mes, 2016);
        	}else {
        		RelatorioMet.executa(VetorFevereiro2016, VetorFevereiro2016.length, mes, 2016);
        		}
        	
        	MetodoSwitch.SwitchzaoDaMassa(); break;
      	            
            
        case "Março":
        	
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMarco2016 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMarco2016[Contador] = ler.nextDouble();
        		Contador++;
        	}

        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMarco2016);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMarco2016,VetorMarco2016.length, mes, 2016);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMarco2016,VetorMarco2016.length, mes, 2016);
        	}else {
        		RelatorioMet.executa(VetorMarco2016, VetorMarco2016.length, mes, 2016);
        		}
            
        	MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Abril":
           
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorAbril2016 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAbril2016[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAbril2016);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAbril2016,VetorAbril2016.length, mes, 2016);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAbril2016,VetorAbril2016.length, mes, 2016);
        	}else {
        		RelatorioMet.executa(VetorAbril2016, VetorAbril2016.length, mes, 2016);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Maio":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMaio2016 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMaio2016[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMaio2016);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMaio2016,VetorMaio2016.length, mes, 2016);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMaio2016,VetorMaio2016.length, mes, 2016);
        	}else {
        		RelatorioMet.executa(VetorMaio2016, VetorMaio2016.length, mes, 2016);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Junho":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorJunho2016 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJunho2016[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJunho2016);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJunho2016,VetorJunho2016.length, mes, 2016);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJunho2016,VetorJunho2016.length, mes, 2016);
        	}else {
        		RelatorioMet.executa(VetorJunho2016, VetorJunho2016.length, mes, 2016);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Julho":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJulho2016 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJulho2016[Contador] = ler.nextDouble();
        		Contador++;
        	}        	
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJulho2016);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJulho2016,VetorJulho2016.length, mes, 2016);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJulho2016,VetorJulho2016.length, mes, 2016);
        	}else {
        		RelatorioMet.executa(VetorJulho2016, VetorJulho2016.length, mes, 2016);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Agosto":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorAgosto2016 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAgosto2016[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAgosto2016);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAgosto2016,VetorAgosto2016.length, mes, 2016);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAgosto2016,VetorAgosto2016.length, mes, 2016);
        	}else {
        		RelatorioMet.executa(VetorAgosto2016, VetorAgosto2016.length, mes, 2016);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Setembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorSetembro2016 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorSetembro2016[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorSetembro2016);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorSetembro2016,VetorSetembro2016.length, mes, 2016);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorSetembro2016,VetorSetembro2016.length, mes, 2016);
        	}else {
        		RelatorioMet.executa(VetorSetembro2016, VetorSetembro2016.length, mes, 2016);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Outubro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorOutubro2016 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorOutubro2016[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorOutubro2016);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorOutubro2016,VetorOutubro2016.length, mes, 2016);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorOutubro2016,VetorOutubro2016.length, mes, 2016);
        	}else {
        		RelatorioMet.executa(VetorOutubro2016, VetorOutubro2016.length, mes, 2016);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Novembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorNovembro2016 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorNovembro2016[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorNovembro2016);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorNovembro2016,VetorNovembro2016.length, mes, 2016);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorNovembro2016,VetorNovembro2016.length, mes, 2016);
        	}else {
        		RelatorioMet.executa(VetorNovembro2016, VetorNovembro2016.length, mes, 2016);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Dezembro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorDezembro2016 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorDezembro2016[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorDezembro2016);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorDezembro2016,VetorDezembro2016.length, mes, 2016);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorDezembro2016,VetorDezembro2016.length, mes, 2016);
        	}else {
        		RelatorioMet.executa(VetorDezembro2016, VetorDezembro2016.length, mes, 2016);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        default:
        	
        	System.out.println("Digite um mes válido!");

    }
		
		
		
	}

}
