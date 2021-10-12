package br.com.desafio.br.com.cafemanha.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class ColaboradorRequest {

	@NotNull(message = "campo obrigatorio")
	@JsonProperty(value = "cpf_colaborador")
	private String cpfColaborador;
	
	@NotNull(message = "campo obrigatorio")
	@JsonProperty(value = "nome_colaborador")
	private String nomeColaborador;

}
