package com.mslai.bernal_prueba_tecnica.service;

import com.mslai.bernal_prueba_tecnica.model.entitie.SolicitudTipoCambio;
import com.mslai.bernal_prueba_tecnica.model.entitie.TipoCambio;

import java.util.List;

public interface TipoCambioService {

    public TipoCambio conversionMoneda(SolicitudTipoCambio solicitudTipoCambio);

    public List<TipoCambio> listar();

    public TipoCambio buscar(int id);


}
