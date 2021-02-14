package tpzao;

import java.util.Scanner;
import java.util.Locale; //vai fazer com que o scanner enxergue ponto "." com virgula entre caracteres

public class DeterminaDadosMes2019 {
	static public void GerenciaMes2019(String mes, int Operacao){
		
		Scanner ler = new Scanner(System.in);
    	ler.useLocale(Locale.ENGLISH);
    	int QntDias = 0;
    	int Contador = 0;
		int aux = 0;
		
		switch(mes){

        case "Janeiro":
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJaneiro2019 = new double[QntDias];
        	aux = 0;
        	        	
        	System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJaneiro2019[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJaneiro2019);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJaneiro2019,VetorJaneiro2019.length, mes, 2019);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJaneiro2019,VetorJaneiro2019.length, mes, 2019);
        	}else {
        		RelatorioMet.executa(VetorJaneiro2019, VetorJaneiro2019.length, mes, 2019);
        		}

        	MetodoSwitch.SwitchzaoDaMassa(); break;
        
        case "Fevereiro":
            
        	QntDias = 28;
        	Contador = 0;
        	double [] VetorFevereiro2019 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorFevereiro2019[Contador] = ler.nextDouble();
        		Contador++;
        	} //vai preencher o array
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorFevereiro2019);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorFevereiro2019,VetorFevereiro2019.length, mes, 2019);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorFevereiro2019,VetorFevereiro2019.length, mes, 2019);
        	}else {
        		RelatorioMet.executa(VetorFevereiro2019, VetorFevereiro2019.length, mes, 2019);
        		}
        	
        	MetodoSwitch.SwitchzaoDaMassa(); break;
      	            
            
        case "Março":
        	
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMarco2019 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMarco2019[Contador] = ler.nextDouble();
        		Contador++;
        	}

        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMarco2019);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMarco2019,VetorMarco2019.length, mes, 2019);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMarco2019,VetorMarco2019.length, mes, 2019);
        	}else {
        		RelatorioMet.executa(VetorMarco2019, VetorMarco2019.length, mes, 2019);
        		}
            
        	MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Abril":
           
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorAbril2019 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAbril2019[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAbril2019);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAbril2019,VetorAbril2019.length, mes, 2019);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAbril2019,VetorAbril2019.length, mes, 2019);
        	}else {
        		RelatorioMet.executa(VetorAbril2019, VetorAbril2019.length, mes, 2019);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Maio":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorMaio2019 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorMaio2019[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorMaio2019);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorMaio2019,VetorMaio2019.length, mes, 2019);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorMaio2019,VetorMaio2019.length, mes, 2019);
        	}else {
        		RelatorioMet.executa(VetorMaio2019, VetorMaio2019.length, mes, 2019);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Junho":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorJunho2019 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJunho2019[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJunho2019);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJunho2019,VetorJunho2019.length, mes, 2019);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJunho2019,VetorJunho2019.length, mes, 2019);
        	}else {
        		RelatorioMet.executa(VetorJunho2019, VetorJunho2019.length, mes, 2019);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Julho":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorJulho2019 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorJulho2019[Contador] = ler.nextDouble();
        		Contador++;
        	}        	
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorJulho2019);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorJulho2019,VetorJulho2019.length, mes, 2019);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorJulho2019,VetorJulho2019.length, mes, 2019);
        	}else {
        		RelatorioMet.executa(VetorJulho2019, VetorJulho2019.length, mes, 2019);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Agosto":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorAgosto2019 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorAgosto2019[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorAgosto2019);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorAgosto2019,VetorAgosto2019.length, mes, 2019);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorAgosto2019,VetorAgosto2019.length, mes, 2019);
        	}else {
        		RelatorioMet.executa(VetorAgosto2019, VetorAgosto2019.length, mes, 2019);
        		}

        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Setembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorSetembro2019 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorSetembro2019[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorSetembro2019);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorSetembro2019,VetorSetembro2019.length, mes, 2019);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorSetembro2019,VetorSetembro2019.length, mes, 2019);
        	}else {
        		RelatorioMet.executa(VetorSetembro2019, VetorSetembro2019.length, mes, 2019);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Outubro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorOutubro2019 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorOutubro2019[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorOutubro2019);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorOutubro2019,VetorOutubro2019.length, mes, 2019);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorOutubro2019,VetorOutubro2019.length, mes, 2019);
        	}else {
        		RelatorioMet.executa(VetorOutubro2019, VetorOutubro2019.length, mes, 2019);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        case "Novembro":
            
        	QntDias = 30;
        	Contador = 0;
        	double [] VetorNovembro2019 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorNovembro2019[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorNovembro2019);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorNovembro2019,VetorNovembro2019.length, mes, 2019);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorNovembro2019,VetorNovembro2019.length, mes, 2019);
        	}else {
        		RelatorioMet.executa(VetorNovembro2019, VetorNovembro2019.length, mes, 2019);
        		}
        	
            MetodoSwitch.SwitchzaoDaMassa(); break;

        case "Dezembro":
            
        	QntDias = 31;
        	Contador = 0;
        	double [] VetorDezembro2019 = new double[QntDias];
        	aux = 0;
        	
            System.out.println("Digite as médias de temperatura por dia desse mês");
        	
        	while(Contador<QntDias) {
        		System.out.println("Média do dia " + (Contador+1)+ ":");
        		VetorDezembro2019[Contador] = ler.nextDouble();
        		Contador++;
        	}
        	
        	if(Operacao == 2) {
        		OperacaoMedia.media(VetorDezembro2019);
        	}else if(Operacao == 3) {
        		RetornaMenor.menor(VetorDezembro2019,VetorDezembro2019.length, mes, 2019);
        	}else if(Operacao == 4) {
        		RetornaMaior.maior(VetorDezembro2019,VetorDezembro2019.length, mes, 2019);
        	}else {
        		RelatorioMet.executa(VetorDezembro2019, VetorDezembro2019.length, mes, 2019);
        		}

        	
            MetodoSwitch.SwitchzaoDaMassa(); break;
            
        default:
        	
        	System.out.println("Digite um mes válido!");

    }
		
		
		
	}

}
