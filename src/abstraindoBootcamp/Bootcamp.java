package abstraindoBootcamp;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Bootcamp {
	
	private String nome;
	private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(30);
    private Set<Developer> inscritos = new HashSet<>();
    private Set<Conteudo> conteudo = new LinkedHashSet<>();
	
    public Set<Developer> getInscritos() {
		return inscritos;
	}
	public void setInscritos(Set<Developer> inscritos) {
		this.inscritos = inscritos;
	}
	public Set<Conteudo> getConteudo() {
		return conteudo;
	}
	public void setConteudo(Set<Conteudo> conteudo) {
		this.conteudo = conteudo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
    
   
}
