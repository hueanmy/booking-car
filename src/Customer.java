public class Customer {
    public int id;
    public String name;
    public String phone;
    public String email;
    public String address;
    public Customer(){
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getPhone(){
        return phone;
    }
    public String getEmail(){
        return email;
    }
    public String getAddress(){
        return address;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAddress(String address){
        this.address = address;
    }
}
