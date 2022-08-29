package busca;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;


public class BuscaProfessor {
    ProfessorService professorService;

    public BuscaProfessor(ProfessorService service){
        this.professorService = service;
    }

    public Professor buscaProfessor(String periodo){
        String professorJson = professorService.buscaProfessor(periodo);
        JsonObject jsonObject = JsonParser.parseString(professorJson).getAsJsonObject();

        return new Professor(jsonObject.get("nome").getAsString(),
                jsonObject.get("horarioDeAtendimento").getAsString(),
                jsonObject.get("periodo").getAsString());

    }

    public boolean verificaArrayListExistente(String periodo){
        boolean ProfExistente = professorService.profExistente(periodo);

        if (ProfExistente){
            return true;
        }else{
            return false;
        }
    }

}