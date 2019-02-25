/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import org.lasencinas.enzinium.Address;
import org.lasencinas.enzinium.TokenContract;

/**
 *
 * @author mojim
 */
public class AddressTest {
    
    @Test
    public void generate_key_pair_test() {
        Address address = new Address();
        assertNotNull(address);
        address.generateKeyPair();
        assertNotNull(address.getPK());
        assertNotNull(address.getSK());
    }


    @Test
    public void transferEZI_test() {

        Address rick = new Address();
        rick.generateKeyPair();

        rick.addEZI(20d);

        rick.transferEZI(20d);

        assertEquals(40d, rick.getBalance(), 0d);
    }
    
    @Before
    public void init() {

        rick = new Address();
        rick.generateKeyPair();

        morty = new Address();
        morty.generateKeyPair();

        ricknillos = new TokenContract(rick);
        ricknillos.setName("Ricknillos");
        ricknillos.setSymbol("RNiLL");
        ricknillos.setTotalSupply(100d);

        ricknillos.addOwner(rick.getPK(), ricknillos.totalSupply());
        // verifica que Rick no se actualiza una vez que ya existe en el balance
        ricknillos.addOwner(rick.getPK(), 500d);
    }

}

