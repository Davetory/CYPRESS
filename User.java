import java.util.ArrayList;

public class User 
{
    //personal information
 private String firstName;
 private String lastName;
 private String address;
 private String phoneNumber;
 private String email;
 private String username;
 private String password;
 private String secretQuestion;
 private String secretAnswer;
 private ArrayList<Report> reports;

 //user will have a list of reports
 
 public User(String firstName, String lastName, String address, String phoneNumber, String email, String username, String password, String secretQuestion, String secretAnswer)
 {
  this.firstName = firstName;
  this.lastName = lastName;
  this.address = address;
  this.phoneNumber = phoneNumber;
  this.email = email;
  this.username = username;
  this.password = password;
  this.secretQuestion = secretQuestion;
  this.secretAnswer = secretAnswer;
  this.reports = new ArrayList<Report>();
 }
 
 public String getUserName()
 {
  return this.username;
 }
 
 public String getPassword()
 {
  return this.password;
 }
 
 public String getPhoneNumber()
 {
  return this.phoneNumber;
 }
 
 public String getFirstName()
 {
  return this.firstName;
 }
 
 public String getLastName()
 {
  return this.lastName;
 }
 
 public String getSecretQuestion()
 {
  return this.secretQuestion;
 }
 
 public String getSecretAnswer()
 {
  return this.secretAnswer;
 }
 
 public String[] getInfo()
 {
  String[] info = {firstName, lastName, address, phoneNumber, email, username, password, secretQuestion, secretAnswer};
  return info;
 }
 
 public void setInfo(String[] newInfo)
 {
  this.firstName = newInfo[0];
  this.lastName = newInfo[1];
  this.address = newInfo[2];
  this.phoneNumber = newInfo[3];
  this.email = newInfo[4];
  this.username = newInfo[5];
  this.password = newInfo[6];
  this.secretQuestion = newInfo[7];
  this.secretAnswer = newInfo[8];
 }
  
 public void addReport(Report report)
 {
  reports.add(report);
 }
 
 public ArrayList<Report> getReports()
 {
  return this.reports;
 }
 
 
 public void removeReport(Report report)
 {
  reports.remove(report);
 }
 

}
