import java.lang.Math;
public class Driver {
    public String id;
    public String  name;
    public String phone;
    public String address;
    public String email;
    public int rate;
    public String driverLocation;
    public Booking free;
    public Car car;

    public Driver(String id, String name, String phone, String address, String email, String driverLocation, Car car) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.address = address;
        this.email = email;
        this.driverLocation = driverLocation;
        this.car = car;
    }

    public int convertLocation(String driverLocation){
        return driverLocation.length();
    }

    public void setFree(Booking free) {
        this.free = free;
    }

    public int getRate(int locationA) {
        return (Math.abs(locationA-convertLocation(driverLocation)));
    }
    public Booking getFree() {
        return free;
    }
}
