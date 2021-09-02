import java.util.Scanner;

public class Rectangulo {

    private static Punto punto1;
    private static Punto punto2;
    private static Punto punto3;
    private static Punto punto4;

    public Rectangulo (){

    }

    public void setPuntos (){
        Scanner sc = new Scanner(System.in);
        int xMenor = 1000;
        int xMayor = 1;
        int yMenor = 1000;
        int yMayor = 1;
        int x[] = new int[3];
        int y[] = new int[3];
        System.out.println("Introduzca los datos");
        for (int i = 0; i < 3; i++) {
            System.out.println("x"+i+1+":");
            x[i] = sc.nextInt();//5
            System.out.println("y"+i+1+":");
            y[i] = sc.nextInt();
            if (x[i]<=xMenor){
                xMenor=x[i];//xMenor=(5,y) ;
                System.out.println(xMenor+" "+" "+yMenor);
                System.out.println(xMayor+" "+" "+yMayor);
            }else {
                xMayor = x[i];//xMayor(7,y)
                System.out.println(xMenor+" "+" "+yMenor);
                System.out.println(xMayor+" "+" "+yMayor);
            }
            if(y[i]<=yMenor){
                yMenor=y[i];//yMenor(5,4)
                System.out.println(xMenor+" "+" "+yMenor);
                System.out.println(xMayor+" "+" "+yMayor);
            }else {
                yMayor=y[i];
                System.out.println(xMenor+" "+" "+yMenor);
                System.out.println(xMayor+" "+" "+yMayor);
            }
        }
        punto1 = new Punto(xMenor, yMenor);
        punto2 = new Punto(xMenor, yMayor);
        punto3 = new Punto(xMayor, yMayor);
        punto4 = new Punto(xMayor, yMenor);

        System.out.println("Punto1: "+punto1);
        System.out.println("Punto2: "+punto2);
        System.out.println("Punto3: "+punto3);
        System.out.println("Punto4: "+punto4);
    }
}
