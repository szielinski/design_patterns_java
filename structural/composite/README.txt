Purpose: create a nested class hierarchy where both the parent and its children use the same interface.

The common interface allows both to be treated uniformly - useful when both are similar in structure and operations are commonly applied across the entire tree. Used extensively in GUIs to represent groups of objects with common funtionality:
- Graphic(component), Window(composite), Line, Rectangle (leaf items). A call to draw() on the parent would also cause all of the children to be drawn as well.
