# Sistema de Controle de Ações com Pilha

## Descrição

Este projeto consiste na implementação de uma estrutura de dados do tipo **Pilha (Stack)** utilizando um **array de tamanho fixo**, sem o uso de estruturas prontas da linguagem Java, como `ArrayList` ou `Stack`.

O sistema permite registrar ações realizadas por um usuário e desfazer a última ação executada, simulando funcionalidades semelhantes ao comando "Ctrl + Z" encontrado em diversos programas.

## Funcionalidades

* Inserir uma nova ação na pilha.
* Desfazer a última ação realizada.
* Listar todas as ações disponíveis para desfazer.
* Informar quando não houver ações registradas.
* Informar quando a pilha estiver cheia.

## Estrutura do Projeto

### Classe Pilha

Responsável pelo gerenciamento da pilha, contendo os métodos:

* `inserir(String acao)` – adiciona uma nova ação.
* `desfazer()` – remove a última ação inserida.
* `listar()` – exibe todas as ações armazenadas.
* `vazia()` – verifica se a pilha está vazia.
* `cheia()` – verifica se a pilha está cheia.

### Classe Main

Responsável pela interação com o usuário através de um menu de opções.

## Estrutura de Dados Utilizada

A pilha segue o princípio **LIFO (Last In, First Out)**, ou seja, o último elemento inserido é o primeiro a ser removido.

Exemplo:

1. Inserir "Editar texto"
2. Inserir "Salvar arquivo"
3. Inserir "Excluir linha"

Ao desfazer, a ação removida será:

"Excluir linha"

## Restrições Atendidas

* Utilização de array com tamanho fixo.
* Controle manual da posição dos elementos através da variável `topo`.
* Não utilização de estruturas prontas da linguagem.
* Tratamento de pilha cheia.
* Tratamento de pilha vazia.

## Tecnologias Utilizadas

* Java
* Programação Orientada a Objetos (POO)

## Autor

Gabriel Spaniol
