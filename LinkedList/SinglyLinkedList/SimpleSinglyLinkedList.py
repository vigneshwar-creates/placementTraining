class Node:
  def __init__(self, data):
    self.data = new_data
    self.next = None

head = Node(1)
head.next = Node(2)
head.next.next = Node("Hello im 3")
head.next.next.next = Node(True)

current = head

while(current):
  print(current.data, end= " ~> ")
  current = current.next
print("None")
  
