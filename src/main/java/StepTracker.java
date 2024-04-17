import java.util.ArrayList;
public class StepTracker { 
 private int n;
 public StepTracker(int steps) {
  n = steps; 
 }
 public void addDailySteps() {
  if (n >= 10000) {
   System.out.println("This represents an active day.");
  } else {
   System.out.println("This is too few steps for the day to be considered active.");
  }
 }
 public int activeDays() {

 }
 public double averageSteps() {

 }
} 
