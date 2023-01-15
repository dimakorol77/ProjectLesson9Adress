package Lesson9Adress;


public class Main {
    public static void main(String[] args) {
        Address address = new Address();

        address.setIndex(85977);
        address.setCountry("Germany");
        address.setCity("Vaterstetten");
        address.setStreet("Fohrenweg");
        address.setHouse("77");
        address.setApartment("7");
        System.out.println("Apartment " + address.getApartment() +" Country " + address.getCountry() + " City " + address.getCity() +
                " Street " + address.getStreet() +" House " + address.getHouse()+" Index " + address.getIndex());


    }

}
