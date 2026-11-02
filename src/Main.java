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
    if (fechaCita == null) {
        return "Fecha no disponible";
    }
    return fechaCita.format(FORMATO_ESPANOL);
}
public static void leerYValidarFecha() {
    // De las fechas se encarga el alumno C
    scanner.nextLine();
    System.out.print("Fecha y hora de la cita (" + PATRON_FECHA + "): ");
    String entrada = scanner.nextLine();

    try {
        // Intenta parsear la cadena ingresada según el patrón definido
        fechaCita = LocalDateTime.parse(entrada, FORMATO_ESPANOL);
        System.out.println(" Fecha correcta.");

    } catch (DateTimeParseException e) {
        System.out.println("Formato incorrecto. Debe usar exactamente el formato: dd/MM/yyyy HH:mm");
        System.out.println("Se asignará la fecha y hora actual por defecto.");
        fechaCita = LocalDateTime.now();
    }

}