class perkusjaTester {
	public static void main(String[] args) {
		
		Perkusja p = new Perkusja();
		p.zagrajNaBebnie();
		p.zagrajNaTalerzach();
		p.beben = true;
		if (p.beben == true){
			p.zagrajNaBebnie();
			System.out.println("To jest w ifie");
		}
			}
}