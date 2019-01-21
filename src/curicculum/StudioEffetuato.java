package curicculum;

import java.time.LocalDate;

public class StudioEffetuato extends voci{

	private String nomeIst;
	private int anniStudio;
	private boolean diploma;
	public StudioEffetuato(long id, LocalDate dataIniizio, LocalDate dataFine, String descrizione, String nomeIst,
			int anniStudio, boolean diploma) {
		super(id, dataIniizio, dataFine, descrizione);
		this.nomeIst = nomeIst;
		this.anniStudio = anniStudio;
		this.diploma = diploma;
	}
	@Override
	public String toString() {
		return "StudioEffetuato [nomeIst=" + nomeIst + ", anniStudio=" + anniStudio + ", diploma=" + diploma + ", id="
				+ id + ", dataIniizio=" + dataIniizio + ", dataFine=" + dataFine + ", descrizione=" + descrizione + "]";
	}



}

