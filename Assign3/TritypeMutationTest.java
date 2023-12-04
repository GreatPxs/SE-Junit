package com.example.tritypejunittest;

import static org.junit.Assert.*;
import org.junit.Test ;
 
public class  TritypeMutationTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        //kill MutationOne
        assertEquals(4, tri.Triang(2, 2, 5));
        //kill MutationTwo
        assertEquals(4, tri.Triang(2, 2, 4));
    }

}
