package ex2;

import javax.swing.JOptionPane;

public class Ex2 {
	
	public static void main(String args[]) {
		int a;
		a = Integer.parseInt((JOptionPane.showInputDialog("Digite um numero")));
		System.out.println(Ex2(a));
	}
	
	public static String Ex2(int n) {
		if (n >= 2000)
			return "entrada limitada a 2000";
		//condição de parada. se o valor for igual a 1 não há mais conversão, pois o resultado será ele mesmo
		else if (n == 1) {
			return Integer.toString(n%2);
		}
		else {
			int r;
			r = n/2;
			// a função retorna uma string com o resto da divisão atual, ao mesmo tempo ela chama a si mesma enviando o resultado inteiro
			// da divisão do numero atual por 2, possibilitando que a conversão contine ocorrendo
			return Ex2(r) + Integer.toString(n%2);
		}
	}
}
