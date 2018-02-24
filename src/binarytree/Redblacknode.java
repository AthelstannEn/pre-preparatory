package binarytree;

public class Redblacknode<Key extends Comparable<Key>, Value> implements Comparable<Key> {

	private final Key key;
	private Value value;
	private boolean red;
	private Redblacknode<Key, Value> left, right;

	
	public Redblacknode(final Key key, final Value value) {
		this.key = key;
		this.value = value;
		red = true;
		left = right = null;
	}



	@Override
	public int compareTo(final Key otherKey) {
		return key.compareTo(otherKey);
	}

	public Key getKey() {
		return key;
	}

	public Redblacknode<Key, Value> getLeft() {
		return left;
	}

	public Redblacknode<Key, Value> getRight() {
		return right;
	}

	public Value getValue() {
		return value;
	}

	public boolean hasLeft() {
		return left != null;
	}

	public boolean hasRight() {
		return right != null;
	}

	public boolean isLeftBlack() {
		return left == null ? true : !left.red;
	}

	public boolean isLeftRed() {
		return left == null ? false : left.red;
	}

	public boolean isRed() {
		return red;
	}

	public boolean isRightBlack() {
		return right == null ? true : !right.red;
	}

	public boolean isRightRed() {
		return right == null ? false : right.red;
	}

	public void setLeft(final Redblacknode<Key, Value> left) {
		this.left = left;
	}

	public void setRed(final boolean red) {
		this.red = red;
	}

	public void setRight(final Redblacknode<Key, Value> right) {
		this.right = right;
	}

	public void setValue(final Value value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return value == null ? "null" : value.toString();
	}
}
