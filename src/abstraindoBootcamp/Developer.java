package abstraindoBootcamp;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;


public class Developer {

	private String nome;
    private Set<Conteudo> conteudosPendentes = new LinkedHashSet<>();
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    
    public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Set<Conteudo> getConteudosPendentes() {
		return conteudosPendentes;
	}
	public void setConteudosPendentes(Set<Conteudo> conteudosPendentes) {
		this.conteudosPendentes = conteudosPendentes;
	}
	public Set<Conteudo> getConteudosConcluidos() {
		return conteudosConcluidos;
	}
	public void setConteudosConcluidos(Set<Conteudo> conteudosConcluidos) {
		this.conteudosConcluidos = conteudosConcluidos;
	}
    
    public void inscricaoBootcamp(Bootcamp bootcamp) {
    	this.conteudosPendentes.addAll(bootcamp.getConteudo());
    	bootcamp.getInscritos().add(this);
    }
	
    public void progredir() {
    	Optional<Conteudo> conteudo = this.conteudosPendentes.stream().findFirst();
    	if(conteudo.isPresent()) {
    		this.conteudosConcluidos.add(conteudo.get());
    		this.conteudosPendentes.remove(conteudo.get());
    	}else System.out.println("Voce não tem contudos pendentes.");
    }
    
    public double calculoXpTotal(){
    	Iterator<Conteudo> iterator = this.conteudosConcluidos.iterator();
    	double xpTotal = 0;
    	while(iterator.hasNext()) {
    		double soma = iterator.next().Calcularxp();
    		xpTotal += soma;
    	}
    	return xpTotal;
    }
    
}
