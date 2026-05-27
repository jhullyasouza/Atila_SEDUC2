 import static java.lang.IO.*;
void main() {
    IO.print("Cadastro de alunos");
    IO.println("-----------------");

    IO.print("Digite seu nome: ");
    String nome = readln();

    IO.print("Digite seu e-mail: ");
    String email = readln();

    IO.print("Digite seu telefone: ");
    String telefone = readln();

    IO.print("Digite seu Registro Acadêmico - RA: ");
    String ra = readln();

    IO.print("Digite seu CPF: ");
    String cpf = readln();

    IO.print("Digite seu Registro Geral - RG: ");
    String rg = readln();


    println("Seus dados");
    println("------------");

    println("Seu nome: " + nome);
    println("Seu e-mail: " + email);
    println("Seu telefone: " + telefone);
    println("Seu RA: " + ra);
    println("CPF: " + cpf);
    println("RG: " + rg);





}

