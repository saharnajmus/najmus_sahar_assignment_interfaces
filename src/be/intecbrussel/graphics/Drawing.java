package be.intecbrussel.graphics;

import java.util.Arrays;
import java.util.Objects;

public class Drawing implements Drawable {
    private Drawable[] drawables;
    private int size;

    public Drawing() {
        drawables = new Drawable[100];
        size = 0;
    }

    public void add(Drawable drawable) {
        int index = findElementIndex(null);
        if (findElementIndex(drawable) != -1) {
            return;
        }
        if (index == -1) {
            // Drawable[] biggerDrawableArray = new Drawable[drawables.length+1];
            // System.arraycopy(drawables,0,biggerDrawableArray,0,drawables.length+1);
            drawables = Arrays.copyOf(drawables, drawables.length + 1);
            index = drawables.length - 1;
        }
        drawables[index] = drawable;
        size++;
    }

    public void remove(Drawable drawable) {
        int index = findElementIndex(drawable);
        if (index == -1) {
            return;
        }
        drawables[index] = null;
        size--;
    }

    private int findElementIndex(Drawable drawable) {
        for (int i = 0; i < drawables.length; i++) {
            if (Objects.equals(drawables[i], drawable)) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        Arrays.fill(drawables, null);
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "Drawing{" + "drawables= " + Arrays.toString(drawables) + "size " + size + "}";
    }

    @Override
    public void draw(DrawingContext dc) {
        for (int i = 0; i < size; i++) {
            drawables[i].draw(dc);
        }

    }

    @Override
    public void scale(int factor) {
        for(int i=0; i<size;i++){
            drawables[i].scale(factor);
        }

    }
}
