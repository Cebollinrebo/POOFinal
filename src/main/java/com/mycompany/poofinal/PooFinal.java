/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poofinal;
import java.util.Scanner;

/**
 * Proyecto Final POO
 * Equipo TonalliTech
 * Integrantes:
 * - Arzate Rios Adrián Axel
 * - Cabrera Luna Samuel
 * - Garcia Trejo Arturo
 * - Monrroy Caamaño Fernando
 * - Rebolledo Ceballos Daniel Antonio.
 */

/**
 *
 * @author empanada25
 */
public class PooFinal {
    public static void main(String[] args) {
        var leerDatos = new Scanner(System.in);
        int opcionPrincipal = 0;
        int opcionSucursal = 0;
        int opcionUsuario = 0;
        int opcionAdmin = 0;
        
        do{
            System.out.print("""
                             ****************
                             RoboTICs presenta:
                             Cine-TICs
                             El Cine de confianza
                             ****************\n
                             """);
            
            System.out.println("Elija una opcion");
            System.out.println("1) Vista Usuario");
            System.out.println("2) Vista Administrador");
            System.out.println("3) Acerca De....");
            System.out.println("4) Salir");
            
            opcionPrincipal = leerDatos.nextInt();
            leerDatos.nextLine();
            
            switch (opcionPrincipal) {
                case 1 -> {
                    do{
                        System.out.println("Selecciona una Sucursal: ");
                        System.out.print("""
                                         1) CU
                                         2) Universidad
                                         3) Delta
                                         4) Xochimilco  
                                         
                                         **Presiona 5 para regresar**
                                        """);

                        opcionSucursal = leerDatos.nextInt();
                        leerDatos.nextLine();

                            switch (opcionSucursal) {
                            case 1 -> {
                                opcionUsuario = 0;
                                do {
                                    mostrarMensajeUser("CU");
                                    System.out.print(""" 
                                    1. Ver Cartelera 
                                    2. Buscar película 
                                    3. Cambiar Sucursal
                                    4. Iniciar Sesión
                                    5. Buscar producto
                                    6. Ver Carrito
                                    7. Actualizar Datos Personales
                                    8. Registrarse 
                                    9. Ver Mis compras 
                                    10.Ver Mis puntos 
                                    11.Salir
                                                     """);

                                    opcionUsuario = leerDatos.nextInt();
                                    leerDatos.nextLine();

                                    switch (opcionUsuario) {
                                        case 1 -> {
                                            // Cartelera 
                                        }

                                        case 2 -> {
                                            // Buscar Pelicula 
                                        }

                                        case 3 -> {
                                            // Cambiar Sucursal
                                        }

                                        case 4 -> {
                                            // Buscar Pelicula 
                                        }

                                        case 5 -> {
                                            // Inicio de Sesión
                                        }

                                        case 6 -> {
                                            // Ver Carrito
                                        }

                                        case 7 -> {
                                            // Actualizar Datos Personales
                                        }

                                        case 8 -> {
                                            // Registrarse
                                        }
                                        case 9 -> {
                                            // Ver Compras
                                        }
                                        case 10 -> {
                                            // Ver Puntos 
                                        }
                                        case 11 -> {
                                            System.out.println("Rregresando...");
                                        }
                                        default -> throw new AssertionError();
                                    }
                                }while(opcionUsuario != 11);
                            }

                            case 2 -> {
                                opcionUsuario = 0;
                                do {
                                    mostrarMensajeUser("Universidad");
                                    System.out.print(""" 
                                    1. Ver Cartelera 
                                    2. Buscar película 
                                    3. Cambiar Sucursal
                                    4. Iniciar Sesión
                                    5. Buscar producto
                                    6. Ver Carrito
                                    7. Actualizar Datos Personales
                                    8. Registrarse 
                                    9. Ver Mis compras 
                                    10.Ver Mis puntos 
                                    11.Salir
                                                     """);

                                    opcionUsuario = leerDatos.nextInt();
                                    leerDatos.nextLine();

                                    switch (opcionUsuario) {
                                        case 1 -> {
                                            // Cartelera 
                                        }

                                        case 2 -> {
                                            // Buscar Pelicula 
                                        }

                                        case 3 -> {
                                            // Cambiar Sucursal
                                        }

                                        case 4 -> {
                                            // Buscar Pelicula 
                                        }

                                        case 5 -> {
                                            // Inicio de Sesión
                                        }

                                        case 6 -> {
                                            // Ver Carrito
                                        }

                                        case 7 -> {
                                            // Actualizar Datos Personales
                                        }

                                        case 8 -> {
                                            // Registrarse
                                        }
                                        case 9 -> {
                                            // Ver Compras
                                        }
                                        case 10 -> {
                                            // Ver Puntos 
                                        }
                                        case 11 -> {
                                            System.out.println("Rregresando...");
                                        }
                                        default -> throw new AssertionError();
                                    }
                                }while(opcionUsuario != 11);
                            }

                        case 3 -> {
                                opcionUsuario = 0;
                                do {
                                    mostrarMensajeUser("Delta");
                                    System.out.print(""" 
                                    1. Ver Cartelera 
                                    2. Buscar película 
                                    3. Cambiar Sucursal
                                    4. Iniciar Sesión
                                    5. Buscar producto
                                    6. Ver Carrito
                                    7. Actualizar Datos Personales
                                    8. Registrarse 
                                    9. Ver Mis compras 
                                    10.Ver Mis puntos 
                                    11.Salir
                                                     """);

                                    opcionUsuario = leerDatos.nextInt();
                                    leerDatos.nextLine();

                                    switch (opcionUsuario) {
                                        case 1 -> {
                                            // Cartelera 
                                        }

                                        case 2 -> {
                                            // Buscar Pelicula 
                                        }

                                        case 3 -> {
                                            // Cambiar Sucursal
                                        }

                                        case 4 -> {
                                            // Buscar Pelicula 
                                        }

                                        case 5 -> {
                                            // Inicio de Sesión
                                        }

                                        case 6 -> {
                                            // Ver Carrito
                                        }

                                        case 7 -> {
                                            // Actualizar Datos Personales
                                        }

                                        case 8 -> {
                                            // Registrarse
                                        }
                                        case 9 -> {
                                            // Ver Compras
                                        }
                                        case 10 -> {
                                            // Ver Puntos 
                                        }
                                        case 11 -> {
                                            System.out.println("Rregresando...");
                                        }
                                        default -> throw new AssertionError();
                                    }
                                }while(opcionUsuario != 11);
                            }

                            case 4 -> {
                            opcionUsuario = 0;
                                do {
                                    mostrarMensajeUser("Xochimilco");
                                    System.out.print(""" 
                                    1. Ver Cartelera 
                                    2. Buscar película 
                                    3. Cambiar Sucursal
                                    4. Iniciar Sesión
                                    5. Buscar producto
                                    6. Ver Carrito
                                    7. Actualizar Datos Personales
                                    8. Registrarse 
                                    9. Ver Mis compras 
                                    10.Ver Mis puntos 
                                    11.Salir
                                                     """);

                                    opcionUsuario = leerDatos.nextInt();
                                    leerDatos.nextLine();

                                    switch (opcionUsuario) {
                                        case 1 -> {
                                            // Cartelera 
                                        }

                                        case 2 -> {
                                            // Buscar Pelicula 
                                        }

                                        case 3 -> {
                                            // Cambiar Sucursal
                                        }

                                        case 4 -> {
                                            // Buscar Pelicula 
                                        }

                                        case 5 -> {
                                            // Inicio de Sesión
                                        }

                                        case 6 -> {
                                            // Ver Carrito
                                        }

                                        case 7 -> {
                                            // Actualizar Datos Personales
                                        }

                                        case 8 -> {
                                            // Registrarse
                                        }
                                        case 9 -> {
                                            // Ver Compras
                                        }
                                        case 10 -> {
                                            // Ver Puntos 
                                        }
                                        case 11 -> {
                                            System.out.println("Rregresando...");
                                        }
                                        default -> throw new AssertionError();
                                    }
                                }while(opcionUsuario != 11);
                            }

                            case 5 -> { System.out.println("**Regresando al Menu Principal");
                            }

                            default -> throw new AssertionError();
                        }
                    } while(opcionSucursal != 5);
                }

                case 2 -> {
                        do{
                        System.out.println("Selecciona una Sucursal: ");
                        System.out.print("""
                                         1) CU
                                         2) Universidad
                                         3) Delta
                                         4) Xochimilco  
                                         
                                         **Presiona 5 para regresar**
                                        """);
                        opcionSucursal = leerDatos.nextInt();
                        leerDatos.nextLine();
                        }while(opcionSucursal != 5);
                }

                case 3 -> {  
                            System.out.print("""
                            Proyecto Final
                            Programacion Orientada a Objetos
                            Grupo: 09
                            Semestre: 2025 - 01
                            Equipo ##: TonallTech
                            Integrantes:
                            * Arzate Rios Adrian Axel: 
                            * Cabrera Luna Samuel: 
                            * Garcia Trejo Arturo: 
                            * Monrroy Caamano Fernando: 
                            * Rebolledos Ceballo Daniel Antonio: \n 
                             """);
                }

                case 4 -> System.out.println("Gracias por utilizar el servicio, nos vemos!!");
                default -> throw new AssertionError();
            }
        } while (opcionPrincipal != 4); // do-while principal
    }
}

public static String mostrarMensajeUser(String nombreSucursal) {
        var mensaje = String.format("""
                             ****************
                             RoboTICs presenta:
                             Cine-TICs %s
                             El Cine de confianza
                             ****************\n
                             """, nombreSucursal);
        System.out.print(mensaje);
        return mensaje;
    }

public static String mostrarMensajeAdmin(String nombreSucursal) {
        String mensaje = String.format("""
                             ****************
                            Menu de Administrador
                             Cine-TICs %s
                             ****************\n
                             """, nombreSucursal);
        System.out.print(mensaje);
        return mensaje;
    }
