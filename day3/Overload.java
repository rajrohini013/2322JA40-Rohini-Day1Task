package day3;

class Overload {
    int sum(int a, int b) {
        return a + b;
    }

    double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Overload obj = new Overload();
        System.out.println(obj.sum(5, 10));        // int version
        System.out.println(obj.sum(2.5, 3.5));     // double version
    }
}
