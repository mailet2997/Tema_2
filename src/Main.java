//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
    //tipado, es lenguaje compilado

        //Tipos de datos primitivos y variables
        //las variables siempre se declaran con la inicial en minuscula

//        byte edad = 25; //8bit
//        short anio = 2024; //16bist
//        int poblacionCiudad = 500000; //32bits
//        long distanciaEntreEstrelllas = 15000000000000L; //64bits
//        float temperatura = 36.5f;
//        double precio = 19.99;//mayor precision que float
//        char inicial = 'A';
//        boolean esMayordeEdad = true;
//
//        System.out.println("edad"+ edad);
//        System.out.println("anio: " + anio);
//        System.out.println("poblacionciudad: "+ poblacionCiudad);
//        System.out.println("Distancia entre estrellas: " + distanciaEntreEstrelllas);
//        System.out.println("Temperatura: " + temperatura);
//        System.out.println("Precio: " + precio);
//        System.out.println("Inicial: " + inicial);
//        System.out.println("Es mayor de edad: " + esMayordeEdad);

        //Operadores Aritmeticos y Logicos
        //- Ejercicio 1: Comparación de Números - Declara dos números y usa una estructura if-else
        //para determinar cuál es mayor o si son iguales.

//        System.out.println("Comparacion de numeros ");
//        int num1 = 10;
//        int num2 = 10;
//
//        if(num1>num2){
//            System.out.println(num1 + " es mayor que "+ num2);
//        } else if (num1<num2) {
//            System.out.println(num2 + " es mayor que " + num1);
//
//        }else{
//            System.out.println(num1 + " y " + num2 + "son iguales");
//        }

        //- Ejercicio 2: Calculadora Simple - Declara dos números y realiza operaciones aritméticas
        //básicas: suma, resta, multiplicación, división y módulo.
//        System.out.println("ejercicio de calculadora simpel");
//
//        int a = 1;
//        int b = 4;
//
//        System.out.println("suma "+ (a+b));
//        System.out.println("resta " + (a-b));
//        System.out.println("multiplicacion " +(a*b));
//        System.out.println("division "+ (a/b));
//        System.out.println("Modulo " + (a % b));
        // el divide entre 2 numero, el resultado es el residuo.

        //- Ejercicio 3: Evaluar si un Número es Par y Mayor que Cero - Usa una estructura if para
        //determinar si un número es par y positivo.

        int numero = 8;

        if (numero> 0 && numero % 2 == 0 ){
            System.out.println("este numero es par "+ numero);
        }else{
            System.out.println("este numero es impar");
        }

    }
}