package ec.edu.epn.git.calculator;
import org.junit.*;

import static org.junit.Assert.*;

public class CalculatorTest {
    Calculator c = null;

    @BeforeClass
    public static void setUpClass(){
        System.out.println("SetUpClass()");
    }

    @Before
    public void setUp(){
        c = new Calculator();
        System.out.println("SetUp()");
    }

    @Test
    public void given_two_integers_when_addition_then_ok(){
        assertEquals(6,c.addition(4,2));
        System.out.println("Test 1");
    }

    @Test
    public void given_two_integers_when_subtraction_then_ok(){
        assertEquals(2, c.sustraction(4,2));
        System.out.println("Test 2");
    }

    @Test(expected = ArithmeticException.class)
    public void given_two_integers_when_division_then_ok(){
        assertEquals(3, c.division(6,0));
        System.out.println("Test 3");

    }

    @Test(timeout = 150)
    public void given_two_integers_when_multiplication_then_ok(){
        assertEquals(8, c.multiplication(4,2));
        System.out.println("Test 4");
    }

    @After
    public void tearDown(){
        System.out.println("TearDown()");
        c.setAns(0);
        c = null;
    }

    @AfterClass
    public static void tearDownClass(){
        System.out.println("TearDownClass()");
    }

}