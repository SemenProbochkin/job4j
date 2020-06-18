package ru.job4j.tracker;
import java.util.Random;
import java.util.Arrays;
public class Tracker {
    /**
     * Массив для хранения заявок.
     */
    private final Item[] items = new Item[100];

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
        items[position++] = item;
        return item;
    }
    public Item[] findAll(){
        Item[] result = new Item[this.position];

        int size=0;

        for ( int i = 0; this.items.length>i ;i++){

            if (this.items[i]!=null ) {
                // String name = this.items[i].getName();

                result[i]= this.items[i];

                size++;


            }
        }
        result = Arrays.copyOf(result, size);
        return result;
    }
    public Item[] findByName(String key){
          Item[] result = new Item[this.position];

          int size=0;

        for ( int i = 0; this.items.length>i ;i++){

            if (this.items[i]!=null && this.items[i].getName().equals(key)) {
                  // String name = this.items[i].getName();

               result[i]= this.items[i];

                    size++;


            }
        }
        result = Arrays.copyOf(result, size);
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
