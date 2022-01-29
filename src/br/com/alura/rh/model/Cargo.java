package br.com.alura.rh.model;

public enum Cargo {

	ASSISTENTE {
		@Override
		public Cargo obterProximo() {
			return ANALISTA;
		}
	},
	ANALISTA {
		@Override
		public Cargo obterProximo() {
			return ESPECIALISTA;
		}
	},
	ESPECIALISTA {
		@Override
		public Cargo obterProximo() {
			return GERENTE;
		}
	},
	GERENTE {
		@Override
		public Cargo obterProximo() {
			return GERENTE;
		}
	};

	public abstract Cargo obterProximo();
}
