import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
	Scanner input = new Scanner(System.in);
	private ArrayList<String> toDoListItems = new ArrayList<String>();

	public ArrayList<String> getToDoListItems() {
		return toDoListItems;
	}

	public void setToDoListItems(ArrayList<String> toDoListItems) {
		this.toDoListItems = toDoListItems;
	}
	
	
	public void addItem() {
		System.out.println("Type your To Do list item: ");
		toDoListItems.add(input.nextLine());
	}
	
	public void removeItem() {
		if (toDoListItems.size() > 0) {

			System.out.println("Which To Do List item do you want to delete?\n");
			for (int i = 0; i < toDoListItems.size(); i++) {
				System.out.println((i + 1) + ". " + toDoListItems.get(i));
				System.out.println();
			}
			int deleteChoice = input.nextInt();
			input.nextLine();

			toDoListItems.remove(deleteChoice - 1);

		} else
			System.out.print("There are no items in your to do list!\n");
	}
	
	public void displayItems() {
		if (toDoListItems.size() == 0) {
			System.out.println("There are no items in your to do list!");
		} else {
			for (int i = 0; i < toDoListItems.size(); i++) {
				System.out.println((i + 1) + ". " + toDoListItems.get(i));
				System.out.println();
			}
		}
	}
	
	
	
	
}
