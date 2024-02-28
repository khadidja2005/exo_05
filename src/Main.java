
class Cinema {
    private String nom ;
    private String adresse ;
    private  int nbrSalle = 0;

    private Salle[] Salles ;
    private Client[] clientFidele ;
    public Cinema(String n1 , String n2 ){
        this.nom = n1 ;
        this.adresse = n2 ;
    }
    public void ajouteSalles(Salle S){
        this.Salles[this.nbrSalle] = S ;
        this.nbrSalle ++ ;
    }
    public void affichSalles(){
        for (int i =0 ; i < this.nbrSalle ; i++ ){
            Salles.affichSalle();
        }

    }
    public void setNom(String n){
       this.nom = n ;
    }
    public void setAdresse(String adr){
        this.adresse = adr ;
    }
    public void setNbrSalle(int n){
        this.nbrSalle = n ;
    }
    public int getNbrSalle (){
        return this.nbrSalle ;
    }
    public String getNom (){
        return this.nom ;
    }
    public String getAdresse(){
        return  this.adresse;
    }

}

class Film {
    private String titre ;
    private  int annee ;
    private String nomRealisateur ;
    private int nbrActeurs =0 ;
    private String[] acteurs ;
    private String synopsis ;

    public void affichActeurs(){
        for (int i =0 ; i < this.nbrActeurs ; i++ ){
            System.out.println(acteurs[1]);
        }

    }
    public void ajouteActeurs(String acteur){
      acteurs[this.nbrActeurs] =  acteur ;
      this.nbrActeurs++ ;
    }
    public Film(String titre1 , String  nomrealisateur1 , String synopsis1 , int annee1 ){
        this.titre = titre1 ;
        this.annee = annee1 ;
        this.nomRealisateur = nomrealisateur1 ;
        this.synopsis = synopsis1;
    }

    public String getTitre(){
       return this.titre ;
    }

    public String getNomRealisateur(){
        return this.nomRealisateur;
    }
    public String getSynopsis(){
        return this.synopsis ;
    }
    public int getAnnee(){
        return this.annee ;
    }
    public void setTitre(String n){
        this.titre = n ;
    }

    public void setAnnee (int n){
        this.annee = n ;
    }
    public void setNomRealisateur(String n){
        this.nomRealisateur = n ;
    }
    public void setSynopsis(String n){
        this.synopsis = n ;
    }

}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}