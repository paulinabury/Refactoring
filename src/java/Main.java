public class Main {

    public static void main(String[] args) {
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

        System.out.println(a.statement());
        System.out.println(b.statement());
        System.out.println(c.statement());

    }
}
