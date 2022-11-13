package domain;

import java.util.Objects;

public class Address {
    private String country;
    private String street;
    private int buildingNumber;
    private int postalCode;

    public Address() {

    }

    public Address(String country, String street, int buildingNumber, int postalCode) {
        this.country = country;
        this.street = street;
        this.buildingNumber = buildingNumber;
        this.postalCode = postalCode;
    }

    public String getCountry() {                                          //getter for country
        return country;
    }

    public void setCountry(String country) {
        if(country.equals(null)){
            System.out.println("Error");                                       //setter for country
        }
        this.country = country;
    }

    public String getStreet() {                                           //getter for street
        return street;
    }

    public void setStreet(String street) {
        if(street.equals(null)){
            System.out.println("Error, u should write street name:)");    //setter for street
        }
        this.street = street;
    }

    public int getBuildingNumber() {                                      //getter for build num
        return buildingNumber;
    }

    public void setBuildingNumber(int buildingNumber) {                   //setter for build num
        if (buildingNumber <= 0) {
            System.out.println("Incorrect Building Number:(");
        }
        this.buildingNumber = buildingNumber;
    }

    public int getPostalCode() {                                          //getter for postcode
        return postalCode;
    }

    public void setPostalCode(int postalCode) {                            //setter for postcode
        if (postalCode <= 0) {
            System.out.println("Incorrect Postal Code:(");
        }
        this.postalCode = postalCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address adress = (Address) o;
        return buildingNumber == adress.buildingNumber && postalCode == adress.postalCode && Objects.equals(country, adress.country) && Objects.equals(street, adress.street);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country, street, buildingNumber, postalCode);
    }

    @Override
    public String toString() {
        return "Adress{" +
                "country='" + country + '\'' +
                ", street='" + street + '\'' +
                ", buildingNumber=" + buildingNumber +
                ", postalCode=" + postalCode +
                '}';
    }
}

