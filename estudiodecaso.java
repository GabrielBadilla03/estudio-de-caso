package programacion.clase7;
import javax.swing.JOptionPane;
import javax.swing.text.TabExpander;
public class estudiodecaso {
    public static void main(String[] args){
        cliente client = new cliente();
        int totalpendiente = 0;
        int totalpago = 0;
        int menu = 0;
        String leer = JOptionPane.showInputDialog("bienvenido el menu principal \n 1=registrar cliente \n 2=registrar factura \n 3=ver informacion del cliente y facturas");
        menu = Integer.parseInt(leer);
        while(menu==1){
            client.setnombre();
            client.setcedula();
            JOptionPane.showMessageDialog(null,"nombre del cliente: "+client.getnombre()+"\n cedula del cliente: "+client.getcedula(),"Cliente",0);
            leer = JOptionPane.showInputDialog("bienvenido el menu principal \n 1=registrar cliente \n 2=registrar factura \n 3=ver informacion del cliente y facturas");        
            menu = Integer.parseInt(leer);
        }
        while(menu==2){
            client.setNfactura();
            client.setMontofactura();
            client.setañofac();
            client.setmesfac();
            client.setEfactura();
            if(client.getEfactura()==1){
                totalpendiente += client.getMontofactura();  
            }else{
                totalpago += client.getMontofactura();
            }
            JOptionPane.showMessageDialog(null, "numero de factura "+client.getNfactura()+"\nmonto de la factura "+client.getMontofactura()+"\n fecha de la factura "+client.getmesfac()+"/"+client.getañofac()+"\nestado de la factura:"+client.getEfactura(), "datos de la factura", 0);
            leer = JOptionPane.showInputDialog("bienvenido el menu principal \n 1=registrar cliente \n 2=registrar factura \n 3=ver informacion del cliente y facturas");        
            menu = Integer.parseInt(leer);
        }
        JOptionPane.showMessageDialog(null,"el cliente "+client.getnombre()+"\ncon la cedula "+client.getcedula()+"\na pagado en total: "+totalpago, null,0);
        double impuesto = totalpendiente*0.05;
        double plan = impuesto+totalpendiente;
        double planpago = plan/6;
        
        JOptionPane.showMessageDialog(null,"el cliente debe:"+totalpendiente+"\na 6 meses de cuotas seria \ncuota de julio: "+planpago+"\ncuota de agosto: "+planpago+"\ncuota de septimbre: "+planpago+"\ncuota de octubre: "+planpago+"\ncuota de noviembre: "+planpago+"\ncuota de diciembre: "+planpago, null, 0);
        
    }
}
