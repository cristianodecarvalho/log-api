package com.cristianofilho.log.domain.service;

import org.springframework.stereotype.Service;

import com.cristianofilho.log.domain.exception.EntidadeNaoEncontradaException;
import com.cristianofilho.log.domain.model.Entrega;
import com.cristianofilho.log.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {

	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada"));
	}
	
}
