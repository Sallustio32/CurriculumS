package curicculum;

import java.time.LocalDate;

public class EsperienzaLavorativa extends voci {
	private String azienda;
	private int guadagno;
	private boolean partecipCorso;
	private String tipoCorso;
	public EsperienzaLavorativa(long id, LocalDate dataIniizio, LocalDate dataFine, String descrizione, String azienda,
			int guadagno, boolean partecipCorso, String tipoCorso) {
		super(id, dataIniizio, dataFine, descrizione);
		this.azienda = azienda;
		this.guadagno = guadagno;
		this.partecipCorso = partecipCorso;
		this.tipoCorso = tipoCorso;
	}
	@Override
	public String toString() {
		return "EsperienzaLavorativa [azienda=" + azienda + ", guadagno=" + guadagno + ", partecipCorso="
				+ partecipCorso + ", tipoCorso=" + tipoCorso + ", id=" + id + ", dataIniizio=" + dataIniizio
				+ ", dataFine=" + dataFine + ", descrizione=" + descrizione + "]";
	}




}
