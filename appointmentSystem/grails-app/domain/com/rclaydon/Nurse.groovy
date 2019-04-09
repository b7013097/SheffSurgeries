package com.rclaydon

class Nurse {
String nurseName
String qualifications
String nurseEmail
String nurseOffice
int nursePhone

static hasMany=[patients:Patient, appointments:Appointment, prescriptions:Prescription, surgeries:Surgery]
static belongsTo=[Surgery]


    static constraints = {
	nurseName nullable:true;
	qualifications nullable: true;
	nurseEmail nullable:true,blank: false;
	nurseOffice nullable:true,blank: false;
	nursePhone nullable:false,blank: false;
    }
}
