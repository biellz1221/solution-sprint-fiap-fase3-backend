package br.com.fiap.abctechapi.application;

import br.com.fiap.abctechapi.application.dto.AssistDto;
import br.com.fiap.abctechapi.application.dto.OrderDto;
import br.com.fiap.abctechapi.model.Assist;

import java.util.List;

public interface AssistApplication {
    List<AssistDto> getAssists();
    void createAssist(AssistDto assistDto) throws Exception;

}
