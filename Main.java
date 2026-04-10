public class Main {
    static void main(String[] args) {
        Logger logger1 = new SimpleLogger();
        Logger logger2 = new SmartLogger();
        logger1.log("Соббщение с каким-то текстом");

        logger2.log("Соббщение с каким-то текстом");
        logger2.log("Соббщение с каким-то текстом Error");
    }
}