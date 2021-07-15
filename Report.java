import java.util.Map;
import java.util.TreeMap;

public class Report 
{
 private String address;
 private String problem;
 private Map<String, Integer> solution;
 private boolean resolve;
 
 public Report(String address, String problem)
 {
  this.address = address;
  this.problem = problem;
  this.solution = new TreeMap<String, Integer>();
  this.resolve = false;
 }
 
 
 public void setAddress(String address)
 {
  this.address = address;
 }
 
 public void setProblem(String problem)
 {
  this.problem = problem;
 }
 
 public void setResolve(boolean resolve)
 {
   this.resolve = resolve;
 }
 
 public void addSolution(String sol)
 {
   solution.put(sol, 0);
 }
 
 public void addPoint(String sol)
 {
   solution.replace(sol, solution.get(sol)+1);
 }
 
 public String getAddress()
 {
  return this.address;
 }
 
 public String getProblem()
 {
  return this.problem;
 }
 
 public boolean getResolve(){
   return resolve;
 }
 
 public Object[] getSolution(){
   return solution.keySet().toArray();
 }
 
 public int getSizeSol(){
   return solution.size();
 }
 
 public int getPoint(String sol){
   return solution.get(sol);
 }
 
 public String toString()
 {
  return this.problem + " at " + this.address;
 }
 
 public boolean equals(Object object)
 {
  if (object instanceof Report == true)
  {
   Report otherReport = (Report) object;
   if (this.address.equals(otherReport.getAddress()) && this.problem.equals(otherReport.getProblem()))
    return true;
   else
    return false;
  }
  return false;
 }

}
