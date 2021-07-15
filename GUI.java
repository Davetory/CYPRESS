import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JRadioButton;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JSeparator;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JCheckBox;



public class GUI {

 private JFrame frame;
 
 //different screens
 private JPanel panelFrontPage;
 private JPanel panelMainPage;
 private JPanel panelRegistrationPage;
 private JPanel panelLoginPage;
 private JPanel panelMembersPage;
 private JPanel panelReportingPage;
 private JPanel panelUserInfoPage;
 private JPanel panelSuggestPage;
 private JPanel panelVotePage;
 
 private JTextField textFieldSecretAnswer;
 private JTextField textFieldSecretQuestion;
 private JTextField textFieldFirstName;
 private JTextField textFieldLastName;
 private JTextField textFieldAddress;
 private JTextField textFieldPhoneFirst3Digits;
 private JTextField textFieldPhoneSecond3Digits;
 private JTextField textFieldPhoneLast4Digits;
 private JTextField textFieldUserName;
 private JTextField textFieldPassword;
 private JTextField textFieldEmail;
 private JTextField textFieldSecretA;
 private JTextField textFieldSecretQ;
 
 private JTextArea textAreaSol;
 
 
 private JTextField textFieldAddressReportingPage;
 private JRadioButton rdbtnUtilityFailures;
 private JRadioButton rdbtnPotholes;
 private JRadioButton rdbtnCityProperty;
 private JRadioButton rdbtnEroded;
 private JRadioButton rdbtnTreeCollapse;
 private JRadioButton rdbtnFlooded;
 private JRadioButton rdbtnMould;
 private JRadioButton rdbtnGarbage;
 
 
 private String userSelection = "";
 private ArrayList<User> users = new ArrayList<User>();
 private User currentUser; 
 private ArrayList<Report> reports = new ArrayList<Report>();
 private String problemReportingPage = "";
 
