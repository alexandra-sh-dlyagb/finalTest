import java.util.Scanner;

public class newAnimal {
    public void AddNewAnimal(){
        System.out.println("Введите имя нового животного");
        String name = in.nextLine();
        System.out.println("Введите возраст нового животного");
        int age = in.nextInt();
        System.out.println("Введите тип, к которому новое животное относится (например, осел, лошадь, хомячок и тд)");
        String type = in.nextLine();
        System.out.println("Какие команды умеет новое животное исполнять?");
        String commands = in.nextLine();
        System.out.println ("Итак, Вы завели новое животное!");
        System.out.println("Имя: ", name);
        System.out.println("Возраст: ", age);
        System.out.println("Вид животного (его класс, если угодно):", type);
        System.out.println("Команды, которые животное умеет исполнять: ", commands);
        System.out.println("Го создадим новую команду для животного. Какую? (введите ее)");
        String newcommand = in.nextLine();
        System.out.println("Теперь команды животного следующие:");
        System.out.println(commands, newcommand);
    }
}
