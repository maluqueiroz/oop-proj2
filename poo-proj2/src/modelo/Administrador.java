package modelo;

/** IS-A Pessoa */
public class Administrador extends Pessoa {
	private boolean isAdmin = true;
	
	public Administrador(String email, String senha, String nome) {
		super(email, senha, nome);
	}
			
	// debug main
	public static void main(String args[]) {
		Administrador admin = new Administrador("abc@ab.c", "123!@#", "gerson");
		
		System.out.println(admin.isAdmin);
		}
}
