package pxu.edu.vn;

import java.util.Scanner;

public class BaiTapLon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = nhapSoLuongSinhVien();
		System.out.println("n = " + n);
		//Tao cac mang 1 chieu chua hoten, dToan, dVan, dAnh va DTB
		String[] hoten = new String[n];
		double[] dToan = new double[n];
		double[] dVan = new double[n];
		double[] dAnh = new double[n];
		double[] dTB = new double[n];
		//Goi ham nhap du lieu
		nhapHoTenVaDiem(hoten, dToan, dVan, dAnh);
	}
	
	//Ham nhap so luong sinh vien N nguyen duong
	public static int nhapSoLuongSinhVien() {
		try {
			int n;
			Scanner sc = new Scanner(System.in);
			do {
				System.out.print("Nhap so luong sinh vien n = ");
				n = sc.nextInt();
			}while( n <= 0);
			return n;
		}catch(Exception e) {
			System.out.println("DA XAY RA LOI TRONG QUA TRINH NHAP DU LIEU");
			return -1;
		}
	}
	//Ham nhap ho ten, diem Toan, Van Anh
	public static void nhapHoTenVaDiem(String[] hoten,
										double[] dToan,
										double[] dVan,
										double[] dAnh) {
		System.out.println("*************************************************************");
		try {
			Scanner sc = new Scanner(System.in);
			for(int i = 0; i < hoten.length; i++) {
				System.out.println("Nhap du lieu cho sinh vien thu " + (i + 1));
				System.out.print("Ho ten: ");
				hoten[i] = sc.next();
				System.out.print("Diem Toan: ");
				dToan[i] = sc.nextDouble();
				System.out.print("Diem Van: ");
				dVan[i] = sc.nextDouble();
				System.out.print("Diem Anh: ");
				dAnh[i] = sc.nextDouble();
			}
		}catch(Exception e) {
			System.out.println("DA XAY RA LOI TRONG QUA TRINH NHAP DU LIEU");
		}
		System.out.println("*************************************************************");
	}
	//Ham tinh diem trung binh
//	public static double[] tinhDTB(double[] dToan, double[] dVan, double[] dAnh) {
//		
//	}
	//Ham sap xep sinh  vien theo chieu giam dan cua diem trung binh
	public static void sapxepDSSV(String[] hoten,
										double[] dToan,
										double[] dVan,
										double[] dAnh,
										double[] dTB) {
		
	}
	//Ham in danh sach sinh vien ra man hinh
	public static void inDSSV(String[] hoten,
										double[] dToan,
										double[] dVan,
										double[] dAnh,
										double[] dTB) {
		
	}
	//Ham tim kiem sinh vien theo diem mon Toan
	public static void timkiemDiem(String[] hoten,
										double[] dToan,
										double[] dVan,
										double[] dAnh,
										double[] dTB) {
		
	}
	//Ham tim kiem sinh vien theo ho ten
	public static void timHoTen(String[] hoten,
										double[] dToan,
										double[] dVan,
										double[] dAnh,
										double[] dTB) {
		
	}
}
