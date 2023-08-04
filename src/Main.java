import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

public class Main {

    //1. Realiza un programa que solicite al usuario dos números enteros y muestre su suma, resta,
    // multiplicación y división.
    public static int operacionSuma(int num1, int num2) {

        return num1 + num2;
    }

    public static int operacionResta(int num1, int num2) {

        return num1 - num2;
    }

    public static int operacionMultiplicacion(int num1, int num2) {

        return num1 * num2;
    }

    public static double operacionDivision(int num1, int num2) {

        if (num2 == 0) {
            throw new ArithmeticException("No se puede dividir entre 0");
        }
        return (double) num1 / num2;
    }

    //2. Escribe un programa que pida al usuario un número entero y determine si es par o impar.

    public static String parOImpar(int num) {

        return num % 2 == 0 ? "par" : "impar";
    }

    //3. Crea un programa que calcule y muestre el área y el perímetro de un círculo. El usuario debe
    //proporcionar el radio del círculo.

    public static double areaCirculo(double radio) {

        return radio * radio * Math.PI;
    }

    public static double perimetroCirculo(double radio) {

        return 2 * radio * Math.PI;
    }

    //4. Pide al usuario su edad y muestra un mensaje indicando si es mayor de edad
    //o menor de edad.

    public static String mayorOMenorDeEdad(int edad) {

        return edad >= 18 ? "Eres mayor de edad" : "Eres menor de edad";
    }

    //5. Realiza un programa que solicite al usuario dos números enteros y determine
    //cuál es el mayor de ellos.

    public static int mayorDeDosNumeros(int num4, int num5) {

        return num4 > num5 ? num4 : num5;
    }

    //6. Escribe un programa que pida al usuario un número y verifique si es positivo,
    //negativo o cero.

    public static String positivoNegativoOcero(double num6) {

        if (num6 > 0) {
            return "positivo";
        } else if (num6 < 0) {
            return "negativo";
        } else {
            return "cero";
        }
    }

    //7. Crea un programa que pida al usuario un número entero positivo y muestre
    //su tabla de multiplicar hasta el 10.

    public static int[] tablaMultiplicar(int num7) {

        int tabla[] = new int[10];
        if (tabla.length > 0) {
            System.out.println("La tabla de multiplicar es:");
            for (int i = 0; i < tabla.length; i++) {
                tabla[i] = num7 * (i + 1);
                System.out.println(num7 + " x " + (i + 1) + " = " + tabla[i]);
            }
        }
        return tabla;
    }

    //8. Realiza un programa que simule un juego de adivinar un número. El
    //programa debe generar un número aleatorio entre 1 y 100, y el usuario debe
    //adivinarlo. El programa debe indicar si el número ingresado es mayor o
    //menor que el número a adivinar.

    public static void adivinarNumero() {

        Random aleatorio = new Random();
        Scanner scanner = new Scanner(System.in);
        int numeroAdivinar = aleatorio.nextInt(100) + 1;
        while (true) {
            System.out.println("Adivina un número entre el 1 y el 100 y escríbelo: ");
            int numeroIngresado = scanner.nextInt();
            if (numeroIngresado == numeroAdivinar) {
                System.out.println("¡Has acertado el número!");
                break;
            } else if (numeroIngresado < numeroAdivinar) {
                System.out.println("El número es mayor");
            } else {
                System.out.println("El número es menor");
            }
        }
    }

    //9. Escribe un programa que solicite al usuario un número entero positivo y
    //calcule su factorial.

    public static int factorial(int num8) {

        int factorial = 1;
        for (int i = 1; i <= num8; i++) {
            factorial *= i;
        }
        return factorial;
    }

    //10. Crea un programa que muestre los primeros 20 números de la
    //serie Fibonacci. La serie Fibonacci se forma sumando los dos números
    //anteriores para obtener el siguiente número: 0, 1, 1, 2, 3, 5, 8, 13, …

