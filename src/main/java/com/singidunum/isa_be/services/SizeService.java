package com.singidunum.isa_be.services;

import com.singidunum.isa_be.entities.Size;
import com.singidunum.isa_be.repositories.SizeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
@RequiredArgsConstructor
public class SizeService implements ISizeService {
    private final SizeRepository sizeRepository;

    @Override
    public List<Size> getAll() {
        return sizeRepository.findAll();
    }

    @Override
    public void deleteSize(int id) {
        sizeRepository.deleteById(id);
    }

    @Override
    public void addSize(String size) {
        Size newSize = new Size();
        newSize.setName(size);

        sizeRepository.save(newSize);
    }

    @Override
    public void updateSize(String oldName, String newName) {
        System.out.println(oldName);

        var z = sizeRepository.findByName(oldName).orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "invalid size id"));

        z.setName(newName);

        sizeRepository.save(z);
    }
}
