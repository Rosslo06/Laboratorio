
public class bigliettaio extends utente {

    //CAMPI
    private int idbigliettaio;

    //COSTRUTTORI
    /**
     * Costruttore della classe bigliettaio
     *
     * @param nome nome del bigliettaio
     * @param cognome cognome del bigliettaio
     * @param username username del bigliettaio
     * @param codicefiscale codice fiscale del bigliettaio
     * @param password password del bigliettaio
     * @param idbigliettaio id del bigliettaio
     */
    public bigliettaio(String nome, String cognome, String username, String codicefiscale, int password, int idbigliettaio) {
        super(nome, cognome, username, codicefiscale, password);
        this.idbigliettaio = idbigliettaio;
    }

    //METODI
    /**
     * @return restituisce l'id del bigliettaio
     */
    public int getIdbigliettaio() {
        return idbigliettaio;
    }

    /**
     * @param idbigliettaio id del bigliettaio
     */
    public void setIdbigliettaio(int idbigliettaio) {
        this.idbigliettaio = idbigliettaio;
    }

}
