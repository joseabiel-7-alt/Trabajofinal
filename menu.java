
    import java.util.Scanner;

public class menu {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcionPrincipal;

        do {

            // MENÚ PRINCIPAL
            System.out.println("\n===== SISTEMA DE RENTING =====");
            System.out.println("1. Gestión de Clientes");
            System.out.println("2. Gestión de Vehículos");
            System.out.println("3. Gestión de Contratos de Renting");
            System.out.println("4. Imprimir Informe General");
            System.out.println("5. Salir del Sistema");
            System.out.print("Seleccione una opción: ");

            opcionPrincipal = sc.nextInt();

            switch (opcionPrincipal) {

                // ---------------- CLIENTES ----------------
                case 1:

                    int opcionClientes;

                    do {
                        System.out.println("\n--- GESTIÓN DE CLIENTES ---");
                        System.out.println("1. Registrar cliente");
                        System.out.println("2. Modificar cliente");
                        System.out.println("3. Eliminar cliente");
                        System.out.println("4. Buscar cliente");
                        System.out.println("5. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");

                        opcionClientes = sc.nextInt();

                        switch (opcionClientes) {

                            case 1:
                                System.out.println("Cliente registrado.");
                                break;

                            case 2:
                                System.out.println("Cliente modificado.");
                                break;

                            case 3:
                                System.out.println("Cliente eliminado.");
                                break;

                            case 4:
                                System.out.println("Cliente encontrado.");
                                break;

                            case 5:
                                System.out.println("Volviendo al menú principal...");
                                break;

                            default:
                                System.out.println("Opción inválida.");
                        }

                    } while (opcionClientes != 5);

                    break;

                // ---------------- VEHÍCULOS ----------------
                case 2:

                    int opcionVehiculos;

                    do {
                        System.out.println("\n--- GESTIÓN DE VEHÍCULOS ---");
                        System.out.println("1. Registrar vehículo");
                        System.out.println("2. Modificar vehículo");
                        System.out.println("3. Eliminar vehículo");
                        System.out.println("4. Buscar vehículo");
                        System.out.println("5. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");

                        opcionVehiculos = sc.nextInt();

                        switch (opcionVehiculos) {

                            case 1:
                                System.out.println("Vehículo registrado.");
                                break;

                            case 2:
                                System.out.println("Vehículo modificado.");
                                break;

                            case 3:
                                System.out.println("Vehículo eliminado.");
                                break;

                            case 4:
                                System.out.println("Vehículo encontrado.");
                                break;

                            case 5:
                                System.out.println("Volviendo al menú principal...");
                                break;

                            default:
                                System.out.println("Opción inválida.");
                        }

                    } while (opcionVehiculos != 5);

                    break;

                // ---------------- CONTRATOS ----------------
                case 3:

                    int opcionContratos;

                    do {
                        System.out.println("\n--- GESTIÓN DE CONTRATOS DE RENTING ---");
                        System.out.println("1. Registrar nuevo contrato");
                        System.out.println("2. Modificar contrato");
                        System.out.println("3. Finalizar contrato (devolución)");
                        System.out.println("4. Buscar contrato");
                        System.out.println("5. Volver al menú principal");
                        System.out.print("Seleccione una opción: ");

                        opcionContratos = sc.nextInt();

                        switch (opcionContratos) {

                            case 1:
                                System.out.println("Contrato registrado.");
                                break;

                            case 2:
                                System.out.println("Contrato modificado.");
                                break;

                            case 3:
                                System.out.println("Contrato finalizado.");
                                break;

                            case 4:
                                System.out.println("Contrato encontrado.");
                                break;

                            case 5:
                                System.out.println("Volviendo al menú principal...");
                                break;

                            default:
                                System.out.println("Opción inválida.");
                        }

                    } while (opcionContratos != 5);

                    break;

                // ---------------- INFORME ----------------
                case 4:
                    System.out.println("\nImprimiendo informe general...");
                    break;

                // ---------------- SALIR ----------------
                case 5:
                    System.out.println("\nSaliendo del sistema...");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcionPrincipal != 5);

        sc.close();
    }
}
    

