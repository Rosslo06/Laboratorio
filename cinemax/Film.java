
public class Film {

    //CAMPI
    //Attributi: Titolo, Genere, Regista, Anno, Durata (in minuti) ed Età minima per il pubblico.
    private String titolo;
    private String genere;
    private int durata;
    private String regista;
    private int anno;
    private int etaMinima;

    //COSTRUTTORI
    /**
     * Costruttore della classe Film
     *
     * @param titolo titolo del film
     * @param genere genere del film
     * @param durata durata del film
     * @param regista regista del film
     * @param anno anno di uscita del film
     * @param etaMinima età minima per il pubblico
     */
    public Film(String titolo, String genere, int durata, String regista, int anno, int etaMinima) {
        this.titolo = titolo;
        this.genere = genere;
        this.durata = durata;
        this.regista = regista;
        this.anno = anno;
        this.etaMinima = etaMinima;
    }

    //METODI
    /**
     * @return restituisce il titolo del film
     */
    public String getTitolo() {
        return titolo;
    }

    /**
     * @param titolo titolo del film
     */
    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    /**
     * @return restituisce il genere del film
     */
    public String getGenere() {
        return genere;
    }

    /**
     * @param genere genere del film
     */
    public void setGenere(String genere) {
        this.genere = genere;
    }

    /**
     * @return restituisce la durata del film
     */
    public int getDurata() {
        return durata;
    }

    /**
     * @param durata durata del film
     */
    public void setDurata(int durata) {
        this.durata = durata;

    }

    /**
     * @return restituisce il regista del film
     */
    public String getRegista() {
        return regista;
    }

    /**
     * @param regista regista del film
     */
    public void setRegista(String regista) {
        this.regista = regista;
    }

    /**
     * @return restituisce l'anno di uscita del film
     */
    public int getAnno() {
        return anno;
    }

    /**
     * @param anno anno di uscita del film
     */
    public void setAnno(int anno) {
        this.anno = anno;
    }

    /**
     * @return restituisce l'età minima per il pubblico del film
     */
    public int getEtaMinima() {
        return etaMinima;
    }

    /**
     * @param etaMinima età minima per il pubblico del film
     */
    public void setEtaMinima(int etaMinima) {
        this.etaMinima = etaMinima;
    }

    @Override
    public String toString() {
        return titolo + " (" + anno + ") - " + genere + ", Regia di " + regista + " [" + durata + " min]";
    }

}
