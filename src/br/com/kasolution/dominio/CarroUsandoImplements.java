package br.com.kasolution.dominio;

public class Carro implements Veiculo, Motor {

	private String modelo;
	private String placa;
	private boolean motorLigado;
	private int velocidade;

	public Carro(String modelo, String placa) {
		super();
		this.modelo = modelo;
		this.placa = placa;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Carro(boolean motorLigado, int velocidade) {
		super();
		this.motorLigado = false;
		this.velocidade = 0;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Carro [modelo=" + modelo + ", placa=" + placa + "]";
	}

	@Override
	public void ligar() {
		// TODO Auto-generated method stub
		if(!motorLigado) {
			motorLigado = true;
			System.out.println("Motor Ligado");
		} else {
			System.out.println("O motor já está ligado");
		}
	}

	@Override
	public void desligar() {
		// TODO Auto-generated method stub
        if (motorLigado) {
        	motorLigado = false;
        	velocidade = 0;
        	System.out.println("Motor Desligado");
        } else {
        	System.out.println("O motor já está desligado");
        }
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		if (motorLigado) {
			velocidade += 10;
			System.out.println("Acelerando. Velocidade: " + velocidade + "km/h");
		} else {
			System.out.println("Não é possível acelerar. Motor desligado");
		}
	}

	@Override
	public void frear() {
		if (velocidade > 0) {
			velocidade -= 5;
			System.out.println("Freando. Velocidade " + velocidade + "km/h");
		} else {
			System.out.println("O carro já está parado.");
		}

		// TODO Auto-generated method stub

	}

    public static void main(String args[]) {
    	
    	Carro meucarro = new Carro(true,30);
    	meucarro.ligar();
    	meucarro.acelerar();
    	meucarro.frear();
    	meucarro.desligar();
    	
    }
   
}
