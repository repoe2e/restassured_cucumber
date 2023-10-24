# Projeto Rest Assured com Cucumber

Este é um projeto de exemplo para testes de API usando Rest Assured e Cucumber. O projeto demonstra como realizar solicitações HTTP para uma API e criar cenários de teste com Cucumber.

## Configuração

Certifique-se de ter o Java e o Maven instalados em seu sistema. Você pode encontrar as dependências do projeto no arquivo `pom.xml`.

### Dependências Principais

- [Rest Assured](https://github.com/rest-assured/rest-assured): Uma biblioteca para testar APIs REST em Java.
- [Cucumber](https://cucumber.io/): Uma estrutura de teste que permite escrever testes em linguagem natural.

### Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- `src/test/resources/features`: Arquivos de definição de cenário Cucumber.
- `projto.restassured.apiobjects`: Classes que encapsulam chamadas de API e configurações.
- `projeto.restassured.teste`: Classes de teste Cucumber.

## Configuração do Ambiente

Siga as etapas abaixo para configurar o ambiente de desenvolvimento:

1. Clone este repositório para sua máquina local.
Abra o terminal ou prompt de comando e navegue até o diretório onde deseja clonar o projeto. Em seguida, execute o comando:

git clone <URL do repositório>

3. Certifique-se de ter o JDK instalado e configurado corretamente.

Abra o prompt e execute o comando: java -version

5. Certifique-se de ter o Apache Maven instalado e configurado corretamente.

Abra o prompt e execute o comando: mvn -version

6. Não esqueça de configurar as variáveis de ambiente Java e Maven 

## Executando Testes

Para executar o projeto, siga as etapas abaixo:

1. Abra um terminal ou prompt de comando.
2. Navegue até o diretório raiz do projeto.
3. Execute o seguinte comando para compilar o projeto:

   ```shell
1. mvn clean install
2. mvn test -Dtest=Executa

após a execução acessar a pasta target para visualizar o report atualizado

