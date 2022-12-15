import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6fce9501-e376-4438-a043-d896e9e65e7c")
public class Commande {
    @objid ("439852ed-2af8-4d4d-98aa-348e4f28ea74")
    private String idcmd;

    @objid ("237a6c67-fd91-4703-9c8e-0269cd1ecb61")
    public Date date;

    @objid ("005c4abc-4a7e-4ee6-a7fd-ed6ffe105abd")
    public int qte;

    @objid ("704e2242-8abd-43ed-a0f4-4ad805e884b4")
    public int montant;

    @objid ("f023b4f6-f921-4c9a-9d9a-dbd2281bdf92")
    public Facture concerner;

    @objid ("e34d9339-0b52-48c6-8891-847693a0b774")
    public Livraison concerner;

    @objid ("a18e3a83-619e-4f4f-b2eb-f86e24f2e30a")
    public Carte payerpar;

    @objid ("0fa12d56-4611-4b3b-ab8f-8c505e97468f")
    public void SommeTotalProd() {
    }

    @objid ("eff6028f-3a2b-4172-8c97-d03cd4613ea5")
    String getIdcmd() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.idcmd;
    }

    @objid ("0dafd6b9-ad24-41bd-83b8-d27ed0322c38")
    void setIdcmd(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.idcmd = value;
    }

    @objid ("60288f02-0f04-4d3b-b34d-aa66fef5b9d5")
    String getIdclient() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.idclient;
    }

    @objid ("15955c7b-1004-4670-bf87-5d1158f5b198")
    void setIdclient(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.idclient = value;
    }

    @objid ("26cd000a-86ec-411a-abb2-39726d06f13c")
    void setIdprd(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.idprd = value;
    }

}
