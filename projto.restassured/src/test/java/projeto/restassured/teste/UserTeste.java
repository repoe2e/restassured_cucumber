package projeto.restassured.teste;

import static org.junit.Assert.assertEquals;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import projto.restassured.apiobjects.UserAPI;

public class UserTeste {

	private UserAPI userAPI;
	Response response;

	@Given("a base URL {string}")
	public void aBaseURL(String baseUrl) {
		userAPI = new UserAPI(baseUrl);
	}

	@When("o cliente faz uma solicitacao GET")
	public void oClienteFazUmaSolicitacaoGET() {
		response = userAPI.getUsers("2");
	}

	@Then("o codigo de status de resposta deve ser {int}")
	public void oCodigoDeStatusDeRespostaDeveSer(Integer int1) {
		assertEquals(200, response.getStatusCode());
	}

}
