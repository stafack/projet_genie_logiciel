import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("d47f5b85-c9d2-4615-8983-0b58b9acdd85")
public class Admin extends Utilisateur {
    @objid ("d376901f-d282-414b-99a4-df1fb0a1da99")
    private String idadmin;

    @objid ("bba999b3-b666-45cd-a48e-d975f9097700")
    public List<Livraison> effectuer = new ArrayList<Livraison> ();

    @objid ("73f42b24-a7ac-4713-a2c4-955ebd6b4bfe")
    public List<Utilisateur> gerer = new ArrayList<Utilisateur> ();

    @objid ("9811b669-50da-4d6a-abdd-eedabccf957f")
    String getIdadmin() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.idadmin;
    }

    @objid ("8fc5f2cf-8f91-4bce-bf81-2e043d7ae415")
    void setIdadmin(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.idadmin = value;
    }

    @objid ("7edef8e4-d121-4c23-97da-d8dfde220f36")
    public void ajouterRoleUtilisateur() {
        
    }

}
