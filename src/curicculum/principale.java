package curicculum;
import java.util.*;
import java.time.LocalDate;
public class principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		cv cvObj=new cv();
		int voto;
		int durata;
		String nomeIst;
		int anniStudio;
		int pick=0;
		int anno;
		int mese;
		int giorno;
		int scelta=0;
		long id;
		String tipoDiploma;
		LocalDate dataInizio;
		LocalDate dataFine;
		String descrizione;
		String azienda;
		int guadagno;
		String partecipCorso;
		String tipoCorso;
		boolean partecip=false;
		int finale=0;
		while(finale==0) {
			System.out.println("0)Exit");
			System.out.println("1)Inserimento voce");
			System.out.println("2)togli voce");
			System.out.println("3)Mettere in ordine cronologico");
			System.out.println("4)Visualizza CV");
			pick=input.nextInt();
			switch(pick) {
			case 0: finale=1;
			break;
			case 1: 
				System.out.println("Scegli:");
				System.out.println("1)Esperienza Lavorativa");
				System.out.println("2)Studio Effetuato");
				scelta=input.nextInt();
				if (scelta==1) {
					System.out.println("Inserisci ID");
					id=input.nextLong();
					System.out.println("Inserisci Data Inizio");
					System.out.print("Anno: ");
					anno=input.nextInt();
					System.out.println();
					System.out.print("Mese: ");
					mese=input.nextInt();
					System.out.println();
					System.out.print("Giorno: ");
					giorno=input.nextInt();
					dataInizio=LocalDate.of(anno, mese, giorno);
					System.out.println();
					System.out.println("Inserisci Data fine");
					System.out.print("Anno: ");
					anno=input.nextInt();
					System.out.println();
					System.out.print("Mese: ");
					mese=input.nextInt();
					System.out.println();
					System.out.print("Giorno: ");
					giorno=input.nextInt();
					dataFine=LocalDate.of(anno, mese, giorno);
					System.out.println();
					System.out.println("Inserisci Descrizione");
					descrizione=input.next();
					System.out.println("Inserisci Azienda");
					azienda=input.next();
					System.out.println("Inserisci Guadagno");
					guadagno=input.nextInt();
					System.out.println("Hai partecipato ai corsi? y/n");
					partecipCorso=input.next();
					if(partecipCorso.equalsIgnoreCase("y")){
						partecip=true;
					} else {
						partecip=false;
					}
					System.out.println("Inserisci Tipo corso");
					tipoCorso=input.next();
					EsperienzaLavorativa obj=new EsperienzaLavorativa(id, dataInizio, dataFine, descrizione, azienda, guadagno, partecip, tipoCorso);
					cvObj.aggiungiVoceL(obj);
				} if (scelta==2) {
					System.out.println("Inserisci ID");
					id=input.nextLong();
					System.out.println("Inserisci Data Inizio");
					System.out.print("Anno: ");
					anno=input.nextInt();
					System.out.println();
					System.out.print("Mese: ");
					mese=input.nextInt();
					System.out.println();
					System.out.print("Giorno: ");
					giorno=input.nextInt();
					dataInizio=LocalDate.of(anno, mese, giorno);
					System.out.println();
					System.out.println("Inserisci Data fine");
					System.out.print("Anno: ");
					anno=input.nextInt();
					System.out.println();
					System.out.print("Mese: ");
					mese=input.nextInt();
					System.out.println();
					System.out.print("Giorno: ");
					giorno=input.nextInt();
					dataFine=LocalDate.of(anno, mese, giorno);
					System.out.println();
					System.out.println("Inserisci Descrizione");
					descrizione=input.next();
					System.out.println("Inserisci nome Istituto");
					nomeIst=input.next();
					System.out.println("Numero anni di studio:");
					anniStudio=input.nextInt();
					System.out.println("Diploma Conseguito? y/n");
					partecipCorso=input.next();

					if(partecipCorso.equalsIgnoreCase("y")) {
						partecip=true;
						System.out.println("Tipo diploma:");
						tipoDiploma=input.next();
						System.out.println("Durata diploma:");
						durata=input.nextInt();
						System.out.println("Voto:");
						voto=input.nextInt();
						diploma obj2 = new diploma(tipoDiploma,durata,voto);
						cvObj.aggiungeDiploma(obj2);

					} else {
						partecip=false;
					}
					StudioEffetuato studObj = new StudioEffetuato(id, dataInizio, dataFine, descrizione, nomeIst, anniStudio, partecip);
					cvObj.aggiungiVoceS(studObj);
				}

				break;
			case 2: 

				cvObj.rimuovi();
				break;
			case 3: 

				cvObj.stampa();
				break;
			case 4: 
				cvObj.elenco();

				break;

			}

		}
	}

}
