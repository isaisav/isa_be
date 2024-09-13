package com.singidunum.isa_be.controllers;

import com.singidunum.isa_be.entities.Size;
import com.singidunum.isa_be.services.ISizeService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/size")
@RequiredArgsConstructor
@CrossOrigin("*")
public class SizeController {
    private final ISizeService sizeService;

    @GetMapping("all")
    public List<Size> getAll() {
        return sizeService.getAll();
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> delete(@PathVariable int id) {
        sizeService.deleteSize(id);

        return ResponseEntity.ok().build();
    }

    @PostMapping("/add")
    public ResponseEntity<?> add(@RequestBody String size) {
        sizeService.addSize(size);

        return ResponseEntity.ok().build();
    }

    @Setter
    @Getter
    public static class UpdateRequest{
        private String oldName;
        private String newName;

    }

    @PutMapping("/update")
    public ResponseEntity<?> update(@RequestBody UpdateRequest updateRequest) {
        sizeService.updateSize(updateRequest.getOldName(), updateRequest.getNewName());

        return ResponseEntity.ok().build();
    }
}
