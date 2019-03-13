package assignment3.hinhchunhat;

import java.util.Scanner;

public class Rectangle {
   public double length;
   public double width;

   public void nhap(){
       Scanner scanner = new Scanner(System.in);
       System.out.println("Nhập chiều dài: ");
       length = scanner.nextDouble();
       System.out.println("Nhập Chiều rộng: ");
       width = scanner.nextDouble();
     //  this.hienThi();

   }
   public void hienThi(){
       System.out.println("Chiều dài hình chữ nhật"+length);
       System.out.println("Chiều rộng hình chữ nhật"+width);
       System.out.println("Chu vi hình chữ nhật :"+tinhChuVi());
       System.out.println("Diện tích hình chữ nhật là:"+tinhDienTich());
   }
   public double tinhChuVi(){
       double chuVi = (length + width) * 2;
       return chuVi;
   }
    public double tinhDienTich() {
        double dienTich = length * width;
        return dienTich;
    }
}
