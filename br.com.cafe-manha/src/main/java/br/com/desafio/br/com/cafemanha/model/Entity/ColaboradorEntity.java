package br.com.desafio.br.com.cafemanha.model.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "colaborador")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ColaboradorEntity {
	
	@Column(name = "ID_COLABORADOR")
	private Integer idColaborador;
	
	@Column(name = "CPF_COLABORADOR")
	private String cpfColaborador;
	
	@Column(name = "NOME_COLABORADOR")
	private String nomeColaborador;

}
