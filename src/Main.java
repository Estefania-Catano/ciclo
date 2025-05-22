import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double nota = 0, acumulado = 0, cantidadNotas=0;
        System.out.println("Ingrese la cantidad de notas a promediar: ");
        cantidadNotas = sc.nextDouble();
        System.out.println("Promedio de notas lógica programación");
        for(int i=1; i<=cantidadNotas;i++){
            System.out.print("Ingrese la nota: " + i + " ");
            nota=sc.nextDouble();
            acumulado+=nota;
        }
        System.out.println("El promedio del estudiante es: " + acumulado/cantidadNotas);
    }
}