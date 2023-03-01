import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestRunner extends Setup {

    @Test(priority = 1, description = "Sum of 2 numbers")
    public void doSum() throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);

        String sum = calcScreen.doSum();
        System.out.println(sum);

        Assert.assertEquals(sum,"14");
    }

    @Test(priority = 2, description = "Sub of 2 numbers")
    public void doSub() throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);

        String sub = calcScreen.doSub();
        System.out.println(sub);

        Assert.assertEquals(sub,"5");

    }

    @Test(priority = 3, description = " Multiply of Result of Sum and Subtraction ")
    public void doMul() throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);

        String mul = calcScreen.doMul();
        System.out.println(mul);

        Assert.assertEquals(mul,"70");

    }

    @Test(priority = 4, description = " Divide the result of multiplication with 10 ")
    public void doDiv() throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);

        String div = calcScreen.doDiv();
        System.out.println(div);

        Assert.assertEquals(div,"7");

    }

    @Test(priority = 5, description = " Solve this series ")
    public void doSeries() throws InterruptedException {
        CalcScreen calcScreen = new CalcScreen(driver);

        String series = calcScreen.doSeries();
        System.out.println(series);

        Assert.assertEquals(series,"260");

    }

    @AfterMethod
    public void clearScreen(){
        CalcScreen calcScreen = new CalcScreen(driver);
        calcScreen.btnClear.click();//clear the digit
    }
}
