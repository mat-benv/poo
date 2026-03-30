package br.univali.poo.lista02;

public class Employee {

    private String firstName;
    private String lastName;
    private String socialSecurityNumber;
    private Date birthDate;

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
    public Date getBirthDate() {
        return birthDate;
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
    public void setBirthDate(int day, int month, int year) {
        this.birthDate = new Date(day, month, year);
    }

    public String toString(){
        return String.format(
                "%s %s\n%s\n%s",
                getFirstName(),
                getLastName(),
                birthDate.toString(),
                getSocialSecurityNumber());
    }
}
