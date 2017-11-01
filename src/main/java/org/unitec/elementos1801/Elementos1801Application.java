package org.unitec.elementos1801;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Elementos1801Application implements CommandLineRunner{
    
    
@Autowired RepositorioMensajito repoMensa; //se conecta 
@Autowired RepositorioUsuario repoUsu;
@Autowired RepositorioDireccion repoDir;

	public static void main(String[] args) {
		SpringApplication.run(Elementos1801Application.class, args);
	}

    @Override
    public void run(String... strings) throws Exception {
        
        
        //Vamos a generar un usuario
        Usuario u= new Usuario(123386L, "Ivan Herrera", "ivan.herrera@mail.com");
        //Lo gusrdamos
        //repoUsu.save(u);
        
        //Generamos direccion       Se busca el usuario por medio del constructor
        Direccion d=new Direccion(new Usuario(123386L), "Monte sauces",5513 , "Tultepec");//****L es de Long
        //repoDir.save(d);
        
        //Haremos un join
        Direccion d2 = repoDir.findOne(4l);   //Invocacion en cadena para el join
                System.out.println("Correo: "+ d2.getU().getMail()+" municipio: "+ d2.getMunicipio());
 
        
    }
}
