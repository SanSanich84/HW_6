package HomeWork_6;
/*      Создать классы Собака и Кот с наследованием от класса Животное.
        Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
        Создать массив животных и в цикле заставить их бегать и плавать на разные расстояния.
*/
import java.util.Random;
import HomeWork_6.Lagacy.Animal;
import HomeWork_6.Lagacy.Cat;
import HomeWork_6.Lagacy.Dog;

public class ZooPark {
    public static void main(String[] args) {
        Random swim_distance = new Random();
        Random wolk_distance = new Random();

        Animal[] animals = {
                new Cat("Барсик", "рыжий", "кот"),
                new Dog("Бобик", "черный", "пес")};
        for (int j = 0; j < 10; j++) {


            for (int i = 0; i < animals.length; i++) {
                if (animals[i] instanceof Cat) {
                    animals[i].Wolk(wolk_distance.nextInt(200));
                    animals[i].Swimm(swim_distance.nextInt(1));
                }
                if (animals[i] instanceof Dog) {
                    animals[i].Wolk(wolk_distance.nextInt(500));
                    animals[i].Swimm(swim_distance.nextInt(10));
                }

            }
        }
    }
}
