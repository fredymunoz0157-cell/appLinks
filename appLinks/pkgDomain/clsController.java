/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgDomain;


import java.util.ArrayList;
import pkgServices.clsBrokerCrud;

/**
 *
 * @author Acer3
 */

public class clsController{
    
    private static clsController attInstance;
    private ArrayList<clsCategory> attMyCategories = new ArrayList<>();
    private ArrayList<clsAccount> attMyAccounts = new ArrayList<>();
    
    private clsController(){
    
    }
    
    public static clsController opGetInstance() {
        if (attInstance == null)
            attInstance = new clsController();
        return attInstance;
    } 

    public ArrayList<clsCategory> opGetMyCategories() {
        return attMyCategories;
    }

    public void opSetMyCategories(ArrayList<clsCategory> prmMyCategories) {
        this.attMyCategories = prmMyCategories;
    }

    public ArrayList<clsAccount> opGetMyAccounts() {
        return attMyAccounts;
    }

    public void opSetMyAccounts(ArrayList<clsAccount> prmMyAccounts) {
        this.attMyAccounts = prmMyAccounts;
    }
    
    public Boolean opRegisterCategory (String prmOUIDCategory, String prmName, String prmDescription){
        if (opGetCategory(prmOUIDCategory)!=null) {
            return false;
        }
        return opAssociateCategory(new clsCategory(prmOUIDCategory, prmName, prmDescription, new ArrayList<>()));
    }
    
    public Boolean opRegisterAccount(String prmOUIDAccount, String prmName, String prmPassword, String prmMail){
        if (opGetAccount(prmOUIDAccount)!=null) {
            return false;
        }
        return opAssociateAccount(new clsAccount(prmOUIDAccount, prmName, prmMail, prmPassword, new ArrayList<>()));
    }
    
    public Boolean opRegisterLInk (){
        return true;
    }
    
    public Boolean opRegisterCollection(){
        return true;
    }
    
    private Boolean opAssociateCategory (clsCategory prmClsCategory){
        return clsBrokerCrud.opAssociateItemTo(prmClsCategory, attMyCategories);
    }
    
    private Boolean opAssociateAccount (clsAccount prmAccount){
        return clsBrokerCrud.opAssociateItemTo(prmAccount, attMyAccounts);
    }
    
    private Boolean opDisassociateCategory (clsCategory prmCategory){
        return clsBrokerCrud.opDisassociateItemTo(prmCategory, attMyCategories);
    }
    
    private Boolean opDisassociateAccount(clsAccount prmAccount){
        
        return clsBrokerCrud.opDisassociateItemTo(prmAccount, attMyAccounts);
    }
    
    public clsCategory opGetCategory (String prmOUID){
        return clsBrokerCrud.opGetItemType(prmOUID, attMyCategories);
    }
    
    public clsAccount opGetAccount (String prmOUID){
        return clsBrokerCrud.opGetItemType(prmOUID, attMyAccounts);
    }
}
