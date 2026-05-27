import static java.lang.IO.*;
void main() {
    //Entrada
    IO.println("Digite o Valor do Saldo: ");
    float saldo = Float.parseFloat(readln());

    IO.println("Digite o Valor do Saque: ");
    float saque = Float.parseFloat(readln());

    IO.println("Valor de Saldo Novo: ");

    //Processamento + saída
    float SN = (saldo - saque);
    if(saque <= saldo) {
        IO.println("Saque Efetuado Com Sucesso!");
    }else if(saque >= saldo) {
        IO.println("Saldo Insuficiente!");
    }else {
    }
    }
