
package org.lasencinas.enzinium;

import java.security.PrivateKey;
import java.security.PublicKey;
import org.lasencinas.enzinium.GenSig;

public class Address {
    
    //ATRIBUTOS
    private PublicKey PK;
    private PrivateKey SK;
    private Double balance = 0d;
    private String symbol = "EZI";
    
    //CONSTRUCTOR
    public Address(){};
    
    
    //SETTERS & GETTERS
    public void setPK (PublicKey PK) {
        this.PK = PK;
    }
    
    public PublicKey getPK() {
        return this.PK;
    }
    
    public void setSK(PrivateKey SK) {
        this.SK = SK;
    }
    
    public PrivateKey getSK() {
        return this.SK;
    }
        
    public Double getBalance() {
        return balance;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    
    //MÉTODOS
    
    public void generateKeyPair() {
        this.PK = GenSig.generateKeyPair().getPublic();
        this.SK = GenSig.generateKeyPair().getPrivate();
    }
    
    @Override
    public String toString() {
        return "\n" + "PK = " + getPK().hashCode() + "\n" +
                "Balance = " + getBalance() + " " + getSymbol() + "\n";
    } 
    
    
   
}
