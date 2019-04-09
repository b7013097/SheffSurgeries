package com.rclaydon

class Prescription {
String pharmacyName
int prescripNumber
String medicine
float totalCost
Date dateIssued
Boolean patientPaying

static hasMany=[patients:Patient, doctors: Doctor]
static belongsTo=[Doctor]



    static constraints = {
	pharmacyName nullable:true,blank:false;
	prescripNumber nullable:false,blank: false;
	medicine nullable:true,blank: false;
	totalCost nullable:false,blank: false;
	dateIssued nullable:false,blank: false;
	patientPaying nullable:false,blank:false;
    }
}
