class ThreadData extends Thread {
	public void run() {
		System.out.println("Class: "+getClass());
		System.out.println("Name: "+getName());
		System.out.println("Priority: "+getPriority());
		System.out.println("Thread Group: "+getThreadGroup().getName());
	}
}

class ThreadDetails {
	public static void main(String args[]) {
		ThreadData t = new ThreadData();
		t.start();
	}
}