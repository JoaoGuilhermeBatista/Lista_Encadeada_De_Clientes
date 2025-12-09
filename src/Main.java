import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        // Lista com 7 Clientes
        LinkedList<Cliente> linkedList = new LinkedList<>();
        // Adicionar os Clientes
        linkedList.add(new Cliente("João Guilherme", "Brasilia", 18));
        linkedList.add(new Cliente("Victor Ribeiro", "São Paulo", 21));
        linkedList.add(new Cliente("Marco Antonio", "Belo Horizonte", 20));
        linkedList.add(new Cliente("Arthur Amorim", "Campo Grande", 35));
        linkedList.add(new Cliente("Raphael Fonseca", "Porto Velho", 27));
        linkedList.add(new Cliente("Luis Felipe", "São Luis", 50));
        linkedList.add(new Cliente("Elizeth Augusto", "Rio de Janeiro", 45));

        System.out.println("_______ Lista de Clientes _______");
        for (Cliente cliente : linkedList) {
            System.out.println(cliente);
        }

        System.out.println("=============== Cliente Adicionado no Inicio ===============");

        // Adicionar Cliente no inicio da lista

        linkedList.addFirst(new Cliente("Minato Namikaze", "Vila da folha", 25));

        for (Cliente cliente : linkedList) {
            System.out.println(cliente);
        }

        System.out.println("=============== Cliente Removido ===============");

        // Remover do inicio da lista
        Cliente removido = linkedList.removeFirst();

        System.out.println("Cliente removido = " + removido) ;

        System.out.println("=============== mudanças ===============");

        // Listar Clientes da lista
        for (Cliente listaDeClientesAtualizadas : linkedList) {
            System.out.println("Lista de Ninjas depois das mudanças " + listaDeClientesAtualizadas);
        }

        System.out.println("=============== Achar por indice ===============");
        // Procurar Cliente por indice
        Cliente terceiroCliente = linkedList.get(2);
        System.out.println("Achando por indice " + terceiroCliente);

    }
}