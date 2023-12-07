public class responsable extends employer{
    public int Prime;
    public responsable(int Prime,int id,String nom, String adresse,double nbrheur){
        super(id, nom, adresse, nbrheur);
        this.Prime=Prime;
    }

}