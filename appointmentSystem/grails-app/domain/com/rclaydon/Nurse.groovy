package com.rclaydon

class Nurse {
String nurseName;
String qualifications;
String nurseEmail;
String nurseOffice;
int nursePhone;
    static constraints = {


nurseName nullable: false
nurseName blank: false


qualifications nullable: false
qualifications blank: false


nurseEmail nullable: false
nurseEmail blank: false
nurseEmail unique: true


nurseOffice nullable: false
nurseOffice blank: false


nursePhone nullable: false
nursePhone blank: false
    }
}
