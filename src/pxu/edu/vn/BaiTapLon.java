package pxu.edu.vn;

import java.util.Scanner;

public class BaiTapLon {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int n = nhapSoLuongSinhVien();
//		System.out.println("n = " + n);
//		// Tao cac mang 1 chieu chua hoten, dToan, dVan, dAnh va DTB
//		String[] hoten = new String[n];
//		double[] dToan = new double[n];
//		double[] dVan = new double[n];
//		double[] dAnh = new double[n];
//		double[] dTB = new double[n];
//		// Goi ham nhap du lieu
//		nhapHoTenVaDiem(hoten, dToan, dVan, dAnh);
//		// Xuat danh sach vua nhap
//		inDSSV(hoten, dToan, dVan, dAnh, dTB);
//		// Goi ham tinh diem trung binh
//		dTB = tinhDTB(dToan, dVan, dAnh);
//		// Xuat danh sach vua nhap
//		inDSSV(hoten, dToan, dVan, dAnh, dTB);
//		// Sap xep DSSV theo DTB
//		sapxepDSSV(hoten, dToan, dVan, dAnh, dTB);
//		inDSSV(hoten, dToan, dVan, dAnh, dTB);
//		//tim kiem diem
//		timkiemDiem(hoten, dToan, dVan, dAnh, dTB);
		char key;
		do {
			inMenu();
			Scanner sc = new Scanner(System.in);
			System.out.print("Ban chon chuc nang nao: ");
			key = sc.next().charAt(0);
			String[] hoten;
			double[] dToan;
			double[] dVan;
			double[] dAnh;
			double[] dTB;
			switch(key) {
			case '1': 
				int n = nhapSoLuongSinhVien();
				hoten = new String[n];
				dToan = new double[n];
				dVan = new double[n];
				dAnh = new double[n];
				dTB = new double[n];
				break;
			case '2':
				dTB = tinhDTB(dToan, dVan, dAnh);
				inDSSV(hoten, dToan, dVan, dAnh, dTB);
				break;
			case '3':
				inDSSV(hoten, dToan, dVan, dAnh, dTB);
				break;
			case '4':
				sapxepDSSV(hoten, dToan, dVan, dAnh, dTB);
				inDSSV(hoten, dToan, dVan, dAnh, dTB);
				break;
			case '5':
				timkiemDiem(hoten, dToan, dVan, dAnh, dTB);
				break;
			case 'Q':
				break;
			case 'q':
				break;
			}
		}while(key != 'Q' || key != 'q');
	}
	
	//Ham tao menu
	public static void inMenu() {
		System.out.println("*******************************");
		System.out.println("(1): Nhap du lieu");
		System.out.println("(2): Tinh Diem trung binh");
		System.out.println("(3): In danh sach sinh vien");
		System.out.println("(4): Sap xep theo DTB");
		System.out.println("(5): Tim kiem theo diem Toan");
		System.out.println("(Q/q): Thoa khoi chuong trinh");
		System.out.println("*******************************");
	}

	// Ham nhap so luong sinh vien N nguyen duong
	public static int nhapSoLuongSinhVien() {
		try {
			int n;
			Scanner sc = new Scanner(System.in);
			do {
				System.out.print("Nhap so luong sinh vien n = ");
				n = sc.nextInt();
			} while (n <= 0);
			return n;
		} catch (Exception e) {
			System.out.println("DA XAY RA LOI TRONG QUA TRINH NHAP DU LIEU");
			return -1;
		}
	}

	// Ham nhap ho ten, diem Toan, Van Anh
	public static void nhapHoTenVaDiem(String[] hoten, double[] dToan, double[] dVan, double[] dAnh) {
		System.out.println("*************************************************************");
		try {
			for (int i = 0; i < hoten.length; i++) {
				Scanner sc = new Scanner(System.in);
				System.out.println("Nhap du lieu cho sinh vien thu " + (i + 1));
				System.out.print("Ho ten: ");
				hoten[i] = sc.nextLine();
				System.out.print("Diem Toan: ");
				dToan[i] = sc.nextDouble();
				System.out.print("Diem Van: ");
				dVan[i] = sc.nextDouble();
				System.out.print("Diem Anh: ");
				dAnh[i] = sc.nextDouble();
			}
		} catch (Exception e) {
			System.out.println("DA XAY RA LOI TRONG QUA TRINH NHAP DU LIEU");
		}
		System.out.println("*************************************************************");
	}

	// Ham tinh diem trung binh
	public static double[] tinhDTB(double[] dToan, double[] dVan, double[] dAnh) {
		double[] dtb = new double[dToan.length];
		for (int i = 0; i < dtb.length; i++) {
			dtb[i] = Math.round(((dToan[i] + dVan[i] + dAnh[i]) / 3) * 100.0) / 100.0;
		}
		return dtb;
	}

	// Ham sap xep sinh vien theo chieu giam dan cua diem trung binh
	public static void sapxepDSSV(String[] hoten, double[] dToan, double[] dVan, double[] dAnh, double[] dTB) {
		for (int i = 0; i < dTB.length - 1; i++) {
			for (int j = i + 1; j < dTB.length; j++) {
				if (dTB[i] < dTB[j]) {
					// hoan vi DTB
					double tam = dTB[i];
					dTB[i] = dTB[j];
					dTB[j] = tam;
					// hoan vi Toan
					tam = dToan[i];
					dToan[i] = dToan[j];
					dToan[j] = tam;
					// hoan vi Van
					tam = dVan[i];
					dVan[i] = dVan[j];
					dVan[j] = tam;
					// hoan vi Anh
					tam = dAnh[i];
					dAnh[i] = dAnh[j];
					dAnh[j] = tam;
					// hoan vi hoten
					String tam2 = hoten[i];
					hoten[i] = hoten[j];
					hoten[j] = tam2;
				}
			}
		}
	}

	// Ham in danh sach sinh vien ra man hinh
	public static void inDSSV(String[] hoten, double[] dToan, double[] dVan, double[] dAnh, double[] dTB) {
		System.out.println("*************************************************************");
		System.out.println("\t\t\t DANH SAH SINH VIEN");
		for (int i = 0; i < hoten.length; i++) {
			System.out.println(
					hoten[i] + "; Toan: " + dToan[i] + "; Van: " + dVan[i] + "; Anh: " + dAnh[i] + "; DTB: " + dTB[i]);
		}
		System.out.println("*************************************************************");
	}

	// Ham tim kiem sinh vien theo diem mon Toan
	public static void timkiemDiem(String[] hoten, double[] dToan, double[] dVan, double[] dAnh,
			double[] dTB) {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		double diemcantim;
		try {
			do {
				System.out.print("Diem Toan can tim: ");
				diemcantim = sc.nextDouble();
			}while(diemcantim < 0.0 || diemcantim > 10.0);
			
			for (int i = 0; i < dToan.length; i++) {
				if (dToan[i] == diemcantim) {
					System.out.println(hoten[i] + "; Toan: " + dToan[i] + "; Van: " + dVan[i] + "; Anh: " + dAnh[i]
							+ "; DTB: " + dTB[i]);
					count = count + 1;
				}
			}
			if(count == 0) {
				System.out.println("KHONG TIM THAY");
			}
		}catch(Exception e){
			System.out.println("DA XAY RA LOI TRONG QUA TRINH NHAP DU LIEU");
		}	
	}

	// Ham tim kiem sinh vien theo ho ten
	public static void timHoTen(String[] hoten, double[] dToan, double[] dVan, double[] dAnh, double[] dTB) {

	}
}
