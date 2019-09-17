public class Esfera{
	private double radio;
	private double pi = 3.1416;

	public Esfera(double radio){
		this.radio = radio;
	}

	public void setEsfera(double radio){
		this.radio = radio;
	}

	public double area(){
        return 4*pi*(Math.pow(radio,2));
	}

	public double volumen(){
		return (4*pi*(Math.pow(radio,3)))/3;
	}

	public void imprimirArea(){
		System.out.println("El area de la esfera es: " + area()+ " unidades cuadradas");
	}
	 public void imprimirVolumen(){
	 	System.out.println("El volumen de la esfera es: " + volumen()+" unidades cubicas");
	 }
}