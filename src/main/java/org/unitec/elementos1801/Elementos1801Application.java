package org.unitec.elementos1801;

import java.util.Date;
import org.unitec.elementos1801.examenBim.RepositorioTarjeta;
import org.unitec.elementos1801.examenBim.RepositorioCliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.unitec.elementos1801.examenBim.Cliente;
import org.unitec.elementos1801.examenBim.Tarjeta;

@SpringBootApplication
public class Elementos1801Application implements CommandLineRunner{
    
    
@Autowired RepositorioCliente repoCliente;
@Autowired RepositorioTarjeta repoTarjeta;


	public static void main(String[] args) {
		SpringApplication.run(Elementos1801Application.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        
        
        //Vamos a generar un usuario
        
        Cliente cl = new Cliente(1234, "Panchio");
        repoCliente.save(cl);
        
        Tarjeta tj = new Tarjeta(123, "debito", 10000, new Date(1996), new Cliente(1234));
        repoTarjeta.save(tj);
        Tarjeta tj1 = new Tarjeta(124, "credito", 30009, new Date(1996), new Cliente(1234));
        repoTarjeta.save(tj1);
        
        
        
        for(Tarjeta ts:repoTarjeta.findAll()){
            System.out.println("Tarjeta: "+ts.getTarjetai());
            System.out.println("Tipo: "+ts.getTipo());
            System.out.println("Saldo: "+ts.getSaldo());
            System.out.println("Vence: "+ts.getFechavenc());
            System.out.println("Cliente: "+ts.getCl().getNombre());
        }
    
        Tarjeta st = repoTarjeta.findOne(123);
        System.out.println("Tarjeta: "+st.getTarjetai());
            System.out.println("Tipo: "+st.getTipo());
            System.out.println("Saldo: "+st.getSaldo());
            System.out.println("Vence: "+st.getFechavenc());
            System.out.println("Cliente: "+st.getCl().getNombre());
        
        
    }
}
