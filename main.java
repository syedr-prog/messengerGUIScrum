
class main{
    public static void main(String[] args) throws InterruptedException{
    	
       Thread thread1 = new Thread() {
        	public void run() {
                outServer server1=new outServer();
                server1.startRunning();
        	}
        };
        Thread thread2 = new Thread() {
        	public void run() {
                client_server serverObj = new client_server("10.0.0.113");
                serverObj.startRunning();
        	}
        };
        
        thread1.start();
        thread2.sleep(10000);
        thread2.start();
   }
}