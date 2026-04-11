/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgServices;

/**
 *
 * @author Acer3
 */
public class clsEntity {
    private String attOUID;
    private String attName;
    private String attDescription;

    public clsEntity() {
    }

    public String opGetAttOUID() {
        return attOUID;
    }

    public void opSetAttOUID(String prmOUID) {
        this.attOUID = prmOUID;
    }

    public String opGetAttName() {
        return attName;
    }

    public void opSetAttName(String prmName) {
        this.attName = prmName;
    }

    public String opGetAttDescription() {
        return attDescription;
    }

    public void opSetAttDescription(String prmDescription) {
        this.attDescription = prmDescription;
    }
}
