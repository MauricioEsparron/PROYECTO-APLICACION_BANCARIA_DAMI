package com.example.aplicacionbancaria

import androidx.room.PrimaryKey
import java.lang.reflect.Constructor

data class Cliente(
    val nombre: String? = null,
    val apellido: String? = null,
    val dni: String? = null,
    val telefono: String? = null,
    val direccion: String? = null,

)
