package cinema;

public class Compra {
	public int quantidade;
	public String filme, cadastro;
	
	public float Total() {
		float total;
	    if (filme == "Velozes e Furiosos 9 ") {
	    	total = quantidade * 20;
	    } else if (filme == "Vingadores") {
	    	total = quantidade * 30;
	    } else if (filme == "Minha m�e � uma pe�a") {
	    	total = quantidade * 25;
	    } else if (filme == "Um espi�o e meio") {
	    	total = quantidade * 22;
	    } else {
	    	total = 0;
	    }
	    return total;
	 }
}