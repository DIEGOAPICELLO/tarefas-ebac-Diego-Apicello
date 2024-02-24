import dao.ClientDao;
import dao.mock.ClientDaoMock;
import dao.IClientDao;
import org.junit.Assert;
import org.junit.Test;
import service.ClientService;

public class ClienteServiceTest {

    @Test
    public void salvarTest(){
        IClientDao mockDao = new ClientDaoMock();
        ClientService service = new ClientService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso" , retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void esperadoErroNoSalvarTest(){

        IClientDao mockDao = new ClientDao();
        ClientService service = new ClientService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso" , retorno);
    }
    @Test
    public void buscarTest(){
        IClientDao mockDao = new ClientDaoMock();
        ClientService service = new ClientService(mockDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso ao Buscar" , retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void erroEsperadoAoBuscarClientNoBancoDeDados(){
        IClientDao mockDao = new ClientDao();
        ClientService service = new ClientService(mockDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso" , retorno);
    }
    @Test
    public void excluirTest(){
        IClientDao mockDao = new ClientDaoMock();
        ClientService service = new ClientService(mockDao);
        String retorno = service.exluir();
        Assert.assertEquals("Sucesso ao Excluir" , retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void erroEsperadoAoExcluirClientDoBancoDeDados(){
        IClientDao mockDao = new ClientDao();
        ClientService service = new ClientService(mockDao);
        String retorno = service.exluir();
        Assert.assertEquals("Sucesso" , retorno);
    }
    @Test
    public void atualizarTest(){
        IClientDao mockDao = new ClientDaoMock();
        ClientService service = new ClientService(mockDao);
        String retorno = service.atualizar();
        Assert.assertEquals("Sucesso ao Atualizar" , retorno);
    }
    @Test(expected = UnsupportedOperationException.class)
    public void erroEsperadoAoAtualizarClientNoBancoDeDados(){
        IClientDao mockDao = new ClientDao();
        ClientService service = new ClientService(mockDao);
        String retorno = service.buscar();
        Assert.assertEquals("Sucesso" , retorno);
    }







}
