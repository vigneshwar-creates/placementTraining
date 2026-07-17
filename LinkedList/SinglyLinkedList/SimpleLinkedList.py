class Node:
  def __init__ (self, data):
    self.data = data
    self.next = None

node1 = Node(1)
node2 = Node(22)
node3 = Node(33)
node4 = Node(44)

node1.nexdt = node2
node2. next = node3
node3.next = node4

head = node1

current = head

while(current):
  print(current. end ="->")
  current = current.next
print("None") #In python we use None instead of Null
