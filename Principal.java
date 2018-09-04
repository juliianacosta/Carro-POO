import java.util.Scanner;

public class Principal {
  public static Scanner sc = new Scanner(System.in);
  public static void main(String[] args) {

    String help = "\t======================= help =======================\n"+
                  "\tembarcar: embarcar uma pessoa no carro\n"+
                  "\tdesembarcar: desembarcar uma pessoa no carro\n"+
                  "\tabastecer _n: colocar combustivel no tanque\n"+
                  "\tandar _n: faz o carro andar\n"+
                  "\tstatus: mostra status do carro\n"+
                  "\tsair: sai do programa\n"+
                  "\t====================================================\n";

                  Carro c = new Carro();
                  c.status();

                  while(true){
                    System.out.println("Digite um comando"+
                      "(help para ver os comandos): ");
                    String comando = sc.nextLine();
                    if(comando.equals("help")){
                      System.out.println(help);
                    } else if(comando.equals("sair")){
                      System.out.println("Ate a proxima! :) ");
                      break;
                    } else {
                      String cmd[] = comando.split(" ");

                      double tanque;
                      double km;
                      int pass;
                      switch(cmd[0]){
                        case "embarcar":
                        if (c.embarcar()) {
                          System.out.println("Passageiro embarcado.");
                        } else{
                          System.out.println("Erro: limite de passageiros excedido.");
                        }
                        break;
                        case "desembarcar":
                        if(c.desembarcar()){
                          System.out.println("Passageiro desembarcado.");
                        } else{
                          System.out.println("Erro: sem passageiros para desembarque.");
                        }
                        break;
                        case "abastecer":
                        c.abastecer(Double.parseDouble(cmd[1]));
                        break;
                        case "andar":
                        c.andar(Double.parseDouble(cmd[1]));
                        break;
                        case "status":
                        c.status();
                        break;
                        default:
                        System.out.println("Comando inválido.");
                      }
                  }
  }
}
}