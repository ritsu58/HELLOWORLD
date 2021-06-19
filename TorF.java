public class TorF {
    public static void main(String[] args) {
        int num = new java.util.Random().nextInt(2);
        judge(num);
    }
    public static void judge(int num) {
        if(num == 0) {
            System.out.println("偽");
        }else {
            System.out.println("真");
        }
    }
}
