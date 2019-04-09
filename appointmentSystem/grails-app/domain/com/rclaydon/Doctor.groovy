package com.rclaydon

class Doctor {

String fullName
String qualification
String position
String doctorEmail
String password
String doctorOffice
int doctorPhone
String bio

static hasMany=[patients:Patient, appointments:Appointment, prescriptions:Prescription, surgeries:Surgery]
static belongsTo=[Surgery]


    static constraints = {
	fullName  nullable:true, blank:false
	qualification nullable:true, blank:false
	position nullable:true, blank:false
	doctorEmail nullable:true, blank:false
	password nullable:true, blank:false
	doctorOffice nullable:true, blank:false
	doctorPhone nullable:false, blank:false
	bio nullable:true, blank:false

    }
}
