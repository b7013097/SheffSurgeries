package com.rclaydon

class Surgery {
String name;
String address;
String postcode;
int Telephone;
int numberOfPatients;
String description;
float openingTime;
    static constraints = {


name nullable: false
name blank: false


address nullable: false
address blank: false


postcode nullable: false
postcode blank: false


telephone nullable: false
telephone blank: false


numberOfPatients nullable: false
numberOfPatients blank: false


description nullable: false
description blank: false


openingTime nullable: false
openingTime blank: false
    }
}
