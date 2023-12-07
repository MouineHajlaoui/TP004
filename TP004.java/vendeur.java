public class vendeur extends employer{
    public int TauxDeVente;

    public vendeur (int TauxDeVente,int id,String nom, String adresse,double nbrheur){

       super( id, nom, adresse, nbrheur);
       this.TauxDeVente=TauxDeVente;
    }
}