import org.junit.Assert;
import org.junit.Test;


public class CustomerTest {
    @Test
    public void Test(){
        Customer a = new Customer("Jakub");
        Customer b = new Customer("Sylwia");
        Customer c = new Customer("Paulina");
        Movie odyssey = new Movie("Cosmic Oddysey:2001", 0);
        Movie matrix = new Movie("Matrix Incarnation", 1);
        Movie rattatouille = new Movie("Rattatouille", 2);
        Rental rental = new Rental(odyssey, 3);
        Rental rental1 = new Rental(matrix, 2);
        Rental rental2 = new Rental(rattatouille, 4);

        a.addRental(rental);
        b.addRental(rental1);
        c.addRental(rental2);

        String source1 = "Rental Record for Jakub\n" +
                "\tCosmic Oddysey:2001\t1.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points";
        String source2 = "Rental Record for Sylwia\n" +
                "\tMatrix Incarnation\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points";
        String source3 = "Rental Record for Paulina\n" +
                "\tRattatouille\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points";

        Assert.assertEquals(source1, a.statement());
        Assert.assertEquals(source2, b.statement());
        Assert.assertEquals(source3, c.statement());
    }
}
