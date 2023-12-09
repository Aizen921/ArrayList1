import java.util.ArrayList;
import java.util.List;

public class Studenti {
    private String nome;
    private int eta;
    private List<Studenti> listaStudenti = new ArrayList<>();
    public Studenti(String nome, int eta){
        this.nome = nome;
        this.eta = eta;
    }
    public Studenti(){

    }

    public List<Studenti> getListaStudenti() {
        return listaStudenti;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public void dettagliStudenti(){
      for(Studenti studente :listaStudenti){
          System.out.println("Lista Studenti: Nome: " + studente.getNome() + " Età: "+ studente.getEta());
      }
    }

    @Override
    public String toString() {
        return "Studenti{" +
                "nome='" + nome + '\'' +
                ", eta=" + eta +
                '}';
    }
}
