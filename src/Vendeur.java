import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("1e3960c5-ea9c-4ab8-b89b-75948e28787d")
public class Vendeur extends Utilisateur {
    @objid ("9b29ec9a-c2d6-40a9-a34d-3805f5f36913")
    private String idvendeur;

    @objid ("20598658-2f94-4811-a267-1c7699109c4b")
    public List<Produit> gerer = new ArrayList<Produit> ();

    @objid ("13a22db9-fd27-40e0-9f65-ba4fb77528ea")
    String getIdvendeur() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.idvendeur;
    }

    @objid ("f0cde0c9-8305-49eb-ab42-00c2ffddfb45")
    void setIdvendeur(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.idvendeur = value;
    }

}
