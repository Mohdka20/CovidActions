package assignment1.Action.sec313;

/**
 * This is the Action Superclass class that provides a catalog of actions to be
 * carried out in view of COVID-19 OPH protocols. 
 * @author Mohamed Elsheikh
 * @version Mar 7, 2022
 */
public abstract class Action {
	private String description;

	/**
	 * Constructs an action without a description.
	 * @param description 
	 */
	protected Action(String d) {
		description = d;
	}

	/**
	 * Sets the description of this action.
	 * 
	 * @param description the text description of the action
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * Determines if this action occurs on the specified date.
	 * 
	 * @param year  the year
	 * @param month the month
	 * @param day   the day
	 * @return true if the action activity occurs on the specified date.
	 */

	public abstract boolean occursOn(int year,int month, int day);

	/**
	 * Converts action activity to string description.
	 */
	public String toString() {
		return description;
	}

	/**
	 * Overrides the abstract method from the superClass
	 * @return True "Actions to be done everyday".
	 */
	public boolean occursOn() {
		return false;
	}
}