    public static void serieFibonacci(int num9) {

        int a = 0;
        int b = 1;

        System.out.println("Los primeros " + num9 + " números de la serie Fibonacci son:");
        for (int i = 0; i < num9; i++) {
            System.out.print(a + ", ");
            int suma = a + b;
            a = b;
            b = suma;
        }
    }

    //11. Escribe un programa que calcule el área de un triángulo utilizando la fórmula
    //de Herón. El usuario debe ingresar las longitudes de los tres lados.

    public static double areaTriangulo(double lado1, double lado2, double lado3) {

        double perimetro = lado1 + lado2 + lado3;
        double semiperimetro = perimetro / 2;
        return Math.sqrt(semiperimetro * (semiperimetro - lado1) * (semiperimetro - lado2) * (semiperimetro - lado3));
    }

    //12. Realiza un programa que pida al usuario un número entero y determine si es
    //un número primo o no.

    public static boolean esPrimoONoPrimo(int num10) {

        if (num10 == 1) {
            return false;
        }

        for (int i = 2; i < num10; i++) {
            if (num10 % i == 0)
                return false;
        }
        return true;
    }

    //13. Pide al usuario un número decimal y muestra su valor redondeado a un
    //número específico de decimales.

    public static double redondeoDecimal(double num11) {

        BigDecimal bd = new BigDecimal(num11);
        BigDecimal redondeado = bd.setScale(2, RoundingMode.HALF_UP);
        return redondeado.doubleValue();
    }

    //14. Escribe un programa que solicite al usuario un número entero positivo y
    //verifique si es un número perfecto. Un número perfecto es aquel cuya suma
    //de sus divisores propios (excluyendo al propio número) es igual al número.

    public static boolean esPerfecto(int num12) {

        int suma = 0;
        for (int i = 1; i < num12; i++) {
            if (num12 % i == 0) {
                suma += i;
            }
        }
        return num12 == suma;
    }

    //15. Crea un programa que pida al usuario un número entero y determine si es un
    //número capicúa. Un número capicúa es aquel que se lee igual de izquierda a
    //derecha que de derecha a izquierda.

    public static boolean esCapicua(int num13) {

        int num14 = num13;
        int num15 = 0;
        while (num13 > 0) {
            num15 = num15 * 10 + num13 % 10;
            num13 /= 10;
        }
        return num14 == num15;
    }

    //16. Realiza un programa que calcule e imprima la serie de Fibonacci hasta un
    //número dado ingresado por el usuario.

    public static void imprimirSerieFibonacci(int num16) {

        int d = 0, e = 1, f;

        while (d <= num16) {
            System.out.println(d);
            f = d + e;
            d = e;
            e = f;
        }
    }

    //17. Pide al usuario dos números enteros y muestra todos los números primos
    //que se encuentran en ese rango.

