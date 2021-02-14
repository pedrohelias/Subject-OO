package tpzao;

import java.util.Scanner;
import java.util.Locale; //vai fazer com que o scanner enxergue ponto "." com virgula entre caracteres

public class DeterminaDadosMes2018 {
	static public void GerenciaMes2018(String mes, int Operacao){
		
		Scanner ler = new Scanner(System.in);
    	ler.useLocale(Locale.ENGLISH);
    	int QntDias = 0;
    	int Contador = 0;
		int aux = 0;
		
		switch(mes){

        case "Janeiro":
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJaneiro2018 = new double[QntDias];
        	aux = 0;
        	        	
        	System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJaneiro2018[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJaneiro2018);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJaneiro2018,VetorJaneiro2018.length, mes, 2018);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJaneiro2018,VetorJaneiro2018.length, mes, 2018);
        	}else {
        		RelatorioMet.executa(VetorJaneiro2018, VetorJaneiro2018.length, mes, 2018);
        		}

        	MetodoSwitch.SwitchzaoDaMassa(); break;
        
        case "Fevereiro":
            
        	QntDias = 28;
        	Contador = 0;
        	double [] VetorFevereiro2018 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorFevereiro2018[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorFevereiro2018);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorFevereiro2018,VetorFevereiro2018.length, mes, 2018);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorFevereiro2018,VetorFevereiro2018.length, mes, 2018);
        	}else {
        		RelatorioMet.executa(VetorFevereiro2018, VetorFevereiro2018.length, mes, 2018);
        		}
        	
        	MetodoSwitch.SwitchzaoDaMassa(); break;
      	            
            
        case "Março":
        	
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMarco2018 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMarco2018[Contador] = ler.nextDouble();
        		Contador++;
        	}

        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMarco2018);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMarco2018,VetorMarco2018.length, mes, 2018);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMarco2018,VetorMarco2018.length, mes, 2018);
        	}else {
        		RelatorioMet.executa(VetorMarco2018, VetorMarco2018.length, mes, 2018);
        		}
            
        	MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Abril":
           
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorAbril2018 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAbril2018[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAbril2018);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAbril2018,VetorAbril2018.length, mes, 2018);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAbril2018,VetorAbril2018.length, mes, 2018);
        	}else {
        		RelatorioMet.executa(VetorAbril2018, VetorAbril2018.length, mes, 2018);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Maio":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMaio2018 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMaio2018[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMaio2018);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMaio2018,VetorMaio2018.length, mes, 2018);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMaio2018,VetorMaio2018.length, mes, 2018);
        	}else {
        		RelatorioMet.executa(VetorMaio2018, VetorMaio2018.length, mes, 2018);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Junho":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorJunho2018 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJunho2018[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJunho2018);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJunho2018,VetorJunho2018.length, mes, 2018);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJunho2018,VetorJunho2018.length, mes, 2018);
        	}else {
        		RelatorioMet.executa(VetorJunho2018, VetorJunho2018.length, mes, 2018);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Julho":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJulho2018 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJulho2018[Contador] = ler.nextDouble();
        		Contador++;
        	}        	
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJulho2018);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJulho2018,VetorJulho2018.length, mes, 2018);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJulho2018,VetorJulho2018.length, mes, 2018);
        	}else {
        		RelatorioMet.executa(VetorJulho2018, VetorJulho2018.length, mes, 2018);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Agosto":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorAgosto2018 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAgosto2018[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAgosto2018);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAgosto2018,VetorAgosto2018.length, mes, 2018);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAgosto2018,VetorAgosto2018.length, mes, 2018);
        	}else {
        		RelatorioMet.executa(VetorAgosto2018, VetorAgosto2018.length, mes, 2018);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Setembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorSetembro2018 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorSetembro2018[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorSetembro2018);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorSetembro2018,VetorSetembro2018.length, mes, 2018);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorSetembro2018,VetorSetembro2018.length, mes, 2018);
        	}else {
        		RelatorioMet.executa(VetorSetembro2018, VetorSetembro2018.length, mes, 2018);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Outubro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorOutubro2018 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorOutubro2018[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorOutubro2018);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorOutubro2018,VetorOutubro2018.length, mes, 2018);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorOutubro2018,VetorOutubro2018.length, mes, 2018);
        	}else {
        		RelatorioMet.executa(VetorOutubro2018, VetorOutubro2018.length, mes, 2018);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Novembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorNovembro2018 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorNovembro2018[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorNovembro2018);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorNovembro2018,VetorNovembro2018.length, mes, 2018);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorNovembro2018,VetorNovembro2018.length, mes, 2018);
        	}else {
        		RelatorioMet.executa(VetorNovembro2018, VetorNovembro2018.length, mes, 2018);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Dezembro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorDezembro2018 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorDezembro2018[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorDezembro2018);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorDezembro2018,VetorDezembro2018.length, mes, 2018);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorDezembro2018,VetorDezembro2018.length, mes, 2018);
        	}else {
        		RelatorioMet.executa(VetorDezembro2018, VetorDezembro2018.length, mes, 2018);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        default:
        	
        	System.out.println("Digite um mes válido!");

    }
		
		
		
	}

}
