package model;

public class Carro {
	private String Marca;
	private String Modelo;
	private String Placa;
	private int Ano;
	private String Cor;
	private String Reparo;
	private float ValorReparo;

	public Carro(String Marca, String Modelo, String Placa, int Ano, String Cor) {
		this.Marca = Marca;
		this.Modelo = Modelo;
		this.Placa = Placa;
		this.Ano = Ano;
		this.Cor = Cor;
	}

	public String getMarca() {
		return Marca;
	}

public void setMarca(String marca) {
Marca = marca;
}
