class CustomException extends Exception {
    private String message = null;

    public CustomException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}

public class Activity_2_4_Exception_Handling {
    public static void main(String[] a){
        try {
        	Activity_2_4_Exception_Handling.exceptionTest("Will print to console");
        	Activity_2_4_Exception_Handling.exceptionTest(null);
        	Activity_2_4_Exception_Handling.exceptionTest("Won't execute");
        } catch(CustomException mae) {
            System.out.println("Inside catch block: " + mae.getMessage());
        }
    }

    static void exceptionTest(String str) throws CustomException {
        if(str == null) {
            throw new CustomException("String value is null");
        } else {
            System.out.println(str);
        }
    }
}