package com.cristianofilho.log.api.model;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

import com.cristianofilho.log.domain.model.StatusEntrega;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntregaDTO {

	private Long id;
	private ClienteDTO cliente;
	private DestinatarioDTO destinatario;
	private BigDecimal taxa;
	private StatusEntrega status;
	private OffsetDateTime dataPedido;
	private OffsetDateTime dataFinalizacao;
	
}
