package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Funcionario;

public class ValidacaoPeriodicidade implements ValidacaoReajuste {
	
	public void validar(Funcionario funcionario, BigDecimal aumento) {
		
		if (ChronoUnit.MONTHS.between(funcionario.getDataUltimoReajuste(), LocalDate.now()) < 6) {
			throw new ValidacaoException("O periodo entre um reajuste e outro não pode ser menor que seis meses");
		}
	}

}
