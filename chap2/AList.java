/** Array based list.
 *  @author Josh Hug
 */

public class AList {
    /** Creates an empty list. */
    public AList() {
      Node head = Sentinel;
      Node last = Sentinel;
      int size = 0;
    }

    /** Inserts X into the back of the list. */
    public void addLast(int x) {
      Node nextNode = new Node(x);
      this.last.next = nextNode;
      this.last = head;
      this.size++;
    }

    /** Returns the item from the back of the list. */
    public int getLast() {
        return this.last;       
    }
    /** Gets the ith item in the list (0 is the front). */
    public int get(int i) {
        if(size == 0) {
          return;
        }
        Node track = this.head.next;
        for(int count = 0; count < i; count++) {
          track = track.next;
        }
        return track
    }

    /** Returns the number of items in the list. */
    public int size() {
        return this.size();        
    }

    /** Deletes item from back of the list and
      * returns deleted item. */
    public int removeLast() {
        return 0;
    }
} 
