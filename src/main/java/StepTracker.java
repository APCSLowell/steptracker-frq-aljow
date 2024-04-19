import java.util.ArrayList;
public class StepTracker { 
 private int n;
 private ArrayList<Integer> arr;
 public StepTracker(int steps) {
  n = steps; 
  arr = new ArrayList<Integer>();
 }
 public void addDailySteps(int num) {
  arr.add(num);
  // if (n >= 10000) {
  //  System.out.println("This represents an active day.");
  // } else {
  //  System.out.println("This is too few steps for the day to be considered active.");
  // }
 }
 public int activeDays() {
  int days = 0; 
  for (int i = 0; i < arr.size(); i++) {
   if (arr.get(i) >= n) {
    days++;
   }
  }
  return days;
 }
 public double averageSteps() {
  double stepAverage = 0.0;
  if (arr.size() == 0) {
   return stepAverage;
  }
  for(int i = 0; i < arr.size(); i++) {
   stepAverage += arr.get(i);
  }
  return stepAverage/arr.size();
 }
} 
