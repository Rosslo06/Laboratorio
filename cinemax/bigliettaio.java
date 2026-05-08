
public class bigliettaio extends utente {

    //CAMPI
    private int idbigliettaio;

    //COSTRUTTORI
    public bigliettaio(String nome, String cognome, String username, String codicefiscale, int password, int idbigliettaio) {
        super(nome, cognome, username, codicefiscale, password);
        this.idbigliettaio = idbigliettaio;
    }

    //METODI
    public int getIdbigliettaio() {
        return idbigliettaio;
    }

    public void setIdbigliettaio(int idbigliettaio) {
        this.idbigliettaio = idbigliettaio;
    }

}
