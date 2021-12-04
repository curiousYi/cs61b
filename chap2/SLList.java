public class SLList {
    public class IntNode {
        public int item;
        public IntNode next;
        public IntNode(int i, IntNode n) {
            item = i;
            next = n;
        }
    }

    private IntNode first; 

    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /** Adds an item to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }    

    /** Retrieves the front item from the list. */
    public int getFirst() {
        return first.item;
    }

    /** Adds an item to the end of the list. */
    public void addLast(int x) {
        IntNode currentPointer = first;
        IntNode newNode = new IntNode(x);
        while(currentPointer.next != null) {
          currentPointer = currentPointer.next;
        }
        currentPointer.next = newNode;
    }

    /** Returns the number of items in the list using recursion. */
    public int size() {
      var original = first;
      var count = 1;
      if(first.next != null) {
        first = first.next;
        count = count + size();
      }
      first = original;
      return count;
    }
}
