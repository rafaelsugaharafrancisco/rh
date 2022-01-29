package br.com.alura.rh.service.promocao;

import br.com.alura.rh.ValidacaoException;
import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
	
	public void promover(Funcionario funcionario, boolean metaBatida) {
		
		Cargo cargoAtual = funcionario.getCargo();
		
		if (Cargo.GERENTE == cargoAtual)
			throw new ValidacaoException("Gerente é o último da hierarquia");
		
		if (metaBatida) {
			Cargo proximoCargo = cargoAtual.obterProximo();
			funcionario.promover(proximoCargo);
		} else {
			throw new ValidacaoException("Meta não batida, portanto não terá promoção");
		}
	}

}
