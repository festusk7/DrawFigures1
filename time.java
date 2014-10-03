public class time {
public static void main(String args[]) {
int sec = 5000;
int hours = sec / 3600;
int minutes = (sec % 3600) / 60;
 int secs = (sec % 3600) % 60;
System.out.println(+ sec + " seconds = " + hours + " hour, " + minutes + " minutes, " + secs + " seconds");

}
}

