import static java.lang.IO.*;
void main() {
    //Entrada
    IO.print("Digite a temoperatura");
    float temperatura = Float.parseFloat(readln());

    //Processamento + Saída
    if (temperatura < 15) {
        IO.println(("Ligar o aquecedor!"));
    }else if(temperatura > 25) {
        IO.println("Ligar o Ar Condicionado!");
    }else {
        IO.println("Sistema em StanBy");
    }
}