<!doctype html>
<html lang="en" class="no-js">
<head>
<asset:stylesheet src="SheffSurgery.css"/>
<title>Sheff Surgeries</title>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>
        <g:layoutTitle default="Grails"/>
    </title>
    <meta name="viewport" content="width=device-width, initial-scale=1"/>
    <asset:link rel="icon" href="favicon.ico" type="image/x-ico"/>

    <asset:stylesheet src="application.css"/>

    <g:layoutHead/>
</head>
<body>
<div id="content" role="main">
<div class="nav">

	<div class="row">
	 	
	<div class="first">
		<button type="button" class="btn btn-success">
			<g:link controller="Nurse" action="create">Nurse</g:link>
	</div>
	<div class="second">
		<button type="button" class="btn btn-success">
			<g:link controller="Doctor" action="create"> Doctor</g:link>

	<div class="third">
		<button type="button" class="btn btn-success">
			<g:link controller="Appointment" action="create"> Appointment</g:link>
		</button>
	</div>
	<div class="fourth">
		<button type="button" class="btn btn-success">
			<g:link controller="Prescription" action="create"> Prescription</g:link>
		</button>
	</div>
	<div class="five">
		<button type="button" class="btn btn-success">
			<g:link controller="Receptionist" action="create"> Receptionist</g:link>
		</button>
	</div>
	<div class="six">
		<button type="button" class="btn btn-success">
			<g:link controller="Patient" action="create"> Patient</g:link>
		</button>
	</div>
	<div class="seven">
		<button type="button" class="btn btn-success">
			<g:link controller="Surgery" action="create"> Surgery</g:link>
		</button>
	</div>
</div>
</div>
<div class="banner">
<h1 align="center">Welcome to Sheff Surgeries</h1>
<g:loginToggle/>
</div>

<g:layoutBody/>
</body>
</html>
