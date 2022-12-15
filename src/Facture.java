import java.util.Date;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("b1b1a8d2-83e0-40ec-abee-ee7352200592")
public class Facture {
    @objid ("cd43963d-04af-46da-bc13-6fc62d2d3ddd")
    private String idfact;

    @objid ("5e75a82b-d368-4bca-bef0-b7f66fcb9833")
    public Date date;

    @objid ("bfb8d995-71bf-4a97-b1ca-7f2ce8b195e2")
    public int remise;

    @objid ("203cef2e-2cf0-42f5-a0d2-c17d13ec1122")
    String getIdfact() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.idfact;
    }

    @objid ("aa2e2d6b-3822-4b00-87b2-5d7c671cbc85")
    void setIdfact(String value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.idfact = value;
    }

}
