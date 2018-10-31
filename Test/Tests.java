import org.junit.Assert;
import org.junit.Test;

public class Tests {
    @Test
    public void test_2(){
        Item apple = new Item("Green Apple", 2.99);
        apple.setPrice(-0.99);

        Assert.assertEquals(-0.99, apple.price,  0);

    }

    @Test
    public void test_3() {
        Electronics laptop = new Electronics("Laptop", 299.99, "Asus", 2018);

        Assert.assertEquals("Laptop", laptop.name);
        Assert.assertEquals(299.99,laptop.price,  0);
        Assert.assertEquals("Asus", laptop.getModel() );
        Assert.assertEquals(2018, laptop.getYear());

        Assert.assertEquals("Laptop,Asus,2018", laptop.formattedOutput());
    }

    @Test
    public void test_4() {
        Electronics computer = new Electronics();
        computer.setName("Desktop");
        computer.setPrice(399.99);
        computer.setModel("HP");
        computer.setYear(2019);

        Assert.assertEquals("Desktop", computer.getName());
        Assert.assertEquals(399.99, computer.getPrice(), 0);
        Assert.assertEquals("HP", computer.getModel());
        Assert.assertEquals(2019, computer.getYear());

        Assert.assertEquals("Desktop,HP,2019", computer.formattedOutput());
    }

    @Test
    public void test_10() {
        // Not exactly problem 10 but since I can't see what items, I can't reproduce it exactly
        // This test should be sufficient in testing the total quantity and price of cart.
        Cart cart = new Cart();
        cart.add(new Item("Apple", 1000), 1);
        cart.add(new Item("Chicken", 1300), 1);
        cart.add(new Item("Banana", 200), 5);
        cart.add(new Item("Bread", 1030), 1);

        Assert.assertEquals(4330.0, cart.getTotalPrice(), 0);
        Assert.assertEquals(8, cart.getTotalQuantity());
    }
}