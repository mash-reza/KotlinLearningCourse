public class Runner {
    public static void main(String[] args) {
        Thread thread = () -> {
            System.out.println("my goddamn thread!!");
        };
        thread.run();
    }
}

interface Thread {
    void run();
}