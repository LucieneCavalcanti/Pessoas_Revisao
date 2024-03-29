import java.util.ArrayList;
import java.util.Scanner;

import model.PF;
import model.PJ;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner teclado = new Scanner(System.in);
        ArrayList<PF> listaPFs = new ArrayList<>();
        ArrayList<PJ> listaPJs = new ArrayList<>();
        int opcao=0;
        do {
            try{
            System.out.println("Escolha uma opção:"+
            "\n1 - Cadastrar PF"+
            "\n2 - Cadastrar PJ"+
            "\n3 - Listar PFs"+
            "\n4 - Listar PJs"+
            "\n6 - Buscar por CPF"+
            "\n7 - Buscar por CNPJ"+
            "\n8 - Buscar por NOME (PF e PJ)"+
            "\n10 - Sair");
            opcao = teclado.nextInt();
            switch (opcao) {
                case 1:
                    PF objPF = new PF();
                    System.out.println("Digite o id:");
                    objPF.setId(teclado.nextInt());
                    System.out.println("Digite o nome:");
                    objPF.setNome(teclado.next());
                    System.out.println("Digite o CPF:");
                    objPF.setCpf(teclado.next());
                    listaPFs.add(objPF);
                    break;
                case 2:
                    PJ objPJ = new PJ();
                    System.out.println("Digite o id:");
                    objPJ.setId(teclado.nextInt());
                    System.out.println("Digite o nome:");
                    objPJ.setNome(teclado.next());
                    System.out.println("Digite o CNPJ:");
                    objPJ.setCnpj(teclado.next());
                    listaPJs.add(objPJ);
                    break;
                case 3:
                    for (PF f : listaPFs) {
                        System.out.println("---- PFs ----");
                        System.out.println("ID:" + f.getId());
                        System.out.println("Nome:"+f.getNome());
                        System.out.println("CPF:"+f.getCpf());
                    }
                    System.out.println("-------------------------------");
                    break;
                case 4:
                    for (PJ j : listaPJs) {
                        System.out.println("---- PJs ----");
                        System.out.println("ID:" + j.getId());
                        System.out.println("Nome:"+j.getNome());
                        System.out.println("CNPJ:"+j.getCnpj());
                    }
                    System.out.println("-------------------------------");
                    break;
                default:
                    break;
            }
        }//fim do try
        catch(Exception erro){
            System.out.println("Erro: "+erro.getMessage());
        }
        } while (opcao!=5);
    }
}
