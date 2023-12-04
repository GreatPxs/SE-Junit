package com.example.tritypejunittest;

import static org.junit.Assert.*;
import org.junit.Test ;
import java.io.*;
public class TritypeDecisionTest {
    @Test
  /*测试以下decision（包含3个condition）
    if (Side1 <= 0 || Side2 <= 0 || Side3 <= 0)
        {
            triOut = 4;
            return (triOut);
        }
     */
    public void testTriang(){
        Tritype tri = new Tritype();
        assertEquals(4, tri.Triang(0,2,3));
        assertEquals(1, tri.Triang(2,3,4));
    }

}
