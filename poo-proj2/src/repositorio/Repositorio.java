package repositorio;
import modelo.Pessoa;
import modelo.Mensagem;
import java.util.TreeMap;
import java.util.ArrayList;

public class Repositorio {
	TreeMap<String, Pessoa> pessoas = new TreeMap<String, Pessoa>();
	ArrayList<Mensagem> mensagens = new ArrayList<Mensagem>();	
}
