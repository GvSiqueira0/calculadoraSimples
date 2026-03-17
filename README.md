# calculadoraSimples
# 🧮 Calculadora Java Modular

Este projeto é uma calculadora simples desenvolvida em Java, focada em demonstrar conceitos de **modularização**, utilização da classe `Scanner` e estruturas de controle. O código está dividido em classes de operações para facilitar a organização e manutenção.

## 🚀 Funcionalidades

O sistema permite realizar as quatro operações aritméticas fundamentais:
* **Soma**: Processada pela classe `OperacoesBasicas`.
* **Subtração**: Processada pela classe `OperacoesBasicas`.
* **Multiplicação**: Processada pela classe `OperacoesAvancadas`.
* **Divisão**: Processada pela classe `OperacoesAvancadas` (com verificação para evitar divisão por zero).

## 📁 Estrutura do projeto

O projeto é composto por três arquivos principais:

* `Main.java`: Gerencia a interface via console e o fluxo de entrada do usuário.
* `OperacoesBasicas.java`: Contém a lógica para as operações de adição e subtração.
* `OperacoesAvancadas.java`: Contém a lógica para as operações de multiplicação e divisão.

## 💻 Exemplo de Uso

Ao iniciar o programa, siga as instruções no terminal:
```text
=== CALCULADORA ===
Digite o primeiro número: 10
Escolha a operação (+, -, *, /): *
Digite o segundo número: 5
Resultado: 50.0