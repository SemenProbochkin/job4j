package ru.job4j.tracker;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Arrays;
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final List<Item> items = new ArrayList<>();

    /**
     * Указатель ячейки для новой заявки.
     */
    private int position = 0;

    /**
     * Метод добавления заявки в хранилище
     * @param item новая заявка
     */
    public Item add(Item item) {
        item.setId(generateId());
        items.add(item);
        //this.items[this.position++] = item;
        return item;
    }
    public List <Item> findAll(){
        return items;
        }


    public  List<Item> findByName(String key){
        List<Item> result = new ArrayList<>();




        for ( int i = 0; i != this.items.size() ;i++){

            if (items.get(i)!=null && items.get(i).getName().equals(key)) {


                result.add(items.get(i));




            }
        }

        return result;
    }
    public Item findById(String id){
        Item result = null;
        for (Item item : items) {
            if (item != null && item.getId().equals(id)) {
                result = item;
                break;
            }
        }
        return result;
    }
    public void  editItem(String id,String name){

        for (Item item : items){
            if ( item != null && item.getId().equals(id)){

                item.setName(name);
                break;
            }

        }

    }
    public Boolean deleteItem (String id){


 boolean result = false;

        for ( int i = 0; i != this.items.size() ;i++){

            if (items.get(i).getId().equals(id) ) {


                items.remove(i);
                 result = true;

                 break;

            }
        }
         return result;

    }
    /**
     * Метод генерирует уникальный ключ для заявки.
     * Так как у заявки нет уникальности полей, имени и описание. Для идентификации нам нужен уникальный ключ.
     * @return Уникальный ключ.
     */
    private String generateId() {
        Random rm = new Random();
        return String.valueOf(rm.nextLong() + System.currentTimeMillis());
    }
}
