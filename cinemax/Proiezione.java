
import java.time.LocalDateTime;

public class Proiezione {

    private LocalDateTime dataOra;
    private final Film film;
    private final double costoBiglietto;
    private final int CAPACITA_SALA = 200; // Specifica di progetto [cite: 4]
    private int postiPrenotati;

    /**
     * Costruttore della classe Proiezione
     *
     * @param dataOra data e ora della proiezione
     * @param film film proiettato
     * @param costoBiglietto costo del biglietto per la proiezione
     */
    public Proiezione(LocalDateTime dataOra, Film film, double costoBiglietto) {
        this.dataOra = dataOra;
        this.film = film;
        this.costoBiglietto = costoBiglietto;
        this.postiPrenotati = 0;
    }

    /**
     *
     * @return restituisce il numero di posti liberi per la proiezione
     */
    public int getPostiLiberi() {
        return CAPACITA_SALA - postiPrenotati; // Calcolato come richiesto [cite: 14]
    }

    /**
     * Prenota un certo numero di posti per la proiezione
     *
     * @param num numero di posti da prenotare
     * @return true se la prenotazione è avvenuta con successo, false altrimenti
     */
    public boolean prenotaPosti(int num) {
        if (num <= getPostiLiberi()) {
            postiPrenotati += num;
            return true;
        }
        return false;
    }

    /**
     *
     * @return restituisce il numero di posti prenotati per la proiezione
     */
    // Getter
    public LocalDateTime getDataOra() {
        return dataOra;
    }

    /**
     * @return restituisce il film proiettato
     */
    public Film getFilm() {
        return film;
    }

    /**
     * @return il costo del biglietto per la proiezione
     */
    public double getCostoBiglietto() {
        return costoBiglietto;
    }
}
