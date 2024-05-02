package org.example;
import java.util.concurrent.atomic.AtomicInteger;

public class Hospital {
    public static void main(String[] args) {
        AtomicInteger pacientesAtendidos = new AtomicInteger(0);
        Thread[] medicos = new Thread[5];

        for (int i = 0; i < medicos.length; i++) {
            medicos[i] = new Thread(new Medico(i, pacientesAtendidos));
            medicos[i].start();
        }

        try {
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        for (Thread medico : medicos) {
            medico.interrupt();
        }

        System.out.println("El hospital ha cerrado. Pacientes atendidos: " + pacientesAtendidos.get());
    }
}