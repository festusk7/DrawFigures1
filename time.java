public class time {
public static void main(String args[]) {
int sec = 5000;
int hours = sec / 3600;
int remainder = sec % 3600;
int minutes = remainder / 60;
 int secs = remainder % 60;
System.out.println("Hours in 5000 seconds = " + hours);
System.out.println("Minutes in 5000  seconds = " + minutes);
System.out.println("Seconds in 5000 seconds = " + secs);
}
}

