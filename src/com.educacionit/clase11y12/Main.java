package com.educacionit.clase11y12;

import com.educacionit.clase11y12.classes.Alumno;
import com.educacionit.clase11y12.classes.Banco;
import com.educacionit.clase11y12.classes.Escuela;
import com.educacionit.clase11y12.classes.Institucion;
import com.educacionit.clase11y12.classes.Titulo;
import com.educacionit.clase11y12.classes.Universidad;
import com.educacionit.clase11y12.interfaces.Formativa;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Institucion institucionGenerica = new Institucion();

        /*
            BANCO
         */

        Banco santader11 = new Banco("Colon 10", 50, "Santander suc. 10");
        Long cbuCliente1 = santader11.altaCuenta();
        //System.out.println("Cbu Cliente 1: " + cbuCliente1);

        Long cbuCliente2 = santader11.altaCuenta();
        //System.out.println("Cbu Cliente 2: " + cbuCliente2);

        Long cbuCliente3 = santader11.altaCuenta();
        //System.out.println("Cbu Cliente 3: " + cbuCliente3);

        boolean seElimino = santader11.bajaCuenta(2L);

        /*
            UNIVERSIDAD
         */

        // creación de la universidad "Universidad Nacional de Córdoba"
        Universidad unc = new Universidad();

        // creación de la carrera
        String csComputacion = "Ciencias de la Computación";
        boolean creada = unc.altaCarrera(csComputacion);
        if (creada) {
            System.out.println("Se creó la carrera " + csComputacion);
        }

        // agregar alumnos
        Alumno juan = unc.inscribir("Juan");
        System.out.println("Inscribimos a " + juan.getNombre());

        Alumno johana = unc.inscribir("Johana");
        System.out.println("Inscribimos a " + johana.getNombre());

        // egresar alumno
        Titulo licCsComputacion = unc.egresar(johana, "Lic. en Cs. de la Computación");
        System.out.println("Se egresó " + johana.getNombre() +
                " con el título de " + licCsComputacion.getNombre() +
                " el día " + licCsComputacion.getFechaDeEgreso());

        // baja la carrera
        unc.bajaCarrera(csComputacion);

        /*
            ESCUELA
         */

        // creo una escuela secundaria
        Escuela secundaria = new Escuela();

        // creo el listado de grados
        List<String> grados = List.of("1A", "1B", "2A", "2B", "3A", "3B");
        secundaria.setGrados(grados);

        System.out.println("Grados de la escuela secundaria:");
        for (String grado : secundaria.getGrados()) {
            System.out.println(grado);
        }

        // inscribir alumnos
        Alumno nico = secundaria.inscribir("Nico");
        Alumno sofi = secundaria.inscribir("Sofi");

        System.out.println("Alumnos de la escuela secundaria:");
        for (Alumno alumno : secundaria.getAlumnos()) {
            System.out.println(alumno);
        }

        // Dar de baja un alumno
        boolean seEliminoAlumno = secundaria.bajaAlumno(100L);
        if (seEliminoAlumno) {
            System.out.println("Se eliminó el alumno correctamente");
        }

        seEliminoAlumno = secundaria.bajaAlumno(100L);
        if (!seEliminoAlumno) {
            System.out.println("El alumno no se eliminó porque no existía");
        }

        // egresar alumnos
        Titulo tituloSofi = secundaria.egresar(sofi, "Ciclo Básico");
        System.out.println(tituloSofi);

        Titulo tituloNico = secundaria.egresar(nico, "Ciclo Básico");
        System.out.println(tituloNico);

        /*
            Ejercicio Polimorfismo
            ----------------------
            REQUERIMIENTO CLIENTE: Crear una función que:
            1. Reciba el nombre de un alumno y un listado de instituciones.
            2. La función debe inscribir y egresar al alumno.
            3. Se debe imprimir la información del título de egreso.
         */

    }

    static void inscribirYEgresar(String nombreAlumno, List<Institucion> instituciones) {
        // Recorremos las instituciones
        for (Institucion institucion : instituciones) {

            // Usamos el operador instanceof para saber si implementa la interfaz Formativa
            if (institucion instanceof Formativa) {

                // Casteamos la institución a Formativa
                Formativa institucionFormativa = (Formativa) institucion;

                // inscribimos y egresamos el Alumno

                // imprimimos los datos de Titulo

            }
        }
    }


}
