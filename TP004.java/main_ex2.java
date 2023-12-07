public class main_ex2 {
    public static void main(String[] args) {


        caisse caissier1 = new caisse(1, 123, "emna", "kerknah", 160);
        vendeur vendeur1 = new vendeur(15, 456, "rahma", "kerknah", 150);
        responsable responsable1 = new responsable(400, 789, "imen", "ramla", 140);

        caisse caissier2 = new caisse(2, 147, "habib", "kerknah", 80);
        vendeur vendeur2 = new vendeur(20, 258, "hedia", "sfax", 180);

        vendeur vendeur3 = new vendeur(18, 369, "omar", "Ataya", 75);
        responsable responsable2 = new responsable(250, 951, "amine", "sfax", 165);

        Magasin carrefour = new Magasin("Carrefour", "Centre Ville", 200, new employer[]{caissier1, vendeur1, responsable1});
        Magasin monoprix = new Magasin("Monoprix","Centre Ville" , 350, new employer[]{caissier2, vendeur2, vendeur3, responsable2});

        afficherCaracteristiquesEmployes(new employer[]{caissier1, vendeur1, responsable1});
        afficherCaracteristiquesEmployes(new employer[]{caissier2, vendeur2, vendeur3, responsable2});

        produit_ex2 produit1 = new produit_ex2("Produit1", 2.5);
        produit_ex2 produit2 = new produit_ex2("Produit2", 10.0);
        produit_ex2 produit3 = new produit_ex2("Produit3", 5.75);

        carrefour.ajouteProduit(produit1);
        carrefour.ajouteProduit(produit2);

        monoprix.ajouteProduit(produit2);
        monoprix.ajouteProduit(produit3);

        carrefour.afficheCaracteristiqueMag();
        monoprix.afficheCaracteristiqueMag();

        afficherSalaires(new employer[]{caissier1, vendeur1, responsable1});
        afficherSalaires(new employer[]{caissier2, vendeur2, responsable2});
    }


    public static void afficherCaracteristiquesEmployes(employer[] employes) {
        for (int i = 0; i < employes.length; i++) {
            employer emp = employes[i];
            System.out.println("ID: " + emp.id + ", Nom: " + emp.nom +
                    ", Adresse: " + emp.adresse + ", Nombre d'heures: " + emp.nbrheur);
        }
    }

    public static void afficherSalaires(employer[] employes) {
        for (int i = 0; i < employes.length; i++) {
            employer emp = employes[i];
            double salaire = 0.0;

            if (emp instanceof responsable) {
                responsable resp = (responsable) emp;
                salaire = resp.nbrheur * 10 + resp.Prime;
                if (resp.nbrheur > 160) {
                    salaire += (resp.nbrheur - 160) * 10 * 1.4; // sup 40% de plus
                }
            } else if (emp instanceof caisse) {
                caisse c = (caisse) emp;
                salaire = c.nbrheur * 5;
                if (c.nbrheur > 180) {
                    salaire += (c.nbrheur - 180) * 5 * 1.25; // sup 25% de plus
                }
            } else if (emp instanceof vendeur) {
                vendeur v = (vendeur) emp;
                salaire = 450 * (v.TauxDeVente / 100.0);
            }

            System.out.println("le salaire de " + emp.nom + "est : " + salaire + " dt");
        }
    }
}