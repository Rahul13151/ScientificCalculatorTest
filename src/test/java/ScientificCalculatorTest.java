import ScientificCalculator.ScientificCalculator;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.testng.Assert;
import org.apache.commons.csv.*;
import org.testng.annotations.*;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;


public class ScientificCalculatorTest extends ScientificCalculator {
   public ScientificCalculator calculator;
    @BeforeMethod
    public void setup(){

    }

    @Test(groups = {"basicOperations"},dataProvider = "twoParameterDataProvider",dataProviderClass = CustomDataProvider.class)
    public void  testAddition(double num1,double num2,double expectedResult){
     calculator = new ScientificCalculator();
        double actualResult = calculator.add(num1,num2);
        Assert.assertEquals(actualResult, expectedResult);
    }
    @Test(groups = {"basicOperations"})
    public void testSubtraction(){

    }
    @Test(groups = {"basicOperations"})
    public void testMultiplication(){

    }
    @Test(groups = {"basicOperations"})
    public void testDivision(){
     calculator = new ScientificCalculator();
        System.out.println(calculator.divide(1,3));

    }
    @Test(groups = {"advancedOperations"})
    public void testSquareRoot(){
        System.out.println("Square Root");
    }
    @Test(groups = {"advancedOperations"})
    public void testPower(){
        System.out.println("Square power");
    }
    @Test(groups = {"advancedOperations"})
    public void testSinFunction(){

    }
    @Test(groups = {"advancedOperations"})
    public void testCosFunction(){

    }
    @Test(groups = {"advancedOperations"})
    public void testTanFunction(){

    }
    @Test
    public void testInvalidAddition(){

    }
    @Test
    public void testInvalidDivision(){

    }
    @AfterMethod
    public void tearDown(){
    }

}
