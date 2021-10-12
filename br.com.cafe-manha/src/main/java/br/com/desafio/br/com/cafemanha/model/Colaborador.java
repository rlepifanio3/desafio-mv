package br.com.desafio.br.com.cafemanha.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Colaborador {

	private Integer idColaborador;
	
	private String cpfColaborador;
	
	private String nomeColaborador;
}
