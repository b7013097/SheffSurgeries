package com.rclaydon

class Prescription {
String pharmacyName;
int prescripNumber;
String medicine;
float totalCost;
Date dateIssued;
Boolean patientPaying;
    static constraints = {


pharmacyName nullable: false
pharmacyName blank: false


prescripNumber nullable: false
prescripNumber blank: false


medicine nullable: false
medicine blank: false


totalCost nullable: false
totalCost blank: false


dateIssued nullable: false
dateIssued blank: false


patientPaying nullable: false
patientPaying blank: false
    }
}
