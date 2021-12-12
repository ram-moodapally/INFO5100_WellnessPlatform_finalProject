/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author shwet
 */
public class MfrWorkRequest extends WorkRequest{

    private String mfrMedicine;
    private int mfrQuantity;
    
    public String getMfrMedicine() {
        return mfrMedicine;
    }

    public void setMfrMedicine(String mfrMedicine) {
        this.mfrMedicine = mfrMedicine;
    }

    public int getMfrQuantity() {
        return mfrQuantity;
    }

    public void setMfrQuantity(int mfrQuantity) {
        this.mfrQuantity = mfrQuantity;
    }
  
}
