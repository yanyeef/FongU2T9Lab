public class Random {
    public static void main(String[] args) {
        System.out.println(Math.random());
        double random = Math.random();
        System.out.println(random*9 + 1);
        double randomNUm = Math.random()*75 + 25;
        System.out.println(randomNUm);

        for (int i = 0; i < 100; i++) {
            int randomNum = (int) (Math.random()* 36) + 50;
                    System.out.println(randomNum);
        }

    }
}
