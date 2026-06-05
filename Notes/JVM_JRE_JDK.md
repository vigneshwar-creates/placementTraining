# Java Architecture & Memory

**JVM** - Java Virtual Machine that runs the compiled java bytecode.

**JRE** - Java Runtime Environment provides library and other components needed to run applications on JVM.

**JDK** - Java Development Kit compiles the source code; it has tools such as compilers and debuggers.

### Memory
**Heap Memory**
1. Stores object and instance variables.
2. Managed by garbage collector.

**Stack Memory**
1. Store method calls, local variables, and reference variable address.

**Non-heap**
1. Stores class metadata, static variables, method area, and JIT-compiled code.

### FOR REVISION: Java Machine Stack
* JDK -> Compiler + JRE
* JRE -> Java lib + JVM
* JVM -> Bytecode -> Machine Code + JIT
