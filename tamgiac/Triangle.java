package assignment3.tamgiac;

import java.util.Scanner;

public class Triangle {
    public double a;
    public double b;
    public double c;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }
    //* Hàm Nhập
    public void  Nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập cạnh a: ");
        a = scanner.nextDouble();
        System.out.println("Nhập cạnh b: ");
        b = scanner.nextDouble();
        System.out.println("Nhập cạnh c: ");
        c = scanner.nextDouble();
        if ((a < b + c) && (b < a + c) && (c < a + b)) {
            if ((a == b) && (b == c) && (c == a)) {
                System.out.println("Đây là tam giác đều");
            } else if ((a == b) || (b == c) || (c == a)) {
                System.out.println("đây là tam giác cân");
            } else if ((a * a == b * b + c * c) || (b * b == a * a + c * c) || (c * c == b * b + a * a)) {
                System.out.println("đây là tam giác vuông");

            } else {
                System.out.println("đây không phải là tam giác");
            }
        }
    }
    public void hienThi(){
        System.out.println(" Cạnh a "+a+" cạnh b "+b+" cạnh c "+c);
        System.out.println("Chu vi tam giác là : "+chuVi());
        System.out.println("Diện Tích hình tam giác là : "+dienTich());
    }
    public double chuVi(){
        double chuvi = a + b + c;
        return  chuvi;
    }
    public double dienTich(){
        double dientich = a + b + c / 2;
        return dientich;
    }


    }



