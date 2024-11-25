package org.example;

import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);


       /* System.out.println("ingrese titular");
        String name = sc.nextLine();*/
        int count = 0;
        int optionAccess = -1;
        int optionIn = -1;
        do{
            System.out.println("¡Bienvenido!\n" +
                    "1. Crear cuenta\n" +
                    "2. Acceso\n" +
                    "3. Cambio de clave\n" +
                    "4. Eliminar cuenta\n" +
                    "5. Finalizar");
            optionIn = sc.nextInt();
            switch (optionIn){
                case 1:
                    UserService.createAccount();
                    break;
                case 2:
                    UserService.AccessAcount();
                    break;
                case 3:
                    UserService.UpdatePass();
                    break;
                case 4:
                    System.out.println("Seguro?");
                    char answer = sc.next().charAt(0);
                    if (answer == 'y' || answer == 'Y'){
                        System.out.println("Eliminado");
                        //   UserService.DeleteAccount();
                    }
                    else if(answer == 'n' || answer == 'N'){
                        System.out.println("Gracias por tu respuesta");
                        break;
                    }
                    else{
                        System.out.println("parece que te has equivocado, elige nuevamente");
                        optionIn = 4;
                    }
                    break;
                case 5:
                    optionAccess = 0;
                    System.out.println("Proceso finalizado");
                    break;
                default:
                    System.out.println("Opción invalida, intenta de nuevo");
                    count += 1;
                    if (count == 3){
                        optionIn = 5;
                    }
                    break;
            }
        }while (optionAccess!=0);
    }
}