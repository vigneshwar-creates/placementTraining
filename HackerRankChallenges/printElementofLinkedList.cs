    static void printLinkedList(SinglyLinkedListNode head) {
        while(head != null){
            Console.WriteLine(head.data);
            head = head.next;
        }

    }

    static void Main(string[] args) {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistCount = Convert.ToInt32(Console.ReadLine());

        for (int i = 0; i < llistCount; i++) {
            int llistItem = Convert.ToInt32(Console.ReadLine());
            llist.InsertNode(llistItem);
        }

        printLinkedList(llist.head);
    }
}
