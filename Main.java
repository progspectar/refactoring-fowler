import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Name");
        Movie movie1 = new Movie("movie1", Movie.REGULAR);
        Movie movie2 = new Movie("movie2", Movie.NEW_RELEASE);
        Movie movie3 = new Movie("movie3", Movie.CHILDRENS);
        Rental rental1 = new Rental(movie1, 1);
        customer1.addRental(rental1);
        RentalsCustomer rentalsCustomer1 =
                new RentalsCustomer(customer1, movie1, 1);
        RentalsCustomer rentalsCustomer2 =
                new RentalsCustomer(customer1, movie2, 10);
        List<RentalsCustomer> orders = new ArrayList<>();
        orders.add(rentalsCustomer1);
        orders.add(rentalsCustomer2);
        Controller controller1 = new Controller(orders);
        String invoiceString = customer1.statement();
        System.out.println(invoiceString);
    }
}
