package br.com.fiap.abctechapi.service;

import br.com.fiap.abctechapi.application.dto.AssistDto;
import br.com.fiap.abctechapi.model.Assist;

import java.util.List;


public interface AssistService {
    List<Assist> getServiceList();
    void saveAssist(Assist assist) throws Exception;
}
