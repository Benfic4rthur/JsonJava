package json;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class LendoJson {
	public static void main(String[] args) throws IOException {
		FileReader filereader = new FileReader("C:\\workspace-java\\JsonJava\\src\\json\\arquivo.json");
		JsonArray jsonArray = (JsonArray) JsonParser.parseReader(filereader);

		List<Usuario> listausuario = new ArrayList<Usuario>();

		for (JsonElement jsonElement : jsonArray) {
			Usuario usuario = new Gson().fromJson(jsonElement, Usuario.class);
			listausuario.add(usuario);
		}
		System.out.println("Leitura do arquivo Json: " + listausuario);
	}
}