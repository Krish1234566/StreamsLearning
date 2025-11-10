public class SecondFor implements Runnable{
  public   void run(){
        for(int i=16; i<=45; i++){
            System.out.println("second thread for "+ i);
        }
    }
}
