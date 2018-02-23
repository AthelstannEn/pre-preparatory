package binarytree;

public class BinaryNode<Key extends Comparable<Key>, Value> implements
		Comparable<Key> {

	private final Key key;

	private Value value;

	private BinaryNode<Key, Value> left, right;

	public BinaryNode(final Key key, final Value value) {
		this.key = key;
		this.value = value;
		left = right = null;
	}

	@Override
	public int compareTo(Key otherKey) {
		return key.compareTo(otherKey);
	}

	public Value getValue() {
		return value;
	}

	public void setValue(Value value) {
		this.value = value;
	}

	public BinaryNode<Key, Value> getLeft() {
		return left;
	}

	public void setLeft(BinaryNode<Key, Value> left) {
		this.left = left;
	}

	public BinaryNode<Key, Value> getRight() {
		return right;
	}

	public void setRight(BinaryNode<Key, Value> right) {
		this.right = right;
	}

	public Key getKey() {
		return key;
	}

	@Override
	public String toString() {
		return value == null ? "null" : value.toString();
	}

}
