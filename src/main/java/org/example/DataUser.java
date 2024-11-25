package org.example;


import java.util.Scanner;

public class DataUser {

    /**
     * Metodo que recibe la contraseña y valida sus parametros
     * @param password
     * @return
     */
    public static boolean isValidPassword(String password) {
        if (password.length() < 8 || password.contains(" ")) {
            return false;
        }

        boolean hasUppercase = false, hasLowerCase = false, hasDigit = false, hasSpecialChar = false;

        for (char ch : password.toCharArray()) {
            if (Character.isUpperCase(ch)) hasUppercase = true;
            else if (Character.isLowerCase(ch)) hasLowerCase = true;
            else if (Character.isDigit(ch)) hasDigit = true;
            else if (!Character.isLetterOrDigit(ch)) hasSpecialChar = true;

        }

        return hasUppercase && hasLowerCase && hasDigit && hasSpecialChar;
    }

    public static  String validEmail(){
        Scanner sc = new Scanner(System.in);
        String emailpass="";

        while (true){
            System.out.println("Ingrese un correo valido");
            String email = sc.nextLine();
            int i = 0;
            if(email.contains("@")){
                for(char ch : email.toCharArray()){
                    if (ch == '@')i += 1;
                }

                if (i>0 && i<2){
                    System.out.println("Correo valido");
                    emailpass = email;
                    break;
                }else{
                    System.out.println("Correo invalido\n" + "Intenta nuevamente");
                }
            }else{
                System.out.println("Correo invalido\n" + "Intenta nuevamente");
            }
        }
        sc.close();
        return emailpass;
    }

    /**
     * Metodo que escanea la contraseña y la retorna valida
     * @return
     */
    public static String validPass(){
        Scanner sc = new Scanner(System.in);
        String pass;
        while(true) {
            System.out.println("Ingresa una clave mayor a 8 digitos\n" +
                    "que no tenga espacios en blanco,\n" +
                    "que contenga al menos una mayuscula, al menosuna minuscula" +
                    "al menos un numero y al menos un simbolo");
            String passWord = sc.next();

            if (isValidPassword(passWord)) {
                pass = passWord;
                break;
            } else {
                System.out.println("Intenta de nuevo");
            }
        }
        sc.close();
        return pass;
    }
}
