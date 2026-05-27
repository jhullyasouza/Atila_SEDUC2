import static java.lang.IO.*;
void main() {
    IO.println(" Login ");
    IO.println("------------------------");

    IO.print("DIgite seu nome: ");
    String nome = readln();

    IO.print("Digite seu E-mail: ");
    String email = readln();

    IO.print("Digite a senha: ");
    String senha = readln();

    IO.print("Data de cadastro: ");
    String data = readln();

    IO.print("Qual o seu perfil de usuario: ");
    String perfil = readln();
    //perfil1 ou perfil2


    println("----------");
    println("Seus Dados");
    println("----------");

    println("Seu nome: " + nome);
    println("Seu e-mail: " + email);
    println("A data de cadastro: " + data);

    if(perfil.equals("perfil1")){
        println("Perfil: Você é professor!");
    } else {
        println("Perfil: Você é aluno!");
    }

}