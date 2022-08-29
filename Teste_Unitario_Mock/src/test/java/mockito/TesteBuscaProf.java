package mockito;

import busca.BuscaProfessor;
import busca.Professor;
import busca.ProfessorService;
import testes.ProfConst;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class TesteBuscaProf {

    @Mock
    private ProfessorService service;
    private BuscaProfessor buscaProfessor;

    @Before
    public void setup(){
        buscaProfessor = new BuscaProfessor(service);
    }

    @Test
    public void testeBuscaProfSoned(){
        Mockito.when(service.buscaProfessor("noturno")).thenReturn(ProfConst.SONED);

        Professor Soned = buscaProfessor.buscaProfessor("noturno");
        //Faz assertion
        assertEquals("Soned", Soned.getNome());
        assertEquals("19h10", Soned.getHorarioDeAtendimento());
        assertEquals("noturno", Soned.getPeriodo());

    }

   @Test
    public void testeBuscaProfValido(){

        Mockito.when(service.ProfExistente("noturno")).thenReturn(true);
        //Faz a busca de um inimigo válido (id = 10 ou id = 20 ou ID positivo)
        boolean ProfValido = service.ProfExistente("noturno");

        assertTrue(ProfValido);
    }




}

