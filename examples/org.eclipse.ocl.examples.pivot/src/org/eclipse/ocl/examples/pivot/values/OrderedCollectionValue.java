package org.eclipse.ocl.examples.pivot.values;


public interface OrderedCollectionValue extends CollectionValue
{
    OrderedCollectionValue append(Value object);
    Value at(int index);
	Value first();
    OrderedCollectionValue insertAt(int index, Value object);
    int indexOf(Value object);
    Value last();
    OrderedCollectionValue prepend(Value object);
	OrderedCollectionValue reverse();
}
