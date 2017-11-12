class MagnetofonTester {
	public static void main(String[] args){
		
		Magnetofon m = new Magnetofon();//poprawile to dodalem
		m.mozeNgarywac = true;
		m.odtworzTasme();
		
		if (m.mozeNgarywac == true) {
			m.nagrajTasme();
		}
	}
}