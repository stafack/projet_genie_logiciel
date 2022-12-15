import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("167bd9ee-ea3b-4375-ab93-3c129c44d8c7")
public class Produit {
    @objid ("deaed7c5-1a8f-44e9-991a-aa38d1d82d93")
    private String idprod;

    @objid ("77e45614-8e05-4d6d-ae0e-db63ea43bdf7")
    public String nom;

    @objid ("f43de6ff-f1c5-4499-885a-250f973fb3aa")
    public int prix.u;

    @objid ("ba7fd5d5-3bcb-438c-acc3-150c733487cf")
    public String description;

    @objid ("dd50789b-8936-4069-9c65-eafe022600c0")
    public Categorie appartenir;

    @objid ("500f4bce-37f2-410c-8d03-f9e69010ab49")
    public void listerProduit() {
    }

    @objid ("c00ead76-7aa1-459c-82a1-926f0d6bf2e6")
    public void ajouterProduit() {
    }

    @objid ("ac96ef33-5053-4360-8abe-ba82e7812876")
    public void rechercherProduit() {
    }

    @objid ("53be5c59-b16f-4310-a88b-8b6e4df6c5af")
    public void modifierProduit() {
    }

    @objid ("87a47f9c-90c7-4475-93ca-54e9d486c814")
    public void supprimerProduit() {
    }

    @objid ("83944d8c-beb8-4f3c-9893-12f8af2bf501")
    String getIdprod() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.idprod;
    }

    @objid ("ca3fde8f-c2b8-410c-a024-f0dafbdd8906")
    void setIdprod(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.idprod = value;
    }

}
