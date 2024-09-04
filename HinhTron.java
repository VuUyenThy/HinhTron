package VuUyenThy_23730871;

public class HinhTron {
	private double banKinh;
	private Tam t;
	
	public Tam getT() {
		return t;
	}
	public void setT(Tam t) throws Exception {
		if (t != null) {
			this.t = t;
		} else {
			throw new Exception("Loi");
		}
	}
//Hang
public static final double PI= 3.1416;
//Dong goi va rang buoc
public double getBanKinh() {
	return banKinh;
}
public void setBanKinh(double b) throws Exception {
	if (b>0) {
		this.banKinh = b;
	} else {
		throw new Exception("Loi");
	}
}

//contrustion
public HinhTron( ) {}
public HinhTron(double banhKinh, Tam t) {
	this.banKinh = banhKinh;
	this.t = t;
}
//Ham tao dien tich chu vi
public double getChuVi() {
	return getBanKinh()*2*PI;
}
public double getDienTich() {
	return getBanKinh()*getBanKinh()*PI;
}
//In Mau
@Override
public String toString() {
	String m ="";
	m+=m.format(", %5s,%5s,%5s",getBanKinh(),getChuVi(),getDienTich());
	return m;
}
//thu
public static void main(String[] args) throws Exception{
	HinhTron h1 = new HinhTron(5, new Tam("O", 20, 10));
	System.out.println(h1);
	
}

}
