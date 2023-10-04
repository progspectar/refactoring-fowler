import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class RentalsCustomer {

    private Customer customer;
    private List<Rental> rentals = new ArrayList<>();

    public RentalsCustomer(Customer customer, Movie movie, int daysRented) {
        this.customer = customer;
        this.rentals.add(new Rental(movie, daysRented));
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

    @Override
    public String toString() {
        return "RentalsCustomer{" +
                "customer=" + customer +
                ", rentals=" + rentals +
                '}';
    }
}
