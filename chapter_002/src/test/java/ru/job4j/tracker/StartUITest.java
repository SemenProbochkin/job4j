package ru.job4j.tracker;
import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class StartUITest {

    @Test
    public void whenCreateItem() {
        Tracker tracker = new Tracker();     // создаём Tracker
        Input input = new StubInput(new String[]{"0", "test name", "6"});   //создаём StubInput с последовательностью действий
        new StartUI(input, tracker).init();
        //   создаём StartUI и вызываем метод init()
        assertThat(tracker.findAll().get(0).getName(), is("test name")); //
    }
    @Test
    public void whenReplaceItem() {
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Replaced item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        String replacedName = "New item name";
        Input input = new StubInput(
                new String[] {"2" ,item.getId(),replacedName, "6"}
        );
        new StartUI(input, tracker).init();

        assertThat(tracker.findById(item.getId()).getName(), is(replacedName));
    }

    @Test
    public void whenDeleteItem() {
        Tracker tracker = new Tracker();
        /* Добавим в tracker новую заявку */
        Item item = tracker.add(new Item("Deleted item"));
        /* Входные данные должны содержать ID добавленной заявки item.getId() */
        Input input = new StubInput(
                new String[] {"3" ,item.getId(), "6"}
        );
        Integer result = null;
        new StartUI(input, tracker).init();
        assertThat(tracker.findById(item.getId()), is(result));

    }
}