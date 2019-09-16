public class Prisma{
	private double med_lado;
	private double altura;
	private int n_lados;
	private double apotem;

	public Prisma(double med_lado, double altura, int n_lados, double apotem){
		this.med_lado = med_lado;
		this.altura = altura;
		this.n_lados = n_lados;
		this.apotem = apotem;
	}

	public void setPrisma(double med_lado, double altura, int n_lados, double apotem){
		this.med_lado = med_lado;
		this.altura = altura;
		this.n_lados = n_lados;
		this.apotem = apotem;
	}

	public double areaBase(){
		return (n_lados*med_lado*apotem)/2;
	}

	public double areaLado(){
		return med_lado*altura;
	}

	public double volumen(){
		return ((n_lados*med_lado*apotem)/2)*altura;
	}

	public double areaTotal(){
		return (2*areaBase())+(n_lados*areaLado());

	}

	public void impVol(){
		System.out.println("El volumen  de su figura es: " + volumen() +" unidades cubicas");
	}

	public void impArea(){
		System.out.println("El area superficial de la figura es: " + areaTotal() + "unidades cuadradas");
	}
}