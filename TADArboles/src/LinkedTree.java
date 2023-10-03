import material.Position;

import java.util.*;


/**
 * This class represents a tree data structure using a linked implementation.
 * It implements the NAryTree interface.
 *
 * @param <E> the type of element stored in the tree
 */
public class LinkedTree<E> implements NAryTree<E> {

    /**
     * This class represents a node in a tree data structure.
     * It implements the Position interface.
     *
     * @param <T> the type of element stored in the node
     */
    private class TreeNode<T> implements Position<T> {
        private List<TreeNode<T>> children;
        private T element;
        private TreeNode<T> parent;

        public TreeNode(List<TreeNode<T>> children, TreeNode<T> parent) {
            this.children = children;
            this.parent = parent;
        }

        public List<TreeNode<T>> getChildren() {
            return children;
        }

        public TreeNode<T> getParent() {
            return parent;
        }

        public void setChildren(List<TreeNode<T>> children) {
            this.children = children;
        }

        public void setElement(T element) {
            this.element = element;
        }

        public void setParent(TreeNode<T> parent) {
            this.parent = parent;
        }

        @Override
        public T getElement() {
            throw new UnsupportedOperationException("Not supported yet.");
        }

    }

    @Override
    public Position<E> addRoot(E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private TreeNode<E> checkPosition(Position<E> p){
        if ()
    }
    @Override
    public Position<E> add(E element, Position<E> p) {
        TreeNode<E> parent=checkPosition(p);

    }

    @Override
    public Position<E> add(E element, Position<E> p, int n) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void swapElements(Position<E> p1, Position<E> p2) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public E replace(Position<E> p, E e) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void remove(Position<E> p) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public NAryTree<E> subTree(Position<E> v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void attach(Position<E> p, NAryTree<E> t) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isEmpty() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Position<E> root() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Position<E> parent(Position<E> v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterable<? extends Position<E>> children(Position<E> v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isInternal(Position<E> v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isLeaf(Position<E> v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean isRoot(Position<E> v) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Iterator<Position<E>> iterator() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int size() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
