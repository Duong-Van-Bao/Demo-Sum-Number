import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 *
 Bước 1: Tạo biến n, unit, ten, hundred, sum
 Bước 2: In thông báo nhập n
 Bước 3: Cho người dùng nhập vào n
 Bước 4: Tách hàng trăm theo công thức:
 hundred = n/100;
 Bước 5: Tách số hàng chục theo công thức 
 ten = ((n%100/10));
 Bước 6: Tách số hàng đơn vị theo công thức 
 unit = (n%10);
 Bước 7: Tính Sum = hundred + ten + unit;
 Bước 8: In kết quả ra màn hình
 *
 **/
		
		int n;
		int unit;
		int ten;
		int hundred;
		int sum;
		Scanner nhap = new Scanner(System.in);
		System.out.println("Vui lòng nhập vào số n: ");
		n = Integer.parseInt(nhap.nextLine());
		hundred = n/100;
		ten = n%100/10; 
		unit = n%10;
		sum = hundred + ten + unit;
		System.out.println("Tổng của ba kí số của n = " + n + "\t là: " + sum);
	}
}
