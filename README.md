# Accessing Private Members Directly in Scala Methods

This example demonstrates a common, yet subtle issue in Scala: directly accessing private members from within a class's methods. While this compiles without error, it's considered bad practice for several reasons:

* **Maintainability:**  Changes to how `myVar` is managed may cause unexpected side effects in `myMethod`.
* **Testability:**  Direct access makes unit testing `myMethod` more difficult, as you can't easily control the value of `myVar`.
* **Encapsulation:** Violates good object-oriented design principles of encapsulation. 

The provided solution showcases a better approach using a public accessor method to access `myVar` indirectly.