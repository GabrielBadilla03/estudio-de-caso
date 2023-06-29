package programacion.clase7;
import java.util.Random;

import javax.swing.JOptionPane;
public class cliente {
    String nombre = "";
    int cedula = 0;
    int Nfactura = 0;
    int Montofactura = 0;
    String mesfac = "";
    int añofac = 0;
    int Efactura = 0;
    public void setnombre(){
        nombre = JOptionPane.showInputDialog("ingrese el nombre de la persona: ");
        this.nombre = nombre;    
    }
    public String getnombre(){
        return nombre;
    }

    public void setcedula(){
        String leer = JOptionPane.showInputDialog("ingrese la cedula del cliente:");
        int cedula = Integer.parseInt(leer);
        this.cedula = cedula;
    }
    public int getcedula(){
        return cedula;
    }

    public void setNfactura(){
        Random  random = new Random();
        Nfactura = random.nextInt(1000000);
        this.Nfactura = Nfactura;
    }
    public int getNfactura(){
        return Nfactura;
    }

    public void setMontofactura(){
        String leer = JOptionPane.showInputDialog("ingrese el monto de la factura: ");
        Montofactura = Integer.parseInt(leer);
        this.Montofactura = Montofactura;
    }
    public int getMontofactura(){
        return Montofactura;
    }

    public void setmesfac(){
    mesfac = JOptionPane.showInputDialog("ingrese el mes de la factura: ");
    this.mesfac = mesfac;
    }
    public String getmesfac(){
        return mesfac;
    }

    public void setañofac(){
    String leer = JOptionPane.showInputDialog("ingrese el año de la factura: ");
    añofac = Integer.parseInt(leer);
    this.añofac = añofac;
    }
    public int getañofac(){
        return añofac;
    }

    public void setEfactura(){
        String leer = JOptionPane.showInputDialog("ingrese el estado de la factura\n1=pediente\n2=cancelada");
        Efactura = Integer.parseInt(leer);
        this.Efactura = Efactura;
    }
    public int getEfactura(){
        return Efactura;
    }
}
