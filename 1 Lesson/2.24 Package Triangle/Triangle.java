public class Triangle {

    double a;
    double b;
    double c;

    Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    void getArea () {

       double p = (a+b+c)/2;

       double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));

       System.out.println("Area of this triangle " + s);
    }

}
