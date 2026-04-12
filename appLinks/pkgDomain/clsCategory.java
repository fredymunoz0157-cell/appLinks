/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgDomain;

import java.util.ArrayList;
import pkgServices.clsEntity;

/**
 *
 * @author Acer3
 */
public class clsCategory extends clsEntity{
    
    private ArrayList<clsLink> attLinks = new ArrayList<>();
    
    public clsCategory (){
        super();
    }
    
    public clsCategory(String prmOUID, String prmName, String prmDescription, ArrayList<clsLink> prmLinks){
        super(prmOUID,prmName,prmDescription);
        this.attLinks=prmLinks;
    }
    
    public ArrayList<clsLink> opGetLinks() {
        return attLinks;
    }

    public void opSetLinks(ArrayList<clsLink> prmLinks) {
        this.attLinks = prmLinks;
    }
}
