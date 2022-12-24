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

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        if (findById(id) != null) {
            int index = indexOf(id);
            item.setId(id);
            items[index] = item;
            rsl = true;
        }
        return rsl;
    }
}