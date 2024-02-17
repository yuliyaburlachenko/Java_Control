import java.io.FileWriter;
import java.io.IOException;
import java.util.PriorityQueue;

class Toy {
    int id;
    String name;
    int weight;

    public Toy(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    public static void main(String[] args) {
        Toy toy1 = new Toy(1, "робот", 2);
        Toy toy2 = new Toy(2, "конструктор", 2);
        Toy toy3 = new Toy(3, "кукла", 6);

        // Заполнить массивы идентификаторами и весами
        int[] ids = {toy1.id, toy2.id, toy3.id};
        int[] weights = {toy1.weight, toy2.weight, toy3.weight};

        //  Создать PriorityQueue и добавить элементы
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0; i < ids.length; i++) {
            for (int j = 0; j < weights[i]; j++) {
                queue.add(ids[i]);
            }
        }

        // Получаем значения 10 раз и записываем в файл
        try (FileWriter writer = new FileWriter("output.txt")) {
            for (int i = 0; i < 10; i++) {
                int random = (int) (Math.random() * 100);
                if (random < 20) {
                    writer.write("Get result: " + queue.poll() + "\n");
                } else if (random < 40) {
                    writer.write("Get result: " + queue.poll() + "\n");
                } else {
                    writer.write("Get result: " + queue.poll() + "\n");
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

