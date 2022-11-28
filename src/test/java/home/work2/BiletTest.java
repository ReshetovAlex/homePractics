package home.work2;

import static home.work2.Bilet.getBilet;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;


public class BiletTest {

    @Test
    public void getBiletTest() {
        int x = 100100;
        assertTrue(getBilet(x));

    }

    @Test
    public void getBiletTestNegativ() {
        int x = 0;
        assertFalse(getBilet(x));

    }
}

//    private static boolean getResult () {
//        return true;

//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class sumChiselTest {
//
////@BeforeEach
////public void setUp() {
//
//
//   @Test
//  public void sumTest() {
//       int x = 4;
//       int y = 5;
//    int result = 9;
//   assertEquals(result,sumChisel.getsum(x, y));
//
//   }
//
//    @Test
//    public void sumTest2() {
//        int x = 10;
//        int y = 10;
//        int result = 15;
//        assertEquals(result,sumChisel.getsum(x, y));
//
//    }
//}
