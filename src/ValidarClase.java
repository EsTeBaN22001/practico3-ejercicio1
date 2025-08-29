public class ValidarClase {
    
    public static boolean validarContraseña(String contraseña) {
        if (contraseña == null || contraseña.isEmpty()) {
            System.out.println("La contraseña no puede estar vacia.");
            return false;
        }

        if (contraseña.length() < 8) {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
            return false;
        }

        if (!contraseña.matches(".*[A-Z].*")) {
            System.out.println("La contraseña debe contener al menos una letra mayuscula.");
            return false;
        }

        if (!contraseña.matches(".*[0-9].*")) {
            System.out.println("La contraseña debe contener al menos un número.");
            return false;
        }

        if (!contraseña.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            System.out.println("La contraseña debe contener al menos un carácter especial.");
            return false;
        }

        return true; 
    }
}
