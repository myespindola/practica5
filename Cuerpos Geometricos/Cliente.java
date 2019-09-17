import java.util.Scanner;

/**
 * Cliente
 */
public class Cliente {
    public static void main(String[] args) {
        int op;
        Scanner sc=new Scanner(System.in);
        System.out.println("Este programa calcula el area y volumen de diferentes cuerpos geometricos");
        do{
            System.out.println("Seleccione un cuerpo geometrico");
            System.out.println("1) Esfera");
            System.out.println("2) Cono");
            System.out.println("3) Prisma");
            System.out.println("0) Salir");
            op=sc.nextInt();
            switch (op) {
                case 0:
                    System.out.println("Adios");
                    break;
                case 1:
                    System.out.println("Ingrese el radio de la esfera");
                    double radio=sc.nextDouble();
                    Esfera esfera=new Esfera(radio);
                    esfera.imprimirArea();
                    esfera.imprimirVolumen();
                    break;
                case 2:
                    System.out.println("Ingrese la altura del cono");
                    double altura=sc.nextDouble();
                    System.out.println("Ingrese el radio de la base del cono");
                    radio=sc.nextDouble();
                    Cono cono=new Cono(radio,altura);
                    cono.impresionArea();
                    cono.impresionVolumen();
                    break;
                case 3:
                    System.out.println("Ingrese el numero de lados de la base");
                    int n_lado=sc.nextInt();
                    System.out.println("Ingrese el valor del lado");
                    double lado=sc.nextDouble();
                    System.out.println("Ingrese el valor del apotema");
                    double apotema=sc.nextDouble();
                    System.out.println("Ingrese la altura del cono");
                    altura=sc.nextDouble();
                    Prisma prisma=new Prisma(lado, altura, n_lado, apotema);
                    prisma.impArea();
                    prisma.impVol();
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(op!=0);
    }
}