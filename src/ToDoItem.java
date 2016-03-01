/**
 * Created by Caroline on 2/8/16.
 */
public class ToDoItem {
    public String text; //to use this in JREPL, we had to add "public" on both fields//
    public boolean isDone;
    public int id;

    public ToDoItem(String text, boolean isDone, int id) {
        this.text = text;
        this.isDone = isDone;
        this.id = id;
    }
}
