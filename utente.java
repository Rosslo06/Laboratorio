
public class utente {

    //CAMPI 
    private String nome;
    private String cognome;
    private String età;
    private int password;

    //COSTRUTTORI
    public utente(String nome, String cognome, String età, int password) {
        this.nome = nome;
        this.cognome = cognome;
        this.età = età;
        this.password = password;
    }

    //METODI
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getEtà() {
        return età;
    }

    public void setEtà(String età) {
        this.età = età;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

}
