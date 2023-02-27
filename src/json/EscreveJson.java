package json;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class EscreveJson {
	public static void main(String[] args) throws IOException {
		Usuario usuario1 = new Usuario();
		usuario1.setNome("Arthur Benfica");
		usuario1.setCpf("99999999999");
		usuario1.setLogin("admin");
		usuario1.setSenha("admin");
		
		Usuario usuario2 = new Usuario();
		usuario2.setNome("Natacha Azevedo");
		usuario2.setCpf("88888888888");
		usuario2.setLogin("ademiro");
		usuario2.setSenha("123");
		
		List<Usuario> usuarios = new ArrayList<Usuario>();
		
		usuarios.add(usuario1);
		usuarios.add(usuario2);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String jsonUser = gson.toJson(usuarios);
		
		//System.out.println(jsonUser);
		
		FileWriter fileWriter = new FileWriter("C:\\workspace-java\\JsonJava\\src\\json\\arquivo.json");
		fileWriter.write(jsonUser);
		fileWriter.flush();
		fileWriter.close();
	}
}
