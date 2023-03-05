package TH1_LopHinhChuNhat;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chiều rộng hình chữ nhật là: ");
        double width= scanner.nextDouble();
        System.out.println("Chiều dài hình chữ nhật là: ");
        double height = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Hình chữ nhật của bạn là: "+ rectangle.display());
        System.out.println("Chu vi của hình chữ nhật là: "+ rectangle.getPerimeter());
        System.out.println(" Diện tích của hình chữ nhật là "+ rectangle.getArea());
    }
}
