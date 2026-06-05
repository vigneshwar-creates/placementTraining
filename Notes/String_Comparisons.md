# String vs StringBuilder vs StringBuffer

A comparison based on mutability, storage, thread safety, and speed.

| Feature | `String` | `StringBuilder` | `StringBuffer` |
| :--- | :--- | :--- | :--- |
| **Mutability** | Immutable (cannot be changed once created) | Mutable (can be modified) | Mutable (can be modified) |
| **Storage** | String Pool (Heap Memory) | Heap Memory | Heap Memory |
| **Thread Safety** | Thread-Safe (because it is immutable) | Not Thread-Safe (not synchronized) | Thread-Safe (synchronized methods) |
| **Speed** | Slowest (creates new objects on modification) | Fastest (no synchronization overhead) | Slower than StringBuilder (due to synchronization overhead) |
