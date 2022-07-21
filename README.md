# sb-hub

## Overview
Spring boot hub service.  This is a simple Spring Boot rest service "hub" for various functions.
It uses protobuf for a message schema structure and automatic source generation for messages 
that would be able to be transmitted between services.  This service is more of a skeleton with some functionality 
that can be tested.   

A real world (and maybe future) version would transmit the messages to be recorded to storage by another service.
In this example the "transmission" is done internally.

## Build Requirements
 * Make sure maven v3.6.3 or later is installed
 * Make sure Java 11.0.15 or later is installed
 * Make sure the Protobuf (`protoc`) compiler v3.6.1 or later is installed

## Running
 * Build the application : `mvn clean compile package`
 * Run the application : `mvnw spring-boot:run`

## Testing
 * Connect using your browser to `http://localhost:8080/fibs?seed0=0&seed1=1&iterations=10`
 * Result should look like:

```json
{
  "version": 1,
  "sequence": {
    "version": 1,
    "count": 10,
    "sequence": ["0","1","1","2","3","5","8","13","21","34"]
  },
  "parameters": {
    "version": 1,
    "sequenceSeed1": "1",
    "iterations": 10
  },
  "message": {
    "version": 1,
    "message": "Success"
  }
}
```