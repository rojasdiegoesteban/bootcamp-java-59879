package com.educacionit.clase11.interfaces;

import com.educacionit.clase11.classes.Alumno;
import com.educacionit.clase11.classes.Titulo;

public interface Formativa {
    public abstract Alumno inscripcion(String nombre);

    Titulo egresarse(Alumno alumno);
}
