public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer c = new Customer("Paulina");
        Movie m = new Movie("Cosmic oddysey: 2001", 2);
        Rental r = new Rental(m, 2);
        c.addRental(r);

        System.out.println(c.statement());
    }
}
