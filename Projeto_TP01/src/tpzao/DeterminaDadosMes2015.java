package tpzao;

import java.util.Scanner;
import java.util.Locale; //vai fazer com que o scanner enxergue ponto "." com virgula entre caracteres

public class DeterminaDadosMes2015 {
	static public void GerenciaMes2015(String mes, int Operacao){
		
		Scanner ler = new Scanner(System.in);
    	ler.useLocale(Locale.ENGLISH);
    	int QntDias = 0;
    	int Contador = 0;
		int aux = 0;
		
		switch(mes){

        case "Janeiro":
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJaneiro2015 = new double[QntDias];
        	aux = 0;
        	        	
        	System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJaneiro2015[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJaneiro2015);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJaneiro2015,VetorJaneiro2015.length, mes, 2015);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJaneiro2015,VetorJaneiro2015.length, mes, 2015);
        	}else {
        		RelatorioMet.executa(VetorJaneiro2015, VetorJaneiro2015.length, mes, 2015);
        		}
            
        	MetodoSwitch.SwitchzaoDaMassa(); break;
        
        case "Fevereiro":
            
        	QntDias = 28;
        	Contador = 0;
        	double [] VetorFevereiro2015 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorFevereiro2015[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorFevereiro2015);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorFevereiro2015,VetorFevereiro2015.length, mes, 2015);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorFevereiro2015,VetorFevereiro2015.length, mes, 2015);
        	}else {
        		RelatorioMet.executa(VetorFevereiro2015, VetorFevereiro2015.length, mes, 2015);
        		}
        	
        	MetodoSwitch.SwitchzaoDaMassa(); break;
      	            
            
        case "Março":
        	
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMarco2015 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMarco2015[Contador] = ler.nextDouble();
        		Contador++;
        	}

        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMarco2015);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMarco2015,VetorMarco2015.length, mes, 2015);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMarco2015,VetorMarco2015.length, mes, 2015);
        	}else {
        		RelatorioMet.executa(VetorMarco2015, VetorMarco2015.length, mes, 2015);
        		}
            
        	MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Abril":
           
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorAbril2015 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAbril2015[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAbril2015);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAbril2015,VetorAbril2015.length, mes, 2015);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAbril2015,VetorAbril2015.length, mes, 2015);
        	}else {
        		RelatorioMet.executa(VetorAbril2015, VetorAbril2015.length, mes, 2015);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Maio":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMaio2015 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMaio2015[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMaio2015);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMaio2015,VetorMaio2015.length, mes, 2015);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMaio2015,VetorMaio2015.length, mes, 2015);
        	}else {
        		RelatorioMet.executa(VetorMaio2015, VetorMaio2015.length, mes, 2015);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Junho":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorJunho2015 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJunho2015[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJunho2015);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJunho2015,VetorJunho2015.length, mes, 2015);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJunho2015,VetorJunho2015.length, mes, 2015);
        	}else {
        		RelatorioMet.executa(VetorJunho2015, VetorJunho2015.length, mes, 2015);
        		}
        	
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Julho":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJulho2015 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJulho2015[Contador] = ler.nextDouble();
        		Contador++;
        	}        	
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJulho2015);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJulho2015,VetorJulho2015.length, mes, 2015);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJulho2015,VetorJulho2015.length, mes, 2015);
        	}else {
        		RelatorioMet.executa(VetorJulho2015, VetorJulho2015.length, mes, 2015);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Agosto":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorAgosto2015 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAgosto2015[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAgosto2015);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAgosto2015,VetorAgosto2015.length, mes, 2015);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAgosto2015,VetorAgosto2015.length, mes, 2015);
        	}else {
        		RelatorioMet.executa(VetorAgosto2015, VetorAgosto2015.length, mes, 2015);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Setembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorSetembro2015 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorSetembro2015[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorSetembro2015);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorSetembro2015,VetorSetembro2015.length, mes, 2015);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorSetembro2015,VetorSetembro2015.length, mes, 2015);
        	}else {
        		RelatorioMet.executa(VetorSetembro2015, VetorSetembro2015.length, mes, 2015);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Outubro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorOutubro2015 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorOutubro2015[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorOutubro2015);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorOutubro2015,VetorOutubro2015.length, mes, 2015);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorOutubro2015,VetorOutubro2015.length, mes, 2015);
        	}else {
        		RelatorioMet.executa(VetorOutubro2015, VetorOutubro2015.length, mes, 2015);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Novembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorNovembro2015 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorNovembro2015[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorNovembro2015);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorNovembro2015,VetorNovembro2015.length, mes, 2015);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorNovembro2015,VetorNovembro2015.length, mes, 2015);
        	}else {
        		RelatorioMet.executa(VetorNovembro2015, VetorNovembro2015.length, mes, 2015);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Dezembro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorDezembro2015 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorDezembro2015[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorDezembro2015);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorDezembro2015,VetorDezembro2015.length, mes, 2015);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorDezembro2015,VetorDezembro2015.length, mes, 2015);
        	}else {
        		RelatorioMet.executa(VetorDezembro2015, VetorDezembro2015.length, mes, 2015);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        default:
        	
        	System.out.println("Digite um mes válido!");

    }
		
		
		
	}

}
