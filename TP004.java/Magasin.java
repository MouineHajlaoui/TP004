
public class Magasin {
    private String identifiant;
    private String adresse;
    private int capaciteMag;
    private produit_ex2[] ensembleProduits;
    private static int nbrProduit = 0;
    public employer M[];

    public Magasin(String identifiant, String adresse, int capaciteMag, employer M[]) {
        this.identifiant = identifiant;
        this.adresse = adresse;
        this.capaciteMag = capaciteMag;
        this.ensembleProduits = new produit_ex2[50];
        this.M = M;
    }

    public void ajouteProduit(produit_ex2 nouveauProduit) {
        if (nbrProduit < 50) {
            ensembleProduits[nbrProduit] = nouveauProduit;
            nbrProduit++;
        } else {
            System.out.println("Impossible d'ajouter un autre produit, le magasin est plein !");
        }
    }

    public void afficheCaracteristiqueMag() {
        System.out.println("Le magasin a un identifiant : " + identifiant + ", son adresse est : " + adresse +
                ", sa capacité est : " + capaciteMag + " et ses produits sont : ");
        for (produit_ex2 produit : ensembleProduits) {
            if (produit != null) {
                System.out.println("Ce produit : " + produit.getNom() + ", a un prix : " + produit.getPrix());
            }
        }
    }

    public static int nbrProduit() {
        return nbrProduit;
    }
}