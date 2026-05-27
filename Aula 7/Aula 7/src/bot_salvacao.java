import static java.lang.IO.*;
void main() {
    //Entrada
    IO.println("Digite a hora: ");
    float hora = Float.parseFloat(readln());

    //Processamnete + Saída
    if(hora >= 6 && hora <= 11) {
        IO.println("Bom Dia!");
    }else if(hora >= 12 && hora < 18) {
        IO.println("Boa Tarde!");
    }else if(hora >= 18 && hora < 24) {
        IO.println("Boa Noite");
    }else {
        IO.println("Hora Inválida!");
    }



}