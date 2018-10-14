public class Booking {
    public int booking_id;
    public String pickup_city;
    public String pickup_location;
    public String drop_location;
    public Customer customer;
    public Driver driver;

    public Booking(){};
    public Booking(int booking_id, String pickup_city, String pickup_location, String drop_location, Customer customer, Driver driver){
        this.booking_id = booking_id;
        this.pickup_city = pickup_city;
        this.pickup_location = pickup_location;
        this.drop_location = drop_location;
        this.customer = customer;
        this.driver = driver;
    };

    public void setBooking_id(int booking_id){
        this.booking_id = booking_id;
    }

    public void setPickup_city(String pickup_city) {
        this.pickup_city = pickup_city;
    }

    public void setPickup_location(String pickup_location) {
        this.pickup_location = pickup_location;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }

    public void setDrop_location(String drop_location) {
        this.drop_location = drop_location;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getBooking_id() {
        return booking_id;
    }

    public String getDrop_location() {
        return drop_location;
    }

    public String getPickup_city() {
        return pickup_city;
    }

    public String getPickup_location() {
        return pickup_location;
    }

    public Driver getDriver() {
        return driver;
    }

    public Customer getCustomer() { return customer; }
    public boolean getFree() {
        if(getDriver()==null) return true;
        return false;
    }
}
