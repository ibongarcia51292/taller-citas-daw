//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// Datos del cliente, vehículo y  cita.
// Variables globales para poder usarlas en registrar cita y en calcular coste.
private static String matricula;
private static String marca;
private static String modelo;
private static int tipoServicio;
private static String cliente;
private static LocalDateTime fechaCita;

// Formatos fecha
private static final String PATRON_FECHA = "dd/MM/yyyy HH:mm";
private static final DateTimeFormatter FORMATO_ESPANOL =
        DateTimeFormatter.ofPattern(PATRON_FECHA, new Locale("es", "ES"));

// Entrada de datos.
private static Scanner scanner = new Scanner(System.in);

void main() {

    // Mostrar menú y ejecutar la función adecuada.
    boolean salir = false;

    while (!salir) {
        System.out.println("\n--- GESTIÓN DE CITAS TALLER ---");
        System.out.println("1. Registrar nueva cita");
        System.out.println("2. Consultar citas por fecha");
        System.out.println("3. Calcular coste de servicio");
        System.out.println("4. Salir");
        System.out.print("Seleccione una opción: ");

        int opcion = scanner.nextInt();
        if (opcion == 1) {
            registrarCita();
        }
        if (opcion == 2) {
            consultarCitas();
        }
        if (opcion == 3) {
            calcularCosteServicio();
        }
        if (opcion == 4) {
            salir = true;
            System.out.println("Saliendo del programa...");
        }
        // Switch para realizar la operación adecuada en función de la opción elegida.
        // Cada desarrollador codifica lo suyo.
        // Se puede añadir un bucle hasta que la opción sea correcta.
        switch (opcion) {
            case 1:
                registrarCita();
                break;
            case 2:
                consultarCitas();
                break;
            case 3:
                calcularCosteServicio();
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }
}

public static void registrarCita() {
    /*
    Alumno A: Rama feature/registro-cita
     (Pide datos del vehículo, convierte la matrícula a mayúsculas, y valida la fecha introducida usando LocalDate).
     */
    Scanner scanner = new Scanner(System.in);
    System.out.println("\n--- REGISTRO DE NUEVA CITA ---");

    // 1. Pedir datos del cliente y vehículo
    // Falta el try, las expresiones regulares, repetitivas hasta que el dato sea correcto.
    System.out.print("Nombre del cliente: ");
    cliente = scanner.nextLine();

    System.out.print("Matrícula del vehículo (ej. 1234ABC, 0012KFX, ECO): ");
    matricula = scanner.nextLine().trim().toUpperCase(); // Convierte la matrícula a mayúsculas

    System.out.print("La marca del vehículo: ");
    marca = scanner.nextLine();

    System.out.print("Modelo del vehículo: ");
    modelo = scanner.nextLine();

    // 2. Pedir y validar la fecha y hora de la cita (haciendo uso de GestorFechas o validación local)
    System.out.println("Asignación de fecha y hora --");
    leerYValidarFecha();

    System.out.println("Tipo de servicio para el que solicita la cita.");
    System.out.println("1.- Cambio de aceite y filtro");
    System.out.println("2.- Revisión general");
    System.out.println("3.- Cambio de frenos");
    System.out.println("4.- Distribución");
    tipoServicio = scanner.nextInt();

    // 3. Resumen del registro de la cita
    System.out.println("\n========================================");
    System.out.println("   ¡CITA REGISTRADA CORRECTAMENTE!");
    System.out.println("========================================");
    System.out.println("Cliente:   " + cliente);
    System.out.println("Matrícula: " + matricula);
    System.out.println("Modelo:  " + modelo);
    System.out.println("Marca:  " + marca);
    System.out.println("Fecha:     " + formatearFechaEspanol());
    System.out.println("Tipo de servicio:     " + tipoServicio);
    System.out.println("========================================\n");

    // Se pueden crear funciones varias, en vez de todo el código en registrar cita.
}

public static void consultarCitas() {
    // No lo hace nadie. Necesitamos una colección.

}
public static void calcularCosteServicio() {
    double precioBase;

    switch (tipoServicio) {
        case 1:
            precioBase = 50.0;  // Cambio de aceite y filtro
            break;
        case 2:
            precioBase = 120.0; // Revisión general / Pre-ITV
            break;
        case 3:
            precioBase = 200.0; // Cambio de frenos y discos
            break;
        case 4:
            precioBase = 350.0; // Reparación de distribución
            break;
        default:
            System.out.println("Opción de servicio no válida.");
            precioBase = 80.0;
            break;
    }

    String matriculaLimpia = matricula.trim().toUpperCase();


    double porcentajeDescuento = 0.0;

    // Regla A: Vehículos híbridos/eléctricos o flotas especiales (ejemplo: terminan en "ECO")

        // Regla B: Vehículos antiguos o promocionales (ejemplo: contienen el número "00")


    // 4. Cálculo final del coste
}
public static String formatearFechaEspanol() {

    return "";
}
public static void leerYValidarFecha() {
    // De las fechas se encarga el alumno C

}