import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        String nombre = "Matrix";
        String sinopsis = """ 
                La mejor pelicula del fin del milenio 
                """;
        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        double mediaEvalucionUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Lanzamiento: " + fechaDeLanzamiento);
        System.out.println("evaluacion: " + evaluacion);
        System.out.println("Plan Basico: " + incluidoEnElPlanBasico);

        if (fechaDeLanzamiento > 2023){

            System.out.println("Pelicula popular en el momento");

        }else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3 ; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingrese la nota que le darias a matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvalucionUsuario = mediaEvalucionUsuario + notaMatrix;

        }

        System.out.println("Media de la pelicula" + "Matrix calculada por el usuario es: " + mediaEvalucionUsuario / 3);
    }
}