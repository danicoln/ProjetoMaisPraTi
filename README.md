# Projeto do Programa Mais Pra Ti
![NPM](https://img.shields.io/badge/Status-em%20desenvolvimento-green)

# Sobre o projeto


O projeto é referente ao trabalho final do treinamento Mais Pra Ti. 

O projeto consiste em adicionar um usuário informando os dados básicos e caso seja informada uma nota, é criado um(a) aluno(a), caso não seja informada, é criada uma pessoa.

# Tecnologias utilizadas
## Back end
- Java

## Implantação em produção
- Inclusão de exceptions em andamento;
- Inclusão de validação de CPF em andamento;

# Como executar o projeto

## Back end
Pré-requisitos: Java 17

```bash
# clonar repositório
git clone git@github.com:danicoln/ProjetoMaisPraTi.git

# entrar na pasta do projeto back end
cd backend

# executar o projeto
./mvnw spring-boot:run

```

# Autor

Daniel Lincoln M. F. Silva

LinkedIn: https://www.linkedin.com/in/daniellincolndev 

e-mail: lincolndeveloper@outlook.com



# Atividades:
- Criar um CRUD (Create, Read, Update, Delete) de pessoas/alunos no terminal usando somente Java:
- Criar pessoa ou aluno;
- Mostrar todas as pessoas e alunos criadas (listar na tela);
- Atualizar dados de uma pessoa ou aluno;
- Deletar uma pessoa ou aluno;
- Encerrar o Programa;

## Informação de pessoa/aluno:
- Nome;
- Telefone;
- Data de Nascimento;
- Data de Cadastro da Pessoa;
- Data da última alteração;
- Nota final do curso;

## Obs.: Caso o usuário informe a nota final do curso, deve ser criado um aluno. Caso não seja informada, deve ser criada uma pessoa.

- Criar menu interativo que o usuário possa usar para executar as opções acima.
- O menu deve continuar sendo exibido até que o usuário use a opção de encerrar a aplicação.
- O avaliado deve usar arrays para armazenar as pessoas criadas;
- O avaliado deve usar herança para que um aluno aproveite todos os dados da pessoa.

Todas as informações ficam em memória local. Não é necessário cadastrar em banco de dados. Ou seja, quando encerrar a aplicação, perde-se todo o histórico.
Não deve ser usado nenhum framework neste projeto. Deve-se usar recursos nativos do Java.
