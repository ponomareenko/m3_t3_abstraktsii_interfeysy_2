import java.time.LocalDateTime;

public class SmartLogger implements Logger {
    int num = 1;
    @Override
    public void log(String msg) {
        if (msg.toLowerCase().contains("error")) {
            System.out.println("ERROR#" + num + " " + "[" + LocalDateTime.now() + "] " + msg);
        } else {
            System.out.println("INFO#" + num + " " + "[" + LocalDateTime.now() + "] " + msg);
        }
        num++;
    }
}