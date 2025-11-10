public class MainExcep {
    public static void main(String[] args) {
     /*   try{
            System.out.println("try");
            exceptionMethod();

        }

        catch (ExceptionLearning e){
            System.out.println(e.getMessage());

        }catch(Exception e){
            System.out.println("hello world");

        }finally{
            System.out.println("final");
        }
    }
    public static void exceptionMethod()throws ExceptionLearning {
         throw new ExceptionLearning("789789");*/


           /*     try {
                    int result = 10 /10; // Causes ArithmeticException
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Error: Division by zero is not allowed.");
                    System.out.println("Exception Message: " + e.getMessage());
                    e.printStackTrace();
                } finally {
                    System.out.println("Finally block executed.");
                }
                System.out.println("Program continues after try-catch-finally.");


                try {
                    int[] numbers = {1, 2, 3};
                    System.out.println(numbers[5]);  // ArrayIndexOutOfBoundsException
                    String text = null;
                    System.out.println(text.length());  // NullPointerException
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Array index is out of bounds!");
                } catch (NullPointerException e) {
                    System.out.println("Null pointer exception caught!");
                } finally {
                    System.out.println("Finally block is always executed.");
                }*/

        FirstFor firstFor=new FirstFor();
        SecondFor secondFor=new SecondFor();
       Thread thread1=new Thread(firstFor);
       Thread thread2=new Thread(secondFor);
       thread1.start();
       thread2.start();
       thread2.setPriority(Thread.MAX_PRIORITY);
        System.out.println("first thread state: "+thread1.getName()+" "+thread1.getState()+" "+thread1.getPriority());
        System.out.println("Second thread state: "+thread2.getName()+" "+thread2.getState()+" "+thread2.getPriority());


        System.out.println("Second thread state: "+thread2.getName()+" "+thread2.getState()+" "+thread2.getPriority());

    }
}

