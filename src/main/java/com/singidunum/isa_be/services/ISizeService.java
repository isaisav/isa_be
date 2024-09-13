package com.singidunum.isa_be.services;

import com.singidunum.isa_be.entities.Size;

import java.util.List;

public interface ISizeService {
    List<Size> getAll();

    void deleteSize(int id);

    void addSize(String size);

    void updateSize(String oldName, String newName);
}
