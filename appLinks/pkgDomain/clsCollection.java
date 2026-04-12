/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgDomain;

import java.util.ArrayList;
import java.util.Date;
import pkgServices.clsEntity;

/**
 *
 * @author Acer3
 */
public class clsCollection extends clsEntity{
    
    private Date attCreationDate;
    private ArrayList<clsLink> attMyLinks;
    private clsAccount attMyAccount;
    
    public clsCollection (){
        super();
    }

    public clsCollection(String prmOUID, String prmName, Date prmCreationDate, ArrayList<clsLink> prmMyLinks, clsAccount prmMyAccount) {
        super(prmOUID, prmName, null);
        this.attCreationDate = prmCreationDate;
        this.attMyLinks = prmMyLinks;
        this.attMyAccount = prmMyAccount;
    }

    public Date opGetCreationDate() {
        return attCreationDate;
    }

    public void opSetCreationDate(Date prmCreationDate) {
        this.attCreationDate = prmCreationDate;
    }

    public ArrayList<clsLink> opGetMyLinks() {
        return attMyLinks;
    }

    public void opSetMyLinks(ArrayList<clsLink> prmMyLinks) {
        this.attMyLinks = prmMyLinks;
    }

    public clsAccount opGetMyAccount() {
        return attMyAccount;
    }

    public void opSetMyAccount(clsAccount prmMyAccount) {
        this.attMyAccount = prmMyAccount;
    }
}
