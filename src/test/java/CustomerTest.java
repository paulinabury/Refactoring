import org.junit.Assert;
import org.junit.Test;

public class CustomerTest {
    Customer a = new Customer("Jakub");
    Customer b = new Customer("Sylwia");
    Customer c = new Customer("Paulina");

    Movie odyssey = new Movie("Cosmic Oddysey:2001", 0);
    Movie matrix = new Movie("Matrix Incarnation", 1);
    Movie rattatouille = new Movie("Rattatouille", 2);

    Rental rental = new Rental(odyssey, 3);
    Rental rental1 = new Rental(matrix, 2);
    Rental rental2 = new Rental(rattatouille, 4);

    @Test
    public void ShouldBeEqualForOneRent() {
        a.addRental(rental);
        String source = "Rental Record for Jakub\n" +
                "\tCosmic Oddysey:2001\t3.5\n" +
                "Amount owed is 3.5\n" +
                "You earned 1 frequent renter points";
        Assert.assertEquals(source, a.statement());
    }

    @Test
    public void ShouldBeEqualForTwoRents() {
        b.addRental(rental1);
        b.addRental(rental);

        String source2 = "Rental Record for Sylwia\n" +
                "\tMatrix Incarnation\t6.0\n" +
                "\tCosmic Oddysey:2001\t3.5\n" +
                "Amount owed is 9.5\n" +
                "You earned 3 frequent renter points";

        Assert.assertEquals(source2, b.statement());
    }

    @Test
    public void ShouldBeEqualForThreeRents() {
        c.addRental(rental);
        c.addRental(rental1);
        c.addRental(rental2);

        String source3 = "Rental Record for Paulina\n" +
                "\tCosmic Oddysey:2001\t3.5\n" +
                "\tMatrix Incarnation\t6.0\n" +
                "\tRattatouille\t3.0\n" +
                "Amount owed is 12.5\n" +
                "You earned 4 frequent renter points";

        Assert.assertEquals(source3, c.statement());
    }
}
