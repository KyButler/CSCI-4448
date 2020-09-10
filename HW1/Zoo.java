class Zoo {
  public static void main(String[] args) {
    System.out.println("Hello World!");

    /** Abstraction:
     * - Program asks for input on amount of days
     * - Zookeeper object will arrive at zoo each day and execute tasks:
     *  - Zookeeper class has wake animals, roll call animals, feed animals, exercise the animals, tell animals to sleep
     * - Once that's done, the zookeeper will leave (maybe de-allocate memory? not sure rn what needs to be done)
     * 
     * - each action will be displayed.
     * 
     * The zookeeper methods should be defined using an abstract class called ZooEmployee. 
     * Zookeeper class extends this abstract class
     * Methods common to all zoo employees should be in abstract class
     * Zookeeper may override these methods or define methods particular to self.
     * 
     * To respond to the zookeeper object methods, each animal instance must have a method that corresponds to the zookeepers tasks.
     * Strings are generated on every action, and should be based on executing object's attributes, like name, type, day number, etc, and not hardcoded.
     * 
     * Should demonstrate the use of overriding inherited methods byt having some subclasses overide methods at each of the two levels after the animal superclass
     * 
     * ie: an animal can have a default eat method, but you may define alternate definitins for eat at the feline or cat level.
     * 
     * Allow for the following special case: When a dog is given the exercise command by the Zookeeper, there is a 25% chance that the dog will roam instead, and 30% chance it will also make noise
     * and 40% chance it will instead sleep. When a pachyderm is given an exercise command, there is a 25% chance it will charge instead of roam. 
     * 
     * documentation needs comments that show at least on instance of abstraction, encapsulation, polymorphism, abstract class, and identity. For polymorphism,
     * all animals should be able to be called regardless of subclasses.
     * 
     * . . . there's more on the writeup but this is the coding part, not the testing part.
     * 
     */
  }
}

/** Animal List:
 * 
 * Pachyderm
 *  - Rhino
 *  - Hippo
 *  - Elephant
 * 
 * Feline
 *  - Tiger
 *  - Lion
 *  - Cat
 * 
 * Canine
 *  - Dog
 *  - Wolf
 * 
 */