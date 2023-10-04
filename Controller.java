import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<RentalsCustomer> orders = new ArrayList<>();

    public Controller(List<RentalsCustomer> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "Controller{" +
                "orders=" + orders +
                '}';
    }

    public List<RentalsCustomer> getOrders() {
        return orders;
    }

    public void setOrders(List<RentalsCustomer> orders) {
        this.orders = orders;
    }
}
