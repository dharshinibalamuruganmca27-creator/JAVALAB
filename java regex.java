import java.util.*;

public class DuplicateWords {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while (n-- > 0) {
            List<String> list = new ArrayList<>(Arrays.asList(input.nextLine().split(" ")));
            ListIterator<String> it = list.listIterator();
            String prev = it.next().toLowerCase();
            while (it.hasNext()) {
                String curr = it.next().toLowerCase();
                if (curr.equals(prev)) {
                    it.remove();
                } else {
                    prev = curr;
                }
            }
            for (int i = 0; i < list.size(); i++) {
                if (i != 0) System.out.print(' ');
                System.out.print(list.get(i));
            }
            System.out.println();
        }
        input.close();
    }
}
