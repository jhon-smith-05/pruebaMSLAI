package com.mslai.bernal_prueba_tecnica.service;

import com.mslai.bernal_prueba_tecnica.model.entitie.SolicitudTipoCambio;
import com.mslai.bernal_prueba_tecnica.model.entitie.TipoCambio;
import com.mslai.bernal_prueba_tecnica.model.repository.TipoCambioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TipoCambioServiceImpl implements TipoCambioService {

    @Autowired
    private TipoCambioRepository repository;

    @Override
    public TipoCambio conversionMoneda(SolicitudTipoCambio solicitudTipoCambio) {

        double tipoCambio = 3.7;

        double cantidadConvertida = solicitudTipoCambio.getMonedaOriginal() * tipoCambio;

        TipoCambio conversion = new TipoCambio();
        conversion.setMonedaOrigen(solicitudTipoCambio.getMonedaOrigen());
        conversion.setMonedaDestino(solicitudTipoCambio.getMonedaDestino());
        conversion.setMontoOriginal(solicitudTipoCambio.getMonedaOriginal());
        conversion.setMontoConvertido(cantidadConvertida);
        conversion.setTipoCambio(tipoCambio);

        return repository.save(conversion);

    }
    @Override
    public List<TipoCambio> listar() {
        return (List<TipoCambio>) repository.findAll();
    }

    @Override
    public TipoCambio buscar(int id) {
        return null;
    }
}
