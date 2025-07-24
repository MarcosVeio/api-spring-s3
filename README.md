# 📦 API Spring S3

API REST construída com Spring Boot para upload, listagem, de arquivos no Amazon S3.

## 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Amazon S3 (AWS SDK)
- Swagger/OpenAPI (springdoc-openapi)
- Maven

---

## 📁 Funcionalidades

- 📤 Upload de arquivos para um bucket S3
- 📄 Listagem de arquivos armazenados
- 📄 Estrututa de eventos relacionados com endereço e cupons

---

## ⚙️ Pré-requisitos

- Java 21 ou superior
- Conta na AWS com acesso ao S3
- Bucket criado e credenciais válidas (Access Key e Secret Key)

---

## 📖 Documentação Swagger

Após iniciar a aplicação, acesse a documentação interativa:

- Swagger UI: http://localhost:8080/swagger-ui/index.html
- OpenAPI JSON: http://localhost:8080/v3/api-docs

---

## 🧼 Melhorias Futuras

- Integração com autenticação JWT
- Upload multipart em background
- Logging estruturado
- Deploy em nuvem (Render, EC2, etc)

---

## 🧪 Instalação e Execução

```bash
# Clone o repositório
git clone https://github.com/MarcosVeio/api-spring-s3.git
cd api-spring-s3

# Configure suas credenciais AWS
# Exemplo: src/main/resources/application.properties
# aws.accessKey=...
# aws.secretKey=...
# aws.region=...
# aws.bucketName=...

# Execute a aplicação
./mvnw spring-boot:run
