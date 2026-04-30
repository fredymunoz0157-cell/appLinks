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

public class clsController {

    private static clsController attInstance;
    private ArrayList<clsCategory> attMyCategories = new ArrayList<>();
    private ArrayList<clsAccount> attMyAccounts = new ArrayList<>();
    private clsAccount attCurrentSession;

    private clsController() {

    }

    public static clsController opGetInstance() {
        if (attInstance == null)
            attInstance = new clsController();
        return attInstance;
    }

    public ArrayList<clsCategory> opGetMyCategories() {
        return attMyCategories;
    }

    public ArrayList<clsAccount> opGetMyAccounts() {
        return attMyAccounts;
    }

    // =========================
    // REGISTER
    // =========================
    public Boolean opRegisterCategory(String prmOUIDCategory, String prmName, String prmDescription) {
        if (opGetCategory(prmOUIDCategory) != null) {
            return false;
        }
        return opAssociateCategory(new clsCategory(prmOUIDCategory, prmName, prmDescription, new ArrayList<>()));
    }

    public Boolean opRegisterAccount(String prmOUIDAccount, String prmName, String prmPassword, String prmMail) {
        if (opGetAccount(prmOUIDAccount) != null) {
            return false;
        }
        return opAssociateAccount(new clsAccount(prmOUIDAccount, prmName, prmMail, prmPassword, new ArrayList<>()));
    }

    // =========================
    // READ
    // =========================
    public clsCategory opGetCategory(String prmOUID) {
        return clsBrokerCrud.opGetItemType(prmOUID, attMyCategories);
    }

    public clsAccount opGetAccount(String prmOUID) {
        return clsBrokerCrud.opGetItemType(prmOUID, attMyAccounts);
    }

    // =========================
    // UPDATE
    // =========================
    public Boolean opUpdateCategory(String prmOUID, String prmName, String prmDescription) {
        clsCategory category = opGetCategory(prmOUID);

        if (category == null) {
            return false;
        }

        category.opSetName(prmName);
        category.opSetDescription(prmDescription);

        return true;
    }

    public Boolean opUpdateAccount(String prmOUID, String prmName, String prmMail, String prmPassword) {
        clsAccount account = opGetAccount(prmOUID);

        if (account == null) {
            return false;
        }

        account.opSetName(prmName);
        account.opSetMail(prmMail);
        account.opSetPassword(prmPassword);

        return true;
    }

    // =========================
    // DELETE
    // =========================
    public Boolean opDeleteCategory(String prmOUID) {
        clsCategory category = opGetCategory(prmOUID);

        if (category == null) {
            return false;
        }

        return opDisassociateCategory(category);
    }

    public Boolean opDeleteAccount(String prmOUID) {
        clsAccount account = opGetAccount(prmOUID);

        if (account == null) {
            return false;
        }

        return opDisassociateAccount(account);
    }

    // =========================
    // LOGIN
    // =========================
    public Boolean opLogin(String prmMail, String prmPassword) {
        for (clsAccount account : attMyAccounts) {
            if (account.opGetMail().equals(prmMail) &&
                account.opGetPassword().equals(prmPassword)) {

                attCurrentSession = account;
                return true;
            }
        }
        return false;
    }

    public void opLogout() {
        attCurrentSession = null;
    }

    public Boolean opIsSessionActive() {
        return attCurrentSession != null;
    }

    public clsAccount opGetCurrentSession() {
        return attCurrentSession;
    }

    // =========================
    // PRIVATE METHODS
    // =========================
    private Boolean opAssociateCategory(clsCategory prmClsCategory) {
        return clsBrokerCrud.opAssociateItemTo(prmClsCategory, attMyCategories);
    }

    private Boolean opAssociateAccount(clsAccount prmAccount) {
        return clsBrokerCrud.opAssociateItemTo(prmAccount, attMyAccounts);
    }

    private Boolean opDisassociateCategory(clsCategory prmCategory) {
        return clsBrokerCrud.opDisassociateItemTo(prmCategory, attMyCategories);
    }

    private Boolean opDisassociateAccount(clsAccount prmAccount) {
        return clsBrokerCrud.opDisassociateItemTo(prmAccount, attMyAccounts);
    }
}
