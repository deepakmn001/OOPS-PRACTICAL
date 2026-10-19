interface Printable {
    void print();
}

interface Scannable {
    void scan();
}

class Machine {
    void start() {
        System.out.println("Machine started");
    }
}

class AllInOnePrinter extends Machine implements Printable, Scannable {
    public void print() {
        System.out.println("Printing document");
    }

    public void scan() {
        System.out.println("Scanning document");
    }
}

class Main {
    public static void main(String[] args) {
        AllInOnePrinter p = new AllInOnePrinter();

        p.start();
        p.print();
        p.scan();
    }
}