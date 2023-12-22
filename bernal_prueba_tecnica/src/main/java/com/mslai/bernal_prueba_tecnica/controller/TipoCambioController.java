package com.mslai.bernal_prueba_tecnica.controller;

import com.mslai.bernal_prueba_tecnica.model.entitie.SolicitudTipoCambio;
import com.mslai.bernal_prueba_tecnica.model.entitie.TipoCambio;
import com.mslai.bernal_prueba_tecnica.service.TipoCambioService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class TipoCambioController {

    @Autowired
    private TipoCambioService service;

    @PostMapping("/tipoCambio")
    @ResponseStatus(HttpStatus.CREATED)
    public TipoCambio convertirMoneda(@RequestBody @Valid SolicitudTipoCambio solicitudTipoCambio) {
        return service.conversionMoneda(solicitudTipoCambio);
    }

    @GetMapping("/consulta")
    public List<TipoCambio> lista() {
        return service.listar();
    }
}
