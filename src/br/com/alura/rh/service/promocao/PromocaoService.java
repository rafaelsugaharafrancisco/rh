package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		
		Cargo cargoAtual = funcionario.getCargo();
		
		if (Cargo.GERENTE == cargoAtual)
			throw new ValidacaoException("Gerente � o �ltimo da hierarquia");
		
		if (metaBatida) {
			Cargo proximoCargo = cargoAtual.obterProximo();
			funcionario.promover(proximoCargo);
		} else {
			throw new ValidacaoException("Meta n�o batida, portanto n�o ter� promo��o");
		}
	}

}
