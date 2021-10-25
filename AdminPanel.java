// Header for the Admin Panel

//function to read file of list of admins (docs/nurses)
/* 
while (each line contains a doctor ID of integers)
  read in integers from files containing doctor ID's
  create a new object with the key doctorID (int) being equal to the read value
close file
*/

// Admin Panel Class creation
/*
LogIn ID - int
Password - int

functions:

IF(LoginID == EnteredUsername && Password == EnteredPasswors) THEN
if True
  print "Login Successful"
Else
  print "Login Failed"

once logged in, using javafx - the admin panel will display the following panes:

display Admin pane which includes:
  nurse tab
  doctor tab
    message button
    upload medical record button
  print button
  and the options menu
