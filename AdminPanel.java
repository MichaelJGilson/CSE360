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
*/

//Code which outputs a string to a text box are (for system messages)
public void printTextField(String text) {
    textArea.setText(text);
}

// function which checks if the user trying to access the message pane is authorized or not, if not it will print an error.
public void messageAuth {
  if(adminID instanceof Doctor) {
    mesagePane();
  }
  else {
    String text = "Error: You do not have authorization."
    printTextField(String text)
    }
}

/* once logged in, using javafx - the admin panel will display the following panes:

display Admin pane which includes:
  nurse tab
  doctor tab
    message button
    upload medical record button
  print button
  and the options menu */
