package com.example.tritypejunittest;

import static org.junit.Assert.*;
import org.junit.Test ;
import java.io.*;
public class TritypeConditionTest {
    @Test
    public void testTriang(){
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(-2,3,0));
        assertEquals(4, tri.Triang(3,-6,2));
    }

}
