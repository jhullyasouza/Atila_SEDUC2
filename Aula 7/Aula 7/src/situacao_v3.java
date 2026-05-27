import static java.lang.IO.*;
void main() {
    //Entrada
    IO.print("Digite a nota1: ");
    float nota1 = Float.parseFloat(readln());

    IO.print("Digite a nota2: ");
    float nota2 = Float.parseFloat(readln());

    IO.print("Digite a nota3: ");
    float nota3 = Float.parseFloat(readln());

    IO.print("Digite a nota4: ");
    float nota4 = Float.parseFloat(readln());

    IO.print("Digite o número de Faltas: ");
    int faltas = Integer.parseInt(readln());

    //Processamneto + Saída
    float mf = (nota1 + nota2 + nota3 + nota4) / 4;
    if(mf >= 7 && faltas <= 25) {
        IO.print("Aluno Aprovado!");
    }else if(mf < 5 && faltas > 25) {
        IO.print("Aluno Reprovado!");
    }else {
        IO.println("Aluno em Recuperação!");
    }
    }
