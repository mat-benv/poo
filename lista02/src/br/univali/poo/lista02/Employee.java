package br.univali.poo.lista02;

public class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName(){
        return this.firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public String getSocialSecurityNumber(){
        return this.socialSecurityNumber;
    }

    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name){
        this.lastName = name;
    }

    public void setSocialSecurityNumber(String ssn){
        this.socialSecurityNumber = ssn;
    }

    public String toString(){
        return String.format(
                "%s %s - %s",
                getFirstName(),
                getLastName(),
                getSocialSecurityNumber());
    }
}
