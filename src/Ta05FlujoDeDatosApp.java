import java.util.Scanner;
import javax.swing.JOptionPane;
public class Ta05FlujoDeDatosApp {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        ejercicio1();
        ejercicio2();
        ejercicio3(scanner);
        ejercicio4(scanner);
        ejercicio5(scanner);
        ejercicio6(scanner);
        ejercicio7();
        ejercicio8();
        ejercicio9();
        ejercicio10(scanner);
        ejercicio11(scanner);
        ejercicio12(scanner);
        ejercicio13(scanner);

        scanner.close();
    }

    //1) Declara 2 variables numéricas (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar que funciona.
    public static void ejercicio1() {
        int num1 = 5;
        int num2 = 10;

        if (num1 > num2) {
            System.out.println("El primer número es mayor.");
        } else if (num2 > num1) {
            System.out.println("El segundo número es mayor.");
        } else {
            System.out.println("Los números son iguales.");
        }
    }

    //2) Declara un String que contenga tu nombre, después muestra un mensaje de bienvenida por consola. Por ejemplo: si introduzco "Fernando", me aparezca "Bienvenido Fernando".
    public static void ejercicio2() {
        String nombre = "Juan";
        System.out.println("Bienvenido " + nombre);
    }

    //3) Modifica la aplicación anterior, para que nos pida el nombre que queremos introducir (recuerda usar JOptionPane).
    public static void ejercicio3(Scanner scanner) {
        System.out.print("Tu nombre: ");
        String nombre = scanner.nextLine();
        System.out.println("Bienvenido " + nombre);
    }

    //4) Haz una aplicación que calcule el área de un circulo (pi*R2). El radio se pedirá por teclado (recuerda pasar de String a double con Double.parseDouble). Usa la constante Pl y el método pow de Math.
    public static void ejercicio4(Scanner scanner) {
        System.out.print("Introduce el radio del círculo: ");
        double radio = Double.parseDouble(scanner.nextLine());
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }

    //5) Lee un número por teclado e indica si es divisible entre 2 (resto = 0). Si no lo es, también debemos indicarlo.
    public static void ejercicio5(Scanner scanner) {
        System.out.print("Introduce un número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        if (numero % 2 == 0) {
            System.out.println("El número es divisible por 2.");
        } else {
            System.out.println("El número no es divisible por 2.");
        }
    }

    //6) Lee un número por teclado que pida el precio de un producto (puede tener decimales) y calcule el precio final con IVA. EI IVA sera una constante que sera del 21%
    public static void ejercicio6(Scanner scanner) {
        System.out.print("Introduce el precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());
        final double IVA = 0.21;
        double precioFinal = precio + (precio * IVA);
        System.out.println("El precio final con IVA es: " + precioFinal);
    }

    //7) Muestra los números del 1 al 100 (ambos incluidos). Usa un bucle while.
    public static void ejercicio7() {
        int i = 1;
        while (i <= 100) {
            System.out.println(i);
            i++;
        }
    }

    //8) Haz el mismo ejercicio anterior con un bucle for.
    public static void ejercicio8() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }
    }

    //9) Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3. Utiliza el bucle que desees.
    public static void ejercicio9() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0 && i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    //10) Realiza una aplicación que nos pida un número de ventas a introducir, después nos pedirá tantas ventas por teclado como número de ventas se hayan indicado. Al final mostrara la suma de todas las ventas. Piensa que es lo que se repite y lo que no.
    public static void ejercicio10(Scanner scanner) {
        System.out.print("Introduce el número de ventas: ");
        int numVentas = Integer.parseInt(scanner.nextLine());
        double sumaVentas = 0;

        for (int i = 1; i <= numVentas; i++) {
            System.out.print("Introduce el valor de la venta " + i + ": ");
            double venta = Double.parseDouble(scanner.nextLine());
            sumaVentas += venta;
        }

        System.out.println("La suma total de las ventas es: " + sumaVentas);
    }
    //11) Crea una aplicación que nos pida un día de la semana y que nos diga si es un día laboral o no. Usa un switch para ello.
    public static void ejercicio11(Scanner scanner) {
        System.out.print("Introduce un día de la semana: ");
        String diaSemana = scanner.nextLine().toLowerCase();

        switch (diaSemana) {
            case "lunes":
            case "martes":
            case "miércoles":
            case "jueves":
            case "viernes":
                System.out.println("Es un día laboral.");
                break;
            case "sábado":
            case "domingo":
                System.out.println("No es un día laboral.");
                break;
            default:
                System.out.println("Día no válido.");
        }
    }
    //12) Escribe una aplicación con un String que contenga una contraseña cualquiera. Después se te pedirá que introduzcas la contraseña, con 3 intentos. Cuando aciertes ya no pedirá mas la contraseña y mostrara un mensaje diciendo "Enhorabuena". Piensa bien en la condición de salida (3 intentos y si acierta sale, aunque le queden intentos).
    public static void ejercicio12(Scanner scanner) {
        String contraseña = "contrasena";
        int intentos = 3;

        while (intentos > 0) {
            System.out.print("Introduce la contraseña: ");
            String entrada = scanner.nextLine();

            if (entrada.equals(contraseña)) {
                System.out.println("¡Enhorabuena! Contraseña correcta.");
                break;
            } else {
                intentos--;
                System.out.println("Contraseña incorrecta. Intentos restantes: " + intentos);
            }
        }

        if (intentos == 0) {
            System.out.println("Has agotado tus intentos. Acceso denegado.");
        }
    }

    /*13) Crea una aplicación llamada Calculadorainversa, nos pedirá 2 operandos (int) y un signo aritmético (String), según este último se realizara la operación correspondiente. Al final mostrara el resultado en un cuadro de dialogo.
    	Los signos aritméticos disponibles son:
    	+: suma los dos operandos.
    	-: resta los operandos.
    	*: multiplica los operandos.
    	/: divide los operandos, este debe dar un resultado con decimales (double)
    	A: 1o operando como base y 2o como exponente.
    	%: módulo, resto de la división entre operando1 y operando2.
    */
    public static void ejercicio13(Scanner scanner) {
        System.out.print("Introduce el primer operando (entero): ");
        int operando1 = Integer.parseInt(scanner.nextLine());

        System.out.print("Introduce el segundo operando (entero): ");
        int operando2 = Integer.parseInt(scanner.nextLine());

        System.out.print("Introduce el signo aritmético (+, -, *, /, A, %): ");
        String signo = scanner.nextLine();

        double resultado = 0;

        switch (signo) {
            case "+":
                resultado = operando1 + operando2;
                break;
            case "-":
                resultado = operando1 - operando2;
                break;
            case "*":
                resultado = operando1 * operando2;
                break;
            case "/":
                resultado = (double) operando1 / operando2;
                break;
            case "A":
                resultado = Math.pow(operando1, operando2);
                break;
            case "%":
                resultado = operando1 % operando2;
                break;
            default:
                System.out.println("Signo aritmético no válido.");
                return;
        }

        System.out.println("Resultado: " + resultado);
    }
}
