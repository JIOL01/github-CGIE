package com.appnica.cursosexcel

object Global {

    val contacto = listOf(
        Contacto(1, "Conceptos básicos de Bases de Datos en Excel"),
        Contacto(2, "Ejemplos de Bases de Datos en Excel"),
        Contacto(3, "Diversos ejemplos de Bases de Datos en Excel "),
        Contacto(4, "¿Que es una Tabla Resumen en Excel y que es una Base de Datos?")
    )

    val contentMd2 = listOf(
        ContentMd2(1, "¿Cómo ingresar datos en una Base de Datos de Excel?"),
        ContentMd2(2, "Aprende a ordenar Bases de Datos en Excel"),
        ContentMd2(3, "¿Cómo generar subtotales en una Base de Datos en Excel?"),
        ContentMd2(4, "¿Cómo se generan autofiltros en una Base de Datos en Excel?"),
        ContentMd2(5, "¿Cómo crear un filtro avanzado en una Base de Datos en Excel? "),
        ContentMd2(6, "Aprende a validar datos en Excel")

    )

    val modulo3 = listOf(
        Modulo3(1, "¿Cómo crear Tablas Dinámicas en Excel?"),
        Modulo3(2, "Agrupar campos en Tablas Dinámicas en Excel"),
        Modulo3(3, "Mostrar datos como porcentaje de fila o columna"),
        Modulo3(4, "Segmentación de Datos en Tablas Dinámicas en Excel ")
    )

    val modulo4 = listOf(
        Modulo4(1, "Combinando correspondencia con Word y una base de datos en Excel"),
        Modulo4(2, "Formato condicional en Excel Parte 1 "),
        Modulo4(3, "Formato condicional en Excel Parte 2"),
        Modulo4(4, "Formato condicional en Excel Parte 3 "),
        Modulo4(5, "¿Cómo generar minigráficos en Excel? "),
        Modulo4(6, "Cinta y barra de menú rápida en Excel"),
        Modulo4(7, "Conoce todos los menús en la presentación de excel "),
        Modulo4(8, "Conoce todas las opciones de menú en Excel "),
        Modulo4(9, "¿Cómo hacer consultas web desde Excel y generar Bases de Datos? "),
        Modulo4(10, "Creación de Macros en Excel ")
    )

}

class Contacto(val id:Int, val subjectMd1:String)

class ContentMd2(val id:Int, val subjectMd2:String)

class Modulo3(val id:Int, val subjectMd3:String)

class Modulo4(val id:Int, val subjectMd4:String)


