public class Cono{
	private double radio;
	private double pi=3.1416;
	private double altura;
	public Cono (double radio, double altura){
		this.radio=radio;
		this.altura=altura;
	}
	public void setCono(double radio, double altura){
		this.radio=radio;
		this.altura=altura;
	}
	public double areaCono(){
		return pi*radio*(Math.sqrt(Math.pow(radio,2)+Math.pow(altura,2))+radio);
	}
	public double volumenCono(){
		return (1/3)*pi*Math.pow(radio,2)*altura;
	}
	public void impresionArea(){
		System.out.println("El area de tu cono es: "+areaCono());
	}
	public void impresionVolumen(){
		System.out.println("El volumen de tu cono es: "+volumenCono());
	}
}