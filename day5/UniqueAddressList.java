package day5;

import java.util.HashSet;

public class UniqueAddressList {
    public static void main(String[] args) {
        
        HashSet<String> addresses = new HashSet<>();

       
        addresses.add("123 Main Street");
        addresses.add("456 Park Avenue");
        addresses.add("789 Lake Road");
        addresses.add("123 Main Street"); 
               System.out.println("Unique Addresses:");
        for (String address : addresses) {
            System.out.println(address);
        }
    }
}
