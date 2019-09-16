public class Cono{
	private double radio;//Declaración de variables
	private double pi=3.1416;//de tipo double
	private double altura;
	public Cono (double radio, double altura){//constructor
		this.radio=radio;
		this.altura=altura;
	}
	public void setCono(double radio, double altura){
		this.radio=radio;
		this.altura=altura;
	}
	public double areaCono(){//metodo para obtener el area superficial del cono en terminos de radio de la base y altura
		return pi*radio*(Math.sqrt(Math.pow(radio,2)+Math.pow(altura,2))+radio);
	}
	public double volumenCono(){//metodo para obtener el volumen del cono en terminos del radio de la base y altura
		return (1/3)*pi*Math.pow(radio,2)*altura;
	}
	public void impresionArea(){//metodo para imprimir el resultado del area
		System.out.println("El area de tu cono es: "+areaCono());
	}
	public void impresionVolumen(){//metodo para imprimir el resultado del volumen
		System.out.println("El volumen de tu cono es: "+volumenCono());
	}
}
