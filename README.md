# calculadoraSimples
# 🧮 Calculadora Java Modular (Maven & CI)

Este projeto é uma calculadora simples desenvolvida em **Java 21**, focada em demonstrar conceitos de **modularização**, utilização da classe `Scanner`, estruturas de controle e práticas de **DevOps** (CI/CD e testes automatizados). O código está organizado seguindo o padrão Maven para facilitar a manutenção e escalabilidade.

## 🚀 Funcionalidades

O sistema permite realizar as quatro operações aritméticas fundamentais através da classe `Calculadora`:
* **Soma**: Processada pela classe `Calculadora`.
* **Subtração**: Processada pela classe `Calculadora`.
* **Multiplicação**: Processada pela classe `Calculadora`.
* **Divisão**: Processada pela classe `Calculadora` (com verificação para evitar divisão por zero).

## 📁 Estrutura do projeto

.
├── .github/
│   └── workflows/
│       └── actions.yaml          # Configuração do GitHub CI
├── src/
│   ├── main/java/com/calculadora/
│   │   ├── Calculadora.java      # Lógica das operações
│   │   └── Main.java             # Ponto de entrada 
│   └── test/java/com/calculadora/
│       └── CalculadoraTest.java  # Testes unitários JUnit 5 
├── .gitignore                    # Arquivos ignorados pelo Git 
├── Makefile                      # Atalhos para comandos 
├── pom.xml                       # Configurações do Maven
└── README.md                     # Documentação

O projeto é composto pelos seguintes arquivos:

* `Main.java`: Gerencia a interface via console e o fluxo de entrada do usuário.
* `Calculadora.java`: Contém a lógica para as operações de adição, subtração, multiplicação e divisão.
* [cite_start]`CalculadoraTest.java`: Contém os testes unitários automatizados utilizando JUnit 5. [cite: 1]
* `pom.xml`: Arquivo de configuração do Maven para gerenciamento de dependências e build.
* `Makefile`: Atalhos para comandos de compilação (`mvn package`) e limpeza (`mvn clean dependency:copy-dependencies package`).
* `.github/workflows/actions.yaml`: Configuração da esteira de Integração Contínua (CI) para execução automática de testes.

## 💻 Exemplo de Uso

Ao iniciar o programa, siga as instruções no terminal:
```text
=== CALCULADORA ===
Digite o primeiro número: 10
Escolha a operação (+, -, *, /): *
Digite o segundo número: 5
Resultado: 50.0
