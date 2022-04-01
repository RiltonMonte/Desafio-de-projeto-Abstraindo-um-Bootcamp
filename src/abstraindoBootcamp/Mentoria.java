package abstraindoBootcamp;

public class Mentoria extends Conteudo{

	private int cargaHoraria;
	
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double Calcularxp() {
	double xpMentoria;
	xpMentoria = xpBase+(cargaHoraria*2);
		return xpMentoria;
	}

	@Override
	public String toString() {
		return "[Mentoria = "+ getNome() + 
				" | Descricao = "+ getDescricao() +
				" | cargaHoraria = " + cargaHoraria + "]";
	}
	
	
	
}
