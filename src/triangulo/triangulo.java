package triangulo;

public class triangulo {
	int l1;
	int l2;
	int l3;
	
	public void setl1(int l1) {
		this.l1 = l1;
	}
	
	public int getl1() {
		return this.l1;
	}
	
	public void setl2(int l2) {
		this.l2 = l2;
	}
	
	public int getl2() {
		return this.l2;
	}
	public void setl3(int l3) {
		this.l3 = l3;
	}
	
	public int getl3() {
		return this.l3;
	}
	
	public boolean esEscaleno() {
		boolean escaleno;
		if(l1 != l2 && l2 != l3 && l1 != l3) {
			escaleno = true;
		}else {
			escaleno = false;
		}
		return escaleno;
	}
	
	public boolean esIsosceles() {
		boolean isosceles;
		if((l1==l2 && l2!=l3 && l1!=l3) || (l1!=l2 && l2!=l3 && l1==l3) || (l1!=l2 && l1!=l3 &&
				l2==l3)) {
			isosceles = true;
		}else {
			isosceles = false;
		}
		return isosceles;
	}
	
	public boolean esEquilatero() {
		boolean equilatero;
		if(l1 == l2 && l2 == l3) {
			equilatero = true;
		}else {
			equilatero = false;
		}
		return equilatero;
	}
	
	public boolean tieneAnguloRecto() {
		boolean angulo;
		if(((l1*l1 +l2*l2) == l3) || ((l2*l2 + l3*l3) == l1) || ((l1*l1 + l3*l3) == l2)) {
			angulo = true;
		}else {
			angulo = false;
		}
		return angulo;
	}
	
}
