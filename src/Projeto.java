import java.util.Locale;
import java.util.Scanner;

public class Projeto {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int escolaridade, experiencia, pontoescolaridade, pontoexperiencia ;
		char viajens, habilitacao;
		
		System.out.println ("Qual sua escolaridade?");
		System.out.println ("1) Ensino Fundamental");
		System.out.println ("2) Ensino M�dio");
		System.out.println ("3) Ensino Superior");
		System.out.println ("4) P�s-gradua��o");
		System.out.print ("Digite uma op��o: ");
		escolaridade = sc.nextInt();
		
		System.out.println();
		System.out.print("Voc� tem quantos anos de experi�ncia profissional? ");
		experiencia = sc.nextInt();
		System.out.print("Voc� tem disponibilidade para viajar (S/N)? ");
		viajens = sc.next().charAt(0);
		System.out.print("Voc� tem habilita��o de motorista (S/N)? ");
		habilitacao = sc.next().charAt(0);
		
		if (escolaridade == 1) {
			pontoescolaridade = 10;
		}
		else if (escolaridade == 2){
			pontoescolaridade = 20;
		}
		else if (escolaridade == 3){
			pontoescolaridade = 30;
		} 
		else {
			pontoescolaridade = 40;
		}
		
		
		if (experiencia == 0) {
			pontoexperiencia = 0;
		}
		else if (experiencia <= 2){
			pontoexperiencia = 10;
		}
		else if (experiencia > 2 && experiencia <= 5){
			pontoexperiencia = 20;
		} 
		else {
			pontoexperiencia = 40;
		}
		
		
		System.out.println();
		System.out.println("Pontos por escolaridade: " + pontoescolaridade);
		System.out.println("Pontos por experi�ncia: " + pontoexperiencia);

		
		sc.close();
	}

}
