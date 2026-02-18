public class Switch {
    public static void main(String[] args) {
        //Example of switch case
        int day = 3;
        String dayName = switch (day) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid day";
        };
        System.out.println("The day is: " + dayName);   
        
    }
}
/*
Switch case in Java :-
The switch statement is a control flow statement that allows you to execute a block of code based on the value of an expression. It is an alternative to using multiple if-else statements when you have a large number of conditions to check. The switch statement evaluates the expression and compares it to the values specified in the case labels. If a match is found, the corresponding block of code is executed. If no match is found, the default block of code is executed (if provided).
*/
