package com.aluraproject.primerprojectospring.Service;

public interface IConvierteDatos {
    <T> T obetenerDatos(String json, Class<T> clase);
}
