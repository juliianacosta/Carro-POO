public class Carro {
    public double tanque = 0;
    public double km = 0;
    public int pass = 0;
    public double mediaTanque = 0;

    public final int passMax = 2;
    public final double tanqueMax = 10;

    public void status(){
    	System.out.println("\tO carro tem " + this.pass +" pessoas, "+ this.tanque + " de combustivel e " + this.km + " km rodados.");
    }

    public boolean embarcar(){
    	boolean x;
    	if (this.pass >= passMax) {
    		x = false;
    	} else{
    		this.pass++;
    		x = true;
    	}
    	return x;
    }
    public boolean desembarcar(){
    	boolean x;
    	if(this.pass == 0){
    		x = false;
    	} else{
    		this.pass--;
    		x = true;
    	}
    	return x;
    }
    public void abastecer(double t){
    	if(t > tanqueMax){
    		System.out.println("Erro: impossivel abastecer alem da capacidade maxima.");
    	}
    	else if((this.tanque + t) <= tanqueMax){
    		this.tanque += t;
    		if(this.tanque > tanqueMax){
    			System.out.println("Erro: tanque ja esta cheio.");
    		} else {
    			System.out.println("Tanque abastecido.");
    		}
    	}
    	else {
    		System.out.println("Erro: tanque ja esta cheio.");
    	}
    }
    public boolean andar(double k){
    	boolean x;
    	mediaTanque = this.tanque - (k/tanqueMax);
    	if(this.pass != 0) {
    		if((mediaTanque >= 0)){
    			this.km += k;
    			this.tanque = mediaTanque;
    			System.out.println("O carro esta andando.");
    			x = true;
    		} else{
    			System.out.println("Erro: sem combustivel suficiente.");
    			x = false;
    		}
    	} else{
    		System.out.println("Erro: nao ha passageiro(s).");
    		x = false;
    	}
    return x;
    }
}