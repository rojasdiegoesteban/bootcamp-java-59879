package com.educacionit.clase11y12.interfaces;

import com.educacionit.clase11y12.classes.Alumno;
import com.educacionit.clase11y12.classes.Titulo;

public interface Formativa {
    Alumno inscribir(String nombre);

    Titulo egresar(Alumno alumno, String nombreTitulo);
}
