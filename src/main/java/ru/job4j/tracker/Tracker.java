package ru.job4j.tracker;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item[] resArr = new Item[size];
        for (int i = 0; i < size; i++) {
            resArr[i] = items[i];
        }
        return resArr;
    }

    public Item[] findByName(String key) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                count++;
            }
        }
        Item[] resArr = new Item[count];
        count = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                resArr[count] = items[i];
                count++;
            }
        }
        return resArr;
    }
}