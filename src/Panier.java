import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

@objid ("4f825194-6660-45ea-9f25-19c2e1fba72c")
public class Panier {
    @objid ("9d4d819d-8a38-4d07-8610-15a90e4a8bef")
    private String idpan;

    @objid ("0166f808-e75e-47db-b411-a4c48ff20f31")
    public boolean etatpan;

    @objid ("888c65c0-ba5f-4d84-933b-ab0180962ec4")
    public int totalpan;

    @objid ("082d9ce5-d4a0-4e7c-a804-dfbcbfa6db05")
    public List<Produit> contenir = new ArrayList<Produit> ();

    @objid ("30e46449-32bd-470c-8bdb-b00d56ae3af2")
    public void AjouterPan() {
    }

    @objid ("34e3737b-54a8-4960-b4bb-3225848f6219")
    public void retirerPan() {
    }

    @objid ("d8fc78f2-add8-4603-843a-922c1e4089d4")
    public void ConsulterPan() {
    }

}
