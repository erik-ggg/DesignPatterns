From baeldung.com

When we're trying to clone, we should decide between making a shallow or a deep copy. Eventually, it boils down to the requirements.

For example, if the class contains only primitive and immutable fields, we may use a shallow copy.

If it contains references to mutable fields, we should go for a deep copy. We might do that with copy constructors or serialization and deserialization.