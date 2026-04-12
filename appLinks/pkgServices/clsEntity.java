/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgServices;

/**
 *
 * @author Acer3
 */
public class clsEntity implements clsBrokerCrud.IIdentificable<String> {
    private String attOUID;
    private String attName;
    private String attDescription;

    protected clsEntity() {
    }
    
    protected clsEntity(String prmOUID, String prmName, String prmDescription){
        this.attOUID=prmOUID;
        this.attName=prmName;
        this.attDescription=prmDescription;
    }

    @Override
    public String opGetOUID() {
        return attOUID;
    }

    public void opSetOUID(String prmOUID) {
        this.attOUID = prmOUID;
    }

    public String opGetName() {
        return attName;
    }

    public void opSetName(String prmName) {
        this.attName = prmName;
    }

    public String opGetDescription() {
        return attDescription;
    }

    public void opSetDescription(String prmDescription) {
        this.attDescription = prmDescription;
    }
}
