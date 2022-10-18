# Projeto do Programa Mais Pra Ti
![NPM](https://img.shields.io/badge/Status-em%20desenvolvimento-green)

# Sobre o projeto


O projeto � referente ao trabalho final do treinamento Mais Pra Ti. 

O projeto consiste em adicionar um usu�rio informando os dados b�sicos e caso seja informada uma nota, � criado um(a) aluno(a), caso n�o seja informada, � criada uma pessoa.

# Tecnologias utilizadas
## Back end
- Java

## Implanta��o em produ��o
- Inclus�o de exceptions em andamento;
- Inclus�o de valida��o de CPF em andamento;

# Como executar o projeto

## Back end
Pr�-requisitos: Java 17

```bash
# clonar reposit�rio
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

## Informa��o de pessoa/aluno:
- Nome;
- Telefone;
- Data de Nascimento;
- Data de Cadastro da Pessoa;
- Data da �ltima altera��o;
- Nota final do curso;

## Obs.: Caso o usu�rio informe a nota final do curso, deve ser criado um aluno. Caso n�o seja informada, deve ser criada uma pessoa.

- Criar menu interativo que o usu�rio possa usar para executar as op��es acima.
- O menu deve continuar sendo exibido at� que o usu�rio use a op��o de encerrar a aplica��o.
- O avaliado deve usar arrays para armazenar as pessoas criadas;
- O avaliado deve usar heran�a para que um aluno aproveite todos os dados da pessoa.

Todas as informa��es ficam em mem�ria local. N�o � necess�rio cadastrar em banco de dados. Ou seja, quando encerrar a aplica��o, perde-se todo o hist�rico.
N�o deve ser usado nenhum framework neste projeto. Deve-se usar recursos nativos do Java.
