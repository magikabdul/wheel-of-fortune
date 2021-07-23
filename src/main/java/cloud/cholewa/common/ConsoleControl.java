package cloud.cholewa.common;

public class ConsoleControl {

    public static void showConsoleMessage(String message) {
        System.out.println(message);
    }

    public static void showConsoleMessage(String message, int numberOfEmptyLines) {
        if (numberOfEmptyLines == 0) {
            System.out.print(message);
        } else {

            System.out.println(message + "\n".repeat(Math.max(0, numberOfEmptyLines)));
        }
    }
}