    public static void imprimirNumerosPrimosRango(int num17, int num18) {

        System.out.println("Los números primos entre " + num17 + " y " + num18 + " son: ");
        for (int i = num17; i <= num18; i++) {
            if (esPrimoONoPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }

    //18. Crea un programa que genere una contraseña aleatoria de 8 caracteres que
    //contenga letras mayúsculas, letras minúsculas y dígitos. Puedes utilizar la
    //clase Math para generar números aleatorios y la clase String para manipular
    //la contraseña.

    public static String generarContraseniaAleatoria() {

        Random random = new Random();
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        StringBuilder contrasenia = new StringBuilder();
        int cantidadCaracteres = 8;

        for (int i = 0; i < cantidadCaracteres; i++) {
            int indice = random.nextInt(caracteres.length());
            char caracterRandom = caracteres.charAt(indice);
            contrasenia.append(caracterRandom);
        }
        return contrasenia.toString();
    }

    //19. Escribe un programa que solicite al usuario su nombre y luego lo imprima en
    //mayúsculas y minúsculas.

    public static void imprimirNombreMayusculasYMinusculas() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce tu nombre: ");
        String nombre = scanner.nextLine();
        String mayusculas = nombre.toUpperCase();
        String minusculas = nombre.toLowerCase();
        System.out.println("Tu nombre en mayúsculas es: " + mayusculas);
        System.out.println("Tu nombre en minúsculas es: " + minusculas);
    }

    //20. Realiza un programa que solicite al usuario una cadena y luego invierta su
    //orden.

    public static String invertirCadena(String cadena) {
        String cadenaInvertida = "";
        for (int i = cadena.length() - 1; i >= 0; i--) {
            cadenaInvertida += cadena.charAt(i);
        }
        return cadenaInvertida;
    }

    //21. Pide al usuario una cadena y muestra cuántas veces aparece una letra
    //específica en ella.

    public static int contarLetra(String cadena, char letra) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == letra) {
                contador++;
            }
        }
        return contador;
    }

    //22. Escribe un programa que solicite al usuario una frase y verifique si es un
    //palíndromo (se lee igual de izquierda a derecha que de derecha a izquierda).

    public static boolean esPalindromo(String frase) {
        String fraseInvertida = invertirCadena(frase);
        return frase.equals(fraseInvertida);
    }

    //23. Crea un programa que pida al usuario una oración y muestre cuántas
    //palabras contiene.

    public static int contarPalabras(String oracion) {

        int contador = 0;
        for (String palabra : oracion.split(" ")) {
            contador++;
        }
        return contador;
    }

    //24. Realiza un programa que solicite al usuario una cadena y reemplace todas
    //las apariciones de una letra específica por otra.

    public static String reemplazarLetra(String cadena, char letra, char nuevaLetra) {
        return cadena.replace(letra, nuevaLetra);
    }

    //25. Pide al usuario una frase y muestra cada palabra por separado.

    public static void imprimirPalabrasSeparado(String frase) {
        String[] palabras = frase.split(" ");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    //26. Escribe un programa que pida al usuario una cadena y muestre cuántos
    //caracteres tiene sin contar los espacios en blanco.

    public static int contarCaracteresSinEspacios(String cadena) {
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) != ' ') {
                contador++;
            }
        }
        return contador;
    }

    //27. Crea un programa que solicite al usuario una frase y luego muestre las
    //palabras ordenadas alfabéticamente.

    public static void imprimirPalabrasOrdenadas(String frase) {
        String[] palabras = frase.toLowerCase().split(" ");
        Arrays.sort(palabras);
        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }

    //28. Suma de elementos: Escribe un programa que calcule la suma de todos los
    //elementos en un arreglo de enteros.

    public static int sumarElementos(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }

    //29. Encontrar el número más grande: Crea un programa que encuentre el número
    //más grande en un arreglo de enteros.

    public static int numeroMasGrande(int[] arreglo) {
        int numeroMasGrande = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] > numeroMasGrande) {
                numeroMasGrande = arreglo[i];
            }
        }
        return numeroMasGrande;
    }

    //30. Eliminar duplicados: Diseña un programa que elimine los elementos
    //duplicados de un arreglo.

    public static int[] eliminarDuplicados(int[] arreglo) {
        int n = arreglo.length;
        int[] nuevoArreglo = new int[n];
        int index = 0;

        for (int i = 0; i < n; i++) {
            boolean duplicado = false;
            for (int j = 0; j < index; j++) {
                if (arreglo[i] == nuevoArreglo[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                nuevoArreglo[index++] = arreglo[i];
            }
        }

        return Arrays.copyOf(nuevoArreglo, index);
    }

    //31. Ordenar elementos: Implementa un algoritmo de ordenamiento (por ejemplo,
    //el algoritmo de burbuja o el de selección) para ordenar un arreglo de enteros
    //de manera ascendente.

    public static int[] ordenarAscendente(int[] arreglo) {
        for (int i = 0; i < arreglo.length - 1; i++) {
            for (int j = 0; j < arreglo.length - i - 1; j++) {
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                }
            }
        }
        return arreglo;
    }

    //32. Buscar un elemento: Escribe un programa que busque un número específico
    //en un arreglo y muestre su índice (o un mensaje si no se encuentra).

    public static int buscarElemento(int[] arreglo, int elemento) {
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] == elemento) {
                return i;
            }
        }
        return -1;
    }

    //33. Frecuencia de elementos: Escribe un programa que cuente la frecuencia de
    //cada elemento en un arreglo.

    public static HashMap<Integer, Integer> frecuenciaElementos(int[] arreglo) {
        HashMap<Integer, Integer> frecuencia = new HashMap<>();
        for (int i = 0; i < arreglo.length; i++) {
            if (frecuencia.containsKey(arreglo[i])) {
                frecuencia.put(arreglo[i], frecuencia.get(arreglo[i]) + 1);
            } else {
                frecuencia.put(arreglo[i], 1);
            }
        }
        return frecuencia;
    }

    //34. Rotación de elementos: Implementa un programa que rote los elementos de un
    //arreglo hacia la izquierda o la derecha una cierta cantidad de posiciones.

    public static void rotar(int[] arreglo, int cantidad, String direccion) {
        int n = arreglo.length;
        cantidad = cantidad % n;

        if (direccion.equalsIgnoreCase("izquierda")) {
            for (int rot = 0; rot < cantidad; rot++) {
                int temp = arreglo[0];
                for (int j = 0; j < n - 1; j++) {
                    arreglo[j] = arreglo[j + 1];
                }
                arreglo[n - 1] = temp;
            }
        } else if (direccion.equalsIgnoreCase("derecha")) {
            for (int rot = 0; rot < cantidad; rot++) {
                int temp = arreglo[n - 1];
                for (int j = n - 1; j > 0; j--) {
                    arreglo[j] = arreglo[j - 1];
                }
                arreglo[0] = temp;
            }
        } else {
            System.out.println("Dirección no válida. No se realizó la rotación.");
        }
    }

    //35. Tabla de multiplicar: Crea un programa que imprima las tablas de multiplicar
    //del 1 al 10. Usa para esto una matriz.

    public static void matrizTablaMultiplicar() {

        int[][] tablasMultiplicar = new int[10][10];
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                tablasMultiplicar[i - 1][j - 1] = i * j;
            }
        }

        for (int i = 0; i < tablasMultiplicar.length; i++) {
            for (int j = 0; j < tablasMultiplicar[0].length; j++) {
                System.out.print(tablasMultiplicar[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("---- Ejercicio 1 ---");
        System.out.println("Introduce un número entero: ");
        int num1 = scanner.nextInt();
        System.out.println("Introduce otro número entero: ");
        int num2 = scanner.nextInt();
        int suma = operacionSuma(num1, num2);
        int resta = operacionResta(num1, num2);
        int multiplicacion = operacionMultiplicacion(num1, num2);
        double division;
        try {
            division = operacionDivision(num1, num2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            division = Double.NaN;
        }

        System.out.println("La suma es igual a: " + suma);
        System.out.println("La resta es igual a: " + resta);
        System.out.println("La multiplicación es igual a: " + multiplicacion);
        System.out.println("La division es igual a: " + division);

        scanner.nextLine();

        System.out.println("---- Ejercicio 2 ---");
        System.out.println("Introduce otro número entero: ");
        int num3 = scanner.nextInt();
        String parImpar = parOImpar(num3);
        System.out.println("El número es: " + parImpar);

        scanner.nextLine();

        System.out.println("---- Ejercicio 3 ---");
        System.out.println("Introduce el radio del círculo: ");
        double radio = scanner.nextDouble();
        double area = areaCirculo(radio);
        double perimetro = perimetroCirculo(radio);
        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);

        scanner.nextLine();

        System.out.println("---- Ejercicio 4 ---");
        System.out.println("Introduce tu edad: ");
        int edad = scanner.nextInt();
        String mayorEdad = mayorOMenorDeEdad(edad);
        System.out.println(mayorEdad);

        scanner.nextLine();

        System.out.println("---- Ejercicio 5 ---");
        System.out.println("Introduce un número entero: ");
        int num4 = scanner.nextInt();
        System.out.println("Introduce otro número entero: ");
        int num5 = scanner.nextInt();
        int mayor = mayorDeDosNumeros(num4, num5);
        System.out.println("El mayor de los dos es: " + mayor);

        scanner.nextLine();

        System.out.println("---- Ejercicio 6 ---");
        System.out.println("Introduce un número: ");
        double num6 = scanner.nextDouble();
        String varPosNegCer = positivoNegativoOcero(num6);
        System.out.println("El número es: " + varPosNegCer);

        scanner.nextLine();

        System.out.println("---- Ejercicio 7 ---");
        System.out.println("Introduce un número entero: ");
        int num7 = scanner.nextInt();
        int[] tabla = tablaMultiplicar(num7);

        scanner.nextLine();

        System.out.println("---- Ejercicio 8 ---");
        adivinarNumero();


        System.out.println("---- Ejercicio 9 ---");
        System.out.println("Introduce un número entero positivo: ");
        int num8 = scanner.nextInt();
        int factorial = factorial(num8);
        System.out.println("El factorial de " + num8 + " es: " + factorial);

        scanner.nextLine();

        System.out.println("---- Ejercicio 10 ---");
        serieFibonacci(20);
        System.out.println("---Fin---");


        System.out.println("---- Ejercicio 11 ---");
        System.out.println("Ingresa la primera longitud: ");
        double lado1 = scanner.nextDouble();
        System.out.println("Ingresa la segunda longitud: ");
        double lado2 = scanner.nextDouble();
        System.out.println("Ingresa la tercera longitud: ");
        double lado3 = scanner.nextDouble();
        double resultado = areaTriangulo(lado1, lado2, lado3);
        System.out.println("El área del triángulo es: " + resultado);

        scanner.nextLine();

        System.out.println("---- Ejercicio 12 ---");
        System.out.println("Ingresa un número entero: ");
        int num10 = scanner.nextInt();
        if (esPrimoONoPrimo(num10)) {
            System.out.println(num10 + " es primo.");
        } else {
            System.out.println(num10 + " no es primo.");
        }

        scanner.nextLine();

        System.out.println("---- Ejercicio 13 ---");
        System.out.println("Ingresa un número decimal: ");
        double num11 = scanner.nextDouble();
        double redondeo = redondeoDecimal(num11);
        System.out.println("El número redondeado es: " + redondeo);

        scanner.nextLine();

        System.out.println("--- Ejercicio 14 ---");
        System.out.println("Ingresa un número entero: ");
        int num12 = scanner.nextInt();
        if (esPerfecto(num12)) {
            System.out.println(num12 + " es perfecto.");
        } else {
            System.out.println(num12 + " no es perfecto.");
        }

        scanner.nextLine();

        System.out.println("---- Ejercicio 15 ---");
        System.out.println("Ingresa un número entero: ");
        int num13 = scanner.nextInt();
        if (esCapicua(num13)) {
            System.out.println(num13 + " es capicúa.");
        } else {
            System.out.println(num13 + " no es capicúa.");
        }

        scanner.nextLine();

        System.out.println("---- Ejercicio 16 ---");
        System.out.println("Ingresa un número entero: ");
        int num16 = scanner.nextInt();
        imprimirSerieFibonacci(num16);
        System.out.println("");

        scanner.nextLine();

        System.out.println("---- Ejercicio 17 ---");
        System.out.println("Ingresa un número entero: ");
        int num17 = scanner.nextInt();
        System.out.println("Ingresa otro número entero: ");
        int num18 = scanner.nextInt();
        imprimirNumerosPrimosRango(num17, num18);
        System.out.println("");

        scanner.nextLine();

        System.out.println("---- Ejercicio 18 ---");
        String contraseniaAleatoria = generarContraseniaAleatoria();
        System.out.println("La contraseña aleatoria es: " + contraseniaAleatoria);


        System.out.println("---- Ejercicio 19 ---");
        imprimirNombreMayusculasYMinusculas();
        System.out.println("");


        System.out.println("---- Ejercicio 20 ---");
        System.out.println("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        String invertida = invertirCadena(cadena);
        System.out.println("La cadena invertida es: " + invertida);
        System.out.println("");


        System.out.println("---- Ejercicio 21 ---");
        System.out.println("Ingresa una cadena: ");
        String contarVeces = scanner.nextLine();
        System.out.println("Ingresa una letra: ");
        char letra = scanner.next().charAt(0);
        int veces = contarLetra(contarVeces, letra);
        System.out.println("La letra " + letra + " aparece " + veces + " veces en la cadena");

        scanner.nextLine();

        System.out.println("---- Ejercicio 22 ---");
        System.out.println("Ingresa una frase: ");
        String frase = scanner.nextLine();
        if (esPalindromo(frase)) {
            System.out.println(frase + " es palíndromo");
        } else {
            System.out.println(frase + " no es palíndromo");
        }


        System.out.println("---- Ejercicio 23 ---");
        System.out.println("Ingresa una oración: ");
        String oracion = scanner.nextLine();
        int cantidadPalabras = contarPalabras(oracion);
        System.out.println("La oración tiene " + cantidadPalabras + " palabras");
        System.out.println("");


        System.out.println("---- Ejercicio 24 ---");
        System.out.println("Ingresa una cadena: ");
        String cadenaLetras = scanner.nextLine();
        System.out.println("Ingresa la letra a reemplazar: ");
        char letra2 = scanner.next().charAt(0);
        System.out.println("Ingresa la letra que vas a usar para hacer el reemplazo: ");
        char nuevaLetra = scanner.next().charAt(0);
        String cadenaNueva = reemplazarLetra(cadenaLetras, letra2, nuevaLetra);
        System.out.println("La nueva cadena es: " + cadenaNueva);

        scanner.nextLine();

        System.out.println("---- Ejercicio 25 ---");
        System.out.println("Ingresa una frase: ");
        String frase2 = scanner.nextLine();
        imprimirPalabrasSeparado(frase2);
        System.out.println("");


        System.out.println("---- Ejercicio 26 ---");
        System.out.println("Ingresa una cadena: ");
        String cadenaNueva2 = scanner.nextLine();
        int contarCaracteres = contarCaracteresSinEspacios(cadenaNueva2);
        System.out.println("La cadena tiene " + contarCaracteres + " caracteres");


        System.out.println("---- Ejercicio 27 ---");
        System.out.println("Ingresa una frase: ");
        String frase3 = scanner.nextLine();
        imprimirPalabrasOrdenadas(frase3);
        System.out.println("");


        System.out.println("---- Ejercicio 28 ---");
        System.out.println("Escribe la cantidad de números que vas a agregar al arreglo: ");
        int cantidadNumeros = scanner.nextInt();
        int[] arregloNumeros = new int[cantidadNumeros];
        for (int i = 0; i < arregloNumeros.length; i++) {
            System.out.println("Escribe el número " + (i + 1) + ": ");
            arregloNumeros[i] = scanner.nextInt();
        }
        int suma2 = sumarElementos(arregloNumeros);
        System.out.println("La suma del arrelo es: " + suma2);

        scanner.nextLine();

        System.out.println("---- Ejercicio 29 ---");
        System.out.println("Escribe la cantidad de números que vas a agregar al arreglo: ");
        int cantidadNumeros2 = scanner.nextInt();
        int[] arregloNumeros2 = new int[cantidadNumeros2];
        for (int i = 0; i < arregloNumeros2.length; i++) {
            System.out.println("Escribe el número " + (i + 1) + ": ");
            arregloNumeros2[i] = scanner.nextInt();
        }
        int maximo = numeroMasGrande(arregloNumeros2);
        System.out.println("El número más grande es: " + maximo);

        scanner.nextLine();

        System.out.println("---- Ejercicio 30 ---");
        System.out.println("Escribe la cantidad de números que vas a agregar al arreglo: ");
        int cantidadNumeros3 = scanner.nextInt();
        int[] arregloNumeros3 = new int[cantidadNumeros3];
        for (int i = 0; i < arregloNumeros3.length; i++) {
            System.out.println("Escribe el número " + (i + 1) + ": ");
            arregloNumeros3[i] = scanner.nextInt();
        }
        int[] nuevoArreglo = eliminarDuplicados(arregloNumeros3);
        System.out.println("El nuevo arreglo sin duplicados es: ");
        System.out.println(Arrays.toString(nuevoArreglo));

        scanner.nextLine();


        System.out.println("---- Ejercicio 31 ---");
        System.out.println("Escribe la cantidad de números que vas a agregar al arreglo: ");
        int cantidadNumeros4 = scanner.nextInt();
        int[] arregloNumeros4 = new int[cantidadNumeros4];
        for (int i = 0; i < arregloNumeros4.length; i++) {
            System.out.println("Escribe el número " + (i + 1) + ": ");
            arregloNumeros4[i] = scanner.nextInt();
        }
        int[] ascendente = ordenarAscendente(arregloNumeros4);
        System.out.println("El arreglo ascendente es: ");
        System.out.println(Arrays.toString(ascendente));

        scanner.nextLine();

        System.out.println("---- Ejercicio 32 ---");
        System.out.println("Escribe la cantidad de números que vas a agregar al arreglo: ");
        int cantidadNumeros5 = scanner.nextInt();
        int[] arregloNumeros5 = new int[cantidadNumeros5];
        for (int i = 0; i < arregloNumeros5.length; i++) {
            System.out.println("Escribe el número " + (i + 1) + ": ");
            arregloNumeros5[i] = scanner.nextInt();
        }
        System.out.println("Escribe el número que deseas buscar: ");
        int elementoBuscado = scanner.nextInt();

        int indice = buscarElemento(arregloNumeros5, elementoBuscado);
        if (indice != -1) {
            System.out.println("El elemento se encuentra en el índice " + indice);
        } else {
            System.out.println("El elemento no fue encontrado en el arreglo.");
        }

        scanner.nextLine();

        System.out.println("---- Ejercicio 33 ---");
        System.out.println("Escribe la cantidad de números que vas a agregar al arreglo: ");
        int cantidadNumeros6 = scanner.nextInt();
        int[] arregloNumeros6 = new int[cantidadNumeros6];
        for (int i = 0; i < arregloNumeros6.length; i++) {
            System.out.println("Escribe el número " + (i + 1) + ": ");
            arregloNumeros6[i] = scanner.nextInt();
        }
        HashMap<Integer, Integer> mapa = frecuenciaElementos(arregloNumeros6);
        for (int i : mapa.keySet()) {
            System.out.println(i + " " + mapa.get(i));
        }

        scanner.nextLine();

        System.out.println("---- Ejercicio 34 ---");
        System.out.println("Escribe la cantidad de números que vas a agregar al arreglo: ");
        int cantidadNumeros7 = scanner.nextInt();
        int[] arregloNumeros7 = new int[cantidadNumeros7];
        for (int i = 0; i < arregloNumeros7.length; i++) {
            System.out.println("Escribe el número " + (i + 1) + ": ");
            arregloNumeros7[i] = scanner.nextInt();
        }

        System.out.println("¿Deseas rotar a la izquierda o a la derecha? (Escribe 'izquierda' o 'derecha'): ");
        String direccion = scanner.next();

        System.out.println("Escribe la cantidad de posiciones a rotar: ");
        int cantidadPosiciones = scanner.nextInt();

        rotar(arregloNumeros7, cantidadPosiciones, direccion);

        System.out.println("Arreglo después de la rotación: ");
        System.out.println(Arrays.toString(arregloNumeros7));


        System.out.println("---- Ejercicio 35 ---");
        matrizTablaMultiplicar();

        scanner.close();
    }
}
