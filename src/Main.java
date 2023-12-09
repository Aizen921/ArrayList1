public class Main {
    public static void main(String[] args){
    Studenti studente1 = new Studenti("Marco",15);
    Studenti studente2 = new Studenti("Luigi",16);
    Studenti studenti = new Studenti();
    studenti.getListaStudenti().add(studente1);
    studenti.getListaStudenti().add(studente2);
    studenti.dettagliStudenti();
    Studenti studente3 = new Studenti("Anna", 15);
    Studenti studente4 = new Studenti("Kevin", 17);
    Studenti studente5 = new Studenti("Luca", 16);
    Studenti studente6 = new Studenti("Giulia", 15);
    studenti.getListaStudenti().add(studente3);
    studenti.getListaStudenti().add(studente4);
    studenti.getListaStudenti().add(studente5);
    studenti.getListaStudenti().add(studente6);
    studenti.dettagliStudenti();




    }
}
