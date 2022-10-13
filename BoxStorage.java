package Lesson_24_Generics;

import java.util.ArrayList;
import java.util.List;

//Создать динамический массив(ХРАНИЛИЩЕ(КОЛЛЕКЦИЮ)), содержащий объекты класса HeavyBox.
//Распечатать его содержимое используя for each.
//Изменить вес любого ящика на 1.
//Удалить последний ящик.
//Получить массив содержащий ящики из коллекции тремя способами и вывести на консоль.
//Удалить все ящики.
public class BoxStorage {
    private List<HeavyBox> listOfBoxes;

    public BoxStorage(){
        listOfBoxes = new ArrayList<>(); //КОГДа создаём коллекции, лучше создавать коллекции типа интерфейс
    }
    public BoxStorage(List<HeavyBox> listOfBoxes){
        //! НЕЛЬЗЯ thos.listOfBoxes = listOfBoxes;

        // надо скопировать содержимое параметры в содержимое поля
        //this.listOfBoxes = (List<HeavyBox>) listOfBoxes.clone();
        //this.listOfBoxes.clear(); если надо очистить объект
//        for (int i = 0; i < listOfBoxes.size(); i++) {
//            this.listOfBoxes.add(listOfBoxes.get(i));
//        }
        this();
        this.listOfBoxes.addAll(listOfBoxes);
    }

    @Override
    public String toString() {
        return "BoxTest{" +
                "listOfBoxes=" + listOfBoxes +
                '}';
    }
    public boolean changeWeightOfBox(int index, int change){
        boolean result = true;
        if (index < 0 || index > listOfBoxes.size() - 1) result = false;
        if (!listOfBoxes.get(index).changeWeight(change)) result = false;
        //listOfBoxes.get(index).setWeight(listOfBoxes.get(index).getWeight() + change);
        return result;
    }
    public HeavyBox[] getArray(){return (HeavyBox[])listOfBoxes.toArray();}
}
