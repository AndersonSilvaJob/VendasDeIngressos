import static org.junit.Assert.assertEquals;
import org.junit.Assert;
import org.junit.Test;

public class VendaDeIngressoTeste {

    VendaDeIngresso Compra = new VendaDeIngresso();

    double delta = 0.0;

    //TESTE PARA AFILIADO
    @Test
    public void TipoAfiliado(){
        Assert.assertEquals(40, Compra.TipoAfiliado(100), delta);
    }
    //TESTE PARA ESTUDANTE
    @Test
    public void TipoEstudante(){
        Assert.assertEquals(50, Compra.TipoEstudante(100), delta);
    }
    //TESTE PARA DEFICIENTE
    @Test
    public void TipoDeficiente(){
        Assert.assertEquals(30, Compra.TipoDeficiente(100), delta);
    }
    //TESTE PARA GERAL
    @Test
    public void TipoGeral(){
        Assert.assertEquals(100, Compra.TipoGeral(100), delta);
    }
}
