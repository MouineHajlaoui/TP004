public class produit_ex2
{
    private String nom;
    private double prix;
    public produit_ex2(String nom,double prix)
    {
        this.nom=nom;
        if (prix >=0)
            this.prix=prix;
        else
            System.out.println("le prix ne peut pas etre négative");
    }
    public String getNom()
    {
        return nom;
    }
    public double getPrix()
    {
        return prix;
    }
    public void comparer(produit_ex2 p1){
        System.out.println("le nom du produit est : "+nom + "et le prix est : " +prix);
    }
    public void comparer(produit_ex2 p2 , produit_ex2 p3)
    {
        System.out.println("le nom du produit 1 est : "+nom + "et le prix est : " +prix);
        System.out.println("le nom du produit 2 est : "+nom + "et le prix est : " +prix);
        if ((p3.getPrix() == p2.getPrix()) && (p3.getNom()==p3.getNom()))
        {
            System.out.println("le client considére deux produits identiques");
        }
        else
        {
            System.out.println("les produits sont differents");
        }
    }

}