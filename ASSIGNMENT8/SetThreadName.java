class MyThread extends Thread {
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println("The new name of the thread: " + t.getName());
        System.out.println("Id: " + t.getId());
        System.out.println("Is Alive: " + t.isAlive());
    }
}

class SetThreadName {
    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        t1.setName("Special Thread");
        t1.start();
    }
}