package com.company;

import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Calendar now = Calendar.getInstance();
        int hora = now.get(Calendar.HOUR_OF_DAY);
        int minutos = now.get(Calendar.MINUTE);
        int mes = now.get(Calendar.MONTH)+1;
        int dia = now.get(Calendar.DAY_OF_MONTH);
        int anio = now.get(Calendar.YEAR);

        if(hora<12){
            System.out.println("Buenos días.\n");
        }else if (hora<17){
            System.out.println("Buenas tardes.\n");
        }else {
            System.out.println("Buenas noches\n");
        }
        System.out.print("Son ");
        if(minutos !=0){
            System.out.print(" " + minutos + " ");
            System.out.print((minutos !=1) ? " minutos " : " minuto ");
            System.out.print(" pasadas ");
        }
        System.out.print(" las ");
        System.out.print((hora>12) ? (hora -12) : hora);
        System.out.print(" en punto ");

        System.out.println("Una prueba en GIT");



    }
}
