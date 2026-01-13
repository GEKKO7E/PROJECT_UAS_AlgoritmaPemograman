import java.util.*;

public class ProjectUASAlgoritma {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== PROJECT UAS ===");
            System.out.println("1. Huffman Coding");
            System.out.println("2. Dijkstra");
            System.out.println("3. Keluar");
            System.out.print("Pilih: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            if (pilihan == 1) {
                System.out.print("Masukkan teks: ");
                String text = sc.nextLine();
                HuffmanCoding.encode(text);

            } else if (pilihan == 2) {
                Map<String, List<Edge>> graph = new HashMap<>();

                System.out.print("Jumlah node: ");
                int n = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < n; i++) {
                    System.out.print("Nama node: ");
                    String node = sc.nextLine();
                    graph.put(node, new ArrayList<>());
                }

                System.out.print("Jumlah edge: ");
                int e = sc.nextInt();
                sc.nextLine();

                for (int i = 0; i < e; i++) {
                    System.out.print("Node asal: ");
                    String u = sc.nextLine();
                    System.out.print("Node tujuan: ");
                    String v = sc.nextLine();
                    System.out.print("Bobot: ");
                    int w = sc.nextInt();
                    sc.nextLine();

                    graph.get(u).add(new Edge(v, w));
                    graph.get(v).add(new Edge(u, w));
                }

                System.out.print("Node awal: ");
                String start = sc.nextLine();
                DijkstraAlgorithm.shortestPath(graph, start);

            } else {
                break;
            }
        }
        sc.close();
    }
}
