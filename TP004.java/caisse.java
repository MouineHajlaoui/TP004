public class caisse extends employer
{
    public int NumeroDeCaisse;


    public caisse(int NumeroDeCaisse,int id,String nom, String adresse,double nbrheur)
    {
        super( id, nom, adresse, nbrheur);
        this.NumeroDeCaisse = NumeroDeCaisse;
    }
}