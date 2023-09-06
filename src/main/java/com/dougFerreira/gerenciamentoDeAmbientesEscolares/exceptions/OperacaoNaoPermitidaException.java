package com.dougFerreira.gerenciamentoDeAmbientesEscolares.exceptions;

public class OperacaoNaoPermitidaException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public OperacaoNaoPermitidaException(String mensagem) {
		super(mensagem);
	}
	
	public OperacaoNaoPermitidaException(String mensagem, Throwable causa) {
		super(mensagem, causa);
	}

}
