class Node:
  def __init__(self, data):
    self.data = data
    self.node = None

def recursiveTraverse(head):
  if head is None:
    print()
    return

  if head is not None:
    print(head.data, end="")

  if head.next is not None:
    print("->", end="")

  recursiveTraverse(head.next)

if __name__ == "__main__":
  head = Node(1)
  head.next = Node(2)
  head.next.next = Node(3)
  head.next.next.next = Node(4)

  recursiveTraverse(head)
  
