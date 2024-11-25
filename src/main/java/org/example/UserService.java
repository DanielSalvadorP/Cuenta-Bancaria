package org.example;

import java.util.Scanner;

public class UserService {
    static Scanner sc = new Scanner(System.in);
    /*
    Metodos de creación de usuario y manejo de cuentas
    Creación de cuentas
        Datos:
        cedula:
        Nombre:
        Correo:
        Contraseña:
        Edad +18 obligado
    acceder a cuenta:
        Usuario Correo:
        Contraseña:
    Actualizar contraseña:
        Escribir contraseña anterior:
        Escribir Clave nueva (8 digitos):
        Escribir nuevamente clave nueva
    eliminar cuenta:
        Escribir nuevamente la contraseña

     */

    public static String newPass;
    public static String confirmPass;

    /**
     * Este metodo permite la creación de los nuevos usuarios
     */
    public static void createAccount() {
        System.out.println("Eres mayor de 18?\n" +
                "(Y/N)");
        char ans = sc.next().charAt(0);
        if (ans =='Y' || ans == 'y') {
            System.out.println("Ingrese los siguientes datos:");
           // System.out.print("Email: ");
            String email = DataUser.validEmail();

            System.out.print("Nombre: ");
            String name = sc.next();
            System.out.print("Cedula: ");
            int idNumber = sc.nextInt();

            String password;//clave
            password = DataUser.validPass();
            User currentUser = new User(idNumber, email, name, password);
            System.out.println("cuenta creada");
        }else if(ans =='N' || ans == 'n'){
            System.out.println("Menor de edad no puede tener cuenta sin supervisión");
        }else{
            System.out.println("Intentalo de nuevo");
        }
    }

    /**
     * Permite el acceso a las cuentas
     */
    public static void AccessAcount(){
        System.out.println("Correo: ");
        String email = sc.next();
        System.out.println("Clave");
        String passWord = sc.next();
        System.out.println("Ingreso confirmado");
    }

    /**
     * Permite actualizar las contraseñas
     */
    public static void UpdatePass(){
        System.out.println("Cambio de clave\n" +
                "Ingrese clave original: ");
        String passWord = sc.next();
        System.out.println("Ingrese clave nueva: ");
        newPass = sc.next();
        System.out.println("Confirme la clave nueva:");
        confirmPass = sc.next();
        if(newPass.equals(confirmPass)){
            System.out.println("Clave cambiada");
        }
        else{
            System.out.println("Error");
        }
    }

    /**
     * Permite eliminar las cuentas existentes
     */
    public static void DeleteAccount(){

    }



}
