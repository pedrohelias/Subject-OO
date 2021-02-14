package tpzao;
import java.util.Scanner;

public class MetodoSwitch {
	static public void SwitchzaoDaMassa() {
		
		int SelecionaMenu = 0;
		int Operacao = 0;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Esté é o Sistema associado ao NMTE (Instituto Nacional de Meteorologia)e é responsável por coletar ");
		System.out.println("e gerar previsões sobre os dados meteorológicos brasileiros. Abaixo, o menu para seleção de serviço:");
		
		System.out.println("1|Entrada das temperaturas;");
		System.out.println("2|Cálculo da temperatura média;");
		System.out.println("3|Cálculo da temperatura mínima;");
		System.out.println("4|Cálculo da temperatura máxima;");
		System.out.println("5|Relatório meteorológico.");
		
		System.out.println("Digite a escolha de menu:");
		
		SelecionaMenu = ler.nextInt();
			
		switch(SelecionaMenu){

        case 1:
        	String mes_case1;
        	int ano_case1;
        	Operacao = 1; //insere dados
        	System.out.println("Digite o mês:(letra inicial maiúscula)");
        	mes_case1 = ler.next();
        	//VerificaMes.ErroMes(mes_case2);
        	System.out.println("Digite o ano:");
        	ano_case1 = ler.nextInt();
        	DeterminaDadosAno.GerenciaDias(ano_case1,mes_case1,Operacao);
    		
        	
            break;

        case 2:
        	String mes_case2;
        	int ano_case2;
        	Operacao = 2; //media
        	System.out.println("Digite o mês:(letra inicial maiúscula)");
        	mes_case2 = ler.next();
        	//VerificaMes.ErroMes(mes_case2);
        	System.out.println("Digite o ano:");
        	ano_case2 = ler.nextInt();
        	DeterminaDadosAno.GerenciaDias(ano_case2,mes_case2,Operacao);
        	
        	
        	
        	
        	
        	
        	
    		break;

        case 3:
        	
        	String mes_case3;
        	int ano_case3;
        	Operacao = 3; //menor
        	System.out.println("Digite o mês:(letra inicial maiúscula)");
        	mes_case3 = ler.next();
        	//VerificaMes.ErroMes(mes_case2);
        	System.out.println("Digite o ano:");
        	ano_case3 = ler.nextInt();
        	DeterminaDadosAno.GerenciaDias(ano_case3,mes_case3,Operacao);
        	
        	
        	
        	
        	break;
        	
        case 4:
        	String mes_case4;
        	int ano_case4;
        	Operacao = 4; //menor
        	System.out.println("Digite o mês:(letra inicial maiúscula)");
        	mes_case4 = ler.next();
        	//VerificaMes.ErroMes(mes_case2);
        	System.out.println("Digite o ano:");
        	ano_case4 = ler.nextInt();
        	DeterminaDadosAno.GerenciaDias(ano_case4,mes_case4,Operacao);
        	
        	break;
        case 5:
        	String mes_case5;
        	int ano_case5;
        	Operacao = 5; //menor
        	System.out.println("Digite o mês:(letra inicial maiúscula)");
        	mes_case5 = ler.next();
        	//VerificaMes.ErroMes(mes_case2);
        	System.out.println("Digite o ano:");
        	ano_case5 = ler.nextInt();
        	DeterminaDadosAno.GerenciaDias(ano_case5,mes_case5,Operacao);
        	
        	
        	
        	
        	
        	
        	
        	break;
        	
        default:
            //caso não for nenhum desses casos


    }
	
		
		
		
		
		
		
	}

}
