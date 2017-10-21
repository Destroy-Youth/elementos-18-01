package org.unitec.elementos1801;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1801Application implements CommandLineRunner{
    
    
@Autowired RepositorioMensajito repoMensa; //se conecta 


	public static void main(String[] args) {
		SpringApplication.run(Elementos1801Application.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        //repoMensa.save(new Mensajito(2,"basterd", "Mi primera vez con Hibernate"));
        /*
        
        //Buscar registro único por ID
        Mensajito m = repoMensa.findOne(1);
        System.out.println(""+m.getCuerpo());
        
        //Buscar todos los registros        
        System.out.println("Vamos a buscar todos");
        for(Mensajito mensa:repoMensa.findAll()){
            System.out.println("ID:" + mensa.getId());
            System.out.println("Título:" + mensa.getTitulo());
            System.out.println("Cuerpo:" + mensa.getCuerpo());
        }
        
        //Resultado con ToString()
        for(Mensajito mensa:repoMensa.findAll()){
            System.out.println(mensa);
        }
        
        //Actualizar
        repoMensa.save(new Mensajito(1, "Nuevo titulo", "Nuevo cuerpo"));
        
        //Resultado con ToString()
        System.out.println(repoMensa.findOne(1));
        
        //Busqueda personalizada
        for(Mensajito mensa:repoMensa.findByTitulo("Nuevo titulo")){
            System.out.println(mensa);
        }
        */
            
        
        
    }
}
