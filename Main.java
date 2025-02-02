//Main.java
// Name:Alabhya Sharma
// Branch:AIML 2023-27 
// Batch: A1
class Main{
	public static void main(String args[]){
		Calculator cal = new Calculator();
		UserInput ui = new UserInput();
		System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Fibonacci");
        int choice = ui.getIntInput("Enter your choice: ");
        
        switch (choice) {
            case 1:
                System.out.println("Sum is: " + cal.sum());
                break;
            case 2:
                System.out.println("Subtraction is: " + cal.sub());
                break;
            case 3:
                System.out.println("Multiplication is: " + cal.multiplication());
                break;
            case 4:
                System.out.println("Division is: " + cal.division());
                break;
            case 5:
			int n = ui.getIntInput("Enter n for Fibonacci: ");
                System.out.println("Fibonacci result: " + cal.fibonacci(n));
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
