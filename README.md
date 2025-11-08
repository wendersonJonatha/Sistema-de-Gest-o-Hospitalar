# 🏥 Sistema de Gestão Hospitalar em Java

Este é um projeto simples desenvolvido em **Java**, com o objetivo de aplicar os principais conceitos de **Programação Orientada a Objetos (POO)**.  
O sistema simula a gestão de um hospital, permitindo o **cadastro e gerenciamento de pacientes, médicos e consultas**.

---

## 🚀 Funcionalidades

- 👨‍⚕️ Cadastro de médicos (nome, especialidade, CRM)  
- 🧍 Cadastro de pacientes (nome, CPF, idade)  
- 📅 Agendamento de consultas (vinculando médico e paciente)  
- 🔍 Listagem de todos os pacientes, médicos e consultas  
- ❌ Cancelamento de consultas  
- 💾 Armazenamento temporário em memória (Listas)

---

## 🧠 Conceitos aplicados

- **Encapsulamento**  
- **Herança**  
- **Polimorfismo**  
- **Classes e Objetos**  
- **Listas (ArrayList)**  
- **Separação de camadas (Model, Service, Main)**  

---

## 🗂 Estrutura do Projeto

src/
├── model/
│ ├── Paciente.java
│ ├── Medico.java
│ └── Consulta.java
│
├── service/
│ └── HospitalService.java
│
└── Main.java

yaml
Copiar código

---

## ⚙️ Tecnologias utilizadas

- ☕ **Java 17**
- 🧰 **IntelliJ IDEA / VSCode**
- 📦 **Maven (opcional)**

---

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/wendersonJonatha/Sistema-de-Gest-o-Hospitalar.git
Acesse a pasta do projeto:

bash
Copiar código
cd sistema-gestao-hospitalar
Compile e execute o projeto:

bash
Copiar código
javac src/Main.java
java src/Main
💡 Se estiver usando o IntelliJ IDEA, basta abrir o projeto e executar o arquivo Main.java.

💡 Exemplo de uso
diff
Copiar código
=== SISTEMA HOSPITALAR ===
1 - Cadastrar paciente
2 - Cadastrar médico
3 - Agendar consulta
4 - Listar consultas
5 - Sair
📈 Próximas melhorias
🔐 Persistência com banco de dados (MySQL ou PostgreSQL)

🌐 Interface gráfica com JavaFX

🧾 Relatórios de consultas

🧠 Autenticação de usuários (admin / recepcionista / médico)

👨‍💻 Autor
Wenderson Jonatha
Desenvolvedor Java | Estudante de Análise e Desenvolvimento de Sistemas
📍 Pernambuco - Brasil
📧 [seuemail@gmail.com]
💼 LinkedIn

⭐ Se este projeto te inspirou, não esqueça de deixar uma estrela no repositório!

yaml
Copiar código

---
