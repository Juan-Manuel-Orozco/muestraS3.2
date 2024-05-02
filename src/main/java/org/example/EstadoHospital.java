package org.example;
import java.io.Serializable;
public class EstadoHospital implements Serializable {
    private static final long serialVersionUID = 1L;
    private final int pacientesAtendidos;

    public EstadoHospital(int pacientesAtendidos) {
        this.pacientesAtendidos = pacientesAtendidos;
    }

    public int getPacientesAtendidos() {
        return pacientesAtendidos;
    }
}