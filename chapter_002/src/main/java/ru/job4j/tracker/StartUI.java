package ru.job4j.tracker;
import java.util.*;
import java.util.Scanner;
import java.util.Arrays;


public class StartUI {

    private final Tracker tracker;

    private final  Input input;



    public void init() {
        boolean run = true;
        while (run!=false) {
            this.showMenu();
            int select = Integer.valueOf(this.input.ask("Select: "));
            if (select == 0) {
                System.out.println("=== Create a new Item ====");
                String name =this.input.ask("Enter name: ");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1){
                System.out.println("------------ all items --------------");
                List <Item> result = this.tracker.findAll();
                for (Item rst : result) {
                    System.out.println("id:" + rst.getId() + " name:" + rst.getName());
                }

                } else if (select == 2) {
                System.out.println("------------ Edit item --------------");
                String id = this.input.ask("Enter id: ");
                String name = this.input.ask("Enter new name: ");
                tracker.editItem(id,name);

            } else  if (select == 3) {
                System.out.println("------------ Delete item --------------");
                String id = this.input.ask("Enter id: ");

                boolean result = this.tracker.deleteItem(id);
                if (result) {
                    System.out.println("------------ Item : " + id + " delete-----------"); }
                else {
                    System.out.println("------------Item not found-----------");
                }
            }
                /*             Добавить остальные действия системы по меню. */
            else  if (select == 4) {
                System.out.println("------------ Find item by Id --------------");
                String id = this.input.ask("Enter id: ");

                Item result = this.tracker.findById(id);
                if (result != null) {
                    System.out.println("id:" + result.getId() + " name:" + result.getName());
                } else {
                    System.out.println("------------Item not found-----------");
                }
            }
            else  if (select == 5) {
                System.out.println("------------ Find item by Name --------------");
                String name = this.input.ask("Enter Name: ");
                List<Item> result;

                result = this.tracker.findByName(name);
                if (result != null) {
                    for (Item rst : result) {
                    System.out.println("id:" + rst.getId() + " name:" + rst.getName());
                }} else {
                    System.out.println("------------Item not found-----------");
                }
            }
            else if (select == 6) {
                run = false;
            }
        }
    }

    public StartUI(Input input, Tracker tracker) {
        this.input = input;
        this.tracker = tracker;
    }
    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");


        /* добавить остальные пункты меню. */
    }


public static void main(String[] args) {
        new StartUI(new ConsoleInput(), new Tracker()).init();
        }
}
