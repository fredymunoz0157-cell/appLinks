/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkgServices;

import java.util.ArrayList;

/**
 *
 * @author Acer3
 * @param <T>
 */
public class clsBrokerCrud<T extends clsEntity> {
    private clsBrokerCrud() {
        throw new IllegalStateException("Clase de utilidades, no instanciar");
    }
    
    public interface IIdentificable<T> {
        T opGetOUID();
    }
    
    public static <OUIDType extends Comparable<OUIDType>, ItemType extends IIdentificable<OUIDType>> 
           ItemType opGetItemType(OUIDType prmOUID, ArrayList<ItemType> prmCollection) {
        
        for (ItemType varObj : prmCollection) {
            if (varObj.opGetOUID().compareTo(prmOUID) == 0) {
                return varObj;
            }
        }
        return null;
    }
           
    public static <ItemType> Boolean opAssociateItemTo(ItemType prmItem, ArrayList<ItemType> prmCollection) {
        prmCollection.add(prmItem); // En C# es Add(), en Java es add()
        return true;
    }

    public static <ItemType> Boolean opDisassociateItemTo(ItemType prmItem, ArrayList<ItemType> prmCollection) {
        prmCollection.remove(prmItem);
        return true;
    }
}
