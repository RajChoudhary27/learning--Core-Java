
enum Status {
    RUNNING, FAILED, PENDING, SUCCESS;
}

public class Enum2 {

    public static void main(String[] args) {

        Status s = Status.RUNNING;
        Status ss = Status.FAILED;

        switch (s) {
            case RUNNING:
                System.out.println("System is running");
                break;

            case FAILED:
                System.out.println("System failed");
                break;

            case PENDING:
                System.out.println("Please wait");
                break;

            case SUCCESS:
                System.out.println("Task completed");
                break;
        }
        // or

        switch (ss) {
            case RUNNING ->
                System.out.println("Running...");
            case FAILED ->
                System.out.println("Error...");
            case PENDING ->
                System.out.println("Wait...");
            case SUCCESS ->
                System.out.println("Done...");
        }

    }
}
