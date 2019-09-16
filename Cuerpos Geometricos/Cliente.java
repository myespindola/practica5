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
                    
                    break;
                case 2:
                    
                    break;
                case 3:
                    
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        }while(op!=0);
    }
}