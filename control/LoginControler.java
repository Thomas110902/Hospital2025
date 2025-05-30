package control;

public class LoginControler {
    // Datos del usuario temporal
    String[][] credenciales = {
        {"thomaslu", "elpollitopio"}, {"alex_g", "securePass123"}, {"mariadb", "dragon2024!"},
        {"codeMaster", "blueSky#45"}, {"tester_qa", "th0m@sPwd"}, {"devOps42", "javaCoder$7"},
        {"cyberNinja", "goldenKey22"}, {"javaKing", "myp@ssW0RD"}, {"pythonLover", "summerTime99"},
        {"rootAdmin", "admin!1234"}, {"theBoss", "winterIsComing"}
    };

    public boolean validacionDatos(String EUsuario, String EContraseña) {
        for (int i = 0; i < credenciales.length; i++) {
            // Compara el usuario primero
            if (credenciales[i][0].equals(EUsuario)) {
                // Si el usuario existe, compara la contraseña
                if (credenciales[i][1].equals(EContraseña)) {
                    return true; // Usuario y contraseña correctos
                } else {
                    return false; // Usuario existe pero contraseña incorrecta
                }
            }
        }
        return false; // Usuario no encontrado
    }
}
