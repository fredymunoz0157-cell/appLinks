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

    private final ArrayList<T> clsListEntity;

    public clsBrokerCrud() {
        clsListEntity = new ArrayList<>();
    }

    public clsBrokerCrud(ArrayList<T> prmClsListEntity) {
        clsListEntity = prmClsListEntity;
    }

    public Boolean opExistEntityWith(String prmOUID) {
        for (int i = 0; i < clsListEntity.size(); i++) {
            if (prmOUID.equals(clsListEntity.get(i).opGetAttOUID())) {
                return true;
            }
        }
        return false;
    }

    public Boolean opAssociateExistEntityWith(T prmEntity) {
        if (prmEntity != null) {
            return false;
        }
        clsListEntity.add(prmEntity);
        return true;
    }
    
    public T opGetEntityWith(String prmOUID){
        for (int i = 0; i < clsListEntity.size(); i++) {
            if (prmOUID.equals(clsListEntity.get(i).opGetAttOUID())) {
                return clsListEntity.get(i);
            }
        }
        return null;
    }
    
    public Boolean opDisassociateExistEntityWith(T prmEntity) {
        if (prmEntity != null) {
            return false;
        }
        clsListEntity.remove(prmEntity);
        return true;
    }
}
