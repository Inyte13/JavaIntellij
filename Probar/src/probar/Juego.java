package probar;

import javax.swing.JOptionPane;

public class Juego {
	public static void main(String[] args) {
		int partida=0;
		while(true) {
			partida++;
			int dado1=(int)(Math.random()*6)+1;
			int dado2=(int)(Math.random()*6)+1;
			int sum=dado1+dado2;
			int gane=0;
			int perdi=0;
			String mensaje;
			if(sum==2||sum==12) {
				mensaje="Ganaste";
				gane++;
				break;}
			else if(sum==7||sum==11) {
				mensaje="Perdiste";
				perdi++;
				break;}
			else
				mensaje="Siga jugando";
				JOptionPane.showMessageDialog(null, "Partida "+partida+"\n"+"Dado1: "+dado1+"\n"+
													"Dado2: "+dado2+"\n"+
													"Suma: "+sum+"\n"+
													mensaje+" en el intento número "+partida);
				while(true) {
					int dado3=(int)(Math.random()*6)+1;
					int dado4=(int)(Math.random()*6)+1;
					int sum2=dado3+dado4;
					partida++;
					if(sum2==7) {
						mensaje="Perdiste";
						perdi++;
						break;}
					else if(sum2==sum) {
						mensaje="Ganaste";
						gane++;
						break;}
					else {
						mensaje="Siga jugando";
						return;}}
				JOptionPane.showMessageDialog(null, "Partida "+partida+"\n"+"Dado1: "+dado1+"\n"+
						"Dado2: "+dado2+"\n"+
						"Suma: "+sum+"\n"+
						mensaje+" en el intento número "+partida);
				
			JOptionPane.showMessageDialog(null, "Partida "+partida+"\n"+"Dado1 "+dado1+"\n"+
												"Dado2 "+dado2+"\n"+
												"Suma "+sum+"\n"+
												mensaje+" en el intento número "+partida);}}}
