import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        /*Create customer*/
        Scanner sr = new Scanner(System.in);
        Random randomId = new Random();
        //enter customer information
        System.out.println("-----------------CREATE CUSTOMER----------------");
        int customer_id = randomId.nextInt();
        System.out.println("Enter name:");
        String name = sr.nextLine();
        System.out.println("Enter phone:");
        String phone = sr.nextLine();
        System.out.println("Enter address:");
        String address = sr.nextLine();
        System.out.println("Enter email:");
        String email = sr.nextLine();

        //show customer information
        Customer customer = new Customer();
        customer.setId(customer_id);
        customer.setName(name);
        customer.setAddress(address);
        customer.setEmail(email);
        customer.setPhone(phone);
        System.out.println("Show customer information:");
        System.out.println("CustomerID:" + " " +  customer.getId());
        System.out.println("CustomerName:" + " " +  customer.getName());
        System.out.println("CustomerAddress:" + " " + customer.getAddress());
        System.out.println("CustomerPhone:" + " " + customer.getPhone());
        System.out.println("CustomerEmail:" + " " + customer.getEmail());

        /*Create list car*/
        Car car1 = new Car("registration1", "12/12/1212", "SH", "29A6242");
        Car car2 = new Car("registration2", "12/12/1212", "Vision", "30B2342");
        Car car3 = new Car("registration3", "12/12/1212", "Lead", "36B2324");

        /*Create list driver*/

        Driver driver1 = new Driver("driver1", "Nguyen Van A", "0392630370", "Nguyen Chi Thanh", "a@gmail.com", "Nguyen Chi Thanh",car1);
        Driver driver2 = new Driver("driver2", "Nguyen Van B", "0892324424", "Nguyen Van Cu", "b@gmail.com", "Nguyen Van Cu",car2);
        Driver driver3 = new Driver("driver3", "Nguyen Van C", "0992630370", "Ho Tung Mau", "c@gmail.com", "Ho Tung Mau",car3);

        /*Create Booking Car*/
        System.out.println("----------START BOOKING CAR-------------------");
        int booking_id = randomId.nextInt();
        System.out.println("Enter Pickup City:");
        String pickup_city = sr.nextLine();
        System.out.println("Enter Pickup Location:");
        String pickup_location = sr.nextLine();
        int locationStart = pickup_location.length();
        System.out.println("Enter Drop Location:");
        String drop_location = sr.nextLine();

        Booking booking = new Booking();
        booking.setBooking_id(booking_id);
        booking.setPickup_city(pickup_city);
        booking.setPickup_location(pickup_location);
        booking.setDrop_location(drop_location);
        booking.setCustomer(customer);

        int rate1 = driver1.getRate(locationStart);
        int rate2 = driver2.getRate(locationStart);
        int rate3 = driver3.getRate(locationStart);
        int rate = rate1;
        if(rate<rate2){
            booking.setDriver(driver2);
        }
        else if(rate<rate3){
            booking.setDriver(driver3);
        }
        else booking.setDriver(driver1);

        /*Completed Booking*/
        System.out.println("Booking car successfully");
        System.out.println(booking.getDriver().name);
        System.out.println(booking.getDriver().id);
        System.out.println(booking.getDriver().car.registrationNo);

        /*Booking information*/
        System.out.println("|-----------------Booking Car Information---------------|");
        System.out.println("|BookingID:" + booking.getBooking_id());
        System.out.println("|Pickup Location: " + " " + booking.getPickup_location());
        System.out.println("|Drop Location: " + " " + booking.getDrop_location());
        System.out.println("|______________________");
        System.out.println("|CUSTOMER'S INFORMATION");
        System.out.println("|______________________");
        System.out.println("|CustomerID:" + " " +  booking.getCustomer().getId());
        System.out.println("|CustomerName:" + " " + booking.getCustomer().getName());
        System.out.println("|CustomerAddress:" + " " + booking.getCustomer().getAddress());
        System.out.println("|CustomerPhone:" + " " + booking.getCustomer().getPhone());
        System.out.println("|CustomerEmail:" + " " + booking.getCustomer().getEmail());
        System.out.println("|____________________");
        System.out.println("|DRIVER'S INFORMATION");
        System.out.println("|____________________");
        System.out.println("|DirverID:" + " " + booking.getDriver().id);
        System.out.println("|DriverName:" + " " + booking.getDriver().name);
        System.out.println("|DriverPhone:" + " " + booking.getDriver().phone);
        System.out.println("|DriverLocation:" + " " + booking.getDriver().driverLocation);
        System.out.println("|__________________");
        System.out.println("|CAR'S INFORMATION:");
        System.out.println("|__________________");
        System.out.println("|CarName:" + " " + booking.getDriver().car.registrationNo);
        System.out.println("|CarModel:" + " " + booking.getDriver().car.model);
        System.out.println("|CarOccupancy:" + " " + booking.getDriver().car.occupancy);
        System.out.println("|-------------------------------------------------------|");
    }
}
