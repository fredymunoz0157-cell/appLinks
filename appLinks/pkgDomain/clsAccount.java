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
public class clsAccount extends clsEntity{
    
    private String attMail;
    private String attPassword;
    private ArrayList<clsCollection> attMyCollections;

    public clsAccount(){
        super();
    }

    public clsAccount( String prmOUID, String prmName, String prmMail, String prmPassword, ArrayList<clsCollection> prmMyCollections) {
        super(prmOUID, prmName, null);
        this.attMail = prmMail;
        this.attPassword = prmPassword;
        this.attMyCollections = prmMyCollections;
    }

    public String opGetMail() {
        return attMail;
    }

    public void opSetMail(String prmMail) {
        this.attMail = prmMail;
    }

    public String opGetPassword() {
        return attPassword;
    }

    public void opSetPassword(String prmPassword) {
        this.attPassword = prmPassword;
    }

    public ArrayList<clsCollection> opGetMyCollections() {
        return attMyCollections;
    }

    public void opSetMyCollections(ArrayList<clsCollection> prmMyCollections) {
        this.attMyCollections = prmMyCollections;
    }
}
