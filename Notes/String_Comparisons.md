# String vs StringBuilder vs StringBuffer

A comparison based on mutability, storage, thread safety, and speed.

| Feature | `String` | `StringBuilder` | `StringBuffer` |
| :--- | :--- | :--- | :--- |
| **Mutability** | Immutable (cannot be changed once created) | Mutable (can be modified) | Mutable (can be modified) |
| **Storage** | String Pool (Heap Memory) | Heap Memory | Heap Memory |
| **Thread Safety** | Thread-Safe (because it is immutable) | Not Thread-Safe (not synchronized) | Thread-Safe (synchronized methods) |
| **Speed** | Slowest (creates new objects on modification) | Fastest (no synchronization overhead) | Slower than StringBuilder (due to synchronization overhead) |

### Why use StringBuilder or StringBuffer?
Used in Java to perform multiple modifications to a string. Since `String` objects are immutable, every time a change is made, a new string object is created in memory, which is inefficient. 

We use `StringBuilder` (or `StringBuffer`) to make a mutable sequence of characters so we can edit it directly without creating a new `String`.

### Common Methods

```java
StringBuilder sb = new StringBuilder();
StringBuffer sbf = new StringBuffer(); // Works similarly but is thread-safe

sb.append("Hello");               // Appends text to the end
sb.insert(5, "world");            // Inserts text at the specified index
sb.reverse();                     // Reverses the sequence
sb.replace(0, 5, "hey");          // Replaces characters from start index to end index
sb.deleteCharAt(2);               // Deletes the character at the specified index
int len = sb.length();            // Returns the length (character count)
char c = sb.charAt(2);            // Returns the character at the specified index
sb.setCharAt(0, 'H');             // Sets the character at the specified index
int index1 = sb.indexOf("Word");  // Returns the index of the first occurrence of the substring
int index2 = sb.lastIndexOf("i"); // Returns the index of the last occurrence of the substring
String str = sb.toString();       // Converts the StringBuilder to a String
sb.insert(2, 'A');                // Inserts a character at the specified index
sb.insert(3, 123);                // Inserts an integer at the specified index
sb.setCharAt(1, '#');             // Sets the character at the specified index
```
