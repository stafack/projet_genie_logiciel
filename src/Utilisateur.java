import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("035308f3-fa03-4492-8c21-baf786bf96fa")
public class Utilisateur {
    @objid ("7d1d0854-b42a-447f-acb9-67ccb4367cf9")
    private String id;

    @objid ("cb8362bb-b03c-4442-9cd1-451c7a84c4fb")
    protected String Nom;

    @objid ("5a56af34-211a-483c-8fe9-3d0b28dce02c")
    protected String Prenom;

    @objid ("b57f4533-190a-41bc-8022-368a77261edf")
    protected String Adresse;

    @objid ("7ba31329-33db-4aa5-a03c-1f32dc17281f")
    protected int Telephone;

    @objid ("59ec8bcb-bf21-4ac4-b53e-000cb2b06604")
    protected boolean Sexe;

    @objid ("4a8c0502-543a-49ed-aff0-10ebe14550a9")
    protected String Password;

    @objid ("673d42c4-485c-4f88-9782-66d4ab0648a6")
    protected String Mail;

    @objid ("58854661-6d14-47d3-b7bf-69b6fe89af26")
    protected String Ville;
    
     @objid ("73f42b24-a7ac-4713-a2c4-955ebd6b4bfe")
    public List<Utilisateur> gerer = new ArrayList<Utilisateur> ();


    public Utilisateur(String Nom,String Prenom,String Adresse,int Telephone,boolean Sexe, String Password,String Mail,String Ville)
     {
        this.Nom=Nom
        this.Prenom=Prenom;
        this.Adresse=adresse;
        this.Telephone=Telephone;
        this.Sexe=Sexe;
        this.Password=Password; 
        this.Mail=Mail;
        this.Ville=Ville;
    }

    @objid ("f3452f6c-5852-4bbf-b63e-3ccfc506e278")
    protected void ajouterUtilisateur(String Nom,String Prenom,String Adresse,int Telephone,boolean Sexe, String Password,String Mail,String Ville) {
        public Utilisateur ut=Utilisateur(String Nom,String Prenom,String Adresse,int Telephone,boolean Sexe, String Password,String Mail,String Ville);
        this.gerer[this.gerer.length]=ut;
    }

    @objid ("19e80acb-1d5c-4ba7-a00d-f253f74a5f20")
    protected void modifierUtilisateur(String Nom,String Prenom,String Adresse,int Telephone,boolean Sexe, String Password,String Mail,String Ville) {
        this.Nom=Nom
        this.Prenom=Prenom;
        this.Adresse=adresse;
        this.Telephone=Telephone;
        this.Sexe=Sexe;
        this.Password=Password; 
        this.Mail=Mail;
        this.Ville=Ville;
    }

    @objid ("e2585dbf-af73-4a36-a65f-47b8daf99cf4")
    protected void supprimerUtilisateur() {
        int i;
        for(i=0;i<this.gerer.length;i++){
            if( this.gerer[i].Nom=this.Nom &&
        this.gerer[i].Prenom=this.Prenom &&
        this.gerer[i].Adresse=this.adresse &&
        this.gerer[i].Telephone=this.Telephone &&
        this.gerer[i].Sexe=this.Sexe &&
        this.gerer[i].Password=this.Password &&
        this.gerer[i].Mail=this.Mail &&
        this.gerer[i].Ville=this.Ville)
        {
            while(gerer.length>i){
                this.gerer[i]=this.gerer[i+1];
                i++;
            }
            
        }
    }

    @objid ("80dfffc9-261d-4e0e-9e9d-021b0a07974e")
    protected list<Utilisateur> listerUtilisateur() {
        return gerer;
    
    }

    @objid ("66cd605d-39ce-4ed9-afd8-3b63ed649ea7")
    String getId() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.id;
    }

    @objid ("60cf585a-3094-4a5d-8e66-b24260782779")
    void setId(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.id = value;
    }

}
