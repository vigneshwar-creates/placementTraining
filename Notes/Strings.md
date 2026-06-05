# Strings

**Definition**: String is an object that represents a sequence of characters.
**Immutability**: String is immutable, meaning its values cannot be changed.
**Type**: String is a class and a reference type, not a primitive type like int or char.

**String literal**: create string using double quotes `"Hello world"`

**String pool**: a special memory called string pool to store string literals efficiently

### FOR REVISION: String Topology
* String literal -> String pool
* String (Object) -> Heap Memory

### Java String Methods

| Method | Description |
|---|---|
| `str.charAt(index)` | Returns the character at the specified index. |
| `str.contains(sequence)` | Checks if the string contains the specified sequence of characters. |
| `str.equals(object)` | Compares the string to the specified object (case-sensitive). |
| `str.equalsIgnoreCase(string)` | Compares the string to another string, ignoring case considerations. |
| `str.toLowerCase()` | Converts all characters in the String to lowercase. |
| `str.toUpperCase()` | Converts all characters in the String to uppercase. |
| `str.substring(begin)` | Returns a substring from the beginning index to the end. |
| `str.substring(begin, end)` | Returns a substring from begin index (inclusive) to end index (exclusive). |
| `str.replace(old, new)` | Replaces all occurrences of a character/sequence with another. |
| `str.indexOf(char)` | Returns the index of the first occurrence of the character. |
| `str.lastIndexOf(char)` | Returns the index of the last occurrence of the character. |
| `str.startsWith(prefix)` | Checks if the string starts with the specified prefix. |
| `str.endsWith(suffix)` | Checks if the string ends with the specified suffix. |
| `str.toCharArray()` | Converts the string to a new character array. |
