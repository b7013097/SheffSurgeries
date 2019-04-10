package com.rclaydon

class Appointment {
Date appDate
String appTime
String appDuration
String roomNumber

static hasMany=[surgery:Surgery, patients:Patient]
static belongsTo=[Patient]

    static constraints = {
	appDate nullable:true, blank:false;
	appTime nullable:true, blank:false;
	appDuration nullable:false, blank:false;
	roomNumber nullable:true, blank:false;
    }
}
