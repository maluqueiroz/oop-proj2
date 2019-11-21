package modelo;
import java.time.LocalDateTime;

public class Mensagem {
	public static int id = 0;
	private int mid;
	private Pessoa emitente;
	private Pessoa destinatario;
	private String texto;
	private LocalDateTime data;
	private int TAMANHO_MAX = 200;
	
	// TODO setters
	public Mensagem() {
		Mensagem.id++;
		this.mid = Mensagem.id;
		
				
		if (this.texto.length() > this.TAMANHO_MAX) {
			// raise exception
		}
	}
	
	// TODO getter methods
	public int getMid() {
		return this.mid;
		
	}
	
	
	public Pessoa getEmitente() {
		return this.emitente;
	}
	
	public Pessoa getDestinatario() {
		return this.destinatario;
	}
	
	public String getTexto() {
		return this.texto;
	}
	
	public LocalDateTime getData() {
		return this.data;
	}
}
