package com.company;

/**
 * Created by Gary Lo on 10/4/2016.
 */
public class DoSomethingRequest {
  private String firstName;
  private String lastName;
  private String address;
  private String country;

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public String getAddress() {
    return address;
  }

  public String getCountry() {
    return country;
  }

  private DoSomethingRequest(String firstName, String lastName, String address, String country){
    this.firstName = firstName;
    this.lastName = lastName;
    this.address = address;
    this.country = country;
  }

  public static DoSomethingRequestBuilder newBuilder(){
    return new DoSomethingRequestBuilder();
  }

  static class DoSomethingRequestBuilder {

    private String firstName;
    private String lastName;
    private String address = "N/A";
    private String country = "HK";

    DoSomethingRequestBuilder(){
    }

    DoSomethingRequestBuilder setFirstName(String firstName){
      this.firstName = firstName;
      return this;
    }

    DoSomethingRequestBuilder setLastName(String lastName){
      this.lastName = lastName;
      return this;
    }

    DoSomethingRequestBuilder setAddress(String address){
      this.address = address;
      return this;
    }

    DoSomethingRequestBuilder setCountry(String country){
      this.country = country;
      return this;
    }

    DoSomethingRequest build(){
      if(this.firstName == null) throw new IllegalArgumentException("Missing firstname");
      if(this.lastName == null) throw new IllegalArgumentException("Missing lastname");
      return new DoSomethingRequest(this.firstName,this.lastName,this.address,this.country);
    }

  }
}
