package tugas2;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan berat (dalam kilogram)
        System.out.print("Masukkan berat Anda (kg): ");
        double berat = input.nextDouble();

        // Meminta pengguna untuk memasukkan tinggi (dalam meter)
        System.out.print("Masukkan tinggi Anda (m): ");
        double tinggi = input.nextDouble();

        // Menghitung BMI
        double bmi = berat / (tinggi * tinggi);

        // Menampilkan hasil BMI
        System.out.println("BMI Anda adalah: " + bmi);

        // Menentukan status BMI
        if (bmi < 18.5) {
            System.out.println("Anda termasuk ke dalam kategori Kurus.");
        } else if (bmi < 24.9) {
            System.out.println("Anda termasuk ke dalam kategori Normal.");
        } else if (bmi < 29.9) {
            System.out.println("Anda termasuk ke dalam kategori Kelebihan Berat Badan.");
        } else {
            System.out.println("Anda termasuk ke dalam kategori Obesitas.");
        }

    }}
