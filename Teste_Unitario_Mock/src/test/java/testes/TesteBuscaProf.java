package testes;

import busca.BuscaProfessor;
import busca.Professor;
import busca.ProfessorService;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;


public class TesteBuscaProf {

    ProfessorService service;
    BuscaProfessor buscaProfessor;

    @Before
    public void setup(){

        service = new MockProfService() {
            @Override
            public boolean ProfExistente(String periodo) {
                return false;
            }

            @Override
            public String busca(String periodo) {
                return null;
            }
        };
        buscaProfessor = new BuscaProfessor(service);
    }

    @Test
    public void testeBuscaProfSoned(){


        Professor soned = buscaProfessor.buscaProfessor("noturno");


        assertEquals("Soned", soned.getNome());
        assertEquals("19h10", soned.getHorarioDeAtendimento());
        assertEquals("noturno",soned.getHorarioDeAtendimento());

    }

    @Test
    public void testeBuscaProfChris(){


        Professor Chris = buscaProfessor.buscaProfessor("integral");

        assertEquals("Chris", Chris.getNome());
        assertEquals("15h10", Chris.getHorarioDeAtendimento());
        assertEquals("integral", Chris.getPeriodo());

    }

    @Test
    public void testeBuscaProfLuiz(){


        Professor Luiz = buscaProfessor.buscaProfessor("integral");

        assertEquals("Luiz", Luiz.getNome());
        assertEquals("19h10", Luiz.getHorarioDeAtendimento());
        assertEquals("noturno", Luiz.getPeriodo());

    }

    @Test
    public void testeBuscaProfessorValido(){


        boolean professorValido = buscaProfessor.verificaArrayListExistente("noturno");

        assertTrue(professorValido);
    }

    @Test
    public void testeBuscaProfessorInValido(){


        boolean professorValido = buscaProfessor.verificaArrayListExistente("diurno");

        assertFalse(professorValido);
    }



}
