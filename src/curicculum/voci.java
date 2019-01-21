
package curicculum;
import java.time.LocalDate;
public class voci {
	long id;
	LocalDate dataIniizio;

	LocalDate dataFine;
	String descrizione;
	public voci(long id, LocalDate dataIniizio, LocalDate dataFine, String descrizione) {
		this.id = id;
		this.dataIniizio = dataIniizio;
		this.dataFine = dataFine;
		this.descrizione = descrizione;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setDataIniizio(LocalDate dataIniizio) {
		this.dataIniizio = dataIniizio;
	}
	public void setDataFine(LocalDate dataFine) {
		this.dataFine = dataFine;
	}
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	public long getId() {
		return id;
	}
	public LocalDate getDataIniizio() {
		return dataIniizio;
	}
	public LocalDate getDataFine() {
		return dataFine;
	}
	public String getDescrizione() {
		return descrizione;
	}
	public String toString() {
		return " ";
	}

}
