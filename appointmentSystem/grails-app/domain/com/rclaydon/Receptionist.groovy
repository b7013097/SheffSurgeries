package com.rclaydon

class Receptionist {
String recepName
String recepEmail
String recepUsername
String recepPassword
int recepPhone

static hasMany=[surgeries:Surgery, appointments:Appointment]
static belongsTo=[Surgery]


    static constraints = {
	recepName nullable:true,blank: false;
	recepEmail nullable:true,blank: false;
	recepUsername nullable:true,blank: false;
	recepPassword nullable:true,blank: false;
	recepPhone nullable:false,blank: false;
    }
}
