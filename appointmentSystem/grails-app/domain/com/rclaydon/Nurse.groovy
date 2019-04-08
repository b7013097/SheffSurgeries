package com.rclaydon

class Nurse {
String nurseName
String qualifications
String nurseEmail
String nurseOffice
int nursePhone
    static constraints = {
	nurseName nullable:false;
	qualifications nullable: false;
	nurseEmail nullable:false,blank: false;
	nurseOffice nullable:false,blank: false;
	nursePhone nullable:false,blank: false;
    }
}
