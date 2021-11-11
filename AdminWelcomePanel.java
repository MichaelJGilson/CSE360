package GUIPackage;

import java.lang.*;
import java.util.ArrayList;
import javax.swing.*;
import javax.swing.table.*;


public class AdminWelcomePanel extends JPanel{
    
// Variables declaration
	private JButton Doctor;
	private JButton Nurse;
	private JButton Patient;
    
	private JLabel DoctorDesc;
	private JLabel NurseDesc;
	private JLabel PatientDesc;

	
    //End of variables declaration 
    
    /**
     * Creates new AdminWelcomePanel
     */
    public AdminWelcomePanel() {
	initComponents();
    }
    /**
     * initializes components
     */
	private void initComponents(){
        java.awt.GridBagConstraints gridBagConstraints;

        Doctor = new JButton();
        Nurse = new JButton();
        Patient = new JButton();
        DoctorDesc = new JLabel();
        NurseDesc = new JLabel();
        PatientDesc = new JLabel();

        setLayout(new java.awt.GridBagLayout());

        studentsGoTo.setText("Doctor");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(100, 80, 0, 0);

        instructorsGoTo.setText("Nurse");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 80, 0, 0);

        coursesGoTo.setText("Patient");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 80, 77, 0);

        coursesDesc.setText("Patient Information");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 3;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 32;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(27, 40, 0, 70);


        
        
    }
}
