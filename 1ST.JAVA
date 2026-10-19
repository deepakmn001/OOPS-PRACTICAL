class Student {
    int roll;
    String name;
    int m1, m2, m3;

    Student(int r, String n, int a, int b, int c) {
        roll = r;
        name = n;
        m1 = a;
        m2 = b;
        m3 = c;
    }

    int total() {
        return m1 + m2 + m3;
    }

    double percentage() {
        return total() / 3.0;
    }

    void display() {
        System.out.println("Roll No" + roll);
        System.out.println("Name " + name);
        System.out.println("Total Marks" + total());
        System.out.println("Percentage " + percentage());
        System.out.println();
    }

    public static void main(String[] args) {
        Student s1 = new Student(1, "DEEPAK", 80, 85, 90);
        Student s2 = new Student(2, "REHMAT", 16, 40, 65);
        Student s3 = new Student(3, "AJAY", 90, 95, 85);

        s1.display();
        s2.display();
        s3.display();
    }
}