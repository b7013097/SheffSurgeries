package com.rclaydon

class BootStrap {

    def init = { servletContext ->

	def patient1 = new Patient(
	 patientName:'Guojun Chen',
	 patientAddress:'21 Yellow Lane',
	 patientResidence:'21',
	 patientDob:new Date('01/04/2019'),
	 patientID:'1',
	 dateRegistered:new Date('01/04/2019'),
	 patientPhone:'07880353701'
	).save()

	def patient2 = new Patient(
	 patientName:'Daniel Bowns',
	 patientAddress:'43 Brown Road',
	 patientResidence:'43',
	 patientDob:new Date('07/05/1990'),
	 patientID:'2',
	 dateRegistered:new Date('17/08/2018'),
	 patientPhone:'07880353692'
	).save()

	def patient3 = new Patient(
	 patientName:'Miles Waring',
	 patientAddress:'47 Mac Lane',
	 patientResidence:'47',
	 patientDob:new Date('13/06/1992'),
	 patientID:'3',
	 dateRegistered:new Date('15/08/2018'),
	 patientPhone:'07880353723'
	).save()

	def Doctor1 = new Doctor(
	 fullName: 'Josh Daly',
	 qualification: 'PHD',
	 position: 'Doctor',
	 doctorEmail: 'Jdaly@gmail.com',
	 password: 'Daly55',
	 doctorOffice: 'Northern General Hospital',
	 doctorPhone: '07880543687',
	 bio:'Doctor at Northern General Hospital' 
	).save()

	def Doctor2 = new Doctor(
	 fullName: 'Wajid Khan',
	 qualification: 'PHD',
	 position: 'Doctor',
	 doctorEmail: 'Wkhan@gmail.com',
	 password: 'Wajid55',
	 doctorOffice: 'Northern General Hospital',
	 doctorPhone: '07880543854',
	 bio:'Doctor at Northern General Hospital' 
	).save()

	def Nurse1 = new Nurse(
	 nurseName: 'Janet Grey',
	 qualifications: 'Degree',
	 nurseEmail: 'JGrey@gmail.com',
	 nurseOffice: 'Northern General Hospital',
	 nursePhone: 'Nurse at Northern General Hospital'
	).save()

	def Nurse2 = new Nurse(
	 nurseName: 'Riley Red',
	 qualifications: 'Degree',
	 nurseEmail: 'RRed@gmail.com',
	 nurseOffice: 'Northern General Hospital',
	 nursePhone: 'Nurse at Northern General Hospital'
	).save()

	def Appointment1 = new Appointment(
	 appDate: new Date('15/05/19'),
	 appTime: '15:00',
	 appDuration: '2:00:00',
	 roomNumber: '46'
	).save()

	def Appointment2 = new Appointment(
	 appDate: new Date('17/05/19'),
	 appTime: '13:00',
	 appDuration: '2:00:00',
	 roomNumber: '46'
	).save()

	def Appointment3 = new Appointment(
	 appDate: new Date('19/05/19'),
	 appTime: '15:00',
	 appDuration: '3:00:00',
	 roomNumber: '14'
	).save()
	
	def Prescription1 = new Prescription(
	 pharmacyName: 'MedMart',
	 prescripNumber: '455',
	 medicine: 'Paractemol',
	 totalCost: '43.95',
	 dateIssued: new Date('13/06/2019'),
	 patientPaying: 'Y'
	).save()

	def Prescription2 = new Prescription(
	 pharmacyName: 'MedMart',
	 prescripNumber: '654',
	 medicine: 'Paractemol',
	 totalCost: '43.95',
	 dateIssued: new Date('16/06/2019') ,
	 patientPaying: 'Y'
	).save()

	def Receptionist1 = new Receptionist(
	 recepName: 'Main Desk1',
	 recepEmail: 'Help1@gmail.com',
	 recepUsername: 'MainDesk1',
	 recepPassword: 'MainDesk155',
	 recepPhone: '07880457'
	).save()

	def Receptionist2 = new Receptionist(
	 recepName: 'Main Desk2',
	 recepEmail: 'Help2@gmail.com',
	 recepUsername: 'MainDesk2',
	 recepPassword: 'MainDesk255',
	 recepPhone: '07880864'
	).save()

	def Surgery1 = new Surgery(
	 name: 'Surgery1',
	 address: '74 Zoo Lane',
	 postcode: 'S2 7AT',
	 telephone: '07880353567',
	 numberOfPatients: '1',
	 description: 'Surgery1 Specialises in heart surgery',
	 openingTime: '9:00'
	).save()

	def Surgery2 = new Surgery(
	 name: 'Surgery2',
	 address: '201 Bradford Road',
	 postcode: 'S2 7AJ',
	 telephone: '07880353853',
	 numberOfPatients: '1',
	 description: 'Surgery2 Specialises in brain surgery',
	 openingTime: '8:00'
	).save()
    }
    def destroy = {
    }
}
