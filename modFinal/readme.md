📸 Memelândia - Sistema de Compartilhamento de Memes
Sistema desenvolvido em microserviços com Spring Boot, simulando uma rede para cadastro e gerenciamento de memes, com separação por usuário, categoria e os próprios memes.

📦 Microserviços
Serviço	Porta	Função Principal
usuario-service	8081	Gerencia usuários
categoria-service	8082	Gerencia categorias de memes
meme-service	8083	Cadastra memes, relacionados a usuário e categoria

🧱 Tecnologias Utilizadas
Java 17

Spring Boot

Spring Data JPA

Spring Validation

Spring Actuator

H2 Database

Docker & Docker Compose

Micrometer + Prometheus (para métricas)

🚀 Como Executar o Projeto
Pré-requisitos:
Java 17+

Maven instalado e configurado no PATH

Docker e Docker Compose instalados

Rodar manualmente (sem Docker):
bash
Copiar
Editar
# Dentro de cada microserviço
mvn clean package
java -jar target/*.jar
Rodar com Docker Compose:
bash
Copiar
Editar
# Na raiz onde está o docker-compose.yml
docker-compose up --build
📌 Endpoints por Serviço
🔹 usuario-service (localhost:8081)
GET /usuarios – Lista todos os usuários

GET /usuarios/{id} – Busca por ID

POST /usuarios – Cria novo usuário

🔹 categoria-service (localhost:8082)
GET /categorias – Lista categorias

GET /categorias/{id} – Busca por ID

POST /categorias – Cria nova categoria

🔹 meme-service (localhost:8083)
GET /memes – Lista memes

GET /memes/{id} – Busca por ID

POST /memes – Cria novo meme (valida existência de usuário e categoria)

DELETE /memes/{id} – Remove meme

✅ Exemplo de JSON para POST

📥 Criar Usuário (POST /usuarios)
json
Copiar
Editar
{
  "nome": "Diego Silva",
  "email": "diego@example.com",
  "dataCadastro": "2025-07-06"
}

📥 Criar Categoria (POST /categorias)
json
Copiar
Editar
{
  "nome": "Memes de Programador",
  "descricao": "Humor do dia a dia da programação",
  "dataCadastro": "2025-07-06"
}

📥 Criar Meme (POST /memes)
json
Copiar
Editar
{
  "nome": "NullPointerMeme",
  "descricao": "Quando você esquece de instanciar...",
  "url": "https://exemplo.com/nullpointer.jpg",
  "dataCadastro": "2025-07-06",
  "usuarioId": 1,
  "categoriaId": 1
}

📊 Observabilidade
Todos os serviços expõem métricas via Actuator:

GET /actuator/health

GET /actuator/info

GET /actuator/prometheus

💡 Melhorias Futuras
Autenticação com JWT

Upload real de imagens (S3 ou similar)

Banco PostgreSQL em produção

API Gateway (Spring Cloud Gateway)

Service Discovery (Eureka ou Consul)

👨‍💻 Autor
Desenvolvido por Diego Apicello como parte do módulo final EBAC.
