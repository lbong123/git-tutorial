public class Tutorial {
    public Ella ella;
    public Sonja sonja;
    public Zach zach;

    public Tutorial() {
        this.ella = new Ella();
        this.sonja = new Sonja();
        this.zach = new Zach();
    }

    public static void main(String[] args) {
        Tutorial tute = new Tutorial();

        System.out.println(tute.ella.toString());
        System.out.println(tute.sonja.toString());
        System.out.println(tute.zach.toString());
    }
}