 private boolean defaultLang = true;
 
 
 //driver
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     GUI window = new GUI();
     window.frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }
 

 //initialize GUI
 public GUI() {
  frame = new JFrame();
  frame.setBounds(600, 300, 691, 444);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  frame.getContentPane().setLayout(new CardLayout(0, 0));
  
  buildFrontPage();
  //buildMainPage();
  //buildRegistrationPage();
  //buildLoginPage();
  //buildReportingPage();
  //buildMembersPage();
  //buildUserInfoPage();
 
 }

 private void buildLoginPage()
 {
  JTextField textFieldPasswordLoginPage;
  JTextField textFieldUserNameLoginPage;
  
  JLabel lblUserName_1;
  JLabel lblPassword_1;
  JButton btnLogin;
  JButton btnCancelLogin;
  JLabel lblNewLabel_5;
  JLabel lblNewLabel_9;
  JLabel lblNewLabel_10;
  JLabel lblNewLabel_11;
  JLabel lblForgotPassword;
  
  
     //---------------------------------UI ELEMENTS--------------------------------------------
  panelLoginPage = new JPanel();
  panelLoginPage.setBackground(SystemColor.info);
  frame.getContentPane().add(panelLoginPage, "name_237643470946600");
  panelLoginPage.setLayout(null);
  
  if (defaultLang)
  {
    lblUserName_1 = new JLabel("Username:");
    lblPassword_1 = new JLabel("Password:");
    btnLogin = new JButton("Login");
    btnCancelLogin = new JButton("Cancel");
    lblNewLabel_5 = new JLabel("City of Toronto");
    lblNewLabel_9 = new JLabel("You are currently at the Cypress login page. By logging into this system you will be able to ");
    lblNewLabel_10 = new JLabel("report a variety of problems that you have witnessed on the streets of Toronto.");
    lblForgotPassword = new JLabel("Forgot Password?");
    
    lblUserName_1.setBounds(141, 161, 92, 17);
    btnLogin.setBounds(191, 246, 89, 23);
    btnCancelLogin.setBounds(372, 246, 89, 23);
    lblNewLabel_5.setBounds(532, 13, 133, 19);
    lblForgotPassword.setBounds(524, 379, 109, 17);
  }
  else
  {
    lblUserName_1 = new JLabel("Nom d'utilisateur:");
    lblPassword_1 = new JLabel("Mot de passe:");
    btnLogin = new JButton("Connexion");
    btnCancelLogin = new JButton("Annuler");
    lblNewLabel_5 = new JLabel("Ville de Toronto");
    lblNewLabel_9 = new JLabel("Vous êtes actuellement sur la page de connexion de Cypress. En vous connectant à ce système,");
    lblNewLabel_10 = new JLabel("vous serez en mesure de signaler une variété de problèmes dont vous avez été témoin dans les");
    lblNewLabel_11 = new JLabel("rues de Toronto.");
    lblForgotPassword = new JLabel("Mot de passe oublié?");
    
    lblUserName_1.setBounds(128, 161, 105, 17);
    btnLogin.setBounds(185, 246, 100, 23);
    btnCancelLogin.setBounds(366, 246, 100, 23);
    lblNewLabel_5.setBounds(525, 13, 150, 19);
    lblNewLabel_11.setBounds(10, 105, 670, 20);
    lblForgotPassword.setBounds(502, 379, 140, 17);
    
    lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 14));
    panelLoginPage.add(lblNewLabel_11);
  }
  
  lblUserName_1.setHorizontalAlignment(SwingConstants.RIGHT);
  lblUserName_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  panelLoginPage.add(lblUserName_1);
  
  lblPassword_1.setHorizontalAlignment(SwingConstants.RIGHT);
  lblPassword_1.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblPassword_1.setBounds(141, 191, 92, 17);
  panelLoginPage.add(lblPassword_1);
  
  textFieldPasswordLoginPage = new JTextField();
  textFieldPasswordLoginPage.setColumns(10);
  textFieldPasswordLoginPage.setBounds(241, 190, 154, 20);
  panelLoginPage.add(textFieldPasswordLoginPage);
  
  textFieldUserNameLoginPage = new JTextField();
  textFieldUserNameLoginPage.setColumns(10);
  textFieldUserNameLoginPage.setBounds(241, 160, 154, 20);
  panelLoginPage.add(textFieldUserNameLoginPage);
  
  btnLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
  panelLoginPage.add(btnLogin);
  
  btnCancelLogin.setFont(new Font("Tahoma", Font.BOLD, 12));
  panelLoginPage.add(btnCancelLogin);
  
  JLabel lblNewLabel_8 = new JLabel("@cypress.on.ca");
  lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 13));
  lblNewLabel_8.setBounds(405, 163, 92, 14);
  panelLoginPage.add(lblNewLabel_8);
  
  JLabel lblNewLabel_4 = new JLabel("CYPRESS");
  lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
  lblNewLabel_4.setBounds(10, 11, 109, 23);
  panelLoginPage.add(lblNewLabel_4);
  
  JSeparator separator = new JSeparator();
  separator.setBounds(10, 43, 655, 2);
  panelLoginPage.add(separator);
  
  lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
  panelLoginPage.add(lblNewLabel_5);
  
  lblNewLabel_9.setHorizontalAlignment(SwingConstants.LEFT);
  lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
  lblNewLabel_9.setBounds(10, 57, 670, 20);
  panelLoginPage.add(lblNewLabel_9);
  
  lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
  lblNewLabel_10.setBounds(10, 81, 670, 20);
  panelLoginPage.add(lblNewLabel_10);
  
  JLabel lblFAQ = new JLabel("FAQ");
  lblFAQ.setHorizontalAlignment(SwingConstants.LEFT);
  lblFAQ.setFont(new Font("Tahoma", Font.BOLD, 11));
  lblFAQ.setBounds(643, 380, 22, 14);
  panelLoginPage.add(lblFAQ);
  
  lblForgotPassword.setFont(new Font("Tahoma", Font.BOLD, 11));
  panelLoginPage.add(lblForgotPassword);
  
  
  //----------------------------------------ACTIONS ON UI-------------------------------------------
  btnLogin.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
    User user = getUserFromUserName(textFieldUserNameLoginPage.getText());
    
    if (user == null || user.getPassword().equals(textFieldPasswordLoginPage.getText()) == false)
    {
      if (defaultLang)
      {
        JOptionPane.showMessageDialog(frame, "Invalid username or password.");
      }
      else
      {
        JOptionPane.showMessageDialog(frame, "Nom d'utilisateur ou mot de passe invalide.");
      }
    }
    else
    {
     currentUser = user;
     if (defaultLang)
     {
       JOptionPane.showMessageDialog(frame, "You are now logged in.");
     }
     else
     {
       JOptionPane.showMessageDialog(frame, "Vous êtes maintenant connecté.");
     }
     panelLoginPage.setVisible(false);
     buildMembersPage();
     panelMembersPage.setVisible(true);
    }
   }
  });
  
  btnCancelLogin.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
    panelLoginPage.setVisible(false);
    buildMainPage();
    panelMainPage.setVisible(true);
   }
  });
  
  lblForgotPassword.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) 
   {
    User user = getUserFromUserName(textFieldUserNameLoginPage.getText());
    if (user == null)
    {
     if (defaultLang)
     {
       JOptionPane.showMessageDialog(frame, "No account exists with that username.", "Error", JOptionPane.WARNING_MESSAGE);
     }
     else
     {
       JOptionPane.showMessageDialog(frame, "Aucun compte n'existe avec ce nom d'utilisateur.", "Erreur", JOptionPane.WARNING_MESSAGE);
     }
    }
    else
    {
     String input;
     if (defaultLang)
     {
       input = JOptionPane.showInputDialog("Answer your secret question: " + user.getSecretQuestion());
     }
     else
     {
       input = JOptionPane.showInputDialog("Répondez à votre question secrète: " + user.getSecretQuestion());
     }
     if (input != null)
     {
      if (user.getSecretAnswer().equals(input))
      {
        if (defaultLang)
        {
          JOptionPane.showMessageDialog(frame, "Your password has been sent to your email registered with this account.");
        }
        else
        {
          JOptionPane.showMessageDialog(frame, "Votre mot de passe a été envoyé à votre adresse e-mail enregistrée avec ce compte.");
        }
      }
      else
      {
        if (defaultLang)
        {
          JOptionPane.showMessageDialog(frame, "Your answer is not correct.", "Error", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
          JOptionPane.showMessageDialog(frame, "Votre réponse n'est pas correcte.", "Erreur", JOptionPane.WARNING_MESSAGE);
        }
      }
     }
    }
   }
  });
  
 }
 
 private void buildFrontPage()
 {
  //----------------------UI ELEMENTS---------------------------------------
  panelFrontPage = new JPanel();
  panelFrontPage.setBackground(SystemColor.info);
  frame.getContentPane().add(panelFrontPage, "name_191015617015100");
  panelFrontPage.setLayout(null);
  
  JLabel lblCypress = new JLabel("CYPRESS");
  lblCypress.setHorizontalAlignment(SwingConstants.CENTER);
  lblCypress.setFont(new Font("Arial", Font.BOLD, 40));
  lblCypress.setBounds(227, 22, 218, 55);
  panelFrontPage.add(lblCypress);
  
  JLabel lblCityOfToronto = new JLabel("City of Toronto");
  lblCityOfToronto.setHorizontalAlignment(SwingConstants.CENTER);
  lblCityOfToronto.setFont(new Font("Times New Roman", Font.BOLD, 26));
  lblCityOfToronto.setBounds(251, 234, 175, 48);
  panelFrontPage.add(lblCityOfToronto);
  
  JButton btnEnglish = new JButton("English");
  btnEnglish.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnEnglish.setBounds(175, 307, 89, 23);
  panelFrontPage.add(btnEnglish);
  
  JButton btnFrench = new JButton("French");
  btnFrench.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnFrench.setBounds(411, 307, 89, 23);
  panelFrontPage.add(btnFrench);
  
  JLabel lblFAQ = new JLabel("FAQ");
  lblFAQ.setFont(new Font("Tahoma", Font.BOLD, 11));
  lblFAQ.setHorizontalAlignment(SwingConstants.LEFT);
  lblFAQ.setBounds(643, 380, 22, 14);
  panelFrontPage.add(lblFAQ);
  
  JLabel lblNewLabel_11 = new JLabel("");
  Image img = new ImageIcon(this.getClass().getResource("/torontologo.JPG")).getImage();
  lblNewLabel_11.setIcon(new ImageIcon(img));
  lblNewLabel_11.setBounds(251, 106, 174, 107);
  panelFrontPage.add(lblNewLabel_11);
  
  
  //---------------------------ACTIONS ON UI--------------------------------------------
  btnEnglish.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    defaultLang = true;
    panelFrontPage.setVisible(false);
    buildMainPage();
    panelMainPage.setVisible(true);
   }
  });
 btnFrench.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    defaultLang = false;
    panelFrontPage.setVisible(false);
    buildMainPage();
    panelMainPage.setVisible(true);
   }
  });
 }
 
 private void buildMainPage()
 {
  //------------------------UI ELEMENTS----------------------------------
  panelMainPage = new JPanel();
  panelMainPage.setBackground(SystemColor.info);
  frame.getContentPane().add(panelMainPage, "name_191018850926500");
  panelMainPage.setLayout(null);
  JLabel lblQuickLinks;
  JRadioButton rdbtnRegister;
  JRadioButton rdbtnLogin;
  JRadioButton rdbtnReportAProblem;
  JRadioButton rdbtnSuggest;
  JRadioButton rdbtnVote;
  JRadioButton rdbtnContactUs;
  JRadioButton rdbtnTellAFriend;
  JButton btnGo;
  JLabel lblNewLabel_5;
  JLabel lblLOGOUT;
  JLabel lblMembersPage;
  JLabel lblNewLabel_6;
  if (defaultLang)
  {
    lblQuickLinks = new JLabel("QUICK LINKS >>");
    rdbtnRegister = new JRadioButton("Register");
    rdbtnLogin = new JRadioButton("Login");
    rdbtnReportAProblem = new JRadioButton("Report a Problem");
    rdbtnSuggest = new JRadioButton("Suggest");
    rdbtnVote = new JRadioButton("Vote");
    rdbtnContactUs = new JRadioButton("Contact Us");
    rdbtnTellAFriend = new JRadioButton("Tell a Friend");
    btnGo = new JButton("GO");
    lblNewLabel_5 = new JLabel("City of Toronto");
    lblLOGOUT = new JLabel("LOGOUT");
    lblMembersPage = new JLabel("MEMBER'S PAGE");
    lblNewLabel_6 = new JLabel("Keeping the streets of our city clean and safe...");
    
    rdbtnContactUs.setBounds(10, 273, 109, 23);
    btnGo.setBounds(120, 333, 55, 23);
    lblNewLabel_5.setBounds(532, 13, 133, 19);
    lblNewLabel_6.setBounds(271, 332, 328, 23);
    lblLOGOUT.setBounds(619, 54, 46, 14);
    lblMembersPage.setBounds(514, 54, 95, 14);
  }
  else {
    lblQuickLinks = new JLabel("LIENS RAPIDES >>");
    rdbtnRegister = new JRadioButton("S’inscrire");
    rdbtnLogin = new JRadioButton("S’identifier");
    rdbtnReportAProblem = new JRadioButton("Signaler un Problème");
    rdbtnSuggest = new JRadioButton("Suggérer");
    rdbtnVote = new JRadioButton("Voter");
    rdbtnContactUs = new JRadioButton("Nous Contacter");
    rdbtnTellAFriend = new JRadioButton("Dire à un ami");
    btnGo = new JButton("ALLER");
    lblNewLabel_5 = new JLabel("Ville de Toronto");
    lblLOGOUT = new JLabel("SE DÉCONNECTER");
    lblMembersPage = new JLabel("ESPACE MEMBRE");
    lblNewLabel_6 = new JLabel("Garder les rues de notre ville propres et sûres...");
    
    rdbtnContactUs.setBounds(10, 273, 130, 23);
    btnGo.setBounds(120, 333, 73, 23);
    lblNewLabel_5.setBounds(520, 13, 150, 19);
    lblNewLabel_6.setBounds(250, 332, 370, 23);
    lblLOGOUT.setBounds(570, 54, 100, 14);
    lblMembersPage.setBounds(460, 54, 95, 14);
  }
  
  lblQuickLinks.setFont(new Font("Tahoma", Font.BOLD, 15));
  lblQuickLinks.setBounds(10, 84, 165, 26);
  panelMainPage.add(lblQuickLinks);
  
  rdbtnRegister.setBackground(SystemColor.info);
  rdbtnRegister.setBounds(10, 117, 109, 23);
  panelMainPage.add(rdbtnRegister);
  
  rdbtnLogin.setBackground(SystemColor.info);
  rdbtnLogin.setBounds(10, 143, 109, 23);
  panelMainPage.add(rdbtnLogin);
  
  rdbtnReportAProblem.setBackground(SystemColor.info);
  rdbtnReportAProblem.setBounds(10, 169, 165, 23);
  panelMainPage.add(rdbtnReportAProblem);
  
  rdbtnSuggest.setBackground(SystemColor.info);
  rdbtnSuggest.setBounds(10, 195, 109, 23);
  panelMainPage.add(rdbtnSuggest);
  
  rdbtnVote.setBackground(SystemColor.info);
  rdbtnVote.setBounds(10, 221, 109, 23);
  panelMainPage.add(rdbtnVote);
  
  JRadioButton rdbtnFAQ = new JRadioButton("FAQ");
  rdbtnFAQ.setBackground(SystemColor.info);
  rdbtnFAQ.setBounds(10, 247, 109, 23);
  panelMainPage.add(rdbtnFAQ);
  
  rdbtnContactUs.setBackground(SystemColor.info);
  panelMainPage.add(rdbtnContactUs);
  
  rdbtnTellAFriend.setBackground(SystemColor.info);
  rdbtnTellAFriend.setBounds(10, 299, 109, 23);
  panelMainPage.add(rdbtnTellAFriend);
  
  ButtonGroup buttonGroup = new ButtonGroup();
  buttonGroup.add(rdbtnRegister);
  buttonGroup.add(rdbtnLogin);
  buttonGroup.add(rdbtnReportAProblem);
  buttonGroup.add(rdbtnSuggest);
  buttonGroup.add(rdbtnVote);
  buttonGroup.add(rdbtnFAQ);
  buttonGroup.add(rdbtnContactUs);
  buttonGroup.add(rdbtnTellAFriend);
  
  btnGo.setFont(new Font("Tahoma", Font.BOLD, 12));
  panelMainPage.add(btnGo);
  
  JLabel lblNewLabel_1 = new JLabel("");
  Image img = new ImageIcon(this.getClass().getResource("/toronto1.JPG")).getImage();
  lblNewLabel_1.setIcon(new ImageIcon(img));
  lblNewLabel_1.setBounds(205, 84, 202, 237);
  panelMainPage.add(lblNewLabel_1);
  
  JLabel lblNewLabel_3 = new JLabel("");
  Image img2 = new ImageIcon(this.getClass().getResource("/toronto2.JPG")).getImage();
  lblNewLabel_3.setIcon(new ImageIcon(img2));
  lblNewLabel_3.setBounds(417, 121, 237, 198);
  panelMainPage.add(lblNewLabel_3);
  
  JLabel lblNewLabel_4 = new JLabel("CYPRESS");
  lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
  lblNewLabel_4.setBounds(10, 11, 109, 23);
  panelMainPage.add(lblNewLabel_4);
  
  lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
  panelMainPage.add(lblNewLabel_5);
  
  lblNewLabel_6.setFont(new Font("Times New Roman", Font.BOLD, 18));
  panelMainPage.add(lblNewLabel_6);
  
  JSeparator separator = new JSeparator();
  separator.setBounds(10, 43, 655, 2);
  panelMainPage.add(separator);
  
  JLabel lblFAQ = new JLabel("FAQ");
  lblFAQ.setHorizontalAlignment(SwingConstants.LEFT);
  lblFAQ.setFont(new Font("Tahoma", Font.BOLD, 11));
  lblFAQ.setBounds(643, 380, 22, 14);
  panelMainPage.add(lblFAQ);
  
  lblLOGOUT.setFont(new Font("Tahoma", Font.BOLD, 11));
  panelMainPage.add(lblLOGOUT);
  
  lblMembersPage.setHorizontalAlignment(SwingConstants.LEFT);
  lblMembersPage.setFont(new Font("Tahoma", Font.BOLD, 11));
  panelMainPage.add(lblMembersPage);
  
  
  //---------------------------ACTIONS ON UI--------------------------------
  rdbtnRegister.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    userSelection = "Register";
   }
  });
  
  rdbtnLogin.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    userSelection = "Login";
   }
  });
  
  rdbtnReportAProblem.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    userSelection = "Report a Problem";
   }
  });
  
  rdbtnSuggest.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    userSelection = "Suggest";
   }
  });
  
  rdbtnVote.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    userSelection = "Vote";
   }
  });
  
  rdbtnFAQ.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    userSelection = "FAQ";
   }
  });
  
  rdbtnContactUs.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    userSelection = "Contact Us";
   }
  });
  
  rdbtnTellAFriend.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    userSelection = "Tell a Friend";
   }
  });
  
  btnGo.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    switch(userSelection)
    {
        case "Register": 
         userSelection = "";
         panelMainPage.setVisible(false);
         buildRegistrationPage();
         panelRegistrationPage.setVisible(true);
         break;
         
         case "Login":
          userSelection = "";
         panelMainPage.setVisible(false);
         buildLoginPage();
         panelLoginPage.setVisible(true);
         break;
         
        case "Report a Problem":
         if (currentUser != null)
         {
          userSelection = "";
          panelMainPage.setVisible(false);
          buildReportingPage("MainPage", false, null);
          panelReportingPage.setVisible(true);
         }
         else
         {
          if (defaultLang)
            JOptionPane.showMessageDialog(frame, "Please log in.", "Error", JOptionPane.WARNING_MESSAGE);
          else
            JOptionPane.showMessageDialog(frame, "Veuillez vous connecter.", "Erreur", JOptionPane.WARNING_MESSAGE);
         }
         break;
     
        case "Suggest":
          userSelection = "";
          if (currentUser == null)
          {
            if (defaultLang)
            JOptionPane.showMessageDialog(frame, "Please log in.", "Error", JOptionPane.WARNING_MESSAGE);
          else
            JOptionPane.showMessageDialog(frame, "Veuillez vous connecter.", "Erreur", JOptionPane.WARNING_MESSAGE);
          }
          else if (reports.size() == 0) 
          {
            if (defaultLang)
              JOptionPane.showMessageDialog(frame, "We have not received any reports.", "Error", JOptionPane.WARNING_MESSAGE);
            else
              JOptionPane.showMessageDialog(frame, "Nous n'avons reçu aucun rapport.", "Erreur", JOptionPane.WARNING_MESSAGE);
          }
          else
          { 
            Object[] options = reports.toArray();
            
            Report selection;
            if (defaultLang)
              selection = (Report) JOptionPane.showInputDialog(frame, "Select a report to suggest a solution:", "Report solution", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            else
              selection = (Report) JOptionPane.showInputDialog(frame, "Sélectionnez un rapport pour suggérer une solution:", "Solution de rapport", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            
            if (selection != null) 
            {
              panelMainPage.setVisible(false);
              buildSuggestPage(selection);
              panelSuggestPage.setVisible(true);
            }
          }
          break;
           
        case "Vote":
          userSelection = "";
          if (currentUser == null)
          {
            if (defaultLang)
              JOptionPane.showMessageDialog(frame, "Please log in.", "Error", JOptionPane.WARNING_MESSAGE);
            else
              JOptionPane.showMessageDialog(frame, "Veuillez vous connecter.", "Erreur", JOptionPane.WARNING_MESSAGE);
          }
          else if (reports.size() == 0)
          {
            if (defaultLang)
              JOptionPane.showMessageDialog(frame, "We have not received any reports.", "Error", JOptionPane.WARNING_MESSAGE);
            else
              JOptionPane.showMessageDialog(frame, "Nous n'avons reçu aucun rapport.", "Erreur", JOptionPane.WARNING_MESSAGE);
          }
          else 
          { 
            Object[] options = reports.toArray();
            
            Report selection;
            if (defaultLang)
              selection = (Report) JOptionPane.showInputDialog(frame, "Select a report to view the solutions:", "Vote", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            else
              selection = (Report) JOptionPane.showInputDialog(frame, "Sélectionnez un rapport pour afficher les solutions:", "Voter", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            
            if (selection != null) 
            {
              if (selection.getSizeSol() == 0)
              {
                if (defaultLang)
                  JOptionPane.showMessageDialog(frame, "We have not received any solutions for this report. Please suggest first!", "Error", JOptionPane.WARNING_MESSAGE);
                else
                  JOptionPane.showMessageDialog(frame, "Nous n'avons reçu aucune solution pour ce rapport. Veuillez d'abord suggérer!", "Erreur", JOptionPane.WARNING_MESSAGE);
              }
              else
              {
                panelMainPage.setVisible(false);
                buildVotePage(selection, 0);
                panelVotePage.setVisible(true);
              }
            }
          }
          break;
        case "FAQ":
          break;
        case "Contact Us":
         Object[] officials = {"Warren Peace", "Orson Carte", "Teo Revaz"};
         String cityOfficial = (String) JOptionPane.showInputDialog(frame, "Choose a city official:", "Contact Us", JOptionPane.PLAIN_MESSAGE, null, officials, officials[0]);
         
         if (cityOfficial != null)
         {
          switch (cityOfficial)
          {
          case "Warren Peace":
           JOptionPane.showMessageDialog(frame, "Warren Peace \n" + "123-456-7890 \n" + "123 Street Ave \n" + "Mon-Fri 1PM to 3PM");
           break;
          case "Orson Carte":
           JOptionPane.showMessageDialog(frame, "Orson Carte \n" + "345-456-7890 \n" + "345 Street Ave \n" + "Mon-Fri 1PM to 3PM");
           break;
          case "Teo Revaz":
           JOptionPane.showMessageDialog(frame, "Teo Revaz \n" + "678-456-7890 \n" + "567 Street Ave \n" + "Mon-Fri 1PM to 3PM");
           break;
          }
         }
         break;
        case "Tell a Friend":
         if (currentUser == null)
          if (defaultLang)
              JOptionPane.showMessageDialog(frame, "You must be logged in to tell a friend.", "Error", JOptionPane.WARNING_MESSAGE);
          else
              JOptionPane.showMessageDialog(frame, "Vous devez être connecté pour le dire à un ami.", "Erreur", JOptionPane.WARNING_MESSAGE);
         else
         {
             String email;
             if (defaultLang)
               email = JOptionPane.showInputDialog("Enter your friend's email:");
             else
               email = JOptionPane.showInputDialog("Entrez l'email de votre ami:");
             
             if (email != null && email != "")
             {
               int addPersonalMessage;
               if (defaultLang)
                 addPersonalMessage = JOptionPane.showConfirmDialog(null, "Would you like to add a message?", "", JOptionPane.YES_NO_OPTION);
               else
                 addPersonalMessage = JOptionPane.showConfirmDialog(null, "Souhaitez-vous ajouter un message?", "", JOptionPane.YES_NO_OPTION);
               
               if (addPersonalMessage == 1) //no
               {
                 if (defaultLang)
                   JOptionPane.showMessageDialog(frame, "Default Cypress recommendation email sent to " + email);
                 else
                   JOptionPane.showMessageDialog(frame, "E-mail de recommandation Cypress par défaut envoyé à " + email);
               //send email with default message
               }
               else if (addPersonalMessage == 0) //yes
               {
                 String message;
                 if (defaultLang)
                   message = JOptionPane.showInputDialog("Enter your message:");
                 else
                   message = JOptionPane.showInputDialog("Entrez votre message:");
                 if (defaultLang)
                   JOptionPane.showMessageDialog(frame, "Your recommendation email has been sent to " + email);
                 else
                   JOptionPane.showMessageDialog(frame, "Votre e-mail de recommandation a été envoyé à " + email);
                 //send email with message
               }
             }
         }
         break;
     
    }
   }
  });
  
  lblLOGOUT.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) 
   {
    if (currentUser == null)
    {
      panelMainPage.setVisible(false);
      buildFrontPage();
      panelFrontPage.setVisible(true);
    }
    else
    {
     logout(panelMainPage);
    }
   }
  });
  
  lblMembersPage.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) 
   {
    if (currentUser != null)
    {
     panelMainPage.setVisible(false);
     buildMembersPage();
     panelMembersPage.setVisible(true);
    }
    else
    {
      if (defaultLang)
        JOptionPane.showMessageDialog(frame, "You are not logged in.", "Error", JOptionPane.WARNING_MESSAGE);
      else
        JOptionPane.showMessageDialog(frame, "Vous n'êtes pas connecté.", "Erreur", JOptionPane.WARNING_MESSAGE);
    }
   }
  });
  
 }

 private void buildRegistrationPage()
 {
  JTextField textFieldFirstName;
  JTextField textFieldLastName;
  JTextField textFieldAddress;
  JTextField textFieldPhoneFirst3Digits;
  JTextField textFieldPhoneSecond3Digits;
  JTextField textFieldPhoneLast4Digits;
  JTextField textFieldEmail;
  JTextField textFieldUserName;
  JTextField textFieldPassword;
  
  JLabel lblPleaseEnterInformationBelow;
  JLabel lblFirstName;
  JLabel lblLastName;
  JLabel lblAddress;
  JLabel lblPhoneNumber;
  JLabel lblUserName;
  JLabel lblPassword;
  JCheckBox chckbxAgreement;
  JButton btnRegister;
  JButton btnCancel;
  JLabel lblSecretQuestion;
  JLabel lblSecretQuestionsAnswer;
  JLabel lblNewLabel_5;
  
  
  
  
  
  //------------------------------UI ELEMENTS-----------------------------------------------------------
  panelRegistrationPage = new JPanel();
  panelRegistrationPage.setBackground(SystemColor.info);
  frame.getContentPane().add(panelRegistrationPage, "name_191021366737200");
  panelRegistrationPage.setLayout(null);
  
  if (defaultLang)
  {
    lblPleaseEnterInformationBelow = new JLabel("Please Enter Information Below:");
    lblFirstName = new JLabel("First Name:");
    lblLastName = new JLabel("Last Name:");
    lblAddress = new JLabel("Address:");
    lblPhoneNumber = new JLabel("Phone Number:");
    lblUserName = new JLabel("Username:");
    lblPassword = new JLabel("Password:");
    chckbxAgreement = new JCheckBox("I agree to the terms and conditions of this site outlined at www.cypress.ca/terms-and-conditions", false);
    btnRegister = new JButton("Register");
    btnCancel = new JButton("Cancel");
    lblSecretQuestion = new JLabel("Secret Question:");
    lblSecretQuestionsAnswer = new JLabel("Secret Question's Answer:");
    lblNewLabel_5 = new JLabel("City of Toronto");
    
    lblPleaseEnterInformationBelow.setBounds(10, 54, 307, 20);
    lblPhoneNumber.setBounds(84, 169, 120, 17);
    lblUserName.setBounds(112, 227, 92, 17);
    lblNewLabel_5.setBounds(532, 13, 133, 19);
  }
  else 
  {
    lblPleaseEnterInformationBelow = new JLabel("Veuillez saisir les informations ci-dessous:");
    lblFirstName = new JLabel("Prénom:");
    lblLastName = new JLabel("Nom de famille:");
    lblAddress = new JLabel("Adresse:");
    lblPhoneNumber = new JLabel("Numéro de téléphone:");
    lblUserName = new JLabel("Nom d'utilisateur:");
    lblPassword = new JLabel("Mot de passe:");
    chckbxAgreement = new JCheckBox("J'accepte les conditions générales de ce site décrites à www.cypress.ca/terms-and-conditions", false);
    btnRegister = new JButton("S'inscrire");
    btnCancel = new JButton("Annuler");
    lblSecretQuestion = new JLabel("Question secrète:");
    lblSecretQuestionsAnswer = new JLabel("Sa réponse:");
    lblNewLabel_5 = new JLabel("Ville de Toronto");
    
    lblPleaseEnterInformationBelow.setBounds(10, 54, 375, 20);
    lblPhoneNumber.setBounds(80, 169, 125, 17);
    lblUserName.setBounds(105, 227, 100, 17);
    lblNewLabel_5.setBounds(520, 13, 150, 19);
  }
  
  lblPleaseEnterInformationBelow.setFont(new Font("Times New Roman", Font.BOLD, 18));
  panelRegistrationPage.add(lblPleaseEnterInformationBelow);
  
  lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
  lblFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblFirstName.setBounds(112, 85, 92, 17);
  panelRegistrationPage.add(lblFirstName);
  
  textFieldFirstName = new JTextField();
  textFieldFirstName.setColumns(10);
  textFieldFirstName.setBounds(214, 84, 154, 20);
  panelRegistrationPage.add(textFieldFirstName);
  
  lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
  lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblLastName.setBounds(112, 113, 92, 17);
  panelRegistrationPage.add(lblLastName);
  
  textFieldLastName = new JTextField();
  textFieldLastName.setColumns(10);
  textFieldLastName.setBounds(214, 112, 154, 20);
  panelRegistrationPage.add(textFieldLastName);
  
  lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
  lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblAddress.setBounds(112, 141, 92, 17);
  panelRegistrationPage.add(lblAddress);
  
  textFieldAddress = new JTextField();
  textFieldAddress.setColumns(10);
  textFieldAddress.setBounds(214, 140, 418, 20);
  panelRegistrationPage.add(textFieldAddress);
  
  lblPhoneNumber.setHorizontalAlignment(SwingConstants.RIGHT);
  lblPhoneNumber.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  panelRegistrationPage.add(lblPhoneNumber);
  
  textFieldPhoneFirst3Digits = new JTextField();
  textFieldPhoneFirst3Digits.setColumns(10);
  textFieldPhoneFirst3Digits.setBounds(214, 168, 55, 20);
  panelRegistrationPage.add(textFieldPhoneFirst3Digits);
  
  textFieldPhoneSecond3Digits = new JTextField();
  textFieldPhoneSecond3Digits.setColumns(10);
  textFieldPhoneSecond3Digits.setBounds(293, 168, 55, 20);
  panelRegistrationPage.add(textFieldPhoneSecond3Digits);
  
  textFieldPhoneLast4Digits = new JTextField();
  textFieldPhoneLast4Digits.setColumns(10);
  textFieldPhoneLast4Digits.setBounds(373, 168, 55, 20);
  panelRegistrationPage.add(textFieldPhoneLast4Digits);
  
  textFieldUserName = new JTextField();
  textFieldUserName.setColumns(10);
  textFieldUserName.setBounds(214, 226, 154, 20);
  panelRegistrationPage.add(textFieldUserName);
  
  textFieldPassword = new JTextField();
  textFieldPassword.setColumns(10);
  textFieldPassword.setBounds(214, 256, 154, 20);
  panelRegistrationPage.add(textFieldPassword);
  
  textFieldEmail = new JTextField();
  textFieldEmail.setColumns(10);
  textFieldEmail.setBounds(214, 197, 154, 20);
  panelRegistrationPage.add(textFieldEmail);
  
  JLabel lblEmail = new JLabel("Email:");
  lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
  lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblEmail.setBounds(112, 198, 92, 17);
  panelRegistrationPage.add(lblEmail);
  
  lblUserName.setHorizontalAlignment(SwingConstants.RIGHT);
  lblUserName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  panelRegistrationPage.add(lblUserName);
  
  lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
  lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblPassword.setBounds(112, 257, 92, 17);
  panelRegistrationPage.add(lblPassword);
  
  chckbxAgreement.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  chckbxAgreement.setBackground(SystemColor.info);
  chckbxAgreement.setBounds(64, 345, 581, 23);
  panelRegistrationPage.add(chckbxAgreement);
  
  btnRegister.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnRegister.setBounds(159, 375, 89, 23);
  panelRegistrationPage.add(btnRegister);
  
  btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnCancel.setBounds(410, 375, 89, 23);
  panelRegistrationPage.add(btnCancel);
  
  textFieldSecretAnswer = new JTextField();
  textFieldSecretAnswer.setBounds(214, 318, 383, 20);
  panelRegistrationPage.add(textFieldSecretAnswer);
  textFieldSecretAnswer.setColumns(10);
  
  textFieldSecretQuestion = new JTextField();
  textFieldSecretQuestion.setColumns(10);
  textFieldSecretQuestion.setBounds(214, 287, 383, 20);
  panelRegistrationPage.add(textFieldSecretQuestion);
  
  lblSecretQuestion.setHorizontalAlignment(SwingConstants.RIGHT);
  lblSecretQuestion.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblSecretQuestion.setBounds(84, 290, 120, 17);
  panelRegistrationPage.add(lblSecretQuestion);
  
  lblSecretQuestionsAnswer.setHorizontalAlignment(SwingConstants.RIGHT);
  lblSecretQuestionsAnswer.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblSecretQuestionsAnswer.setBounds(10, 321, 194, 17);
  panelRegistrationPage.add(lblSecretQuestionsAnswer);
  
  JLabel lblNewLabel_7 = new JLabel("-");
  lblNewLabel_7.setBounds(279, 171, 46, 14);
  panelRegistrationPage.add(lblNewLabel_7);
  
  JLabel lblNewLabel_7_1 = new JLabel("-");
  lblNewLabel_7_1.setBounds(358, 171, 15, 14);
  panelRegistrationPage.add(lblNewLabel_7_1);
  
  JLabel lblNewLabel_8 = new JLabel("@cypress.on.ca");
  lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 13));
  lblNewLabel_8.setBounds(373, 229, 92, 14);
  panelRegistrationPage.add(lblNewLabel_8);
  
  JSeparator separator = new JSeparator();
  separator.setBounds(10, 43, 655, 2);
  panelRegistrationPage.add(separator);
  
  JLabel lblNewLabel_4 = new JLabel("CYPRESS");
  lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
  lblNewLabel_4.setBounds(10, 11, 109, 23);
  panelRegistrationPage.add(lblNewLabel_4);
  
  lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
  panelRegistrationPage.add(lblNewLabel_5);
  
  JLabel lblFAQ = new JLabel("FAQ");
  lblFAQ.setHorizontalAlignment(SwingConstants.LEFT);
  lblFAQ.setFont(new Font("Tahoma", Font.BOLD, 11));
  lblFAQ.setBounds(643, 380, 22, 14);
  panelRegistrationPage.add(lblFAQ);
  
  
  //--------------------------------------------------ACTIONS ON UI---------------------------------------------------------------------
  btnRegister.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e)              
   {
     //any empty fields
     if (textFieldFirstName.getText().equals("") || textFieldLastName.getText().equals("") || textFieldAddress.getText().equals("") || textFieldPhoneFirst3Digits.getText().equals("") || textFieldPhoneSecond3Digits.getText().equals("") || textFieldPhoneLast4Digits.getText().equals("") || textFieldEmail.getText().equals("") || textFieldUserName.getText().equals("") || textFieldPassword.getText().equals("") || textFieldSecretQuestion.getText().equals("") || textFieldSecretAnswer.getText().equals(""))
     {
       if (defaultLang)
       {
         JOptionPane.showMessageDialog(frame, "One or more empty fields.", "Error", JOptionPane.WARNING_MESSAGE);
       }
       else
       {
         JOptionPane.showMessageDialog(frame, "Un ou plusieurs champs vides.", "Erreur", JOptionPane.WARNING_MESSAGE);
       }
     }
     else if (chckbxAgreement.isSelected() == false)
     {
       if (defaultLang)
       {
         JOptionPane.showMessageDialog(frame, "You must agree to the terms and conditions of this site.", "Error", JOptionPane.WARNING_MESSAGE);
       }
       else
       {
         JOptionPane.showMessageDialog(frame, "Vous devez accepter les termes et conditions de ce site.", "Erreur", JOptionPane.WARNING_MESSAGE);
       }
     }
     //username already taken
     else if (getUserFromUserName(textFieldUserName.getText()) != null)
     {
       if (defaultLang)
       {
         JOptionPane.showMessageDialog(frame, "Username already taken.", "Error", JOptionPane.WARNING_MESSAGE);
       }
       else
       {
         JOptionPane.showMessageDialog(frame, "Nom d'utilisateur déjà pris.", "Erreur", JOptionPane.WARNING_MESSAGE);
       }
     }
     //password weak
     else if (textFieldPassword.getText().length() < 5 || textFieldPassword.getText().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$") == false)
     {
       if (defaultLang)
       {
         JOptionPane.showMessageDialog(frame, "Password must: contain atleast 5 characters, contain atleast 1 Upper and Lower case letter, and atleast 1 number.", "Error", JOptionPane.WARNING_MESSAGE);
       }
       else
       {
         JOptionPane.showMessageDialog(frame, "Le mot de passe doit contenir au moins 5 caractères, au moins 1 lettre majuscule et minuscule et au moins 1 chiffre.", "Erreur", JOptionPane.WARNING_MESSAGE);
       }
     }
     //invalid phone number
     else if (textFieldPhoneFirst3Digits.getText().length() != 3 || textFieldPhoneFirst3Digits.getText().matches("[0-9]+") == false || textFieldPhoneSecond3Digits.getText().length() != 3 || textFieldPhoneSecond3Digits.getText().matches("[0-9]+") == false || textFieldPhoneLast4Digits.getText().length() != 4 || textFieldPhoneLast4Digits.getText().matches("[0-9]+") == false)
     {
       if (defaultLang)
       {
         JOptionPane.showMessageDialog(frame, "Invalid Phone Number.", "Error", JOptionPane.WARNING_MESSAGE);
       }
       else
       {
         JOptionPane.showMessageDialog(frame, "Numéro de téléphone invalide.", "Erreur", JOptionPane.WARNING_MESSAGE);
       }
     }
     //phone number already registered
     else if (phoneNumberAlreadyExists(textFieldPhoneFirst3Digits.getText() + textFieldPhoneSecond3Digits.getText() + textFieldPhoneLast4Digits.getText()) == true)
     {
       if (defaultLang)
       {
         JOptionPane.showMessageDialog(frame, "Phone number already registered to another account.", "Error", JOptionPane.WARNING_MESSAGE);
       }
       else
       {
         JOptionPane.showMessageDialog(frame, "Numéro de téléphone déjà enregistré sur un autre compte.", "Erreur", JOptionPane.WARNING_MESSAGE);
       }
     }
     //everything valid
     else
     { 
       User user = new User(textFieldFirstName.getText(), textFieldLastName.getText(), textFieldAddress.getText(), (textFieldPhoneFirst3Digits.getText() + textFieldPhoneSecond3Digits.getText() + textFieldPhoneLast4Digits.getText()), textFieldEmail.getText(), textFieldUserName.getText(), textFieldPassword.getText(), textFieldSecretQuestion.getText(), textFieldSecretAnswer.getText());
       users.add(user);
       currentUser = user;
       
       if (defaultLang)
       {
         JOptionPane.showMessageDialog(frame, "You are now registered.");
       }
       else
       {
         JOptionPane.showMessageDialog(frame, "Vous êtes maintenant inscrit.");
       }
       panelRegistrationPage.setVisible(false);
       buildMembersPage();
       panelMembersPage.setVisible(true);
      }
    }
  });
  
  btnCancel.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
    panelRegistrationPage.setVisible(false);
    buildMainPage();
    panelMainPage.setVisible(true);
   }
  });
  
  

 }
 
 public void buildMembersPage()
 {
  panelMembersPage = new JPanel();
  panelMembersPage.setBackground(SystemColor.info);
  frame.getContentPane().add(panelMembersPage, "name_247267970072000");
  panelMembersPage.setLayout(null);
  
  JLabel lblMember;
  JButton btnEditProfile;
  JButton btnDeleteProfile;
  JButton btnCreateReport;
  JButton btnEditReport;
  JButton btnDeleteReport;
  JLabel lblMAINPAGE;
  JButton btnTakeSurvey;
  JLabel lblNewLabel_5;
  JLabel lblLOGOUT;
    
  if (defaultLang)
  {
    lblMember = new JLabel("MEMBER'S AREA");
    btnEditProfile = new JButton("Edit Profile");
    btnDeleteProfile = new JButton("Delete Profile");
    btnCreateReport = new JButton("Create a Report");
    btnEditReport = new JButton("Edit a Report");
    btnDeleteReport = new JButton("Delete a Report");
    lblMAINPAGE = new JLabel("MAIN PAGE");
    btnTakeSurvey = new JButton("Take Survey");
    lblNewLabel_5 = new JLabel("City of Toronto");
    lblLOGOUT = new JLabel("LOGOUT");
    
    lblMAINPAGE.setBounds(538, 52, 71, 14);
    lblNewLabel_5.setBounds(532, 13, 133, 19);
    lblLOGOUT.setBounds(619, 52, 46, 14);
  }
  else
  {
    lblMember = new JLabel("ESPACE MEMBRE");
    btnEditProfile = new JButton("Editer le profil");
    btnDeleteProfile = new JButton("Supprimer le profil");
    btnCreateReport = new JButton("Creer un rapport");
    btnEditReport = new JButton("Modifier un rapport");
    btnDeleteReport = new JButton("Supprimer un rapport");
    lblMAINPAGE = new JLabel("PAGE D'ACCUEIL'");
    btnTakeSurvey = new JButton("Participer à l'enquête");
    lblNewLabel_5 = new JLabel("Ville de Toronto");
    lblLOGOUT = new JLabel("SE DÉCONNECTER");
    
    lblMAINPAGE.setBounds(450, 54, 95, 14);
    lblNewLabel_5.setBounds(520, 13, 150, 19);
    lblLOGOUT.setBounds(570, 54, 100, 14);
  }
  
  lblMember.setFont(new Font("Tahoma", Font.BOLD, 15));
  lblMember.setBounds(10, 56, 140, 23);
  panelMembersPage.add(lblMember);
  
  btnEditProfile.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnEditProfile.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
    panelMembersPage.setVisible(false);
    buildUserInfoPage();
    panelUserInfoPage.setVisible(true);
   }
  });
  btnEditProfile.setBounds(219, 131, 228, 36);
  panelMembersPage.add(btnEditProfile);
  
  btnDeleteProfile.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
     String input;
     if (defaultLang)
       input = JOptionPane.showInputDialog("Answer your secret question: " + currentUser.getSecretQuestion());
     else
       input = JOptionPane.showInputDialog("Répondez à votre question secrète: " + currentUser.getSecretQuestion());
     
     if (input != null)  //did not click cancel
     {
      if (input.equals(currentUser.getSecretAnswer()))
      {
        int confirmation;
        if (defaultLang)
          confirmation = JOptionPane.showConfirmDialog(null, "Are you sure you want to delete your profile?", "", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        else
          confirmation = JOptionPane.showConfirmDialog(null, "Êtes-vous sûr de vouloir supprimer votre profil?", "", JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
        
        if (confirmation == 0) //yes
        {
          if (defaultLang)
            JOptionPane.showMessageDialog(frame, "Your profile and reports have been deleted.");
          else
            JOptionPane.showMessageDialog(frame, "Votre profil et vos rapports ont été supprimés."); 
          
          currentUser = null;
          removeUser(currentUser);
          panelMembersPage.setVisible(false);
          buildFrontPage();
          panelFrontPage.setVisible(true);
        }
      }
      else
      {
        if (defaultLang)
          JOptionPane.showMessageDialog(frame, "Incorrect answer to secret question.");
        else
          JOptionPane.showMessageDialog(frame, "Réponse incorrecte.");
      }
     }
   }
  });
  btnDeleteProfile.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnDeleteProfile.setBounds(219, 178, 228, 36);
  panelMembersPage.add(btnDeleteProfile);
  
  btnCreateReport.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
    panelMembersPage.setVisible(false);
    buildReportingPage("MembersPage", false, null);
    panelReportingPage.setVisible(true);
   }
  });
  btnCreateReport.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnCreateReport.setBounds(219, 238, 228, 36);
  panelMembersPage.add(btnCreateReport);
  
  btnEditReport.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
    //ALSO REMEMBER TO UPDATE LIST OF REPORTS AS WELL AS USERS REPORTS AND CHECK IF USER HAS ATLEAST 1 REPORT
     if (currentUser.getReports().size() > 0) {
       Object[] options = currentUser.getReports().toArray();
       
       Report selection;
       if (defaultLang)
         selection = (Report) JOptionPane.showInputDialog(frame, "Select a report to edit:", "Report editing", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
       else
         selection = (Report) JOptionPane.showInputDialog(frame, "Sélectionnez un rapport à modifier:", "Edition de rapport", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
       
       if (selection != null)
       {
         panelMembersPage.setVisible(false);
         buildReportingPage("MembersPage", true, selection);
         panelReportingPage.setVisible(true);
    
         textFieldAddressReportingPage.setText(selection.getAddress());
         switch (selection.getProblem())
         {
           case "Utility Failures":
             rdbtnUtilityFailures.setSelected(true);
             break;
           case "Potholes":
             rdbtnPotholes.setSelected(true);
             break;
           case "City Property Vandalism":
             rdbtnCityProperty.setSelected(true);
             break;
           case "Eroded Streets":
             rdbtnEroded.setSelected(true);
             break;
           case "Tree Collapse":
             rdbtnTreeCollapse.setSelected(true);
             break;
           case "Flooded Streets":
             rdbtnFlooded.setSelected(true);
             break;
           case "Mould and Spore Growth":
             rdbtnMould.setSelected(true);
             break;
           case "Garbage or any Other Road Blocking Objects":
            rdbtnGarbage.setSelected(true);
            break;
         }
       }
     }
     else {
       if (defaultLang)
         JOptionPane.showMessageDialog(frame, "You have 0 reports. Please add the first report.", "Error", JOptionPane.WARNING_MESSAGE);
       else
         JOptionPane.showMessageDialog(frame, "Vous avez 0 rapports. Veuillez ajouter le premier rapport.", "Erreur", JOptionPane.WARNING_MESSAGE);         
     }
   }
  });
  btnEditReport.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnEditReport.setBounds(219, 285, 228, 36);
  panelMembersPage.add(btnEditReport);
  
  btnDeleteReport.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
    if (currentUser.getReports().size() != 0)
    {
     Object[] options = currentUser.getReports().toArray();
     
     Report selectedReport;
     if (defaultLang)
       selectedReport = (Report) JOptionPane.showInputDialog(frame, "Select a report to delete:", "Report deletion", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
     else
       selectedReport = (Report) JOptionPane.showInputDialog(frame, "Sélectionnez un rapport à supprimer:", "Suppression de rapport", JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
       
     if (selectedReport != null)
     {
      int confirmation;
      if (defaultLang)
        confirmation = JOptionPane.showConfirmDialog(frame, "Are you sure you would like to delete this report?", "", JOptionPane.YES_NO_OPTION);
      else
        confirmation = JOptionPane.showConfirmDialog(frame, "Voulez-vous vraiment supprimer ce rapport?", "", JOptionPane.YES_NO_OPTION);
      
      if (confirmation == 0) //yes
      {
          reports.remove(selectedReport);
          currentUser.removeReport(selectedReport);
          if (defaultLang)
            JOptionPane.showMessageDialog(frame, "Report deleted.");
          else
            JOptionPane.showMessageDialog(frame, "Rapport supprimé.");
      }
     }
    }
    else
    {
     if (defaultLang)
       JOptionPane.showMessageDialog(frame, "You have no reports.", "Error", JOptionPane.ERROR_MESSAGE);
     else
        JOptionPane.showMessageDialog(frame, "Vous n'avez aucun rapport.", "Erreur", JOptionPane.ERROR_MESSAGE);
    }
   }
  });
  btnDeleteReport.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnDeleteReport.setBounds(219, 333, 228, 36);
  panelMembersPage.add(btnDeleteReport);
  
  btnTakeSurvey.setFont(new Font("Tahoma", Font.BOLD, 11));
  btnTakeSurvey.setBounds(10, 371, 168, 23);
  panelMembersPage.add(btnTakeSurvey);
  
  JLabel lblNewLabel_4 = new JLabel("CYPRESS");
  lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
  lblNewLabel_4.setBounds(10, 11, 109, 23);
  panelMembersPage.add(lblNewLabel_4);
  
  JSeparator separator = new JSeparator();
  separator.setBounds(10, 43, 655, 2);
  panelMembersPage.add(separator);
  
  lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
  panelMembersPage.add(lblNewLabel_5);
  
  JLabel lblFAQ = new JLabel("FAQ");
  lblFAQ.setHorizontalAlignment(SwingConstants.LEFT);
  lblFAQ.setFont(new Font("Tahoma", Font.BOLD, 11));
  lblFAQ.setBounds(643, 380, 22, 14);
  panelMembersPage.add(lblFAQ);
  
  lblLOGOUT.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) 
   {
    logout(panelMembersPage);
   }
  });
  lblLOGOUT.setFont(new Font("Tahoma", Font.BOLD, 11));
  panelMembersPage.add(lblLOGOUT);
  
  JLabel lblWelcome = new JLabel("");
  lblWelcome.setFont(new Font("Tahoma", Font.BOLD, 15));
  lblWelcome.setBounds(208, 81, 259, 23);
  if (defaultLang)
    lblWelcome.setText("Welcome " + currentUser.getFirstName() + " " + currentUser.getLastName() + "!");
  else
    lblWelcome.setText("Bienvenue " + currentUser.getFirstName() + " " + currentUser.getLastName() + "!");
  panelMembersPage.add(lblWelcome);
  
  JSeparator separator_1 = new JSeparator();
  separator_1.setBounds(219, 225, 228, 2);
  panelMembersPage.add(separator_1);
  
  lblMAINPAGE.addMouseListener(new MouseAdapter() {
   @Override
   public void mouseClicked(MouseEvent e) 
   {
    panelMembersPage.setVisible(false);
    buildMainPage();
    panelMainPage.setVisible(true);
   }
  });
  lblMAINPAGE.setHorizontalAlignment(SwingConstants.LEFT);
  lblMAINPAGE.setFont(new Font("Tahoma", Font.BOLD, 11));
  panelMembersPage.add(lblMAINPAGE);
  
 }
 
 public void buildReportingPage(String calledFrom, boolean edit, Report reportToEdit)
 {
  panelReportingPage = new JPanel();
  panelReportingPage.setBackground(SystemColor.info);
  frame.getContentPane().add(panelReportingPage, "name_249112407851600");
  panelReportingPage.setLayout(null);
  
  JLabel lblAddress;
  JLabel lblNewLabel;
  JButton btnReport;
  JLabel lblNewLabel_5;
  JButton btnCancel;
      
  if (defaultLang)
  {
    lblAddress = new JLabel("Address:");
    lblNewLabel = new JLabel("PROBLEMS AT THE SITE");
    rdbtnUtilityFailures = new JRadioButton("Utility Failures");
    rdbtnPotholes = new JRadioButton("Potholes");
    rdbtnCityProperty = new JRadioButton("City Property Vandalism");
    rdbtnEroded = new JRadioButton("Eroded Streets");
    rdbtnTreeCollapse = new JRadioButton("Tree Collapse");
    rdbtnFlooded = new JRadioButton("Flooded Streets");
    rdbtnMould = new JRadioButton("Mould and Spore Growth");
    rdbtnGarbage = new JRadioButton("Garbage or any Other Road Blocking Objects");
    btnReport = new JButton("Report");
    lblNewLabel_5 = new JLabel("City of Toronto");
    btnCancel = new JButton("Cancel");
    
    rdbtnUtilityFailures.setBounds(10, 174, 109, 23);
    rdbtnCityProperty.setBounds(10, 226, 143, 23);
    rdbtnMould.setBounds(206, 226, 168, 23);
    lblNewLabel_5.setBounds(532, 13, 133, 19);
  }
  else
  {
    lblAddress = new JLabel("Adresse:");
    lblNewLabel = new JLabel("PROBLÈMES SUR LE SITE");
    rdbtnUtilityFailures = new JRadioButton("Pannes de l'utilitaire");
    rdbtnPotholes = new JRadioButton("Nids-de-poule");
    rdbtnCityProperty = new JRadioButton("Vandalisme de propriété");
    rdbtnEroded = new JRadioButton("Rues érodées");
    rdbtnTreeCollapse = new JRadioButton("Réduire l'arbre");
    rdbtnFlooded = new JRadioButton("Rues inondées");
    rdbtnMould = new JRadioButton("Croissance des moisissures et des spores");
    rdbtnGarbage = new JRadioButton("Déchets ou tout autre objet bloquant la route");
    btnReport = new JButton("Signaler");
    lblNewLabel_5 = new JLabel("Ville de Toronto");
    btnCancel = new JButton("Annuler");
    
    rdbtnUtilityFailures.setBounds(10, 174, 140, 23);
    rdbtnCityProperty.setBounds(10, 226, 175, 23);
    rdbtnMould.setBounds(206, 226, 280, 23);
    lblNewLabel_5.setBounds(520, 13, 150, 19);
  }
  
  lblAddress.setHorizontalAlignment(SwingConstants.LEFT);
  lblAddress.setBounds(15, 103, 60, 20);
  panelReportingPage.add(lblAddress);
  
  textFieldAddressReportingPage = new JTextField("");
  textFieldAddressReportingPage.setBounds(72, 103, 544, 20);
  panelReportingPage.add(textFieldAddressReportingPage);
  textFieldAddressReportingPage.setColumns(10);
  
  lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
  lblNewLabel.setBounds(15, 147, 138, 14);
  panelReportingPage.add(lblNewLabel);
  
  rdbtnUtilityFailures.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    problemReportingPage = "Utility Failures";
   }
  });
  rdbtnUtilityFailures.setBackground(SystemColor.info);
  panelReportingPage.add(rdbtnUtilityFailures);
  
  rdbtnPotholes.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    problemReportingPage = "Potholes";
   }
  });
  rdbtnPotholes.setBackground(SystemColor.info);
  rdbtnPotholes.setBounds(10, 200, 109, 23);
  panelReportingPage.add(rdbtnPotholes);
  
  rdbtnCityProperty.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    problemReportingPage = "City Property Vanadlism";
   }
  });
  rdbtnCityProperty.setBackground(SystemColor.info);
  panelReportingPage.add(rdbtnCityProperty);
  
  rdbtnEroded.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    problemReportingPage = "Eroded Streets";
   }
  });
  rdbtnEroded.setBackground(SystemColor.info);
  rdbtnEroded.setBounds(10, 252, 109, 23);
  panelReportingPage.add(rdbtnEroded);
  
  rdbtnTreeCollapse.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    problemReportingPage = "Tree Collapse";
   }
  });
  rdbtnTreeCollapse.setBackground(SystemColor.info);
  rdbtnTreeCollapse.setBounds(206, 174, 109, 23);
  panelReportingPage.add(rdbtnTreeCollapse);
  
  rdbtnFlooded.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    problemReportingPage = "Flooded Streets";
   }
  });
  rdbtnFlooded.setBackground(SystemColor.info);
  rdbtnFlooded.setBounds(206, 200, 109, 23);
  panelReportingPage.add(rdbtnFlooded);
  
  rdbtnMould.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    problemReportingPage = "Mould and Spore Growth";
   }
  });
  rdbtnMould.setBackground(SystemColor.info);
  panelReportingPage.add(rdbtnMould);
  
  rdbtnGarbage.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) {
    problemReportingPage = "Garbage or any Other Road Blocking Objects";
   }
  });
  rdbtnGarbage.setHorizontalAlignment(SwingConstants.LEFT);
  rdbtnGarbage.setBackground(SystemColor.info);
  rdbtnGarbage.setBounds(206, 252, 280, 23);
  panelReportingPage.add(rdbtnGarbage);
  
  btnReport.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
    
    //check if none are checked or not and address entered or not
    if (textFieldAddressReportingPage.getText().equals(""))
    {
     if (defaultLang)
       JOptionPane.showMessageDialog(frame, "Please enter an address.", "Error", JOptionPane.WARNING_MESSAGE);
     else
       JOptionPane.showMessageDialog(frame, "Entrez une adresse s'il vous plait.", "Erreur", JOptionPane.WARNING_MESSAGE);
    }
    else if (rdbtnUtilityFailures.isSelected() == false && rdbtnPotholes.isSelected() == false && rdbtnCityProperty.isSelected() == false && rdbtnEroded.isSelected() == false && rdbtnTreeCollapse.isSelected() == false && rdbtnFlooded.isSelected() == false && rdbtnMould.isSelected() == false && rdbtnGarbage.isSelected() == false)
    {
      if (defaultLang)
        JOptionPane.showMessageDialog(frame, "Please select a problem.", "Error", JOptionPane.WARNING_MESSAGE);
      else
        JOptionPane.showMessageDialog(frame, "Veuillez sélectionner un problème.", "Erreur", JOptionPane.WARNING_MESSAGE);
    }
    
    //reporting the problem
    else
    {
        Report report = new Report(textFieldAddressReportingPage.getText(), problemReportingPage);
         
        if (didUserAlreadyReportProblem(report) == true)
        {
          if (defaultLang)
            JOptionPane.showMessageDialog(frame, "You have already reported this problem.", "Error", JOptionPane.WARNING_MESSAGE);
          else
            JOptionPane.showMessageDialog(frame, "Vous avez déjà signalé ce problème.", "Erreur", JOptionPane.WARNING_MESSAGE);           
        }
        else
        {
            if (edit)
            {
              reportToEdit.setAddress(textFieldAddressReportingPage.getText());
              reportToEdit.setProblem(problemReportingPage);
              if (defaultLang)
                JOptionPane.showMessageDialog(frame, "Your report has been updated.");
              else
                JOptionPane.showMessageDialog(frame, "Votre rapport a été mis à jour.");
            }
            else
            {
              reports.add(report);
              currentUser.addReport(report);
            if (defaultLang)
              JOptionPane.showMessageDialog(frame, "Your report has been sent to the city officials.");
            else
              JOptionPane.showMessageDialog(frame, "Votre rapport a été envoyé aux responsables de la ville.");
            }
            
            if (calledFrom.equals("MainPage"))
            {
             panelReportingPage.setVisible(false);
             buildMainPage();
             panelMainPage.setVisible(true);
            }
            else if (calledFrom.equals("MembersPage"))
            {
             panelReportingPage.setVisible(false);
             buildMembersPage();
             panelMembersPage.setVisible(true);
            }
        }
    }
   }
  });
  btnReport.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnReport.setBounds(192, 288, 89, 23);
  panelReportingPage.add(btnReport);
  
  btnCancel.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
    if (calledFrom.equals("MainPage"))
    {
     panelReportingPage.setVisible(false);
     buildMainPage();
     panelMainPage.setVisible(true);
    }
    else if (calledFrom.equals("MembersPage"))
    {
     panelReportingPage.setVisible(false);
     buildMembersPage();
     panelMembersPage.setVisible(true);
    }
   }
  });
  btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnCancel.setBounds(378, 288, 89, 23);
  panelReportingPage.add(btnCancel);
  
  JLabel lblFAQ = new JLabel("FAQ");
  lblFAQ.setHorizontalAlignment(SwingConstants.LEFT);
  lblFAQ.setFont(new Font("Tahoma", Font.BOLD, 11));
  lblFAQ.setBounds(643, 380, 22, 14);
  panelReportingPage.add(lblFAQ);
  
  JLabel lblNewLabel_4 = new JLabel("CYPRESS");
  lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
  lblNewLabel_4.setBounds(10, 11, 109, 23);
  panelReportingPage.add(lblNewLabel_4);
  
  JSeparator separator = new JSeparator();
  separator.setBounds(10, 43, 655, 2);
  panelReportingPage.add(separator);
  
  lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
  panelReportingPage.add(lblNewLabel_5);
  
  JSeparator separator_1 = new JSeparator();
  separator_1.setBounds(10, 165, 600, 2);
  panelReportingPage.add(separator_1);
  
  ButtonGroup buttonGroup = new ButtonGroup();
  buttonGroup.add(rdbtnUtilityFailures);
  buttonGroup.add(rdbtnPotholes);
  buttonGroup.add(rdbtnCityProperty);
  buttonGroup.add(rdbtnEroded);
  buttonGroup.add(rdbtnTreeCollapse);
  buttonGroup.add(rdbtnFlooded);
  buttonGroup.add(rdbtnMould);
  buttonGroup.add(rdbtnGarbage);
 }
 
 public void buildUserInfoPage()
 {
  panelUserInfoPage = new JPanel();
  panelUserInfoPage.setBackground(SystemColor.info);
  panelUserInfoPage.setLayout(null);
  frame.getContentPane().add(panelUserInfoPage, "name_323231093410500");
  
  JLabel lblPleaseEnterInformationBelow;
  JLabel lblFirstName;
  JLabel lblLastName;
  JLabel lblAddress;
  JLabel lblPhoneNumber;
  JLabel lblUserName;
  JLabel lblPassword;
  JLabel lblSecretQuestion;
  JLabel lblSecretQuestionsAnswer;
  JLabel lblNewLabel_5;
  JButton btnSaveAndExit;
    
  if (defaultLang)
  {
    lblPleaseEnterInformationBelow = new JLabel("Edit your profile Below:");
    lblFirstName = new JLabel("First Name:");
    lblLastName = new JLabel("Last Name:");
    lblAddress = new JLabel("Address:");
    lblPhoneNumber = new JLabel("Phone Number:");
    lblUserName = new JLabel("Username:");
    lblPassword = new JLabel("Password:");
    lblSecretQuestion = new JLabel("Secret Question:");
    lblSecretQuestionsAnswer = new JLabel("Secret Question's Answer:");
    lblNewLabel_5 = new JLabel("City of Toronto");
    btnSaveAndExit = new JButton("Save and Exit");
    
    lblPleaseEnterInformationBelow.setBounds(10, 54, 307, 20);
    lblPhoneNumber.setBounds(84, 169, 120, 17);
    lblUserName.setBounds(112, 227, 92, 17);
    lblNewLabel_5.setBounds(532, 13, 133, 19);
  }
  else 
  {
    lblPleaseEnterInformationBelow = new JLabel("Veuillez saisir les informations ci-dessous:");
    lblFirstName = new JLabel("Prénom:");
    lblLastName = new JLabel("Nom de famille:");
    lblAddress = new JLabel("Adresse:");
    lblPhoneNumber = new JLabel("Numéro de téléphone:");
    lblUserName = new JLabel("Nom d'utilisateur:");
    lblPassword = new JLabel("Mot de passe:");
    lblSecretQuestion = new JLabel("Question secrète:");
    lblSecretQuestionsAnswer = new JLabel("Sa réponse:");
    lblNewLabel_5 = new JLabel("Ville de Toronto");
    btnSaveAndExit = new JButton("Sauvegarder");
    
    lblPleaseEnterInformationBelow.setBounds(10, 54, 375, 20);
    lblPhoneNumber.setBounds(80, 169, 125, 17);
    lblUserName.setBounds(105, 227, 100, 17);
    lblNewLabel_5.setBounds(520, 13, 150, 19);
  }
  
  lblPleaseEnterInformationBelow.setFont(new Font("Times New Roman", Font.BOLD, 20));
  panelUserInfoPage.add(lblPleaseEnterInformationBelow);
  
  textFieldFirstName = new JTextField();
  textFieldFirstName.setColumns(10);
  textFieldFirstName.setBounds(214, 84, 154, 20);
  panelUserInfoPage.add(textFieldFirstName);
  
  textFieldLastName = new JTextField();
  textFieldLastName.setColumns(10);
  textFieldLastName.setBounds(214, 112, 154, 20);
  panelUserInfoPage.add(textFieldLastName);
  
  textFieldAddress = new JTextField();
  textFieldAddress.setColumns(10);
  textFieldAddress.setBounds(214, 140, 422, 20);
  panelUserInfoPage.add(textFieldAddress);
  
  textFieldPhoneFirst3Digits = new JTextField();
  textFieldPhoneFirst3Digits.setColumns(10);
  textFieldPhoneFirst3Digits.setBounds(214, 168, 55, 20);
  panelUserInfoPage.add(textFieldPhoneFirst3Digits);
  
  textFieldPhoneSecond3Digits = new JTextField();
  textFieldPhoneSecond3Digits.setColumns(10);
  textFieldPhoneSecond3Digits.setBounds(293, 168, 55, 20);
  panelUserInfoPage.add(textFieldPhoneSecond3Digits);
  
  textFieldPhoneLast4Digits = new JTextField();
  textFieldPhoneLast4Digits.setColumns(10);
  textFieldPhoneLast4Digits.setBounds(368, 168, 55, 20);
  panelUserInfoPage.add(textFieldPhoneLast4Digits);
  
  textFieldUserName = new JTextField();
  textFieldUserName.setColumns(10);
  textFieldUserName.setBounds(214, 226, 154, 20);
  panelUserInfoPage.add(textFieldUserName);
  
  textFieldPassword = new JTextField();
  textFieldPassword.setColumns(10);
  textFieldPassword.setBounds(214, 256, 154, 20);
  panelUserInfoPage.add(textFieldPassword);
  
  textFieldEmail = new JTextField();
  textFieldEmail.setColumns(10);
  textFieldEmail.setBounds(214, 197, 154, 20);
  panelUserInfoPage.add(textFieldEmail);
  
  textFieldSecretA = new JTextField();
  textFieldSecretA.setColumns(10);
  textFieldSecretA.setBounds(214, 318, 383, 20);
  panelUserInfoPage.add(textFieldSecretA);
  
  textFieldSecretQ = new JTextField();
  textFieldSecretQ.setColumns(10);
  textFieldSecretQ.setBounds(214, 287, 383, 20);
  panelUserInfoPage.add(textFieldSecretQ);
  
  btnSaveAndExit.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnSaveAndExit.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
    //any empty fields
    if (textFieldFirstName.getText().equals("") || textFieldLastName.getText().equals("") || textFieldAddress.getText().equals("") || textFieldPhoneFirst3Digits.getText().equals("") || textFieldPhoneSecond3Digits.getText().equals("") || textFieldPhoneLast4Digits.getText().equals("") || textFieldEmail.getText().equals("") || textFieldUserName.getText().equals("") || textFieldPassword.getText().equals("") || textFieldSecretQ.getText().equals("") || textFieldSecretA.getText().equals(""))
    {
      if (defaultLang)
        JOptionPane.showMessageDialog(frame, "One or more empty fields.");
      else
        JOptionPane.showMessageDialog(frame, "Un ou plusieurs champs vides.");
    }
    //username already taken
    else if (userNameAlreadyExistsBesidesThisOne(textFieldUserName.getText(), currentUser) == true)
    {
      if (defaultLang)
        JOptionPane.showMessageDialog(frame, "Username already taken.");
      else
        JOptionPane.showMessageDialog(frame, "Nom d'utilisateur déjà pris.");
    }
    //password weak
    else if (textFieldPassword.getText().length() < 5 || textFieldPassword.getText().matches("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d).+$") == false)
    {
      if (defaultLang)
        JOptionPane.showMessageDialog(frame, "Password must contain atleast 5 characters and have both letters and numbers.");
      else
        JOptionPane.showMessageDialog(frame, "Le mot de passe doit contenir au moins 5 caractères et contenir à la fois des lettres et des chiffres.");
    }
    else if (textFieldPhoneFirst3Digits.getText().length() != 3 || textFieldPhoneFirst3Digits.getText().matches("[0-9]+") == false || textFieldPhoneSecond3Digits.getText().length() != 3 || textFieldPhoneSecond3Digits.getText().matches("[0-9]+") == false || textFieldPhoneLast4Digits.getText().length() != 4 || textFieldPhoneLast4Digits.getText().matches("[0-9]+") == false)
    {
      if (defaultLang)
        JOptionPane.showMessageDialog(frame, "Invalid Phone Number.");
      else
        JOptionPane.showMessageDialog(frame, "Numéro de téléphone invalide.");        
    }
    else if (phoneNumberAlreadyExistsBesidesThisOne(textFieldPhoneFirst3Digits.getText() + textFieldPhoneSecond3Digits.getText() + textFieldPhoneLast4Digits.getText(), currentUser) == true)
    {
      if (defaultLang)
        JOptionPane.showMessageDialog(frame, "Phone number already registered to another account.");
      else
        JOptionPane.showMessageDialog(frame, "Numéro de téléphone déjà enregistré sur un autre compte.");        
    }
    
    else
    {
     String[] newInfo = {textFieldFirstName.getText(), textFieldLastName.getText(), textFieldAddress.getText(), (textFieldPhoneFirst3Digits.getText() + textFieldPhoneSecond3Digits.getText() + textFieldPhoneLast4Digits.getText()), textFieldEmail.getText(), textFieldUserName.getText(), textFieldPassword.getText(), textFieldSecretQ.getText(), textFieldSecretA.getText()};
     currentUser.setInfo(newInfo);
     
     panelUserInfoPage.setVisible(false);
     buildMembersPage();
     panelMembersPage.setVisible(true);
    }
   }
  });
  btnSaveAndExit.setBounds(273, 359, 132, 23);
  panelUserInfoPage.add(btnSaveAndExit);
  
  textFieldFirstName.setText(currentUser.getInfo()[0]);
  textFieldLastName.setText(currentUser.getInfo()[1]);
  textFieldAddress.setText(currentUser.getInfo()[2]);
  textFieldPhoneFirst3Digits.setText(currentUser.getInfo()[3].substring(0, 3));
  textFieldPhoneSecond3Digits.setText(currentUser.getInfo()[3].substring(3, 6));
  textFieldPhoneLast4Digits.setText(currentUser.getInfo()[3].substring(6, 10));
  textFieldEmail.setText(currentUser.getInfo()[4]);
  textFieldUserName.setText(currentUser.getInfo()[5]);
  textFieldPassword.setText(currentUser.getInfo()[6]);
  textFieldSecretQ.setText(currentUser.getInfo()[7]);
  textFieldSecretA.setText(currentUser.getInfo()[8]);
  
  JLabel lblNewLabel_4 = new JLabel("CYPRESS");
  lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
  lblNewLabel_4.setBounds(10, 11, 109, 23);
  panelUserInfoPage.add(lblNewLabel_4);
  
  JSeparator separator = new JSeparator();
  separator.setBounds(10, 43, 655, 2);
  panelUserInfoPage.add(separator);
  
  lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
  panelUserInfoPage.add(lblNewLabel_5);
  
  lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
  lblFirstName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblFirstName.setBounds(112, 85, 92, 17);
  panelUserInfoPage.add(lblFirstName);
  
  lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
  lblLastName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblLastName.setBounds(112, 113, 92, 17);
  panelUserInfoPage.add(lblLastName);
  
  lblAddress.setHorizontalAlignment(SwingConstants.RIGHT);
  lblAddress.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblAddress.setBounds(112, 141, 92, 17);
  panelUserInfoPage.add(lblAddress);
  
  lblPhoneNumber.setHorizontalAlignment(SwingConstants.RIGHT);
  lblPhoneNumber.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  panelUserInfoPage.add(lblPhoneNumber);
  
  JLabel lblEmail = new JLabel("Email:");
  lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
  lblEmail.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblEmail.setBounds(112, 198, 92, 17);
  panelUserInfoPage.add(lblEmail);
  
  lblUserName.setHorizontalAlignment(SwingConstants.RIGHT);
  lblUserName.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  panelUserInfoPage.add(lblUserName);
  
  lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
  lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblPassword.setBounds(112, 257, 92, 17);
  panelUserInfoPage.add(lblPassword);
  
  lblSecretQuestion.setHorizontalAlignment(SwingConstants.RIGHT);
  lblSecretQuestion.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblSecretQuestion.setBounds(84, 290, 120, 17);
  panelUserInfoPage.add(lblSecretQuestion);
  
  lblSecretQuestionsAnswer.setHorizontalAlignment(SwingConstants.RIGHT);
  lblSecretQuestionsAnswer.setFont(new Font("Times New Roman", Font.PLAIN, 14));
  lblSecretQuestionsAnswer.setBounds(10, 321, 194, 17);
  panelUserInfoPage.add(lblSecretQuestionsAnswer);
  
  JLabel lblNewLabel_8 = new JLabel("@cypress.on.ca");
  lblNewLabel_8.setFont(new Font("Times New Roman", Font.PLAIN, 13));
  lblNewLabel_8.setBounds(373, 229, 92, 14);
  panelUserInfoPage.add(lblNewLabel_8);
  
  JLabel lblFAQ = new JLabel("FAQ");
  lblFAQ.setHorizontalAlignment(SwingConstants.LEFT);
  lblFAQ.setFont(new Font("Tahoma", Font.BOLD, 11));
  lblFAQ.setBounds(643, 380, 22, 14);
  panelUserInfoPage.add(lblFAQ);
 }
 
 public void buildSuggestPage(Report report){
  panelSuggestPage = new JPanel();
  panelSuggestPage.setBackground(SystemColor.info);
  panelSuggestPage.setLayout(null);
  frame.getContentPane().add(panelSuggestPage);
  
  JLabel lbl;
  JLabel lblNewLabel_5;
  JButton btnSubmit;
  JButton btnCancel;
    
  if (defaultLang)
  {
    lbl = new JLabel("Provide your suggestion to " + report);
    lblNewLabel_5 = new JLabel("City of Toronto");
    btnSubmit = new JButton("Submit");
    btnCancel = new JButton("Cancel");
    
    btnSubmit.setBounds(250, 352, 89, 23);
    lblNewLabel_5.setBounds(532, 13, 133, 19);
  }
  else
  {
    lbl = new JLabel("Fournissez votre solution à " + report);
    lblNewLabel_5 = new JLabel("Ville de Toronto");
    btnSubmit = new JButton("Soumettre");
    btnCancel = new JButton("Annuler");
    
    btnSubmit.setBounds(250, 352, 99, 23);
    lblNewLabel_5.setBounds(520, 13, 150, 19);
  }
  
  lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
  lbl.setBounds(10, 53, 500, 20);
  panelSuggestPage.add(lbl);
  
  textAreaSol = new JTextArea();
  textAreaSol.setBounds(30, 94, 620, 250);
  textAreaSol.setLineWrap(true);
  textAreaSol.setWrapStyleWord(true);
  panelSuggestPage.add(textAreaSol);
  
  JLabel lblNewLabel_4 = new JLabel("CYPRESS");
  lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
  lblNewLabel_4.setBounds(10, 11, 109, 23);
  panelSuggestPage.add(lblNewLabel_4);
  
  JSeparator separator = new JSeparator();
  separator.setBounds(10, 43, 655, 2);
  panelSuggestPage.add(separator);
  
  lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
  panelSuggestPage.add(lblNewLabel_5);
  
  btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
  panelSuggestPage.add(btnSubmit);
  btnSubmit.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
     if (textAreaSol.getText().length() > 5)
     {
       report.addSolution(textAreaSol.getText());
       if (defaultLang)
         JOptionPane.showMessageDialog(frame, "Your suggestion is successfully submitted.");
       else
         JOptionPane.showMessageDialog(frame, "Votre suggestion a été envoyée avec succès.");
       panelSuggestPage.setVisible(false);
       buildMainPage();
       panelMainPage.setVisible(true);
     }
     else {
       if (defaultLang)
         JOptionPane.showMessageDialog(frame, "Please provide a clear and possible solution.");
       else
         JOptionPane.showMessageDialog(frame, "Veuillez fournir une solution claire et possible.");         
     }
   }
  });
  
  btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnCancel.setBounds(365, 352, 89, 23);
  panelSuggestPage.add(btnCancel);
  btnCancel.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
    panelSuggestPage.setVisible(false);
    buildMainPage();
    panelMainPage.setVisible(true);
   }
  });
 }
 public void buildVotePage(Report report, int i){
  panelVotePage = new JPanel();
  panelVotePage.setBackground(SystemColor.info);
  panelVotePage.setLayout(null);
  frame.getContentPane().add(panelVotePage);
  
  JLabel lblNewLabel_5;
  JButton btnVote;
  JButton btnCancel;
  
  if (defaultLang)
  {
    lblNewLabel_5 = new JLabel("City of Toronto");
    btnVote = new JButton("Vote");
    btnCancel = new JButton("Cancel");
    
    lblNewLabel_5.setBounds(532, 13, 133, 19);
  }
  else
  {
    lblNewLabel_5 = new JLabel("Ville de Toronto");
    btnVote = new JButton("Voter");
    btnCancel = new JButton("Annuler");
    
    lblNewLabel_5.setBounds(520, 13, 150, 19);
  }
  
  JLabel lbl = new JLabel("Solution " + (i+1));
  lbl.setFont(new Font("Times New Roman", Font.BOLD, 20));
  lbl.setBounds(10, 53, 500, 20);
  panelVotePage.add(lbl);
    
  textAreaSol = new JTextArea((String)report.getSolution()[i]);
  textAreaSol.setBounds(30, 94, 620, 250);
  textAreaSol.setLineWrap(true);
  textAreaSol.setWrapStyleWord(true);
  textAreaSol.setEditable(false);
  panelVotePage.add(textAreaSol);
  
  JLabel lblNewLabel_4 = new JLabel("CYPRESS");
  lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 18));
  lblNewLabel_4.setBounds(10, 11, 109, 23);
  panelVotePage.add(lblNewLabel_4);
  
  JSeparator separator = new JSeparator();
  separator.setBounds(10, 43, 655, 2);
  panelVotePage.add(separator);
  
  lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 18));
  panelVotePage.add(lblNewLabel_5);
  
  btnVote.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnVote.setBounds(250, 352, 89, 23);
  panelVotePage.add(btnVote);
  btnVote.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
      report.addPoint(textAreaSol.getText());
      if (defaultLang)
        JOptionPane.showMessageDialog(frame, "Thank you for the vote! This solution got " + report.getPoint(textAreaSol.getText()) + " vote(s).");
      else
        JOptionPane.showMessageDialog(frame, "Merci pour le vote! Cette solution a obtenu" + report.getPoint(textAreaSol.getText()) + " voix/votes.");
      panelVotePage.setVisible(false);
      buildMainPage();
      panelMainPage.setVisible(true);
   }
  });
  
  btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
  btnCancel.setBounds(365, 352, 89, 23);
  panelVotePage.add(btnCancel);
  btnCancel.addActionListener(new ActionListener() {
   public void actionPerformed(ActionEvent e) 
   {
    panelVotePage.setVisible(false);
    buildMainPage();
    panelMainPage.setVisible(true);
   }
  });
  if (report.getSizeSol() > 1 && (i != report.getSizeSol()-1 || i == 0))
  {
   JLabel lblNext;
   if (defaultLang)
     lblNext = new JLabel("Next >");
   else
     lblNext = new JLabel("Suivant >");  
   lblNext.setFont(new Font("Tahoma", Font.BOLD, 11));
   lblNext.setBounds(600, 48, 70, 40);
   panelVotePage.add(lblNext);
   lblNext.addMouseListener(new MouseAdapter() {
   @Override
     public void mouseClicked(MouseEvent e) 
     {
        panelVotePage.setVisible(false);
        buildVotePage(report, i+1);
        panelVotePage.setVisible(true);
     }
   });
  }
  if (i != 0)
  {
   JLabel lblPrev;
   if (defaultLang)
     lblPrev = new JLabel("< Previous");
   else
     lblPrev = new JLabel("< Précédent");
   lblPrev.setFont(new Font("Tahoma", Font.BOLD, 11));
   lblPrev.setBounds(510, 48, 70, 40);
   panelVotePage.add(lblPrev);
   lblPrev.addMouseListener(new MouseAdapter() {
   @Override
     public void mouseClicked(MouseEvent e) 
     {
        panelVotePage.setVisible(false);
        buildVotePage(report, i-1);
        panelVotePage.setVisible(true);
     }
   });
  }
 }
 
  
 private User getUserFromUserName(String username)
 {
  for (User user : users)
  {
   if (user.getUserName().equals(username))
    return user;
  }
  return null;
 }
 
 private boolean phoneNumberAlreadyExists(String phoneNumber)
 {
  for (User user : users)
  {
   if (user.getPhoneNumber().equals(phoneNumber))
    return true;
  }
  return false;
 }
 
 private boolean phoneNumberAlreadyExistsBesidesThisOne(String phoneNumber, User thisUser)
 {
  for (User user : users)
  {
   if (user.getPhoneNumber().equals(phoneNumber) && user != thisUser)
   {
    return true;
   }
  }
  return false;
 }
 
 private boolean userNameAlreadyExistsBesidesThisOne(String username, User thisUser)
 {
  for (User user : users)
  {
   if (user.getUserName().equals(username) && user != thisUser)
   {
    return true;
   }
  }
  return false;
 }
 
 private void removeUser(User user)
 {
  users.remove(user);
 }
 
 private void logout(JPanel panel)
 {
  currentUser = null;
  if (defaultLang)
    JOptionPane.showMessageDialog(frame, "You have been logged out.");
  else
    JOptionPane.showMessageDialog(frame, "Vous avez été déconnecté.");
  panel.setVisible(false);
  buildFrontPage();
  panelFrontPage.setVisible(true);
 }
 
 private boolean didUserAlreadyReportProblem(Report report)
 {
  for (Report rep : currentUser.getReports())
  {
   if (rep.equals(report))
    return true;
  }
  return false;
 }
}
