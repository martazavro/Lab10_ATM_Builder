package builder;

public class Main {
    public static void main(String[] args) {
        User user = User.builder().name("Martusia").age(81).gender("flower").race("european").occupation("singer").occupation("walker").build();
        System.out.println(user);
    }
}