package com.rclaydon

class Surgery {
String name
String address
String postcode
int telephone
int numberOfPatients
String description
float openingTime

static hasMany=[appointments:Appointment, doctors:Doctor, nurses:Nurse, patients:Patient]
static belongsTo =[Appointment]


    static constraints = {
	name nullable:true, blank: false;
	address nullable:true, blank: false;
	postcode nullable:true, blank: false;
	telephone nullable:true, blank: false;
	numberOfPatients nullable:true, blank: false;
	description nullable:true, blank: false;
	openingTime nullable:true, blank: false;
    }
}
