import java.util.*;

public class DijkstraAlgorithm {

    public static void shortestPath(
            Map<String, List<Edge>> graph, String start) {

        Map<String, Integer> dist = new HashMap<>();
        for (String n : graph.keySet()) {
            dist.put(n, Integer.MAX_VALUE);
        }
        dist.put(start, 0);

        PriorityQueue<Edge> pq =
                new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        pq.add(new Edge(start, 0));

        while (!pq.isEmpty()) {
            Edge cur = pq.poll();

            if (cur.weight > dist.get(cur.node)) continue;

            for (Edge e : graph.get(cur.node)) {
                int nd = dist.get(cur.node) + e.weight;
                if (nd < dist.get(e.node)) {
                    dist.put(e.node, nd);
                    pq.add(new Edge(e.node, nd));
                }
            }
        }

        System.out.println("\nJarak Terpendek:");
        for (var e : dist.entrySet()) {
            System.out.println(e.getKey() + " = " + e.getValue());
        }
    }
}
