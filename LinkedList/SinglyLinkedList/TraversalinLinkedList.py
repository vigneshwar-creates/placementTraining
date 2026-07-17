class Node:
  def __init__(self, new_data):
    self.data = new_data
    self.next = None

def traversal(head):
  while head is not None:
    print(head.data,end="")
    if head.next is not None:
      print("->",end="")
    head = head.next
  print()

if __name__ == "__main__"

head = Node(1)
head.next = Node(2)
head.next.next = Node(4)
head.next.next.next = Node(3)

traversal(head)
