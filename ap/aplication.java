package ap;

import pd.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class aplication  {
    public static void main(String[] args) {
        List<Produto> list = new ArrayList<>();
        Scanner ler = new Scanner(System.in);
        int quantidade;
        System.out.println("Digite quantos produtos deseja:");
        quantidade = ler.nextInt();
        ler.nextLine();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o nome do produto:");
            String nome = ler.nextLine();

            System.out.println("Digite o preço do produto:");
            double preço = ler.nextDouble();
            ler.nextLine();
            list.add(new Produto(nome, preço));
        }

        Consumer<Produto> cons = p -> p.setPreço(p.getPreço() * 1.1);
        list.forEach(cons);
        list.forEach(System.out::println);
    }
}
