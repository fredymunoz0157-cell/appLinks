/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgDomain;

import java.util.Date;
import pkgServices.clsEntity;

/**
 *
 * @author Acer3
 */
public class clsLink extends clsEntity{
    private String attURL;
    private Date attCreationDate;
    private Date attAddedDate;
    private clsCollection attMyCollection;
    private clsCategory attMyCategory;
    
    public clsLink (){
        super();
    }
    
    public clsLink (String prmOUID, String prmName, String PrmDescription, String prmURL, Date prmCreationDate, Date prmAddedDate, clsCollection prmMyCollection, clsCategory prmMyCategory){
        super(prmOUID, prmName, PrmDescription);
        this.attURL = prmURL;
        this.attCreationDate = prmCreationDate;
        this.attAddedDate = prmAddedDate;
        this.attMyCollection = prmMyCollection;
        this.attMyCategory = prmMyCategory;
    }

    public String opGetURL() {
        return attURL;
    }

    public void opSetURL(String prmURL) {
        this.attURL = prmURL;
    }
    
    public Date opGetCreationDate (){
        return this.attCreationDate;
    }
    
    public void opSetCreationDate (Date prmCreationDate){
        this.attCreationDate = prmCreationDate;
    }
    
    public Date opGetAddedDate (){
        return this.attAddedDate;
    }
    
    public void opSetAddedDate (Date prmAddedDate){
        this.attAddedDate = prmAddedDate;
    }
    
    public clsCollection opGetMyCollection (){
        return this.attMyCollection;
    }
    
    public void opSetMyCollection(clsCollection prmMyCollection){
        this.attMyCollection = prmMyCollection;
    }
    
    public clsCategory opGetMyCategory (){
        return this.attMyCategory;
    }
    
    public void opSetMyCategory(clsCategory prmMyCategory){
        this.attMyCategory = prmMyCategory;
    }
}
