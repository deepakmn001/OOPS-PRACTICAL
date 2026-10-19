class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

class Employee {
    void calculatePay() {
        System.out.println("Employee salary");
    }
}

class Manager extends Employee {
    void calculatePay() {
        System.out.println("Manager salary30000");
    }
}

class Worker extends Employee {
    void calculatePay() {
        System.out.println("Worker salary15000");
    }
}

class Main {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        System.out.println(c.add(10, 20));
        System.out.println(c.add(10, 20, 30));
        System.out.println(c.add(2.5, 3.5));

        Employee e = new Manager();
        e.calculatePay();

        e = new Worker();
        e.calculatePay();
    }
}