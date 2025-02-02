# Calculator_project
//Calculator.java

class Calculator{
	int sum(){
		UserInput ui = new UserInput();    
		int[] numbers = ui.UserInput();    //array is retun my user input will be stored in userinput
		int sum = numbers[0] +numbers[1];   //it will sum the numbers
		return sum;
	} 
	int sub(){
		UserInput ui = new UserInput();    
		int[] numbers = ui.UserInput();    
		int sub = numbers[0] - numbers[1];   
		return sub;
	}
	int multiplication(){
		UserInput ui = new UserInput();    
		int[] numbers = ui.UserInput();    
		int multiplication = numbers[0] * numbers[1];   
		return multiplication;
	}
	int division(){
		UserInput ui = new UserInput();    
		int[] numbers = ui.UserInput();    
		int division = numbers[0] / numbers[1];   
		return division;
	}
	int fibonacci(int n) {
		if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    
    
}
