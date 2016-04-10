package com.company;

public class Main {

    public static void main(String[] args) {
	    // write your code here
      final DoSomethingRequest request1 = DoSomethingRequest
        .newBuilder()
        .setFirstName("firstname")
        .setLastName("lastname")
        .build();

      final DoSomethingRequest request2 = DoSomethingRequest
        .newBuilder()
        .setFirstName("firstname")
        .setLastName("lastname")
        .setAddress("address")
        .build();

      final DoSomethingRequest request3 = DoSomethingRequest
        .newBuilder()
        .setFirstName("firstname")
        .setLastName("lastname")
        .setAddress("address")
        .setCountry("country")
        .build();

      final DoSomethingRequest request4 = DoSomethingRequest
        .newBuilder()
        .setFirstName("firstname")
        .setLastName("lastname")
        .setCountry("country")
        .build();

      doSomething(request1);
      doSomething(request2);
      doSomething(request3);
      doSomething(request4);

    }

    public static void doSomething(DoSomethingRequest request) {
      System.out.println(request.getFirstName() + request.getLastName() + request.getAddress() + request.getCountry());
    }
}
