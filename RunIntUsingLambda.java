package RunableInterface;
class Test{
public static void mani(String args[]) {
	Runnable r =()->{
			for(int i=0;i<5;i++) {
				System.out.println("thread 1");
			}
		};
	Thread t=new Thread(r);
	t.start();
	for(int i=0;i<5;i++) {
		System.out.println("Thread2");
	}
}
}
