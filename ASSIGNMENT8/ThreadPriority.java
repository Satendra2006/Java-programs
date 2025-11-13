class Priority extends Thread {
    public void run() {
        System.out.println(getName() + " Priority: " + getPriority());
    }
}

class ThreadPriority {
    public static void main(String[] args) {
        Priority t1 = new Priority();
        Priority t2 = new Priority();
        t1.setPriority(8);
        t2.setPriority(5);
        t1.start();
        t2.start();
    }
}
