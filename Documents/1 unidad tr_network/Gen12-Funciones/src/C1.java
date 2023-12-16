public class C1 {
    public static void main(String[] args) {

        //int i = suma(5,6);

        System.out.println(suma(5,6));
        System.out.println(resta(5,6));
        System.out.println(multiplicacion(5,6));
        System.out.println(division(5,6));

    }


    //crear una funcion que reciba como argumento dos numeros enteros y regrese la suma de ellos
    static int suma(int a, int b){
        return a+b;
    }
//crear una funcion que reciba como argumento dos numeros enteros y regrese y la resta de ellos
    static int resta(int a, int b){
        return a-b;
    }
    //crear una funcion que reciba como argumento dos numeros enteros y regrese la multiplicacion de ellos
    static int multiplicacion(int a, int b){
        return a*b;
    }
    //crear una funcion que reciba como argumento dos numeros enteros y regrese la division de ellos
    static double division(int a, int b){
        return  (a/(b*1.0));
    }
}
