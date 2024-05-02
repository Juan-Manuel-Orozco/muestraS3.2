package org.example;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.Random;

 class Medico implements Runnable {
    private final int id;
     private final AtomicInteger pacientesAtendidos;

     public Medico(int id, AtomicInteger pacientesAtendidos) {
         this.id = id;
         this.pacientesAtendidos = pacientesAtendidos;
     }

     @Override
     public void run() {
         System.out.println("Médico " + id + " comenzó a atender pacientes.");
         Random rand = new Random();
         try {
             while (true) {
                 Thread.sleep(rand.nextInt(5000));
                 pacientesAtendidos.incrementAndGet();
                 System.out.println("Médico " + id + " ha atendido a " + pacientesAtendidos.get() + " pacientes.");
             }
         } catch (InterruptedException e) {
             System.out.println("Médico " + id + " ha terminado su turno.");
         }
     }
 }

