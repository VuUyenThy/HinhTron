package VuUyenThy_23730871;

import java.lang.reflect.UndeclaredThrowableException;

//Khai bao bien
public class Tam {
	private String ten ;
	private double x ;
	private double y ;

//Dong goi 
public String getTen() {
	return ten;
}
//Rang buoc
public void setTen(String ten) throws Exception {
	if (ten != null) {
		this.ten = ten;
	} else {
		throw new Exception("Loi");
	}
}
	
public double getX() {
	return x;
}
public void setX(double x) {
	this.x = x;
}
	
public double getY() {
	return y;
}
public void setY(double y) {
	this.y = y;
}
//Contrustion
public Tam () {}
public Tam(String ten, double x, double y) throws Exception {
	if (ten != null) {
		this.ten = ten;
	} else {
		throw new Exception("Loi");
	}
	this.x = x;
	this.y = y;
}
//Mau in 
@Override
public String toString() {
	String s="";
	s+=s.format("%5s (%3s,%3s)",getTen(),getX(),getY());
	return s ;
}

}










