
import javax.swing.JOptionPane;
// TODA ESTA CLASES LAS HICE AL PEDO PORQUE ME RE CONFUNDI DE CONSIGNA XD
public class ValidarClase{
    public static boolean validarUsuario(String usuario){
        // TODO LO RELACIONADO A LA VALIDACION DE EL USUARIO
        if (usuario == null || usuario.trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El nombre de usuario no puede estar vacio");
            return false;
            }
        if (usuario.length() < 4) {
            JOptionPane.showMessageDialog(null,"El usuario debe tener al menos 4 caracteres");
            return false;
            }   
        return true;
        // TODO LO RELACIONADO A LA VALIDACION DE EL USUARIO
        }
    public static boolean validarContraseña(String contraseña) {
        // TODO LO RELACIONADO A LA VALIDACION DE LA CONTRA
        if (contraseña == null || contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(null, "La contraseña no puede estar vacia.");
            return false;
        }
        if (contraseña.length() < 8) {
            JOptionPane.showMessageDialog(null, "La contraseña debe tener al menos 8 caracteres.");
            return false;
        }
        if (!contraseña.matches(".*[A-Z].*")) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos una letra mayuscula.");
            return false;
        }
        if (!contraseña.matches(".*[0-9].*")) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos un numero.");
            return false;
        }
        if (!contraseña.matches(".*[!@#$%^&*(),.?\":{}|<>].*")) {
            JOptionPane.showMessageDialog(null, "La contraseña debe contener al menos un caracter especial.");
            return false;
        }
        return true; 
        // TODO LO RELACIONADO A LA VALIDACION DE LA CONTRA
        }
// TODA ESTA CLASES LAS HICE AL PEDO PORQUE ME RE CONFUNDI DE CONSIGNA XD
    
}
