
package org.lasencinas.enzinium;

import java.security.PublicKey;
import java.util.HashMap;
import java.util.Map;
import org.lasencinas.enzinium.Address;

public class TokenContract {
    
    //ATRIBUTOS
    
    private Map<PublicKey, Double> balances = new HashMap<PublicKey, Double>();
    private String name = null;
    private String symbol = null;
    private double totalSupply = 0d;
    private Address owner;
    
    //CONSTRUCTOR
    
    public TokenContract(Address owner) {
        this.owner = owner;
    }
    
    //Setters & Getters
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
    
    public String getSymbol() {
        return symbol;
    }
    
    public void setTotalSupply(double totalSupply) {
        this.totalSupply = totalSupply;
    }
    
    public double getTotalSupply() {
        return this.totalSupply;
    }
    
    public PublicKey getOwner() {
        return owner.getPK();
    }
    
    public Map<PublicKey, Double> getBalances() {
        return balances;
    }
    
    
    //MÉTODOS
   
    @Override
    public String toString() {
        return "\n" + "name = " + getName() + "\n" +
                "symbol = " + getSymbol() + "\n" +
                "totalSupply = " + getTotalSupply() + "\n" +
                "owner PK = " + getOwner().hashCode();
    }
    
    
    public void addOwner(PublicKey PK, Double units) {
        balances.put(PK, units);
    }
    
    public double totalSupply() {
        return getTotalSupply();
    }
}


