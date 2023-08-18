package jav;

public class Main {


    public static void main(String[] args) {
//        Address address1 = new Address("Moscow", "Green", 150);
//        Address address2 = new Address("Moscow", "Green", 150);
//        if(address1==address2){
//            System.out.println("Equal");
//        }
        Address address1 = new Address("Moscow", "Green", 150);
        Address address2 = address1;
        if(address1.equals(address2)){
            System.out.println("Equal");
        }
    }
}
