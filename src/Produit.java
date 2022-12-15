import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("167bd9ee-ea3b-4375-ab93-3c129c44d8c7")
public class Produit {
    @objid ("deaed7c5-1a8f-44e9-991a-aa38d1d82d93")
    private String idprod;
    
    @objid ("2ec51df0-5b1f-47e1-8524-7b3ffc6fceaa")
    public List<Produit> etreconstituer = new ArrayList<Produit> ();

    @objid ("77e45614-8e05-4d6d-ae0e-db63ea43bdf7")
    public String nom;

    @objid ("f43de6ff-f1c5-4499-885a-250f973fb3aa")
    public int prix.u;

    @objid ("ba7fd5d5-3bcb-438c-acc3-150c733487cf")
    public String description;

    @objid ("dd50789b-8936-4069-9c65-eafe022600c0")
    public Categorie appartenir;

     @objid ("0e90c8bb-f41f-4bca-b92b-f053ebba25c5")
    public Panier gerer ;
     
    public Produit(String nom,int prix,String description){
        this.nom=nom;
        this.prix=prix;
        this.description=description;
    }
    @objid ("500f4bce-37f2-410c-8d03-f9e69010ab49")
    public List<Produit> listerProduit() {
      return etreconstituer;
    }

    @objid ("c00ead76-7aa1-459c-82a1-926f0d6bf2e6")
    public void ajouterProduit(String nom,int prix,String description) {
        Produit p=new Produit(String nom,int prix,String description)
        this.etreconstituer[this.etreconstituer.length]=p;
    }

    @objid ("ac96ef33-5053-4360-8abe-ba82e7812876")
    public Produit rechercherProduit(String nom,int prix,String description) {
      for(i=0;i<etreconstituer.length;i++){
        if(etreconstituer[i].nom=nom;
        etreconstituer[i].prix=prix;
        etreconstituer[i].description=description;){
            return etreconstituer[i];
        }

      }
    }

    @objid ("53be5c59-b16f-4310-a88b-8b6e4df6c5af")
    public void modifierProduit(String nom,int prix,String description) {
          this.nom=nom;
        this.prix=prix;
        this.description=description;
    }

    @objid ("87a47f9c-90c7-4475-93ca-54e9d486c814")
    public void supprimerProduit() {
            for(i=0;i<this.gerer.length;i++){
            if( this.etreconstituer[i].Nom=this.Nom &&
        this.etreconstituer[i].prix=this.prix &&
        this.etreconstituer[i].description=this.description )
        {
            while(etreconstituer.length>i){
                this.etreconstituer[i]=this.etreconstituer[i+1];
                i++;
            }
            
        }
    }
      @objid ("30e46449-32bd-470c-8bdb-b00d56ae3af2")
    public void AjouterPan() {
         Produit p=new Produit(String nom,int prix,String description);
         Panier pa=new Panier(true,p);
         this.gerer=pa;

    }

    @objid ("34e3737b-54a8-4960-b4bb-3225848f6219")
    public void retirerPan() {
        for(i=0;i<gerer.contenir.length;i++){
             if(this.gerer.contenir[i]=this){
                 while(gerer.contenir.length>i){
                this.gerer.contenir[i]=this.gerer.contenir[i+1];
                i++;
             }
             
        }
       
    }

    @objid ("d8fc78f2-add8-4603-843a-922c1e4089d4")
    public void ConsulterPan() {
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
