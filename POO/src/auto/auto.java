package auto;

public class auto {//Se despliega las varialbles (atributos) de la clase AUTO 
	String marca;
	int precio;
	String tipo;
	int a�o;
	
	 auto(){//Primer constructor de la clase AUTO || inicializamos variables
		marca=null;
		tipo=null;
		a�o=0;
		precio=0;
	}
	 auto(String marca,int precio,String tipo,int a�o){
		this.marca=marca;
		this.precio=precio;
	    this.tipo=tipo;
	    this.a�o=a�o;
	}
	void despliegaAuto(String marca,String tipo,int a�o){
		System.out.println("Con parametros || Depliega menu");
	    System.out.println("Marca del coche: "+marca+" tipo: "+tipo+" a�o: "+a�o);
	}
	void despliegaAuto(){
		System.out.println("Sin parametros || despliega menu");
		System.out.println("Marca del auto: "+marca+ " tipo:"+tipo+" a�o:"+a�o);
	}
	
	class kia extends auto{
		void despliegaAuto(String marca,String tipo,int a�o){
			System.out.println("Con parametros || Depliega menu");
		    System.out.println("Marca del coche: "+marca+" tipo: "+tipo+" a�o: "+a�o);
		}
	}

}
