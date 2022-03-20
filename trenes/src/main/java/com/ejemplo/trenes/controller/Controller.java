package com.ejemplo.trenes.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;
import java.util.logging.*;

import com.ejemplo.trenes.dominio.Consulta;

@Slf4j
@RestController
public class Controller {

    private static Logger LOGGER = Logger.getLogger("InfoLogging");
    /*
    @GetMapping("api/trenes")
    public @ResponseBody ResponseEntity<List<String>> getTrenes() {
        //log.info("Ejecutando la operación listado de trenes");

        List<String> trenes = List.of("Alivia", "Talgo", "Cercanias", "Metroligero", "Ave");
        return ResponseEntity.ok().body(trenes);
    }

    @GetMapping("api/trenes/{id}")
    public @ResponseBody ResponseEntity<String> getTrenesById(@PathVariable ("id") String id) {
        
        //log.info(id);
        Optional<String> tren = List.of("Alivia", "Talgo", "Cercanias", "Metroligero", "Ave")
        .stream()
        .filter(s -> s.toLowerCase().equals(id.toLowerCase()))
        .findAny();

        if (tren.isPresent()) {
            return ResponseEntity.ok().body(tren.get());
        }
        else {
            LOGGER.info("No se ha encontrado");
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("");
        }
    }
    */

    Consulta consulta;

    @GetMapping("/getConsulta")
    public Consulta getConsulta(){
        LOGGER.info("Done GET");
        return consulta;
    }

    @PostMapping("/postConsulta")
    public void postConsulta(@RequestBody Consulta consulta) {
        this.consulta = consulta;
        LOGGER.info("Done POST");
    }
}
