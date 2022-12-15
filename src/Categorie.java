import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("6d51bcfb-d67d-4885-b65c-e99afed155d2")
public class Categorie {
    @objid ("a222e9d9-d4bf-4474-a9db-95b6e5bc37b2")
    private String idcat;

    @objid ("ba382960-a665-4ed6-8002-4f4a725125ec")
    public String nomcat;

    @objid ("6aaf85fa-d128-4f6b-b690-14e32c3f7d85")
    public void AjouterCat() {
    }

    @objid ("f59ceb5d-25af-4a49-aa45-ae174d5702ee")
    public void SupprimerCat() {
    }

    @objid ("5bcf1f02-e80e-456a-9e1a-fd4304491de3")
    public void ListerCat() {
    }

    @objid ("715eb42b-5ff5-46a9-b398-e43dfa57e4df")
    String getIdcat() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.idcat;
    }

    @objid ("7256e17f-bd12-4369-a48e-8fd32873ae26")
    void setIdcat(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.idcat = value;
    }

}
