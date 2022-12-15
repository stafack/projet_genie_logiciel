import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("03c54116-de97-4e2e-a0ab-2b5f807cf234")
public class Client extends Utilisateur {
    @objid ("1beddec1-4498-475e-9f62-9fb381a4d950")
    private String idclient;

    @objid ("a53743eb-2810-4e30-9cc7-e89ee3483a12")
    public List<Commande> passer = new ArrayList<Commande> ();

    @objid ("0e90c8bb-f41f-4bca-b92b-f053ebba25c5")
    public List<Panier> gerer = new ArrayList<Panier> ();

    @objid ("c16b3bf2-a4ca-4467-b1e2-80992ff76133")
    String getIdclient() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.idclient;
    }

    @objid ("6392fec1-59a3-4e06-a58e-20c8e70883f5")
    void setIdclient(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.idclient = value;
    }

}
