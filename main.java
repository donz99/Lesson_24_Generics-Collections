package Lesson_24_Generics;

import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        //generic это параметр который влияет на тип элементов
        //без дженериков
//        List listAnimal = new ArrayList();
//        listAnimal.add("Cat");
//        listAnimal.add("Dog");
//        listAnimal.add("Horse");
//        String firstAnimal = (String) listAnimal.get(0);
//        System.out.println(firstAnimal);
//
//        //с дженериком
//        List<String> listAnimal1 = new ArrayList<>(); //diamond operator <> //
//        listAnimal1.add("Cat1");
//        listAnimal1.add("Dog1");
//        listAnimal1.add("Horse1");
//        String firstAnimal1 = listAnimal1.get(0);
//        System.out.println(firstAnimal1);
        Mage mage = new Mage();
        mage.cast();
        mage.hit();
        mage.move();

        //ArrayList
        //ArrayDeque
        //LinkedList
        //Поведение
        //Стек стопка тарелок - структура данных LIFO last in - first out
        //(1+2)*3  ()()()
        //Очередь - структура данных FIFO
        //Дек -
        //Список ЛИНЕЙНЫЙ СТРУКТУРЫ


    }

}

//Интерфейсы!:
//ходить
interface canMove {
    void move(); //здесь можно прописать только абстрактный метод
}

//летать
//бить
interface canHit {
    void hit();
}

//стрелять
//колдовать
interface canCast {
    void cast();
}

//Маг - ходить, бить, колдовать (т.е. составляем мага только из трёх методов)
class Mage implements canMove, canHit, canCast {
    @Override
    public void cast() {
        System.out.println("Mage casting");
    }

    @Override
    public void move() {
        System.out.println("Mage moving");
    }

    @Override
    public void hit() {
        System.out.println("Mage hitting");
    }
}

