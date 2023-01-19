public class Calculator {
     int memory;
     
     public Calculator() {
       
     }
   
     public int add(int a, int b) {
       int sum = a + b;
       return sum;
     }
   
     public int subtract(int a, int b) {
       int subtraction = a - b;
       return subtraction;
     }
   
     public int mulitply(int a, int b) {
       int multiplication = a * b;
       return multiplication;
     }
   
     public int divide(int a, int b) {
       int division = a/b;
       return division;
     }
   
     public int modulo(int a, int b) {
       int modulo = a % b;
       return modulo;
     }
   
     public void addToMemory(int numberToAdd) {
       System.out.println("The memory now holds " + numberToAdd);
       memory = numberToAdd;
     }
   
     public static void main(String[] args) {
       Calculator myCalculator = new Calculator();
       System.out.println(myCalculator.add(5,7));
       System.out.println(myCalculator.subtract(45,11));
       myCalculator.addToMemory(34);
       System.out.println(myCalculator.memory);
     }
   }