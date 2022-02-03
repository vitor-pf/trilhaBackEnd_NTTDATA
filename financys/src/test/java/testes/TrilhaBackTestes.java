package testes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.test.context.junit4.SpringRunner;
import trilha.back.financys.entities.CategoriaEntity;
import trilha.back.financys.entities.LancamentoEntity;
import trilha.back.financys.enums.Type;
import trilha.back.financys.exceptions.NotFoundException;
import trilha.back.financys.repositories.LancamentoRepository;
import trilha.back.financys.services.impl.LancamentoService;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.verify;

@RunWith(SpringRunner.class)
public class TrilhaBackTestes {
    @InjectMocks
    private LancamentoService lancamentoService;
    @Mock
    private LancamentoRepository lancamentoRepository;


    @Test
    public void lancamentosDependentesTeste() throws Exception{
        String date = "28/01/2022";
        String amount = "1";
        boolean paid = true;
        Mockito.when(lancamentoRepository
                .findAllByDateAndAmountAndPaid(date, Double.parseDouble(amount), paid))
                .thenReturn(Collections.singletonList(new LancamentoEntity(1L, "name", "description12345",
                        Type.revenue.getType(), Double.parseDouble(amount), date, paid, new CategoriaEntity())));
        //"REVENUE"
        List<LancamentoEntity> result = lancamentoService.
                getLancamentosDependentes(date, amount, paid);

        assertEquals("28/01/2022", result.get(0).getDate());
        assertEquals(1L, result.get(0).getAmount());
        assertTrue(result.get(0).isPaid());

        verify(lancamentoRepository).findAllByDateAndAmountAndPaid(date,Double.parseDouble(amount),paid);
    }
    @Test(expected = NotFoundException.class)
    public void lancamentosDependentesExceptions() {
        lancamentoService.getLancamentosDependentes(null,null,true);
    }
}