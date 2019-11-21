package aplicacao;
import modelo.*;

public class Main {

	public static void main(String[] args) {
			Mensagem m1 = new Mensagem();
			
			System.out.println(m1.getMid() + " " + Mensagem.id);
			
			Mensagem m2 = new Mensagem();
			
			System.out.println(m2.getMid());
			
			Mensagem m3 = new Mensagem();
			
			System.out.println(m3.getMid());
			
			Mensagem m4 = new Mensagem();
			
			System.out.println(m4.getMid());
			
			System.out.println("abc".length());
	}
}

