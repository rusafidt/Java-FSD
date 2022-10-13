
import java.awt.Container;
import java.awt.Font;
import java.awt.font.*;
import javax.swing.*;

public class RegistrationForm extends JFrame {

	JLabel message;
	JLabel nameLabel, genderLabel ;
	JTextField nameField;
	JRadioButton genderMale, genderFemale;
	ButtonGroup genderGroup;
	
	JLabel mailIdLabel, mobileNoLabel;
	JTextField MailIdField, mobileNoField;
	
	JLabel programLabel;
	JComboBox<String> programList;
	
	JLabel branchLabel;
	JComboBox<String> branchList;
	
	JButton registerButton;
	Container container;
	
	public RegistrationForm() {
		message = new JLabel("Register New Candidate");
		message.setFont(new Font("Georgia", Font.BOLD, 30));
		
		nameLabel = new JLabel("Name : ");
		nameField = new JTextField();

		genderLabel = new JLabel("Gender");
		genderMale = new JRadioButton("Male");
		genderFemale = new JRadioButton("Female", true);
		genderGroup = new ButtonGroup();
		genderGroup.add(genderMale);
		genderGroup.add(genderFemale);
		
		mailIdLabel = new JLabel ("Mail ID : ");
		MailIdField = new JTextField();
		
		mobileNoLabel = new JLabel ("Mobile No : ");
		mobileNoField = new JTextField();
		
		programLabel = new JLabel("Favorite Food : ");
		programList = new JComboBox<String>();
				programList.addItem("Burger");
				programList.addItem("Pasta");
				programList.addItem("Steak");
				programList.addItem("Biriyani");
				programList.addItem("Fried Rice");

				
		branchLabel = new JLabel("Favourite Sports :  ");
		branchList = new JComboBox<String>();
				branchList.addItem("Football");
				branchList.addItem("Cricket");
				branchList.addItem("Volleyball");
				branchList.addItem("BasketBall");
				branchList.addItem("Hockey");

						
		registerButton = new JButton("Register ");
		
		container = getContentPane();
		container.setLayout(null);
		setBounds();
		addComponents();
		
		}
	
		public void setBounds() {
			message.setBounds(50, 10, 600, 30);
			nameLabel.setBounds(50, 70, 100, 30);
			nameField.setBounds(160, 70 , 200, 30);
			
			genderLabel.setBounds(50, 120, 100, 30);
			genderMale.setBounds(160, 120, 100, 30);
			genderFemale.setBounds(260, 120, 100, 30);
			
			mailIdLabel.setBounds(50, 170, 100, 30);
			MailIdField.setBounds(160, 170,200, 30);
			
			mobileNoLabel.setBounds(50, 220, 100, 30);
	        mobileNoField.setBounds(160, 220, 200, 30);
	 
	        programLabel.setBounds(50, 270, 100, 30);
	        programList.setBounds(160, 270, 200, 30);
	 
	        branchLabel.setBounds(50, 320, 100, 30);
	        branchList.setBounds(160, 320, 200, 30);
	 
	        registerButton.setBounds(300, 400, 100, 30);
	    }
	 
	    public void addComponents() {
	        container.add(message);
	        
	        container.add(nameLabel);
	        container.add(nameField);
	        
	        
	        container.add(genderLabel);
	        container.add(genderMale);
	        container.add(genderFemale);
	        
	        container.add(mailIdLabel);
	        container.add(MailIdField);
	        
	        container.add(mobileNoLabel);
	        container.add(mobileNoField);
	        
	       
	        container.add(programLabel);
	        container.add(programList);
	        
	        container.add(branchLabel);
	        container.add(branchList);
	  
	        container.add(registerButton);
	    }
	 
	    public static void main(String[] args) {
	        RegistrationForm rf = new RegistrationForm();
	        rf.setTitle("Student Register Form");
	        rf.setVisible(true);
	        rf.setBounds(500, 10, 500, 500);
	        rf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        rf.setResizable(true);
	 
	    }
	 
	}


			
	
