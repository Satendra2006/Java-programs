abstract class Bank {
    abstract double getROI();
}

class SBI extends Bank {
    double getROI() {
        return 6.5;
    }
}

class PNB extends Bank {
    double getROI() {
        return 7.0;
    }
}

class BOI extends Bank {
    double getROI() {
        return 6.8;
    }
}

class BankROI {
    public static void main(String[] args) {
        Bank b;
        b = new SBI();
        System.out.println("SBI Rate of Interest: " + b.getROI());
        b = new PNB();
        System.out.println("PNB Rate of Interest: " + b.getROI());
        b = new BOI();
        System.out.println("BOI Rate of Interest: " + b.getROI());
    }
}