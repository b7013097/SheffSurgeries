package com.rclaydon

class Patient {
String patientName
String patientAddress
String patientResidence
Date patientDob
String patientID
Date dateRegistered
String patientPhone

static hasMany=[prescriptions:Prescription, surgeries:Surgery, appointments:Appointment]
static belongsTo=[Surgery]



    static constraints = {
	patientName nullable:true,blank: false;
	patientAddress nullable:true,blank: false;
	patientResidence nullable:true,blank: false;
	patientDob nullable:false,blank: false;
	patientID nullable:true,blank: false;
	dateRegistered nullable:false,blank: false;
	patientPhone nullable:false,blank: false;

    }
}
