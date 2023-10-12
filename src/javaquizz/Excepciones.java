package javaquizz;


public class Excepciones {

    public static void main(String[] args) {

//        try {
//
//            int a = 9;
//            int b = 0;
//            int resultado = a / b;
//
//        } 
//        catch (Exception e) {
//            System.out.println("No se puede dividir por cero");
//        }
        try {
            //Declaro un vector de 3 posiciones 
            int edades[] = {30, 40, 10, 15};
            System.out.println(edades[4]);

        } catch (Exception e) {
            System.out.println("Intentastes acceder a un indice que no corresponde");
        } finally {
            System.out.println("Vuelve a ejecutar el programa");
        }

    }

}
