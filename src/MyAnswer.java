import java.util.Locale;

public class MyAnswer {
    public static void main(String[] args) {

        String name = "Сила Java";
        String name2 = "Ее Усиля";
        String name4 = " = Ты разработчик";
        name2 = name2.trim();
        name4 = name4.trim();
        System.out.println(name.substring(4) + " + " + name2.substring(3) + " " + name4.toUpperCase(Locale.ROOT));
        System.out.println(name.length()+name4.length());

    }

}
