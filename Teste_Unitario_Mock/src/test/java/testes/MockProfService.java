package testes;

import busca.ProfessorService;
import java.util.ArrayList;


public abstract class MockProfService implements ProfessorService {

    @Override
    public String buscaProfessor(String periodo) {

        if (periodo == "noturno") {
            return ProfConst.SONED; //+ ProfConst.LUIZ;
        } else if (periodo == "integral") {
            return ProfConst.CHRIS; //+ ProfConst.FELIPE;
        } else {
            return ProfConst.NaoDefinido;
        }

    }



    @Override
    public boolean profExistente(String periodo) {

        ArrayList list = new ArrayList();
        list.add("noturno");
        list.add("diurno");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(periodo) || list.get(i).equals(periodo)) {
                return true;
            } else {
                return false;
            }

        }
        return false;
    }
}

