import java.util.*;

public class HuffmanCoding {

    static class HuffmanComparator implements Comparator<HuffmanNode> {
        @Override
        public int compare(HuffmanNode a, HuffmanNode b) {
            return a.freq - b.freq;
        }
    }

    private static void generateCode(
            HuffmanNode root, String code, Map<Character, String> map) {

        if (root == null) return;

        // LEAF NODE
        if (root.left == null && root.right == null) {
            // 🔥 HANDLING: pastikan kode tidak kosong
            map.put(root.ch, code.length() > 0 ? code : "0");
            return;
        }

        generateCode(root.left, code + "0", map);
        generateCode(root.right, code + "1", map);
    }

    public static void encode(String text) {

        // 🔥 HANDLING 1: input kosong
        if (text == null || text.isEmpty()) {
            System.out.println("Teks tidak boleh kosong!");
            return;
        }

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : text.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        PriorityQueue<HuffmanNode> pq =
                new PriorityQueue<>(new HuffmanComparator());

        for (var e : freq.entrySet()) {
            pq.add(new HuffmanNode(e.getKey(), e.getValue()));
        }

        // 🔥 HANDLING 2: hanya 1 karakter unik
        if (pq.size() == 1) {
            HuffmanNode node = pq.poll();
            System.out.println("\nKode Huffman:");
            System.out.println(node.ch + " : 0");

            System.out.print("Hasil Enkripsi: ");
            for (int i = 0; i < node.freq; i++) {
                System.out.print("0");
            }
            System.out.println();
            return;
        }

        while (pq.size() > 1) {
            HuffmanNode a = pq.poll();
            HuffmanNode b = pq.poll();
            HuffmanNode p = new HuffmanNode('\0', a.freq + b.freq);
            p.left = a;
            p.right = b;
            pq.add(p);
        }

        HuffmanNode root = pq.poll();

        Map<Character, String> codeMap = new HashMap<>();
        generateCode(root, "", codeMap);

        System.out.println("\nKode Huffman:");
        for (var e : codeMap.entrySet()) {
            System.out.println(e.getKey() + " : " + e.getValue());
        }

        // 🔥 HANDLING 3: cegah null saat enkripsi
        StringBuilder encoded = new StringBuilder();
        for (char c : text.toCharArray()) {
            encoded.append(codeMap.getOrDefault(c, ""));
        }

        System.out.println("Hasil Enkripsi: " + encoded);
    }
}
