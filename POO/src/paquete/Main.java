package paquete;
import paquete.calculadora;

import javax.swing.JOptionPane;
public class Main {
	public static void main(String[] args) {
	   /*Pelota p;
       p =new Pelota();
       p.patearPelota();
       System.out.println("Radio de la pelota: "+p.obtenerRadio());
   
       carro c;
       c=new carro();
       System.out.println("El peso del carro es: "+c.pesocarro());
       c.encendidocarro();*/
		String respuesta;
		boolean resul=true;
		JOptionPane.showMessageDialog(null, "Caluladora -POO-  <n.n>");
	   while (resul==true) {
		   
       float x=Float.parseFloat(JOptionPane.showInputDialog("El valor de X: "));
       float y=Float.parseFloat(JOptionPane.showInputDialog("El valor de Y: "));
       calculadora ca;
       ca=new calculadora(x,y);
       int opcion=Integer.parseInt(JOptionPane.showInputDialog(null, "Que operacio desea realizar: \n 1. Suma\n2. Resta\n3. Divicion\n 4.Multiplicacion"));
       
           switch(opcion){
           case 1:
               JOptionPane.showMessageDialog(null,"La suma es: "+ca.sumacalcula());
               break;
           case 2: 
        	   JOptionPane.showMessageDialog(null, "La resta es: "+ca.restacalcu());
        	   break;
           case 3: 
        	   JOptionPane.showMessageDialog(null, "La divicion es: "+ca.divicalcula());
        	   break;
           case 4:
        	   JOptionPane.showMessageDialog(null, "La multiplicacion es: "+ca.multicalcula());
        	   break ;
        	default:
        		JOptionPane.showMessageDialog(null, "Error :( || vuelve a operar");
        		break;
           }
           respuesta=JOptionPane.showInputDialog("Desea segir operando ? (si/no)");
          if(respuesta.equals("si")){
        	   resul=true;
           }
          if(respuesta.equals("no")){
        	  resul=false;
          }
           
	}
       JOptionPane.showMessageDialog(null, "Gracias :) ");
      
       
       
	}

}
