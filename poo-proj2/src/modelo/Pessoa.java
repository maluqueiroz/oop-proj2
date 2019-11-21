package modelo;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import repositorio.Repositorio;

public class Pessoa {
	private String email;
	private String senha;
	private String nome;
	private BufferedImage imagem;
	private ArrayList<Mensagem> caixaEntrada;
	private ArrayList<Mensagem> caixaSaida;
	
	public Pessoa (String email, String senha, String nome) {
		this.email = email;
		this.senha = senha;
		this.nome = nome;
	}
	
	// Setter Methods
	public void setEmail(String myEmail) {
		this.email = myEmail;
	}
	
	// Mensagens devem conversar com a classe repositório
	
	/*
	public String getSenha() {
		return this.senha;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public BufferedImage getImagem() {
		return this.imagem;
	}
	
	public ArrayList<Mensagem> getCaixaEntrada() {
		return this.caixaEntrada;
	}
	
	public ArrayList<Mensagem> getCaixaSaida() {
		return this.caixaSaida;
	}*/
	
	
	// Getter Methods
	public String getEmail() {
		return this.email;
	}
	
	public String getSenha() {
		return this.senha;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public BufferedImage getImagem() {
		return this.imagem;
	}
	
	public ArrayList<Mensagem> getCaixaEntrada() {
		return this.caixaEntrada;
	}
	
	public ArrayList<Mensagem> getCaixaSaida() {
		return this.caixaSaida;
	}	
}
