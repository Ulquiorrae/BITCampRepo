
public class PersonList {

	private PersonNode firstPerson;
	
	
	
	public PersonNode getFirstPerson() {
		return firstPerson;
	}
	
	
	/**
	 * This method adds a new element on a linked list.
	 * @param person 
	 * @param firstPerson
	 */
	public void add(Person person) {

		PersonNode next = new PersonNode(person);
		if (firstPerson == null) {
			firstPerson = next;
		} else {
			PersonNode lastPerson = firstPerson;
			while (lastPerson.getNext() != null) {
				lastPerson = lastPerson.getNext();
			}
			lastPerson.setNext(next);
		}
	}
}



//OVU METODU KORISTIM SA PERSONENTRYCLASSED !!!!!!!!!!