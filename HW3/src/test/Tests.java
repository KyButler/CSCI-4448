import org.junit.Test;
import static org.junit.Assert.*;

public class StoreAnnouncerTest {

    @Test
    public void testAmnouncer() {
        StoreAnnouncer announcer = new StoreAnnouncer();

        String result = announcer.eventAnnouncment("shut down");

        assertEquals("Hi, this is the Store Announcer. The store has officially shut down.", result);
    }
}

public class PriceFillingDecoratorTest {

    @Test
    public void testPriceFilling() {
        FillingPriceDecorator testFillingPriceDecorator = new FillingPriceDecorator();

        Int result = testFillingPriceDecorator.getPrice(0.25);

        assertEquals(1.0, result);
    }
}

public class PriceSauceDecoratorTest {

    @Test
    public void testPriceFilling() {
        SaucePriceDecorator testSaucePriceDecorator = new SaucePriceDecorator();

        Int result = testSaucePriceDecorator.getPrice(0.5);

        assertEquals(1.0, result);
    }
}

public class PriceToppingsDecoratorTest {

    @Test
    public void testPriceToppings() {
        ToppingsPriceDecorator testToppingsPriceDecorator = new ToppingsPriceDecorator();

        Int result = testToppingsPriceDecorator.getPrice(0.75);

        assertEquals(1.0, result);
    }
}