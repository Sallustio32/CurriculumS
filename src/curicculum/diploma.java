package curicculum;

public class diploma {
	private String tipoDiploma;
	private int durata;
	private int voto;
	public diploma(String tipoDiploma, int durata, int voto) {
		this.tipoDiploma = tipoDiploma;
		this.durata = durata;
		this.voto = voto;
	}
	@Override
	public String toString() {
		return "diploma [tipoDiploma=" + tipoDiploma + ", durata=" + durata + ", voto=" + voto + "]";
	}

}
