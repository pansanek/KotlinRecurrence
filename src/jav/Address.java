package jav;

import java.util.Objects;

public class Address {
    private String city;
    private String street;
    private int number;

    public Address(String city, String street, int number) {
        this.city = city;
        this.street = street;
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
//    @Override
//    public boolean equals(Object obj){
//        if(hashCode() != obj.hashCode()){
//            return false;
//        }
//        if(obj instanceof Address) {
//            Address address = (Address) obj;
//            return this.city.equals(address.city) && this.street.equals(address.street) && this.number == address.number;
//        }
//        return false;
//    }
//
//    @Override
//    public int hashCode() {
//        return city.hashCode() + street.hashCode() +number;
//    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return number == address.number && Objects.equals(city, address.city) && Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, street, number);
    }
}
