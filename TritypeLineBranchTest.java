package com.example.tritypejunittest;

import static org.junit.Assert.*;
import org.junit.Test ;
import java.io.*;
public class TritypeLineBranchTest {
    @Test
    public void testTriang() {
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(1, 2, 7));
        assertEquals(1, tri.Triang(2, 3, 4));
        assertEquals(2, tri.Triang(2, 2, 3));
        assertEquals(3, tri.Triang(2, 2, 2));
        assertEquals(4, tri.Triang(0, 2, 7));
        assertEquals(4, tri.Triang(1, 7, 0));
        assertEquals(4, tri.Triang('a', 0, 7));
        assertEquals(4, tri.Triang(1, -1, 3));
        assertEquals(2, tri.Triang(2, 3, 2));
        assertEquals(2, tri.Triang(3, 2, 2));
        assertEquals(4, tri.Triang(2,2, 5));
        assertEquals(4, tri.Triang(' ',1, 3));
        assertEquals(4, tri.Triang(1,' ', 3));
        assertEquals(4, tri.Triang(5,2, 2));
        assertEquals(4, tri.Triang(2,5, 2));
    }
    public void testGetN() {
        Tritype tri = new Tritype();// Create a mock BufferedReader that we can control
        BufferedReader reader = new BufferedReader(new StringReader("5\n"));

        int result = tri.getN();
        assertEquals(5, result);
    }
}
