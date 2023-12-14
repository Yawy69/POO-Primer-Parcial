
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Yannick
 */

public class Recepcion extends Persona {
   
    private String usuario;
    private String codigo;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void ingresarDatosRecepcion(Scanner scanner) {
        boolean codigoValido = false;
        while (!codigoValido) {
            try {
                System.out.println("Ingrese el codigo del usuario de recepcion (solo numeros):");
                String codigoInput = scanner.nextLine();
                if (codigoInput.matches("\\d+")) {
                    setCodigo(codigoInput);
                    codigoValido = true;
                } else {
                    System.out.println("El codigo debe contener solo numeros. Vuelva a intentarlo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada invalida. Intente nuevamente.");
                scanner.next();
            }
        }
    }
}