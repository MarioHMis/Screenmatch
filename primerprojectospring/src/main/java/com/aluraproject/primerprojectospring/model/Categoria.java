package com.aluraproject.primerprojectospring.model;

public enum Categoria {
    ACCION("Action"),
    ROMANCE("Romance"),
    COMEDIA("comedy"),
    DRAMA("Drama"),
    CRIMEN("Crime");

    private String categoriaOmdb;
    Categoria(String categoriaOmdb) {
        this.categoriaOmdb = categoriaOmdb;
    }
}
