package abstraindoBootcamp;

public class Main {

	public static void main(String[] args) {
		Curso curso1 = new Curso();
		Curso curso2 = new Curso();
		Curso curso3 = new Curso();
		Curso curso4 = new Curso();
		Mentoria mentoria = new Mentoria();
		
		curso1.setNome("Introducao ao Mercado de Qualidade de Software");
		curso1.setDescricao("Introducao a Qualidade de Software");
		curso1.setCargaHoraria(2);
		
		curso2.setNome("Introducao a Testes de Software");
		curso2.setDescricao("Testando Software");
		curso2.setCargaHoraria(3);
		
		curso3.setNome("Testes Unitarios Com JUnit");
		curso3.setDescricao("Apresentação do JUnit");
		curso3.setCargaHoraria(2);
		
		curso4.setNome("Aprenda a Aplicar testes Java");
		curso4.setDescricao("Testando na Pratica");
		curso4.setCargaHoraria(5);

		mentoria.setNome("Abstraindo Situacoes do Mundo Real com Orientacao a Objetos");
		mentoria.setDescricao("Abstraindo Situacoes do Mundo Real com Orientacao a Objetos");
		mentoria.setCargaHoraria(1);
		
		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("Bootcamp QA");
		bootcamp.setDescricao("Descricao QA");
		bootcamp.getConteudo().add(curso1);
	    bootcamp.getConteudo().add(curso2);
	    bootcamp.getConteudo().add(curso3);
	    bootcamp.getConteudo().add(curso4);
	    bootcamp.getConteudo().add(mentoria);
	    
	    Developer joao = new Developer();
	    Developer maria = new Developer();
	    Developer mario = new Developer();
	    
	    joao.setNome("Joao");
	    joao.inscricaoBootcamp(bootcamp);
	    System.out.println("Dev Joao \nconteudos pendentes:" + joao.getConteudosPendentes());
	    System.out.println("\n Xp total de Joao " + joao.calculoXpTotal());
		joao.progredir();
		System.out.println("--------------");
		System.out.println("\n conteudos pendentes:" + joao.getConteudosPendentes());
		System.out.println("\n conteudos concluidos:" + joao.getConteudosConcluidos());
		System.out.println("\n Xp total de Joao " + joao.calculoXpTotal());
		
		System.out.println("\n\n||--------------||\n\n");
		
	    maria.setNome("Maria");
	    maria.inscricaoBootcamp(bootcamp);
	    System.out.println("Dev Maria \nconteudos pendentes:" + maria.getConteudosPendentes());
	    System.out.println("\n Xp total de Maria " + maria.calculoXpTotal());
		maria.progredir();
		maria.progredir();
		maria.progredir();
		System.out.println("--------------");
		System.out.println("\n conteudos pendentes:" + maria.getConteudosPendentes());
		System.out.println("\n conteudos concluidos:" + maria.getConteudosConcluidos());
		System.out.println("\n Xp total de Maria " + maria.calculoXpTotal());
		
		System.out.println("\n\n||--------------||\n\n");
		
		mario.setNome("Mario");
		mario.inscricaoBootcamp(bootcamp);
	    System.out.println("Dev Mario \nconteudos pendentes:" + mario.getConteudosPendentes());
	    System.out.println("\n Xp total de Mario " + mario.calculoXpTotal());
	    mario.progredir();
	    mario.progredir();
	    mario.progredir();
	    mario.progredir();
		System.out.println("--------------");
		System.out.println("\n conteudos pendentes:" + mario.getConteudosPendentes());
		System.out.println("\n conteudos concluidos:" + mario.getConteudosConcluidos());
		System.out.println("\n Xp total de Mario " + mario.calculoXpTotal());
		
	}
	
}
