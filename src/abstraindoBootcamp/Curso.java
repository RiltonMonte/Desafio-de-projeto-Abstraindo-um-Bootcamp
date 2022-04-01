package abstraindoBootcamp;

public class Curso extends Conteudo {

	private int cargaHoraria;

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public double Calcularxp() {
		double xpCurso;
		xpCurso = xpBase*cargaHoraria;
		return xpCurso;
	}

	@Override
	public String toString() {
		return "[Curso = "+ getNome() + 
				" | Descricao = "+ getDescricao() +
				" | cargaHoraria = " + cargaHoraria + "]\n";
	}
	
}
