import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4ba402d0-1f59-4b84-811b-61fd784cfd75")
public class Carte {
    @objid ("5c135b3f-ec48-4625-b503-ad18217309f0")
    private String idcart;

    @objid ("e666bb58-32b4-4521-84b3-d1e65d544631")
    public String code;

    @objid ("385d7b90-f190-4fe3-99ee-ebbe7e136c2c")
    public String password;

    @objid ("ffc592cb-1420-416e-95de-7c52667890bf")
    public int montant;

    @objid ("c4fede40-1ba4-4d1c-ad42-933ca4ca465e")
    String getIdcart() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.idcart;
    }

    @objid ("fe1c70a9-ae1b-4dfb-9908-ebeb8517d149")
    void setIdcart(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.idcart = value;
    }

}
