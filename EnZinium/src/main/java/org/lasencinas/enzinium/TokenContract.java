
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
        return this.symbol;
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
        if (units <= 100) {
            balances.put(PK, units);
        }    
    }
    
    public double totalSupply() {
        return getTotalSupply();
    }
    
    public int numOwners() {
        return balances.size();
    }
    
    public Double balanceOf(PublicKey owner) {
        if (balances.get(owner) != null) {
            return this.balances.get(owner);
        }
        else {
            return 0d;
        }
    }
    
    public String symbol() {
        return getSymbol();
    }
    
    public void transfer(PublicKey recipient, Double units) {
        
    }
    
    public void transfer(PublicKey sender, PublicKey recipient, Double units) {
        
    }
    
    public void owners() {
        for (Map.Entry<PublicKey, Double> lista : balances.entrySet()) {
            System.out.print("Owner: "+ lista.getKey().hashCode() + " " + "has" + " " + lista.getValue().hashCode() + " " + symbol);
        }
    }
    
    public int totalTokensSold() {
        return 4;
    }
    
}


