package week05.vincent.id.ac.umn;

import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int menu;
		
			System.out.println("--------Program Menghitung Bangun Ruang--------");
			System.out.println("1. Lingkaran");
			System.out.println("2. Persegi");
			System.out.println("3. Persegi Panjang");
			System.out.println("4. Segitiga");
			System.out.println("5. Keluar");
			System.out.print("Pilihan : ");
			menu = scanner.nextInt();
        
			System.out.println();

			switch (menu) {
            	case 1:
            		System.out.println("-----------Lingkaran-----------");
            		System.out.print("Masukkan jari-jari : ");
            		double radius = scanner.nextDouble();
            		System.out.print("Warna : ");
            		String warnaCircle = scanner.next();
            		Circle circle = new Circle(radius, warnaCircle);

            		System.out.println("Warna\t\t: " + circle.getColor());
            		System.out.println("Jari-jari\t: " + circle.getRadius());
            		System.out.println("Keliling Lingkaran\t: " + circle.getPerimeter());
            		System.out.println("Luas Lingkaran\t\t: " + circle.getArea());
            		break;

            	case 2:
            		System.out.println("-----------Persegi-----------");
            		System.out.print("Masukkan panjang sisi : ");
            		double side = scanner.nextDouble();
            		System.out.print("Warna : ");
            		String warnaSquare = scanner.next();
            		Square square = new Square(side, warnaSquare);

            		System.out.println("Warna\t\t: " + square.getColor());
            		System.out.println("Panjang Sisi\t: " + square.getSide());
            		System.out.println("Keliling Persegi\t: " + square.getPerimeter());
            		System.out.println("Luas Persegi\t: " + square.getArea());
            		break;

            	case 3:
            		System.out.println("-----------Persegi Panjang-----------");
            		System.out.print("Masukkan panjang : ");
            		double length = scanner.nextDouble();
            		System.out.print("Masukkan lebar : ");
            		double width = scanner.nextDouble();
            		System.out.print("Warna : ");
            		String warnaRectangle = scanner.next();
            		Rectangle rectangle = new Rectangle(length, width, warnaRectangle);

            		System.out.println("Warna\t\t\t: " + rectangle.getColor());
            		System.out.println("Panjang & Lebar\t\t: " + rectangle.getLength() + " & " + rectangle.getWidth());
            		System.out.println("Keliling Persegi Panjang\t: " + rectangle.getPerimeter());
            		System.out.println("Luas Persegi Panjang\t: " + rectangle.getArea());
            		break;

            	case 4:
            		System.out.println("-----------Segitiga Siku-Siku-----------");
            		System.out.print("Masukkan alas : ");
            		double base = scanner.nextDouble();
            		System.out.print("Masukkan tinggi : ");
            		double height = scanner.nextDouble();
            		System.out.print("Warna : ");
            		String warnaTriangle = scanner.next();
            		Triangle triangle = new Triangle(base, height, warnaTriangle);

            		System.out.println("Warna\t\t\t: " + triangle.getColor());
            		System.out.println("Alas & Tinggi\t\t: " + triangle.getBase() + " & " + triangle.getHeight());
            		System.out.println("Keliling Segitiga\t: " + triangle.getPerimeter());
            		System.out.println("Luas Segitiga\t\t: " + triangle.getArea());
            		break;

            	case 5:
            		System.out.println("Keluar program...");
            		break;

            	default:
            		System.out.println("Input tidak valid");

            		System.out.println();
			} while (menu != 5);

			scanner.close();
		}
	}