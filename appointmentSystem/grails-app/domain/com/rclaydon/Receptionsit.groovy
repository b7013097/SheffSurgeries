package com.rclaydon

class Receptionsit {
String recepName;
String recepEmail;
String recepUsername;
String recepPassword;
int recepPhone;
    static constraints = {


recepName nullable: false
recepName blank: false


recepEmail nullable: false
recepEmail blank: false
recepEmail unique: true

recepUsername nullable: false
recepUsername blank: false
recepUsername unique: true

recepPassword nullable: false
recepPassword blank: false


recepPhone nullable: false
recepPhone blank: false
    }
}
