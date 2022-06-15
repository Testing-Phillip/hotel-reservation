package model;

import java.util.regex.Pattern;

public class Customer {
    private final String emailRegex = "^(.+)@(.+).(.+)$";
    private final Pattern pattern = Pattern.compile(emailRegex);
    String firstName;
    String lastName;
    String email;

    public Customer(String firstName, String lastName, String email){
        if(!pattern.matcher(email).matches()){
            throw new IllegalArgumentException("Error, Invalid email");
        }
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    @Override
    public String getEmail() {
        return null;
    }
}
