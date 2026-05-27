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


    //Processamento
    float mf = (nota1 + nota2 + nota3 + nota4) / 4;
    if(mf >= 7) {
        IO.print("Você está aprovado!");
    }else if(mf < 5) {
        IO.print("Você está reprovado!");
    }else {;
        IO.print("Você está em recuperação!");
    }

    //Saída

}







