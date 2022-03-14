package ru.job4j.di;

public class StartUI {

    private Store store;

    public StartUI(Store store) {
        this.store = store;
    }

    public void init(ConsoleInput input) {
        int select = Integer.parseInt(input.askStr("Выберите пункт меню:"));

        System.out.println("Вы выюрали " + select);
    }

    public void add(String value) {
        store.add(value);
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
