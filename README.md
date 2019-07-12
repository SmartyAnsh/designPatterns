# Design Patterns

**Prototype Pattern** - A design pattern in which objects are created at the start and kept in the object registry. So, whenever a new instance is required, we clone the object from the registry.
                    This is to save multiple complex operations which may be required to create a new instance every time.
                    
**Memento Pattern** - A design pattern which is used to restore the state of an object to the previous state. This design pattern is useful when state of an object often changes.
                  An example of this pattern is implementation of Notepad, where user uses "undo" operation regularly to restore the previous state of the content.  