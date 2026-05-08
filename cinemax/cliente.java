
public class cliente extends utente {

    //CAMPI
    private int idcliente;

    //COSTRUTTORI
    public cliente(String nome, String cognome, String username, String codicefiscale, int password, int idcliente) {
        super(nome, cognome, username, codicefiscale, password);
        this.idcliente = idcliente;
    }

    //METODI
    public int getIdcliente() {
        return idcliente;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

}
