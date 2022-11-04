//package practice.practice_6;
//
////import org.junit.Test;
////import static org.junit.Assert.*;
//
//public class Practice_6_Test {
//
//    Practice_6_methods obj = new Practice_6_methods();
//
////    @Test
//    public void doubleChar1() {
//        String actual = obj.doubleChar("-Roman-");
//        String expected = "--RRoommaann--";
////        assertEquals(expected, actual);
//    }
//
////    @Test
//    public void doubleChar2() {
//        String actual = obj.doubleChar("--");
//        String expected = "----";
////        assertEquals(expected, actual);
//    }
//
////    @Test
//    public void doubleChar3() {
//        String actual = obj.doubleChar("Java");
//        String expected = "JJaavvaa";
////        assertEquals(expected, actual);
//    }
//
////    @Test
//    public void sumDigits1() {
//        int actual = obj.sumDigits("1234RASfa");
//        int expected = 10;
////        assertEquals(expected, actual);
//    }
//
////    @Test
//    public void sumDigits2() {
//        int actual = obj.sumDigits("sdgsdgsdgsd");
//        int expected = 0;
////        assertEquals(expected, actual);
////    }
//
//    @Test
//    public void sumDigits3() {
//        int actual = obj.sumDigits("2sdgRASfa");
//        int expected = 2;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void catDog1() {
//        boolean actual = obj.catDog("catdog");
//        boolean expected = true;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void catDog2() {
//        boolean actual = obj.catDog("catdogg");
//        boolean expected = true;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void catDog3() {
//        boolean actual = obj.catDog("caatdogg");
//        boolean expected = false;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void catDog4() {
//        boolean actual = obj.catDog("caatdoggcatcat");
//        boolean expected = false;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void endOther1() {
//        boolean actual = obj.endOther("abc", "abc");
//        boolean expected = true;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void endOther2() {
//        boolean actual = obj.endOther("abc", "sabc");
//        boolean expected = true;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void endOther3() {
//        boolean actual = obj.endOther("sabc", "abc");
//        boolean expected = true;
//        assertEquals(expected, actual);
//    }
//
//    @Test
//    public void endOther4() {
//        boolean actual = obj.endOther("abc213", "abc");
//        boolean expected = false;
//        assertEquals(expected, actual);
//    }
//}